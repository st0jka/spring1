package com.prvi.proj.dto;

public class KursnaListaResultValutaDTO {
	private String kup;
	private String sre;
	private String pro;
	
	public KursnaListaResultValutaDTO() {
		super();
	}
	public KursnaListaResultValutaDTO(String kup, String sre, String pro) {
		super();
		this.kup = kup;
		this.sre = sre;
		this.pro = pro;
	}
	public String getKup() {
		return kup;
	}
	public void setKup(String kup) {
		this.kup = kup;
	}
	public String getSre() {
		return sre;
	}
	public void setSre(String sre) {
		this.sre = sre;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "KursnaListaResultValutaDTO [kup=" + kup + ", sre=" + sre + ", pro=" + pro + "]";
	}
	
	
}
