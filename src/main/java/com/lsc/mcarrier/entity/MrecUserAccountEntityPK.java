package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class MrecUserAccountEntityPK implements Serializable {
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "MSCC_ORG")
    private String msccOrg;

    @Id
    @Column(name = "UPDATE_TS")
    private java.sql.Timestamp updateTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMsccOrg() {
        return msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public Timestamp getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Timestamp updateTs) {
        this.updateTs = updateTs;
    }
}
