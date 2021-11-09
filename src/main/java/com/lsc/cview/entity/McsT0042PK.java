package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class McsT0042PK implements Serializable {

    @Id
    @Column(name = "CARRIER_ID_NUMBER")
    private String carrierIdNumber;

    @Id
    @Column(name = "LAST_UPDATE_DATE")
    private java.sql.Date lastUpdateDate;

    public String getCarrierIdNumber() {
        return carrierIdNumber;
    }

    public void setCarrierIdNumber(String carrierIdNumber) {
        this.carrierIdNumber = carrierIdNumber;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0042PK that = (McsT0042PK) o;
        return Objects.equals(carrierIdNumber, that.carrierIdNumber) &&
                Objects.equals(lastUpdateDate, that.lastUpdateDate) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierIdNumber, lastUpdateDate);
    }
}
