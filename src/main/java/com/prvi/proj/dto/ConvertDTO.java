package com.prvi.proj.dto;

public class ConvertDTO {
    private ConvertResultDTO result;
    private int code;
    private String status;

    public ConvertDTO(ConvertResultDTO result, int code, String status) {
        super();
        this.result = result;
        this.code = code;
        this.status = status;
    }

    public ConvertDTO() {
        super();
    }

    public ConvertResultDTO getResult() {
        return result;
    }

    public void setResult(ConvertResultDTO result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ConvertDTO [result=" + result + ", code=" + code + ", status=" + status + "]";
    }

}
