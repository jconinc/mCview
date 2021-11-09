package com.lsc.mcarrier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

public class CodeTableEntityPK implements Serializable {
    @Id
    @Column(name = "TABLE_N")
    private String tableN;

    @Id
    @Column(name = "TABLE_CD")
    private String tableCd;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private Date lastUpdtTs;

    public String getTableN() {
        return tableN;
    }

    public void setTableN(String tableN) {
        this.tableN = tableN;
    }

    public String getTableCd() {
        return tableCd;
    }

    public void setTableCd(String tableCd) {
        this.tableCd = tableCd;
    }

    public Date getLastUpdtTs() {
        return lastUpdtTs;
    }

    public void setLastUpdtTs(Date lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeTableEntityPK that = (CodeTableEntityPK) o;
        return Objects.equals(tableN, that.tableN) &&
                Objects.equals(tableCd, that.tableCd) &&
                Objects.equals(lastUpdtTs, that.lastUpdtTs);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tableN, tableCd, lastUpdtTs);
    }
}
