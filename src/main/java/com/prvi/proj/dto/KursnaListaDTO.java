package com.prvi.proj.dto;

public class KursnaListaDTO {
	private KursnaListaResultDTO result;

	
	
	public KursnaListaDTO() {
		super();
	}

	public KursnaListaDTO(KursnaListaResultDTO result) {
		super();
		this.result = result;
	}

	public KursnaListaResultDTO getResult() {
		return result;
	}

	public void setResult(KursnaListaResultDTO result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "KursnaListaDTO [result=" + result + "]";
	}
	
	
}
