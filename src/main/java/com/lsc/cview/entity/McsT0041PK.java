package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0041PK implements Serializable {
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public String getSafetyCarrier() {
        return safetyCarrier;
    }

    public void setSafetyCarrier(String safetyCarrier) {
        this.safetyCarrier = safetyCarrier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0041PK that = (McsT0041PK) o;
        return Objects.equals(licensePlateNumber, that.licensePlateNumber) &&
                Objects.equals(registrationJurisdiction, that.registrationJurisdiction) &&
                Objects.equals(vin, that.vin) &&
                Objects.equals(safetyCarrier, that.safetyCarrier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlateNumber, registrationJurisdiction, safetyCarrier, vin);
    }
}
