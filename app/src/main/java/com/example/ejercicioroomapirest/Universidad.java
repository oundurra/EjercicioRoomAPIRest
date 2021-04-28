package com.example.ejercicioroomapirest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Universidad {
    @SerializedName("country") private String country;
    @SerializedName("domains") private String[] domains;
    @SerializedName("web_pages") private String[] web_pages;
    @SerializedName("alpha_two_code") private String alpha_two_code;
    @SerializedName("name") private String name;
    @SerializedName("state-provice") private String state_province;

    public Universidad(String country, String[] domains, String[] web_pages, String alpha_two_code, String name, String state_province) {
        this.country = country;
        this.domains = domains;
        this.web_pages = web_pages;
        this.alpha_two_code = alpha_two_code;
        this.name = name;
        this.state_province = state_province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getDomains() {
        return domains;
    }

    public void setDomains(String[] domains) {
        this.domains = domains;
    }

    public String[] getWeb_pages() {
        return web_pages;
    }

    public void setWeb_pages(String[] web_pages) {
        this.web_pages = web_pages;
    }

    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        this.alpha_two_code = alpha_two_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }
}


