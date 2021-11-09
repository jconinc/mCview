package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0032PrimaryPK implements Serializable {
    @Id
    @Column(name = "CARRIER_ID_NUMBER")
    private String carrierIdNumber;

    @Id
    @Column(name = "DOCKET_NUMBER")
    private String docketNumber;

    @Id
    @Column(name = "PREFIX")
    private String prefix;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0032PrimaryPK that = (McsT0032PrimaryPK) o;
        return Objects.equals(carrierIdNumber, that.carrierIdNumber) &&
                Objects.equals(docketNumber, that.docketNumber) &&
                Objects.equals(prefix, that.prefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierIdNumber, docketNumber, prefix);
    }
}
