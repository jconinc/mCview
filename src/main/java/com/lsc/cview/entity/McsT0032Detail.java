package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0032_DETAIL")
@IdClass(McsT0032DetailPK.class)
public class McsT0032Detail {

  @Id
  @Column(name = "CARRIER_ID_NUMBER")
  private String carrierIdNumber;

  @Id
  @Column(name = "SEQUENCE_NUMBER")
  private String sequenceNumber;

  @Id
  @Column(name = "INSURANCE_TYPE")
  private String insuranceType;

  @Id
  @Column(name = "INSURER")
  private String insurer;

  @Id
  @Column(name = "DOCKET_NUMBER")
  private String docketNumber;

  @Column(name = "POLICY_NUMBER")
  private String policyNumber;

  @Column(name = "POLICY_EFFECTIVE_DATE")
  private java.sql.Date policyEffectiveDate;

  @Column(name = "COVERAGE_LOW_AMOUNT")
  private String coverageLowAmount;

  @Column(name = "COVERAGE_HIGH_AMOUNT")
  private String coverageHighAmount;

  @Column(name = "CANCELLATION_EFFECTIVE_DATE")
  private java.sql.Date cancellationEffectiveDate;




  public String getCarrierIdNumber() {
    return carrierIdNumber;
  }

  public void setCarrierIdNumber(String carrierIdNumber) {
    this.carrierIdNumber = carrierIdNumber;
  }


  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public String getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }


  public String getInsurer() {
    return insurer;
  }

  public void setInsurer(String insurer) {
    this.insurer = insurer;
  }


  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }


  public java.sql.Date getPolicyEffectiveDate() {
    return policyEffectiveDate;
  }

  public void setPolicyEffectiveDate(java.sql.Date policyEffectiveDate) {
    this.policyEffectiveDate = policyEffectiveDate;
  }


  public String getCoverageLowAmount() {
    return coverageLowAmount;
  }

  public void setCoverageLowAmount(String coverageLowAmount) {
    this.coverageLowAmount = coverageLowAmount;
  }


  public String getCoverageHighAmount() {
    return coverageHighAmount;
  }

  public void setCoverageHighAmount(String coverageHighAmount) {
    this.coverageHighAmount = coverageHighAmount;
  }


  public java.sql.Date getCancellationEffectiveDate() {
    return cancellationEffectiveDate;
  }

  public void setCancellationEffectiveDate(java.sql.Date cancellationEffectiveDate) {
    this.cancellationEffectiveDate = cancellationEffectiveDate;
  }


  public String getDocketNumber() {
    return docketNumber;
  }

  public void setDocketNumber(String docketNumber) {
    this.docketNumber = docketNumber;
  }

}
