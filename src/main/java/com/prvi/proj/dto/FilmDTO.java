package com.prvi.proj.dto;

public class FilmDTO {
    String naziv;
    String zanr;
    int trajanje;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public FilmDTO(String naziv, String zanr, int trajanje) {
        this.naziv = naziv;
        this.zanr = zanr;
        this.trajanje = trajanje;
    }
}
