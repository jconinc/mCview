package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class MrecAcctEntityPK implements Serializable {
    @Id
    @Column(name = "MSCC_ORG")
    private String msccOrg;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private java.sql.Timestamp lastUpdtTs;

    public String getMsccOrg() {
        return msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public Timestamp getLastUpdtTs() {
        return lastUpdtTs;
    }

    public void setLastUpdtTs(Timestamp lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }


}
