package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0034_UCR_REGISTRATION")
@IdClass(McsT0034UcrRegistrationPK.class)
public class McsT0034UcrRegistration {

  @Id
  @Column(name = "MCS_T0034_SEQ")
  private String mcsT0034Seq;

  @Column(name = "DOT_NUMBER")
  private String dotNumber;

  @Column(name = "MC_NUMBER")
  private String mcNumber;

  @Column(name = "FF_NUMBER")
  private String ffNumber;

  @Column(name = "MC_MX_TAG")
  private String mcMxTag;

  @Column(name = "INTRASTATE_FLAG")
  private String intrastateFlag;

  @Column(name = "FEE_PAYMENT_FLAG")
  private String feePaymentFlag;

  @Column(name = "REGISTRATION_YEAR")
  private String registrationYear;

  @Column(name = "PAYMENT_UPDATE_DATE")
  private java.sql.Date paymentUpdateDate;

  @Column(name = "BASE_STATE")
  private String baseState;

  @Column(name = "OPERATING_STATES")
  private String operatingStates;

  @Column(name = "UPLOAD_JURISDICTION")
  private String uploadJurisdiction;


  public String getMcsT0034Seq() {
    return mcsT0034Seq;
  }

  public void setMcsT0034Seq(String mcsT0034Seq) {
    this.mcsT0034Seq = mcsT0034Seq;
  }


  public String getDotNumber() {
    return dotNumber;
  }

  public void setDotNumber(String dotNumber) {
    this.dotNumber = dotNumber;
  }


  public String getMcNumber() {
    return mcNumber;
  }

  public void setMcNumber(String mcNumber) {
    this.mcNumber = mcNumber;
  }


  public String getFfNumber() {
    return ffNumber;
  }

  public void setFfNumber(String ffNumber) {
    this.ffNumber = ffNumber;
  }


  public String getMcMxTag() {
    return mcMxTag;
  }

  public void setMcMxTag(String mcMxTag) {
    this.mcMxTag = mcMxTag;
  }


  public String getIntrastateFlag() {
    return intrastateFlag;
  }

  public void setIntrastateFlag(String intrastateFlag) {
    this.intrastateFlag = intrastateFlag;
  }


  public String getFeePaymentFlag() {
    return feePaymentFlag;
  }

  public void setFeePaymentFlag(String feePaymentFlag) {
    this.feePaymentFlag = feePaymentFlag;
  }


  public String getRegistrationYear() {
    return registrationYear;
  }

  public void setRegistrationYear(String registrationYear) {
    this.registrationYear = registrationYear;
  }


  public java.sql.Date getPaymentUpdateDate() {
    return paymentUpdateDate;
  }

  public void setPaymentUpdateDate(java.sql.Date paymentUpdateDate) {
    this.paymentUpdateDate = paymentUpdateDate;
  }


  public String getBaseState() {
    return baseState;
  }

  public void setBaseState(String baseState) {
    this.baseState = baseState;
  }


  public String getOperatingStates() {
    return operatingStates;
  }

  public void setOperatingStates(String operatingStates) {
    this.operatingStates = operatingStates;
  }


  public String getUploadJurisdiction() {
    return uploadJurisdiction;
  }

  public void setUploadJurisdiction(String uploadJurisdiction) {
    this.uploadJurisdiction = uploadJurisdiction;
  }

}
