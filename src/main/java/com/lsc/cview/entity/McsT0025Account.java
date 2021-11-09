package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0025_ACCOUNT")
@IdClass(McsT0025AccountPK.class)
public class McsT0025Account {

  @Id
  @Column(name = "IFTA_BASE_COUNTRY")
  private String iftaBaseCountry;

  @Id
  @Column(name = "IFTA_BASE_STATE")
  private String iftaBaseState;

  @Id
  @Column(name = "IFTA_LICENSE_NUMBER")
  private String iftaLicenseNumber;

  @Column(name = "IFTA_CARRIER_ID_NUMBER")
  private String iftaCarrierIdNumber;

  @Column(name = "IFTA_STATUS_CODE")
  private String iftaStatusCode;

  @Column(name = "IFTA_STATUS_DATE")
  private java.sql.Date iftaStatusDate;

  @Column(name = "IFTA_ISSUE_DATE")
  private java.sql.Date iftaIssueDate;

  @Column(name = "IFTA_EXPIRE_DATE")
  private java.sql.Date iftaExpireDate;

  @Column(name = "IFTA_UPDATE_DATE")
  private java.sql.Date iftaUpdateDate;

  @Column(name = "SENDING_STATE")
  private String sendingState;

  @Column(name = "IFTAEXPIREDATE")
  private java.sql.Date iftaexpiredate;

  @Column(name = "IFTAISSUEDATE")
  private java.sql.Date iftaissuedate;

  @Column(name = "IFTASTATUSCODE")
  private String iftastatuscode;

  @Column(name = "IFTASTATUSDATE")
  private java.sql.Date iftastatusdate;

  @Column(name = "IFTAUPDATEDATE")
  private java.sql.Date iftaupdatedate;

  @Column(name = "SENDINGSTATE")
  private String sendingstate;


  public String getIftaBaseCountry() {
    return iftaBaseCountry;
  }

  public void setIftaBaseCountry(String iftaBaseCountry) {
    this.iftaBaseCountry = iftaBaseCountry;
  }


  public String getIftaBaseState() {
    return iftaBaseState;
  }

  public void setIftaBaseState(String iftaBaseState) {
    this.iftaBaseState = iftaBaseState;
  }


  public String getIftaLicenseNumber() {
    return iftaLicenseNumber;
  }

  public void setIftaLicenseNumber(String iftaLicenseNumber) {
    this.iftaLicenseNumber = iftaLicenseNumber;
  }


  public String getIftaCarrierIdNumber() {
    return iftaCarrierIdNumber;
  }

  public void setIftaCarrierIdNumber(String iftaCarrierIdNumber) {
    this.iftaCarrierIdNumber = iftaCarrierIdNumber;
  }


  public String getIftaStatusCode() {
    return iftaStatusCode;
  }

  public void setIftaStatusCode(String iftaStatusCode) {
    this.iftaStatusCode = iftaStatusCode;
  }


  public java.sql.Date getIftaStatusDate() {
    return iftaStatusDate;
  }

  public void setIftaStatusDate(java.sql.Date iftaStatusDate) {
    this.iftaStatusDate = iftaStatusDate;
  }


  public java.sql.Date getIftaIssueDate() {
    return iftaIssueDate;
  }

  public void setIftaIssueDate(java.sql.Date iftaIssueDate) {
    this.iftaIssueDate = iftaIssueDate;
  }


  public java.sql.Date getIftaExpireDate() {
    return iftaExpireDate;
  }

  public void setIftaExpireDate(java.sql.Date iftaExpireDate) {
    this.iftaExpireDate = iftaExpireDate;
  }


  public java.sql.Date getIftaUpdateDate() {
    return iftaUpdateDate;
  }

  public void setIftaUpdateDate(java.sql.Date iftaUpdateDate) {
    this.iftaUpdateDate = iftaUpdateDate;
  }


  public String getSendingState() {
    return sendingState;
  }

  public void setSendingState(String sendingState) {
    this.sendingState = sendingState;
  }


  public java.sql.Date getIftaexpiredate() {
    return iftaexpiredate;
  }

  public void setIftaexpiredate(java.sql.Date iftaexpiredate) {
    this.iftaexpiredate = iftaexpiredate;
  }


  public java.sql.Date getIftaissuedate() {
    return iftaissuedate;
  }

  public void setIftaissuedate(java.sql.Date iftaissuedate) {
    this.iftaissuedate = iftaissuedate;
  }


  public String getIftastatuscode() {
    return iftastatuscode;
  }

  public void setIftastatuscode(String iftastatuscode) {
    this.iftastatuscode = iftastatuscode;
  }


  public java.sql.Date getIftastatusdate() {
    return iftastatusdate;
  }

  public void setIftastatusdate(java.sql.Date iftastatusdate) {
    this.iftastatusdate = iftastatusdate;
  }


  public java.sql.Date getIftaupdatedate() {
    return iftaupdatedate;
  }

  public void setIftaupdatedate(java.sql.Date iftaupdatedate) {
    this.iftaupdatedate = iftaupdatedate;
  }


  public String getSendingstate() {
    return sendingstate;
  }

  public void setSendingstate(String sendingstate) {
    this.sendingstate = sendingstate;
  }

}
