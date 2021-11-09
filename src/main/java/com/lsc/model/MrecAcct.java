package com.lsc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MrecAcct {

  private String msccOrg;
  private java.sql.Timestamp lastUpdtTs;
  private String baseCountry;
  private String legalName;
  private String dbaName;
  private String baseJuris;
  private String addrL1;
  private String addrL2;
  private String city;
  private String postalCode;
  private String phn;
  private String phnExt;
  private String lastUpdtUserid;

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

  public String getMsccOrg() {
    return msccOrg;
  }

  public void setMsccOrg(String msccOrg) {
    this.msccOrg = msccOrg;
  }


  public java.sql.Timestamp getLastUpdtTs() {
    return lastUpdtTs;
  }

  public void setLastUpdtTs(java.sql.Timestamp lastUpdtTs) {
    this.lastUpdtTs = lastUpdtTs;
  }


  public String getBaseCountry() {
    return baseCountry;
  }

  public void setBaseCountry(String baseCountry) {
    this.baseCountry = baseCountry;
  }


  public String getBaseJuris() {
    return baseJuris;
  }

  public void setBaseJuris(String baseJuris) {
    this.baseJuris = baseJuris;
  }


  public String getAddrL1() {
    return addrL1;
  }

  public void setAddrL1(String addrL1) {
    this.addrL1 = addrL1;
  }


  public String getAddrL2() {
    return addrL2;
  }

  public void setAddrL2(String addrL2) {
    this.addrL2 = addrL2;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
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


  public String getLastUpdtUserid() {
    return lastUpdtUserid;
  }

  public void setLastUpdtUserid(String lastUpdtUserid) {
    this.lastUpdtUserid = lastUpdtUserid;
  }

}
