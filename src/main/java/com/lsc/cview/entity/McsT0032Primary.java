package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0032_PRIMARY")
@IdClass(McsT0032PrimaryPK.class)
public class McsT0032Primary {

  @Id
  @Column(name = "CARRIER_ID_NUMBER")
  private String carrierIdNumber;

  @Id
  @Column(name = "DOCKET_NUMBER")
  private String docketNumber;

  @Id
  @Column(name = "PREFIX")
  private String prefix;

  @Column(name = "CANADIAN_ID")
  private String canadianId;

  @Column(name = "MEXICAN_RFC")
  private String mexicanRfc;

  @Column(name = "MEXICAN_OP_AUTHORITY")
  private String mexicanOpAuthority;

  @Column(name = "INSURANCE_ENTITY_NAME")
  private String insuranceEntityName;

  @Column(name = "INSURANCE_DBA_NAME")
  private String insuranceDbaName;

  @Column(name = "MEXICAN_TERRITORY")
  private String mexicanTerritory;

  @Column(name = "COMMON_AUTH_STATUS")
  private String commonAuthStatus;

  @Column(name = "COMMON_AUTH_REASON_INACTIVE")
  private String commonAuthReasonInactive;

  @Column(name = "COMMON_AUTH_DATE_INACTIVE")
  private java.sql.Date commonAuthDateInactive;

  @Column(name = "CONTRACT_AUTH_STATUS")
  private String contractAuthStatus;

  @Column(name = "CONTRACT_AUTH_REASON_INACTIVE")
  private String contractAuthReasonInactive;

  @Column(name = "CONTRACT_AUTH_DATE_INACTIVE")
  private java.sql.Date contractAuthDateInactive;

  @Column(name = "BROKER_AUTH_STATUS")
  private String brokerAuthStatus;

  @Column(name = "BROKER_AUTH_REASON_INACTIVE")
  private String brokerAuthReasonInactive;

  @Column(name = "BROKER_AUTH_DATE_INACTIVE")
  private java.sql.Date brokerAuthDateInactive;

  @Column(name = "LIABILITY_INSURANCE_AMOUNT")
  private String liabilityInsuranceAmount;

  @Column(name = "LIABILITY_INSURANCE_REQD")
  private String liabilityInsuranceReqd;

  @Column(name = "LIABILITY_INSURANCE_STATUS")
  private String liabilityInsuranceStatus;

  @Column(name = "LIABILITY_INSURANCE_SUMMARY")
  private String liabilityInsuranceSummary;

  @Column(name = "CARGO_INSURANCE_REQD")
  private String cargoInsuranceReqd;

  @Column(name = "CARGO_INSURANCE_STATUS")
  private String cargoInsuranceStatus;

  @Column(name = "CARGO_INSURANCE_SUMMARY")
  private String cargoInsuranceSummary;

  @Column(name = "BOND_TRUST_FUND_REQD")
  private String bondTrustFundReqd;

  @Column(name = "BOND_TRUST_FUND_STATUS")
  private String bondTrustFundStatus;

  @Column(name = "BOND_TRUST_FUND_SUMMARY")
  private String bondTrustFundSummary;

  @Column(name = "DATA_EFFECTIVE_DATE")
  private java.sql.Date dataEffectiveDate;


  public String getCarrierIdNumber() {
    return carrierIdNumber;
  }

  public void setCarrierIdNumber(String carrierIdNumber) {
    this.carrierIdNumber = carrierIdNumber;
  }


  public String getDocketNumber() {
    return docketNumber;
  }

  public void setDocketNumber(String docketNumber) {
    this.docketNumber = docketNumber;
  }


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public String getCanadianId() {
    return canadianId;
  }

  public void setCanadianId(String canadianId) {
    this.canadianId = canadianId;
  }


  public String getMexicanRfc() {
    return mexicanRfc;
  }

  public void setMexicanRfc(String mexicanRfc) {
    this.mexicanRfc = mexicanRfc;
  }


  public String getMexicanOpAuthority() {
    return mexicanOpAuthority;
  }

  public void setMexicanOpAuthority(String mexicanOpAuthority) {
    this.mexicanOpAuthority = mexicanOpAuthority;
  }


  public String getInsuranceEntityName() {
    return insuranceEntityName;
  }

  public void setInsuranceEntityName(String insuranceEntityName) {
    this.insuranceEntityName = insuranceEntityName;
  }


  public String getInsuranceDbaName() {
    return insuranceDbaName;
  }

  public void setInsuranceDbaName(String insuranceDbaName) {
    this.insuranceDbaName = insuranceDbaName;
  }


  public String getMexicanTerritory() {
    return mexicanTerritory;
  }

  public void setMexicanTerritory(String mexicanTerritory) {
    this.mexicanTerritory = mexicanTerritory;
  }


  public String getCommonAuthStatus() {
    return commonAuthStatus;
  }

