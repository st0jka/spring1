package com.prvi.proj.dto;

public class ConvertFailDTO {
	private int code;
	private String msg;
	private String status;
	public ConvertFailDTO(int code, String msg, String status) {
		super();
		this.code = code;
		this.msg = msg;
		this.status = status;
	}
	public ConvertFailDTO() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ConvertFailDTO [code=" + code + ", msg=" + msg + ", status=" + status + "]";
	}
	
}
