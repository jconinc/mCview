package com.lsc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class OrganizationEntries {
    private String msccOrg;
    private String legalName;
    private String dbaName;
    private String phn;
    private String phnExt;
    private String addrL1_b;
    private String addrL2_b;
    private String city_b;
    private String country_b;
    private String juris_b;
    private String postalCode_b;
    private String addrL1_m;
    private String addrL2_m;
    private String city_m;
    private String country_m;
    private String juris_m;
    private String postalCode_m;

    @JsonIgnore
    public boolean isMailing() {
        if (getAddrL1_m() != null && getAddrL1_m().trim().length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getMsccOrg() {
        return msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getDbaName() {
        return dbaName;
    }

    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getPhnExt() {
        return phnExt;
    }

    public void setPhnExt(String phnExt) {
        this.phnExt = phnExt;
    }

    public String getAddrL1_b() {
        return addrL1_b;
    }

    public void setAddrL1_b(String addrL1_b) {
        this.addrL1_b = addrL1_b;
    }

    public String getAddrL2_b() {
        return addrL2_b;
    }

    public void setAddrL2_b(String addrL2_b) {
        this.addrL2_b = addrL2_b;
    }

    public String getCity_b() {
        return city_b;
    }

    public void setCity_b(String city_b) {
        this.city_b = city_b;
    }

    public String getCountry_b() {
        return country_b;
    }

    public void setCountry_b(String country_b) {
        this.country_b = country_b;
    }

    public String getJuris_b() {
        return juris_b;
    }

    public void setJuris_b(String juris_b) {
        this.juris_b = juris_b;
    }

    public String getPostalCode_b() {
        return postalCode_b;
    }

    public void setPostalCode_b(String postalCode_b) {
        this.postalCode_b = postalCode_b;
    }

    public String getAddrL1_m() {
        return addrL1_m;
    }

    public void setAddrL1_m(String addrL1_m) {
        this.addrL1_m = addrL1_m;
    }

    public String getAddrL2_m() {
        return addrL2_m;
    }

    public void setAddrL2_m(String addrL2_m) {
        this.addrL2_m = addrL2_m;
    }

    public String getCity_m() {
        return city_m;
    }

    public void setCity_m(String city_m) {
        this.city_m = city_m;
    }

    public String getCountry_m() {
        return country_m;
    }

    public void setCountry_m(String country_m) {
        this.country_m = country_m;
    }

    public String getJuris_m() {
        return juris_m;
    }

    public void setJuris_m(String juris_m) {
        this.juris_m = juris_m;
    }

    public String getPostalCode_m() {
        return postalCode_m;
    }

    public void setPostalCode_m(String postalCode_m) {
        this.postalCode_m = postalCode_m;
    }
}
