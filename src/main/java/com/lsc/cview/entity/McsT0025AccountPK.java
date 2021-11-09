package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0025AccountPK implements Serializable {
    @Id
    @Column(name = "IFTA_BASE_COUNTRY")
    private String iftaBaseCountry;

    @Id
    @Column(name = "IFTA_BASE_STATE")
    private String iftaBaseState;

    @Id
    @Column(name = "IFTA_LICENSE_NUMBER")
    private String iftaLicenseNumber;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0025AccountPK that = (McsT0025AccountPK) o;
        return Objects.equals(iftaBaseCountry, that.iftaBaseCountry) &&
                Objects.equals(iftaLicenseNumber, that.iftaLicenseNumber) &&
                Objects.equals(iftaBaseState, that.iftaBaseState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iftaBaseCountry, iftaLicenseNumber, iftaBaseState);
    }
}
