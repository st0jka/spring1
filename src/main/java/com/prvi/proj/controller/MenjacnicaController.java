package com.prvi.proj.controller;

import com.prvi.proj.dto.KonvertDTO;
import com.prvi.proj.dto.TestDTO;
import com.prvi.proj.service.MenjacnicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Set;


@Controller
@RequestMapping(value = "/Menjacnica")
public class MenjacnicaController {

    @Autowired
    MenjacnicaService menjacnicaService;

    @GetMapping(value = "/getMenjacnica")
    public ModelAndView getMenjacnica(){
        ModelAndView mav = new ModelAndView("test/home");
        return mav;
    }

    @GetMapping(value = "/getMenjacnicaTest")
    public ModelAndView getMenjacnicaTest(){
        ModelAndView mav = new ModelAndView("test/menjacnicaTest");
        mav.addObject("poruka", "ovaj value dolazi iz get metoda");
        return mav;
    }

    @PostMapping(value = "/postMenjacnicaTest")
    public ModelAndView postMenjacnicaTest(TestDTO testDTO){
        System.out.println(testDTO);


        ModelAndView mav = new ModelAndView("test/menjacnicaTest");
        mav.addObject("poruka", "ovaj value dolazi iz get metoda");
        return mav;
    }


    @GetMapping(value = "/konvertorValuta")
    public ModelAndView konvertorValuta(){
        //retreving of data from service
        Set<String> listaValuta = menjacnicaService.dobaviListuValuta();
        System.out.println("lista valuta- " + listaValuta);
        ModelAndView mav = new ModelAndView("test/konvertovanje");
        mav.addObject("listaValuta", listaValuta);
        //adding objects into mav
        return mav;
    }
    @PostMapping(value = "/konvertujValutu")
    public ModelAndView konvertujValutu(KonvertDTO konvertDTO) throws IOException {
        System.out.println(konvertDTO);
        Set<String> listaValuta = menjacnicaService.dobaviListuValuta();
        ModelAndView mav = new ModelAndView("test/konvertovanje");
        mav.addObject("listaValuta", listaValuta);
        String rezultat = menjacnicaService.result(konvertDTO);
        mav.addObject("rezultat",rezultat);
        return mav;
    }
}
