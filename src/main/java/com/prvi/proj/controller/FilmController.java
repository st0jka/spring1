package com.prvi.proj.controller;

import com.prvi.proj.dto.FilmDTO;
import com.prvi.proj.model.Film;
import com.prvi.proj.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "film")
public class FilmController {
    @Autowired
    private FilmService filmService;


    @GetMapping(value = "/getFilm")
    public ModelAndView getFilm(){
        ModelAndView mav = new ModelAndView("test/film");
        List<Film> listaFilmova = filmService.findAll();
        mav.addObject("listaFilmova",listaFilmova);
        return mav;
    }
    @PostMapping(value = "/postFilm")
    public ModelAndView postFilm(FilmDTO filmDTO){
        filmService.save(filmDTO);
        ModelAndView mav = new ModelAndView("redirect:getFilm");
        return mav;
    }
    @GetMapping(value = "/getFilm2")
    public ModelAndView getFilm2(){
        ModelAndView mav = new ModelAndView("test/film");
        List<Film> listaFilmova = filmService.findAll2();
        mav.addObject("listaFilmova",listaFilmova);
        return mav;
    }
    @PostMapping(value = "/deleteFilm")
    public ModelAndView postDeleteFilm(int idFilm){
        boolean uspesno = filmService.obrisiFilm(idFilm);
        System.out.println("uspesno obrisan:  " + uspesno);
        ModelAndView mav = new ModelAndView("redirect:getFilm");
        System.out.println("nesto ovo ne radi");
        return mav;

    }

    @PostMapping(value = "/updateFilmPost")
    public ModelAndView updateFilmPost(String idFilm, String naslov, String zanr, String trajanje){
        return null;
    }
}
