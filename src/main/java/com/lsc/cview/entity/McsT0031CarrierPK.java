package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0031CarrierPK implements Serializable {

    @Id
    @Column(name = "CARRIER_ID_NUMBER")
    private String carrierIdNumber;

    public String getCarrierIdNumber() {
        return carrierIdNumber;
    }

    public void setCarrierIdNumber(String carrierIdNumber) {
        this.carrierIdNumber = carrierIdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0031CarrierPK that = (McsT0031CarrierPK) o;
        return Objects.equals(carrierIdNumber, that.carrierIdNumber)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierIdNumber);
    }
}
