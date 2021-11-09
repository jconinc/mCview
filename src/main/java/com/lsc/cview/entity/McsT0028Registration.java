package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0028_REGISTRATION")
@IdClass(McsT0028RegistrationPK.class)
public class McsT0028Registration {

  @Id
  @Column(name = "REG_ID")
  private String regId;

  @Column(name = "VEH_ID")
  private String vehId;

  @Column(name = "LICENSE_PLATE_NUMBER")
  private String licensePlateNumber;

  @Column(name = "IRP_BASE_COUNTRY")
  private String irpBaseCountry;

  @Column(name = "IRP_BASE_STATE")
  private String irpBaseState;

  @Column(name = "UNIT_NUMBER")
  private String unitNumber;

  @Column(name = "LAST_UPDATE_DATE")
  private java.sql.Date lastUpdateDate;

  @Column(name = "INTERSTATE_FLAG")
  private String interstateFlag;

  @Column(name = "IRP_STATUS_CODE")
  private String irpStatusCode;

  @Column(name = "IRP_STATUS_DATE")
  private java.sql.Date irpStatusDate;

  @Column(name = "IRP_ACCOUNT_NUMBER")
  private String irpAccountNumber;

  @Column(name = "IRP_FLEET_NUMBER")
  private String irpFleetNumber;

  @Column(name = "REGISTRATION_START_DATE")
  private java.sql.Date registrationStartDate;

  @Column(name = "REGISTRATION_EXPIRE_DATE")
  private java.sql.Date registrationExpireDate;

  @Column(name = "OPERATOR_NAME")
  private String operatorName;

  @Column(name = "SAFETY_CARRIER")
  private String safetyCarrier;

  @Column(name = "IRP_CARRIER_ID_NUMBER")
  private String irpCarrierIdNumber;

  @Column(name = "IFTA_LICENSE_NUMBER")
  private String iftaLicenseNumber;

  @Column(name = "GVW")
  private String gvw;

  @Column(name = "GVW_EXPIRE_DATE")
  private java.sql.Date gvwExpireDate;

  @Column(name = "SENDING_STATE")
  private String sendingState;

  @Column(name = "VERIFICATION_SOURCE")
  private String verificationSource;

  @Column(name = "VERIFICATION_DATE")
  private java.sql.Date verificationDate;

  @Column(name = "TH_INDICATOR")
  private String thIndicator;


  public String getRegId() {
    return regId;
  }

  public void setRegId(String regId) {
    this.regId = regId;
  }


  public String getVehId() {
    return vehId;
  }

  public void setVehId(String vehId) {
    this.vehId = vehId;
  }


  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }


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


  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }


  public java.sql.Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(java.sql.Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public String getInterstateFlag() {
    return interstateFlag;
  }

  public void setInterstateFlag(String interstateFlag) {
    this.interstateFlag = interstateFlag;
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


  public String getIrpAccountNumber() {
    return irpAccountNumber;
  }

  public void setIrpAccountNumber(String irpAccountNumber) {
    this.irpAccountNumber = irpAccountNumber;
  }


  public String getIrpFleetNumber() {
    return irpFleetNumber;
  }

  public void setIrpFleetNumber(String irpFleetNumber) {
    this.irpFleetNumber = irpFleetNumber;
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


  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public String getSafetyCarrier() {
    return safetyCarrier;
  }

  public void setSafetyCarrier(String safetyCarrier) {
    this.safetyCarrier = safetyCarrier;
  }


  public String getIrpCarrierIdNumber() {
    return irpCarrierIdNumber;
  }

  public void setIrpCarrierIdNumber(String irpCarrierIdNumber) {
    this.irpCarrierIdNumber = irpCarrierIdNumber;
  }


  public String getIftaLicenseNumber() {
    return iftaLicenseNumber;
  }

  public void setIftaLicenseNumber(String iftaLicenseNumber) {
    this.iftaLicenseNumber = iftaLicenseNumber;
  }


  public String getGvw() {
    return gvw;
  }

  public void setGvw(String gvw) {
    this.gvw = gvw;
  }


  public java.sql.Date getGvwExpireDate() {
    return gvwExpireDate;
  }

  public void setGvwExpireDate(java.sql.Date gvwExpireDate) {
    this.gvwExpireDate = gvwExpireDate;
  }


  public String getSendingState() {
    return sendingState;
  }

  public void setSendingState(String sendingState) {
    this.sendingState = sendingState;
  }


  public String getVerificationSource() {
    return verificationSource;
  }

  public void setVerificationSource(String verificationSource) {
    this.verificationSource = verificationSource;
  }


  public java.sql.Date getVerificationDate() {
    return verificationDate;
  }

  public void setVerificationDate(java.sql.Date verificationDate) {
    this.verificationDate = verificationDate;
  }


  public String getThIndicator() {
    return thIndicator;
  }

  public void setThIndicator(String thIndicator) {
    this.thIndicator = thIndicator;
  }

}
