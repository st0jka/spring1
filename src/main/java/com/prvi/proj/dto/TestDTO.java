package com.prvi.proj.dto;

public class TestDTO {
    private String prvoPolje;
    private String drugoPolje;

    public TestDTO(String prvoPolje, String drugoPolje) {
        this.prvoPolje = prvoPolje;
        this.drugoPolje = drugoPolje;
    }

    public String getPrvoPolje() {
        return prvoPolje;
    }

    public void setPrvoPolje(String prvoPolje) {
        this.prvoPolje = prvoPolje;
    }

    public String getDrugoPolje() {
        return drugoPolje;
    }

    public void setDrugoPolje(String drugoPolje) {
        this.drugoPolje = drugoPolje;
    }


    @Override
    public String toString() {
        return "TestDTO{" +
                "prvoPolje='" + prvoPolje + '\'' +
                ", drugoPolje='" + drugoPolje + '\'' +
                '}';
    }
}
