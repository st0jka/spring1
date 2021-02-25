package com.prvi.proj.dao;

import com.prvi.proj.dto.FilmDTO;
import com.prvi.proj.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class FilmDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class FilmRowMapper implements RowMapper<Film>{

        @Override
        public Film mapRow(ResultSet resultSet, int i) throws SQLException {
            int index = 1;
            Integer filmId = resultSet.getInt(index++);
            String naziv = resultSet.getString(index++);
            String zanr = resultSet.getString(index++);
            Integer trajanje = resultSet.getInt(index++);
            Film film = new Film();
            film.setIdFilm(filmId);
            film.setNaslov(naziv);
            film.setTrajanje(trajanje);
            film.setZanr(zanr);
            return film;
        }
    }

    private static class FilmRowCallBackHandler implements RowCallbackHandler{


        private Map<Integer, Film> filmovi = new LinkedHashMap<>();

        @Override
        public void processRow(ResultSet resultSet) throws SQLException {
            int index = 1;
            Integer filmId = resultSet.getInt(index++);
            String naziv = resultSet.getString(index++);
            String zanr = resultSet.getString(index++);
            Integer trajanje = resultSet.getInt(index++);
            Film film = filmovi.get(filmId);
            if(film==null){
                film = new Film();
                film.setIdFilm(filmId);
                film.setNaslov(naziv);
                film.setTrajanje(trajanje);
                film.setZanr(zanr);
                filmovi.put(film.getIdFilm(), film);
            }
        }

        public List<Film> dobaviFilmove(){
//            List<Film> lista = new ArrayList<>();
//            for(Map.Entry<Integer, Film> f : filmovi.entrySet()){
//                lista.add(f.getValue());
//            }
//            return lista;
            return new ArrayList<>(filmovi.values());
        }
    }

    public List<Film> findAll(){
        String sql = "select f.id_film, f.naslov, f.zanr, f.trajanje from film as f";
        FilmRowCallBackHandler frcbh = new FilmRowCallBackHandler();
        jdbcTemplate.query(sql, frcbh);
        return frcbh.dobaviFilmove();
    }
    public List<Film> findAll2(){
        String sql = "select f.id_film, f.naslov, f.zanr, f.trajanje from film as f";
        return jdbcTemplate.query(sql,new FilmRowMapper());
    }
    @Transactional
    public void save(FilmDTO filmDTO){
        PreparedStatementCreator preparedStatementCreator = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                String sql = "INSERT INTO film (naslov, zanr, trajanje) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                int index = 1;
                preparedStatement.setString(index++, filmDTO.getNaziv());
                preparedStatement.setString(index++, filmDTO.getZanr());
                preparedStatement.setInt(index++, filmDTO.getTrajanje());
                return preparedStatement;
            }
        };
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(preparedStatementCreator, keyHolder);
//        boolean uspeh = jdbcTemplate.update(preparedStatementCreator, keyHolder) == 1;
//        if(uspeh){
//            String sql = "INSERT INTO projekcija (filmId, zanrId) VALUES (?,?)";
//            jdbcTemplate.update(sql, keyHolder.getKey(), 5);
//        }
    }
    public boolean obrisiFilm(int idFilm){
        try {
            String sql = "delete from film where id_film = ?";
            jdbcTemplate.update(sql, idFilm);
            return true;
        } catch(Exception e){
            System.out.println("upao u catch");
            return false;
        }
    }




}
