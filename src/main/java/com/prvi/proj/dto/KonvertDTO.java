package com.prvi.proj.dto;

public class KonvertDTO {
    private String izValute;
    private String uValutu;
    private int kolicina;

    public KonvertDTO(String izValute, String uValutu, int kolicina) {
        this.izValute = izValute;
        this.uValutu = uValutu;
        this.kolicina = kolicina;
    }

    public String getIzValute() {
        return izValute;
    }

    public void setIzValute(String izValute) {
        this.izValute = izValute;
    }

    public String getuValutu() {
        return uValutu;
    }

    public void setuValutu(String uValutu) {
        this.uValutu = uValutu;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "konvertDTO{" +
                "izValute='" + izValute + '\'' +
                ", uValutu='" + uValutu + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
