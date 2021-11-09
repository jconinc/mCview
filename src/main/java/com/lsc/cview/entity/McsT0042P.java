package com.lsc.cview.entity;

import javax.persistence.*;

@Entity
@Table(name = "MCS_T0042P")
@IdClass(McsT0042PK.class)
public class McsT0042P {

  @Id
  @Column(name = "CARRIER_ID_NUMBER")
  private String carrierIdNumber;

  @Id
  @Column(name = "LAST_UPDATE_DATE")
  private java.sql.Date lastUpdateDate;

  @Column(name = "CARRIER_NAME")
  private String carrierName;

  @Column(name = "DBA_NAME")
  private String dbaName;

  @Column(name = "STREET")
  private String street;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "ZIP_CODE")
  private String zipCode;

  @Column(name = "MCSIP_LEVEL")
  private String mcsipLevel;

  @Column(name = "MCSIP_LEVEL_DATE")
  private java.sql.Date mcsipLevelDate;

  @Column(name = "LAST_UPDATE_USERID")
  private String lastUpdateUserid;


  public String getCarrierIdNumber() {
    return carrierIdNumber;
  }

  public void setCarrierIdNumber(String carrierIdNumber) {
    this.carrierIdNumber = carrierIdNumber;
  }


  public java.sql.Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(java.sql.Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public String getDbaName() {
    return dbaName;
  }

  public void setDbaName(String dbaName) {
    this.dbaName = dbaName;
  }


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public String getMcsipLevel() {
    return mcsipLevel;
  }

  public void setMcsipLevel(String mcsipLevel) {
    this.mcsipLevel = mcsipLevel;
  }


  public java.sql.Date getMcsipLevelDate() {
    return mcsipLevelDate;
  }

  public void setMcsipLevelDate(java.sql.Date mcsipLevelDate) {
    this.mcsipLevelDate = mcsipLevelDate;
  }


  public String getLastUpdateUserid() {
    return lastUpdateUserid;
  }

  public void setLastUpdateUserid(String lastUpdateUserid) {
    this.lastUpdateUserid = lastUpdateUserid;
  }

}
