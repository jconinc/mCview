package com.lsc.cview.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "MCS_T0026_ADDRESS")
@IdClass(McsT0026AddressPK.class)
public class McsT0026Address {

  @Id
  @Column(name = "IRP_BASE_COUNTRY")
  private String irpBaseCountry;

  @Id
  @Column(name = "IRP_BASE_STATE")
  private String irpBaseState;

  @Id
  @Column(name = "IRP_ACCOUNT_NUMBER")
  private String irpAccountNumber;

  @Id
  @Column(name = "ADDRESS_TYPE")
  private String addressType;

  @Column(name = "STREET_LINE_1")
  private String streetLine1;

  @Column(name = "STREET_LINE_2")
  private String streetLine2;

  @Column(name = "PO_BOX")
  private String poBox;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "ZIP_CODE")
  private String zipCode;

  @Column(name = "COUNTY")
  private String county;

  @Column(name = "COLONIA")
  private String colonia;

  @Column(name = "COUNTRY")
  private String country;


  public String getIrpBaseCountry() {
    return irpBaseCountry;
  }

  public void setIrpBaseCountry(String irpBaseCountry) {
    this.irpBaseCountry = irpBaseCountry;
  }


  public String getIrpBaseState() {
    return irpBaseState;
  }

  public void setIrpBaseState(String irpBaseState) {
    this.irpBaseState = irpBaseState;
  }


  public String getIrpAccountNumber() {
    return irpAccountNumber;
  }

  public void setIrpAccountNumber(String irpAccountNumber) {
    this.irpAccountNumber = irpAccountNumber;
  }


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public String getStreetLine1() {
    return streetLine1;
  }

  public void setStreetLine1(String streetLine1) {
    this.streetLine1 = streetLine1;
  }


  public String getStreetLine2() {
    return streetLine2;
  }

  public void setStreetLine2(String streetLine2) {
    this.streetLine2 = streetLine2;
  }


  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
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


  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }


  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
