package com.lsc.mcarrier.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;


public class MrecCodeTableEntityPK implements Serializable {
    //TABLE_N, TABLE_CD1, LAST_UPDT_TS, TABLE_CD2
    @Id
    @Column(name = "TABLE_N")
    private String tableN;

    @Id
    @Column(name = "TABLE_CD1")
    private String tableCd1;

    @Id
    @Column(name = "TABLE_CD2")
    private String tableCd2;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private Timestamp lastUpdtTs;


    public String getTableN() {
    return tableN;
    }

    public void setTableN(String tableN) {
    this.tableN = tableN;
    }


    public String getTableCd1() {
    return tableCd1;
    }

    public void setTableCd1(String tableCd1) {
    this.tableCd1 = tableCd1;
    }


    public String getTableCd2() {
    return tableCd2;
    }

    public void setTableCd2(String tableCd2) {
    this.tableCd2 = tableCd2;
    }

    public Timestamp getLastUpdtTs() {
        return lastUpdtTs;
    }

    public void setLastUpdtTs(Timestamp lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MrecCodeTableEntityPK that = (MrecCodeTableEntityPK) o;
        return Objects.equals(tableN, that.tableN) &&
                Objects.equals(tableCd1, that.tableCd1) &&
                Objects.equals(tableCd2, that.tableCd2) &&
                Objects.equals(lastUpdtTs, that.lastUpdtTs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableN, tableCd1, tableCd2, lastUpdtTs);
    }
}
