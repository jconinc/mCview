package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0032DetailPK implements Serializable {
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

    public String getDocketNumber() {
        return docketNumber;
    }

    public void setDocketNumber(String docketNumber) {
        this.docketNumber = docketNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0032DetailPK that = (McsT0032DetailPK) o;
        return Objects.equals(carrierIdNumber, that.carrierIdNumber) &&
                Objects.equals(sequenceNumber, that.sequenceNumber) &&
                Objects.equals(insuranceType, that.insuranceType) &&
                Objects.equals(insurer, that.insurer) &&
                Objects.equals(docketNumber, that.docketNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierIdNumber, sequenceNumber, insuranceType, insurer, docketNumber);
    }
}
