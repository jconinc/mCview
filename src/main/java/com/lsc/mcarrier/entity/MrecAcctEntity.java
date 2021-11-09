package com.lsc.mcarrier.entity;

import javax.persistence.*;

@Entity
@Table(name = "MREC_ACCT")
@IdClass(MrecAcctEntityPK.class)
public class MrecAcctEntity {
    @Id
    @Column(name = "MSCC_ORG")
    private String msccOrg;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private java.sql.Timestamp lastUpdtTs;

    @Column(name = "BASE_COUNTRY")
    private String baseCountry;

    @Column(name = "BASE_JURIS")
    private String baseJuris;

    @Column(name = "ADDR_L1")
    private String addrL1;

    @Column(name = "ADDR_L2")
    private String addrL2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "PHN")
    private String phn;

    @Column(name = "PHN_EXT")
    private String phnExt;

    @Column(name = "LAST_UPDT_USERID")
    private String lastUpdtUserid;

    @Column(name = "LEGAL_NAME")
    private String legalName;

    @Column(name = "DBA_NAME")
    private String dbaName;

    public String getMsccOrg() {
        return this.msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public java.sql.Timestamp getLastUpdtTs() {
        return this.lastUpdtTs;
    }

    public void setLastUpdtTs(java.sql.Timestamp lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }

    public String getBaseCountry() {
        return this.baseCountry;
    }

    public void setBaseCountry(String baseCountry) {
        this.baseCountry = baseCountry;
    }

    public String getBaseJuris() {
        return this.baseJuris;
    }

    public void setBaseJuris(String baseJuris) {
        this.baseJuris = baseJuris;
    }

    public String getAddrL1() {
        return this.addrL1;
    }

    public void setAddrL1(String addrL1) {
        this.addrL1 = addrL1;
    }

    public String getAddrL2() {
        return this.addrL2;
    }

    public void setAddrL2(String addrL2) {
        this.addrL2 = addrL2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhn() {
        return this.phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getPhnExt() {
        return this.phnExt;
    }

    public void setPhnExt(String phnExt) {
        this.phnExt = phnExt;
    }

    public String getLastUpdtUserid() {
        return this.lastUpdtUserid;
    }

    public void setLastUpdtUserid(String lastUpdtUserid) {
        this.lastUpdtUserid = lastUpdtUserid;
    }

    public String getLegalName() {
        return this.legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getDbaName() {
        return this.dbaName;
    }

    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }
}
