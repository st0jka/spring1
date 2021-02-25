package com.prvi.proj.dto;

public class KursnaListaResultDTO {
	private String date;
	private String  code;
	private String status;
	private KursnaListaResultValutaDTO eur;
	private KursnaListaResultValutaDTO usd;
	private KursnaListaResultValutaDTO chf;
	private KursnaListaResultValutaDTO gbp;
	private KursnaListaResultValutaDTO aud;
	private KursnaListaResultValutaDTO cad;
	private KursnaListaResultValutaDTO sek;
	private KursnaListaResultValutaDTO dkk;
	private KursnaListaResultValutaDTO nok;
	private KursnaListaResultValutaDTO jpy;
	private KursnaListaResultValutaDTO rub;
	private KursnaListaResultValutaDTO cny;
	private KursnaListaResultValutaDTO hrk;
	private KursnaListaResultValutaDTO kwd;
	private KursnaListaResultValutaDTO pln;
	private KursnaListaResultValutaDTO czk;
	private KursnaListaResultValutaDTO huf;
	private KursnaListaResultValutaDTO bam;
	
	
	
	public KursnaListaResultDTO() {
		super();
	}
	public KursnaListaResultDTO(String date, String code, String status, KursnaListaResultValutaDTO eur,
			KursnaListaResultValutaDTO usd, KursnaListaResultValutaDTO chf, KursnaListaResultValutaDTO gbp,
			KursnaListaResultValutaDTO aud, KursnaListaResultValutaDTO cad, KursnaListaResultValutaDTO sek,
			KursnaListaResultValutaDTO dkk, KursnaListaResultValutaDTO nok, KursnaListaResultValutaDTO jpy,
			KursnaListaResultValutaDTO rub, KursnaListaResultValutaDTO cny, KursnaListaResultValutaDTO hrk,
			KursnaListaResultValutaDTO kwd, KursnaListaResultValutaDTO pln, KursnaListaResultValutaDTO czk,
			KursnaListaResultValutaDTO huf, KursnaListaResultValutaDTO bam) {
		super();
		this.date = date;
		this.code = code;
		this.status = status;
		this.eur = eur;
		this.usd = usd;
		this.chf = chf;
		this.gbp = gbp;
		this.aud = aud;
		this.cad = cad;
		this.sek = sek;
		this.dkk = dkk;
		this.nok = nok;
		this.jpy = jpy;
		this.rub = rub;
		this.cny = cny;
		this.hrk = hrk;
		this.kwd = kwd;
		this.pln = pln;
		this.czk = czk;
		this.huf = huf;
		this.bam = bam;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public KursnaListaResultValutaDTO getEur() {
		return eur;
	}
	public void setEur(KursnaListaResultValutaDTO eur) {
		this.eur = eur;
	}
	public KursnaListaResultValutaDTO getUsd() {
		return usd;
	}
	public void setUsd(KursnaListaResultValutaDTO usd) {
		this.usd = usd;
	}
	public KursnaListaResultValutaDTO getChf() {
		return chf;
	}
	public void setChf(KursnaListaResultValutaDTO chf) {
		this.chf = chf;
	}
	public KursnaListaResultValutaDTO getGbp() {
		return gbp;
	}
	public void setGbp(KursnaListaResultValutaDTO gbp) {
		this.gbp = gbp;
	}
	public KursnaListaResultValutaDTO getAud() {
		return aud;
	}
	public void setAud(KursnaListaResultValutaDTO aud) {
		this.aud = aud;
	}
	public KursnaListaResultValutaDTO getCad() {
		return cad;
	}
	public void setCad(KursnaListaResultValutaDTO cad) {
		this.cad = cad;
	}
	public KursnaListaResultValutaDTO getSek() {
		return sek;
	}
	public void setSek(KursnaListaResultValutaDTO sek) {
		this.sek = sek;
	}
	public KursnaListaResultValutaDTO getDkk() {
		return dkk;
	}
	public void setDkk(KursnaListaResultValutaDTO dkk) {
		this.dkk = dkk;
	}
	public KursnaListaResultValutaDTO getNok() {
		return nok;
	}
	public void setNok(KursnaListaResultValutaDTO nok) {
		this.nok = nok;
	}
	public KursnaListaResultValutaDTO getJpy() {
		return jpy;
	}
	public void setJpy(KursnaListaResultValutaDTO jpy) {
		this.jpy = jpy;
	}
	public KursnaListaResultValutaDTO getRub() {
		return rub;
	}
	public void setRub(KursnaListaResultValutaDTO rub) {
		this.rub = rub;
	}
	public KursnaListaResultValutaDTO getCny() {
		return cny;
	}
	public void setCny(KursnaListaResultValutaDTO cny) {
		this.cny = cny;
	}
	public KursnaListaResultValutaDTO getHrk() {
		return hrk;
	}
	public void setHrk(KursnaListaResultValutaDTO hrk) {
		this.hrk = hrk;
	}
	public KursnaListaResultValutaDTO getKwd() {
		return kwd;
	}
	public void setKwd(KursnaListaResultValutaDTO kwd) {
		this.kwd = kwd;
	}
	public KursnaListaResultValutaDTO getPln() {
		return pln;
	}
	public void setPln(KursnaListaResultValutaDTO pln) {
		this.pln = pln;
	}
	public KursnaListaResultValutaDTO getCzk() {
		return czk;
	}
	public void setCzk(KursnaListaResultValutaDTO czk) {
		this.czk = czk;
	}
	public KursnaListaResultValutaDTO getHuf() {
		return huf;
	}
	public void setHuf(KursnaListaResultValutaDTO huf) {
		this.huf = huf;
	}
	public KursnaListaResultValutaDTO getBam() {
		return bam;
	}
	public void setBam(KursnaListaResultValutaDTO bam) {
		this.bam = bam;
	}
	@Override
	public String toString() {
		return "KursnaListaResultDTO [date=" + date + ", code=" + code + ", status=" + status + ", eur=" + eur
				+ ", usd=" + usd + ", chf=" + chf + ", gbp=" + gbp + ", aud=" + aud + ", cad=" + cad + ", sek=" + sek
				+ ", dkk=" + dkk + ", nok=" + nok + ", jpy=" + jpy + ", rub=" + rub + ", cny=" + cny + ", hrk=" + hrk
				+ ", kwd=" + kwd + ", pln=" + pln + ", czk=" + czk + ", huf=" + huf + ", bam=" + bam + "]";
	}
	
	
	
	
}
