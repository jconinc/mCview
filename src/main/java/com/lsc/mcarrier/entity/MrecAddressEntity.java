package com.lsc.mcarrier.entity;

import javax.persistence.*;

@Entity
@Table(name = "MREC_ADDRESS")
@IdClass(MrecAddressEntityPK.class)
public class MrecAddressEntity {
    @Id
    @Column(name = "MSCC_ORG")
    private String msccOrg;

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "ADDR_TYPE")
    private String addrType;

    @Column(name = "ADDR_SERVICE_TS")
    private java.sql.Timestamp addrServiceTs;

    @Column(name = "ADDR_L1")
    private String addrL1;

    @Column(name = "ADDR_L2")
    private String addrL2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "JURIS")
    private String juris;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    @Column(name = "CREATE_USERID", columnDefinition = "CHAR")
    private String createUserid;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private java.sql.Timestamp lastUpdtTs;

    @Column(name = "LAST_UPDT_USERID", columnDefinition = "CHAR")
    private String lastUpdtUserid;

    @Column(name = "COUNTRY")
    private String country;

    public String getMsccOrg() {
        return this.msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddrType() {
        return this.addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public java.sql.Timestamp getAddrServiceTs() {
        return this.addrServiceTs;
    }

    public void setAddrServiceTs(java.sql.Timestamp addrServiceTs) {
        this.addrServiceTs = addrServiceTs;
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

    public String getJuris() {
        return this.juris;
    }

    public void setJuris(String juris) {
        this.juris = juris;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public java.sql.Timestamp getCreateTs() {
        return this.createTs;
    }

    public void setCreateTs(java.sql.Timestamp createTs) {
        this.createTs = createTs;
    }

    public String getCreateUserid() {
        return this.createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    public java.sql.Timestamp getLastUpdtTs() {
        return this.lastUpdtTs;
    }

    public void setLastUpdtTs(java.sql.Timestamp lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }

    public String getLastUpdtUserid() {
        return this.lastUpdtUserid;
    }

    public void setLastUpdtUserid(String lastUpdtUserid) {
        this.lastUpdtUserid = lastUpdtUserid;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
