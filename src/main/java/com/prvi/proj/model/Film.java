package com.prvi.proj.model;

//import javax.persistence.*;


public class Film {

    private Integer idFilm;

    private String naslov;

    private String zanr;

    private Integer trajanje;

    public Integer getIdFilm() {
        return this.idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public String getNaslov() {
        return this.naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getZanr() {
        return this.zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public Integer getTrajanje() {
        return this.trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }
}
