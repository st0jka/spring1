package com.prvi.proj.service.impl;

import com.prvi.proj.dao.FilmDAO;
import com.prvi.proj.dto.FilmDTO;
import com.prvi.proj.model.Film;
import com.prvi.proj.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmDAO filmDAO;
    @Override
    public void save(FilmDTO filmDTO) {
        filmDAO.save(filmDTO);
    }

    @Override
    public List<Film> findAll() {
        List<Film> all = filmDAO.findAll();
        return all;
    }

    @Override
    public List<Film> findAll2() {
        return filmDAO.findAll2();
    }

    @Override
    public boolean obrisiFilm(int idFilm) {
        return filmDAO.obrisiFilm(idFilm);
    }


}
