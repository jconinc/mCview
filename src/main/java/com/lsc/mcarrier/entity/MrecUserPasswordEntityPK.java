package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class MrecUserPasswordEntityPK implements Serializable {
    @Id
    @Column(name = "USERID")
    private String userid;

    @Id
    @Column(name = "CREATE_TS")
    private Timestamp createTs;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Timestamp createTs) {
        this.createTs = createTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MrecUserPasswordEntityPK that = (MrecUserPasswordEntityPK) o;
        return Objects.equals(userid, that.userid) &&
                Objects.equals(createTs, that.createTs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, createTs);
    }
}
