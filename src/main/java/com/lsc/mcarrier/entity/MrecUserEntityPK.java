package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MrecUserEntityPK implements Serializable {
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "UPDATE_TS")
    private java.sql.Timestamp updateTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userid) {
        this.userId = userId;
    }


    public java.sql.Timestamp getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(java.sql.Timestamp updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MrecUserEntityPK that = (MrecUserEntityPK) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(updateTs, that.updateTs) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, updateTs);
    }
}
