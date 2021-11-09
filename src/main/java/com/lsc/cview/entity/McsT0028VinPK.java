package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0028VinPK implements Serializable {
    @Id
    @Column(name = "VEH_ID")
    private String vehId;

    public String getVehId() {
        return vehId;
    }

    public void setVehId(String vehId) {
        this.vehId = vehId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0028VinPK that = (McsT0028VinPK) o;
        return Objects.equals(vehId, that.vehId) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehId);
    }
}
