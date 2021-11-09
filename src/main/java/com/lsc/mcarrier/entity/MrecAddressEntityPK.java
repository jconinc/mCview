package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class MrecAddressEntityPK implements Serializable {
    @Id
    @Column(name = "MSCC_ORG")
    private String msccOrg;

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "ADDR_TYPE")
    private String addrType;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private java.sql.Timestamp lastUpdtTs;

    public String getMsccOrg() {
        return msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public Timestamp getLastUpdtTs() {
        return lastUpdtTs;
    }

    public void setLastUpdtTs(Timestamp lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }
}
