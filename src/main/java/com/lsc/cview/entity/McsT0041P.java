package com.lsc.cview.entity;

import javax.persistence.*;

@Entity
@Table(name = "MCS_T0041P")
@IdClass(McsT0041PK.class)
public class McsT0041P {
//, SAFETY_CARRIER, LICENSE_PLATE_NUMBER,
  @Id
  @Column(name = "VIN")
  private String vin;

  @Id
  @Column(name = "LICENSE_PLATE_NUMBER")
  private String licensePlateNumber;

  @Id
  @Column(name = "REGISTRATION_JURISDICTION")
  private String registrationJurisdiction;

  @Id
  @Column(name = "SAFETY_CARRIER")
  private String safetyCarrier;

  @Column(name = "MCSIP_STEP")
  private String mcsipStep;

  @Column(name = "MODEL_YEAR")
  private String modelYear;

  @Column(name = "MAKE")
  private String make;

  @Column(name = "LAST_UPDATE_DATE")
  private java.sql.Date lastUpdateDate;

  @Column(name = "LAST_CENSUS_UPDATE_DATE")
  private java.sql.Date lastCensusUpdateDate;

  @Column(name = "REGISTRATION_START_DATE")
  private java.sql.Date registrationStartDate;

  @Column(name = "REGISTRATION_EXPIRE_DATE")
  private java.sql.Date registrationExpireDate;


  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }


  public String getMcsipStep() {
    return mcsipStep;
  }

  public void setMcsipStep(String mcsipStep) {
    this.mcsipStep = mcsipStep;
  }


  public String getModelYear() {
    return modelYear;
  }

  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
  }


  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }


  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }


  public String getRegistrationJurisdiction() {
    return registrationJurisdiction;
  }

  public void setRegistrationJurisdiction(String registrationJurisdiction) {
    this.registrationJurisdiction = registrationJurisdiction;
  }


  public java.sql.Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(java.sql.Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public java.sql.Date getLastCensusUpdateDate() {
    return lastCensusUpdateDate;
  }

  public void setLastCensusUpdateDate(java.sql.Date lastCensusUpdateDate) {
    this.lastCensusUpdateDate = lastCensusUpdateDate;
  }


  public java.sql.Date getRegistrationStartDate() {
    return registrationStartDate;
  }

  public void setRegistrationStartDate(java.sql.Date registrationStartDate) {
    this.registrationStartDate = registrationStartDate;
  }


  public java.sql.Date getRegistrationExpireDate() {
    return registrationExpireDate;
  }

  public void setRegistrationExpireDate(java.sql.Date registrationExpireDate) {
    this.registrationExpireDate = registrationExpireDate;
  }


  public String getSafetyCarrier() {
    return safetyCarrier;
  }

  public void setSafetyCarrier(String safetyCarrier) {
    this.safetyCarrier = safetyCarrier;
  }

}
