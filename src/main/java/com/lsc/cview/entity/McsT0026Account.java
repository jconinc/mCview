package com.lsc.cview.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "MCS_T0026_ACCOUNT")
@IdClass(McsT0026AccountPK.class)
public class McsT0026Account {

  @Id
  @Column(name = "IRP_BASE_COUNTRY")
  private String irpBaseCountry;

  @Id
  @Column(name = "IRP_BASE_STATE")
  private String irpBaseState;

  @Id
  @Column(name = "IRP_ACCOUNT_NUMBER")
  private String irpAccountNumber;

  @Column(name = "IRP_ACCOUNT_TYPE")
  private String irpAccountType;

  @Column(name = "IRP_STATUS_CODE")
  private String irpStatusCode;

  @Column(name = "IRP_STATUS_DATE")
  private java.sql.Date irpStatusDate;

  @Column(name = "IRP_CARRIER_ID_NUMBER")
  private String irpCarrierIdNumber;

  @Column(name = "IRP_UPDATE_DATE")
  private java.sql.Date irpUpdateDate;

  @Column(name = "SENDING_STATE")
  private String sendingState;


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


  public String getIrpAccountType() {
    return irpAccountType;
  }

  public void setIrpAccountType(String irpAccountType) {
    this.irpAccountType = irpAccountType;
  }


  public String getIrpStatusCode() {
    return irpStatusCode;
  }

  public void setIrpStatusCode(String irpStatusCode) {
    this.irpStatusCode = irpStatusCode;
  }


  public java.sql.Date getIrpStatusDate() {
    return irpStatusDate;
  }

  public void setIrpStatusDate(java.sql.Date irpStatusDate) {
    this.irpStatusDate = irpStatusDate;
  }


  public String getIrpCarrierIdNumber() {
    return irpCarrierIdNumber;
  }

  public void setIrpCarrierIdNumber(String irpCarrierIdNumber) {
    this.irpCarrierIdNumber = irpCarrierIdNumber;
  }


  public java.sql.Date getIrpUpdateDate() {
    return irpUpdateDate;
  }

  public void setIrpUpdateDate(java.sql.Date irpUpdateDate) {
    this.irpUpdateDate = irpUpdateDate;
  }


  public String getSendingState() {
    return sendingState;
  }

  public void setSendingState(String sendingState) {
    this.sendingState = sendingState;
  }

}
