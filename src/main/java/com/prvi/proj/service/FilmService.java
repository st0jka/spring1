package com.prvi.proj.service;

import com.prvi.proj.dto.FilmDTO;
import com.prvi.proj.model.Film;

import java.util.List;

public interface FilmService {
    void save(FilmDTO filmDTO);
    List<Film> findAll();

    List<Film> findAll2();
    boolean obrisiFilm(int idFilm);

}
