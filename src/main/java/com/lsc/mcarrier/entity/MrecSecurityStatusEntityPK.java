package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MrecSecurityStatusEntityPK implements Serializable {
    @Id
    @Column(name = "USER_ID")
    private String userId;


    @Id
    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public java.sql.Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(java.sql.Timestamp createTs) {
        this.createTs = createTs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MrecSecurityStatusEntityPK that = (MrecSecurityStatusEntityPK) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(createTs, that.createTs) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, createTs);
    }

}
