package com.prvi.proj.dto;

public class ConvertResultDTO {
	private String date;
	private double amount;
	private String from;
	private String to;
	private String type;
	private double value;
	public ConvertResultDTO(String date, double amount, String from, String to, String type, double value) {
		super();
		this.date = date;
		this.amount = amount;
		this.from = from;
		this.to = to;
		this.type = type;
		this.value = value;
	}
	public ConvertResultDTO() {
		super();
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ConvertResultDTO [date=" + date + ", amount=" + amount + ", from=" + from + ", to=" + to + ", type="
				+ type + ", value=" + value + "]";
	}
	
}

