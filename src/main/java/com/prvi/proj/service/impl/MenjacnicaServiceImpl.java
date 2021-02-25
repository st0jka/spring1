package com.prvi.proj.service.impl;

import com.cedarsoftware.util.io.JsonReader;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.prvi.proj.dto.*;
import com.prvi.proj.service.MenjacnicaService;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@Service
public class MenjacnicaServiceImpl implements MenjacnicaService {
    @Value("${kursnalista.api.key}")
    private String kursnaListaApiKey;
    @Override
    public Set<String> dobaviListuValuta() {
        //komunikacija sa eksternim apijem
        Set<String> dostupneValute = new LinkedHashSet<>();
        Class ksrDTOClass = new KursnaListaResultDTO().getClass();
        Field[] ksrDTOFields = ksrDTOClass.getDeclaredFields();
        for (int i = 0; i < ksrDTOFields.length; i++) {
            Class klrvDTOClass = new KursnaListaResultValutaDTO().getClass();
            if (klrvDTOClass.equals(ksrDTOFields[i].getType())) {
                dostupneValute.add(ksrDTOFields[i].getName());
            }
        }
        dostupneValute.add("rsd");
        return dostupneValute;
        //dobavljanje pakovanje podataka
        //return podataka na kontroller

    }
    private String run(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String result(KonvertDTO konvertDto) throws IOException {
        StringBuilder url = new StringBuilder();
        String pocetakUrla = "http://api.kursna-lista.info/"+ kursnaListaApiKey +"/konvertor/";
        url.append(pocetakUrla+konvertDto.getIzValute()+"/"+konvertDto.getuValutu()+"/"+konvertDto.getKolicina());
        System.out.println(url.toString());
        String resposneJson  = run(url.toString());

        try {

            Map args = new HashMap();
            args.put(JsonReader.UNKNOWN_OBJECT, "com.prvi.proj.dto.ConvertDTO");
            ConvertDTO response = (ConvertDTO) JsonReader.jsonToJava(resposneJson, args);
            return String.valueOf(response.getResult().getValue());
        } catch (Exception e) {
            System.out.println("Neuspesno, upao u catch");
            Map args = new HashMap();
            args.put(JsonReader.UNKNOWN_OBJECT, "dto.ConvertFailDTO");
            ConvertFailDTO resposne = (ConvertFailDTO) JsonReader.jsonToJava(resposneJson, args);
            return resposne.getMsg();
        }
    }

}
