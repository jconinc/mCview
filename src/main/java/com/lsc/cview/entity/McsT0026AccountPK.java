package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0026AccountPK implements Serializable {
    @Id
    @Column(name = "IRP_BASE_COUNTRY")
    private String irpBaseCountry;

    @Id
    @Column(name = "IRP_BASE_STATE")
    private String irpBaseState;

    @Id
    @Column(name = "IRP_ACCOUNT_NUMBER")
    private String irpAccountNumber;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0026AccountPK that = (McsT0026AccountPK) o;
        return Objects.equals(irpBaseCountry, that.irpBaseCountry) &&
                Objects.equals(irpBaseState, that.irpBaseState) &&
                Objects.equals(irpAccountNumber, that.irpAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(irpBaseCountry, irpAccountNumber, irpBaseState);
    }
}
