package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0028_VIN")
@IdClass(McsT0028VinPK.class)
public class McsT0028Vin {

  @Id
  @Column(name = "VEH_ID")
  private String vehId;

  @Column(name = "VIN")
  private String vin;

  @Column(name = "TITLE_NUMBER")
  private String titleNumber;

  @Column(name = "TITLE_COUNTRY_CODE")
  private String titleCountryCode;

  @Column(name = "TITLE_JURISDICTION")
  private String titleJurisdiction;

  @Column(name = "OWNER_NAME")
  private String ownerName;

  @Column(name = "MODEL_YEAR")
  private String modelYear;

  @Column(name = "MAKE")
  private String make;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "MODEL")
  private String model;

  @Column(name = "FUEL")
  private String fuel;

  @Column(name = "UNLADEN_WEIGHT")
  private String unladenWeight;

  @Column(name = "NUMBER_OF_AXLES")
  private String numberOfAxles;


  public String getVehId() {
    return vehId;
  }

  public void setVehId(String vehId) {
    this.vehId = vehId;
  }


  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }


  public String getTitleNumber() {
    return titleNumber;
  }

  public void setTitleNumber(String titleNumber) {
    this.titleNumber = titleNumber;
  }


  public String getTitleCountryCode() {
    return titleCountryCode;
  }

  public void setTitleCountryCode(String titleCountryCode) {
    this.titleCountryCode = titleCountryCode;
  }


  public String getTitleJurisdiction() {
    return titleJurisdiction;
  }

  public void setTitleJurisdiction(String titleJurisdiction) {
    this.titleJurisdiction = titleJurisdiction;
  }


  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
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


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public String getFuel() {
    return fuel;
  }

  public void setFuel(String fuel) {
    this.fuel = fuel;
  }


  public String getUnladenWeight() {
    return unladenWeight;
  }

  public void setUnladenWeight(String unladenWeight) {
    this.unladenWeight = unladenWeight;
  }


  public String getNumberOfAxles() {
    return numberOfAxles;
  }

  public void setNumberOfAxles(String numberOfAxles) {
    this.numberOfAxles = numberOfAxles;
  }

}
