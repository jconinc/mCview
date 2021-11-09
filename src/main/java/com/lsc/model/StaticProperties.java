package com.lsc.model;

import com.lsc.mcarrier.entity.CodeTableEntity;

import java.util.List;

public class StaticProperties {
    private List<CodeTableEntity> jurisdictions;
    private List<CodeTableEntity> jurisCountries;
    private List<CodeTableEntity> securityQuestions;
    private List<CodeTableEntity> countries;
    private String userid;

    public List<CodeTableEntity> getJurisdictions() {
        return jurisdictions;
    }

    public void setJurisdictions(List<CodeTableEntity> jurisdictions) {
        this.jurisdictions = jurisdictions;
    }

    public List<CodeTableEntity> getJurisCountries() {
        return jurisCountries;
    }

    public void setJurisCountries(List<CodeTableEntity> jurisCountries) {
        this.jurisCountries = jurisCountries;
    }

    public List<CodeTableEntity> getSecurityQuestions() {
        return securityQuestions;
    }

    public void setSecurityQuestions(List<CodeTableEntity> securityQuestions) {
        this.securityQuestions = securityQuestions;
    }

    public List<CodeTableEntity> getCountries() {
        return countries;
    }

    public void setCountries(List<CodeTableEntity> countries) {
        this.countries = countries;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
