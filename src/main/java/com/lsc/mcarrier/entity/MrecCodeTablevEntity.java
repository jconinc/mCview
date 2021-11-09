package com.lsc.mcarrier.entity;


import com.lsc.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "MREC_CODE_TABLEV", schema = "", catalog = "")
@IdClass(MrecCodeTableEntityPK.class)
public class MrecCodeTablevEntity extends BaseEntity {
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
    private java.sql.Timestamp lastUpdtTs;

    @Column(name = "TABLE_E")
    private String tableE;

    @Column(name = "TABLE_USE_F")
    private String tableUseF;

    @Column(name = "TABLE_DOMAIN")
    private String tableDomain;

    @Column(name = "TABLE_RANGEL_N")
    private String tableRangelN;

    @Column(name = "TABLE_RANGEU_N")
    private String tableRangeuN;

    @Column(name = "LAST_UPDT_USERID")
    private String lastUpdtUserid;


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


    public String getTableE() {
    return tableE;
    }

    public void setTableE(String tableE) {
    this.tableE = tableE;
    }


    public String getTableUseF() {
    return tableUseF;
    }

    public void setTableUseF(String tableUseF) {
    this.tableUseF = tableUseF;
    }


    public String getTableDomain() {
    return tableDomain;
    }

    public void setTableDomain(String tableDomain) {
    this.tableDomain = tableDomain;
    }


    public String getTableRangelN() {
    return tableRangelN;
    }

    public void setTableRangelN(String tableRangelN) {
    this.tableRangelN = tableRangelN;
    }


    public String getTableRangeuN() {
    return tableRangeuN;
    }

    public void setTableRangeuN(String tableRangeuN) {
    this.tableRangeuN = tableRangeuN;
    }


    public java.sql.Timestamp getLastUpdtTs() {
    return lastUpdtTs;
    }

    public void setLastUpdtTs(java.sql.Timestamp lastUpdtTs) {
    this.lastUpdtTs = lastUpdtTs;
    }


    public String getLastUpdtUserid() {
    return lastUpdtUserid;
    }

    public void setLastUpdtUserid(String lastUpdtUserid) {
    this.lastUpdtUserid = lastUpdtUserid;
    }

}
