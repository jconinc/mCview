package com.lsc.cview.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class McsT0028RegistrationPK implements Serializable {
    @Id
    @Column(name = "REG_ID")
    private String regId;

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        McsT0028RegistrationPK that = (McsT0028RegistrationPK) o;
        return Objects.equals(regId, that.regId)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regId);
    }
}