  public void setCommonAuthStatus(String commonAuthStatus) {
    this.commonAuthStatus = commonAuthStatus;
  }


  public String getCommonAuthReasonInactive() {
    return commonAuthReasonInactive;
  }

  public void setCommonAuthReasonInactive(String commonAuthReasonInactive) {
    this.commonAuthReasonInactive = commonAuthReasonInactive;
  }


  public java.sql.Date getCommonAuthDateInactive() {
    return commonAuthDateInactive;
  }

  public void setCommonAuthDateInactive(java.sql.Date commonAuthDateInactive) {
    this.commonAuthDateInactive = commonAuthDateInactive;
  }


  public String getContractAuthStatus() {
    return contractAuthStatus;
  }

  public void setContractAuthStatus(String contractAuthStatus) {
    this.contractAuthStatus = contractAuthStatus;
  }


  public String getContractAuthReasonInactive() {
    return contractAuthReasonInactive;
  }

  public void setContractAuthReasonInactive(String contractAuthReasonInactive) {
    this.contractAuthReasonInactive = contractAuthReasonInactive;
  }


  public java.sql.Date getContractAuthDateInactive() {
    return contractAuthDateInactive;
  }

  public void setContractAuthDateInactive(java.sql.Date contractAuthDateInactive) {
    this.contractAuthDateInactive = contractAuthDateInactive;
  }


  public String getBrokerAuthStatus() {
    return brokerAuthStatus;
  }

  public void setBrokerAuthStatus(String brokerAuthStatus) {
    this.brokerAuthStatus = brokerAuthStatus;
  }


  public String getBrokerAuthReasonInactive() {
    return brokerAuthReasonInactive;
  }

  public void setBrokerAuthReasonInactive(String brokerAuthReasonInactive) {
    this.brokerAuthReasonInactive = brokerAuthReasonInactive;
  }


  public java.sql.Date getBrokerAuthDateInactive() {
    return brokerAuthDateInactive;
  }

  public void setBrokerAuthDateInactive(java.sql.Date brokerAuthDateInactive) {
    this.brokerAuthDateInactive = brokerAuthDateInactive;
  }


  public String getLiabilityInsuranceAmount() {
    return liabilityInsuranceAmount;
  }

  public void setLiabilityInsuranceAmount(String liabilityInsuranceAmount) {
    this.liabilityInsuranceAmount = liabilityInsuranceAmount;
  }


  public String getLiabilityInsuranceReqd() {
    return liabilityInsuranceReqd;
  }

  public void setLiabilityInsuranceReqd(String liabilityInsuranceReqd) {
    this.liabilityInsuranceReqd = liabilityInsuranceReqd;
  }


  public String getLiabilityInsuranceStatus() {
    return liabilityInsuranceStatus;
  }

  public void setLiabilityInsuranceStatus(String liabilityInsuranceStatus) {
    this.liabilityInsuranceStatus = liabilityInsuranceStatus;
  }


  public String getLiabilityInsuranceSummary() {
    return liabilityInsuranceSummary;
  }

  public void setLiabilityInsuranceSummary(String liabilityInsuranceSummary) {
    this.liabilityInsuranceSummary = liabilityInsuranceSummary;
  }


  public String getCargoInsuranceReqd() {
    return cargoInsuranceReqd;
  }

  public void setCargoInsuranceReqd(String cargoInsuranceReqd) {
    this.cargoInsuranceReqd = cargoInsuranceReqd;
  }


  public String getCargoInsuranceStatus() {
    return cargoInsuranceStatus;
  }

  public void setCargoInsuranceStatus(String cargoInsuranceStatus) {
    this.cargoInsuranceStatus = cargoInsuranceStatus;
  }


  public String getCargoInsuranceSummary() {
    return cargoInsuranceSummary;
  }

  public void setCargoInsuranceSummary(String cargoInsuranceSummary) {
    this.cargoInsuranceSummary = cargoInsuranceSummary;
  }


  public String getBondTrustFundReqd() {
    return bondTrustFundReqd;
  }

  public void setBondTrustFundReqd(String bondTrustFundReqd) {
    this.bondTrustFundReqd = bondTrustFundReqd;
  }


  public String getBondTrustFundStatus() {
    return bondTrustFundStatus;
  }

  public void setBondTrustFundStatus(String bondTrustFundStatus) {
    this.bondTrustFundStatus = bondTrustFundStatus;
  }


  public String getBondTrustFundSummary() {
    return bondTrustFundSummary;
  }

  public void setBondTrustFundSummary(String bondTrustFundSummary) {
    this.bondTrustFundSummary = bondTrustFundSummary;
  }


  public java.sql.Date getDataEffectiveDate() {
    return dataEffectiveDate;
  }

  public void setDataEffectiveDate(java.sql.Date dataEffectiveDate) {
    this.dataEffectiveDate = dataEffectiveDate;
  }

}
