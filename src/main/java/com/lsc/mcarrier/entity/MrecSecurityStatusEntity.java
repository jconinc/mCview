package com.lsc.mcarrier.entity;

import javax.persistence.*;

@Entity
@Table(name = "MREC_SECURITY_STATUS")
@IdClass(MrecSecurityStatusEntityPK.class)
public class MrecSecurityStatusEntity {
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_STATUS")
    private String userStatus;

    @Column(name = "SECURITY_STATUS")
    private String securityStatus;

    @Column(name = "SECURITY_ROLE")
    private String securityRole;

    @Column(name = "SFA_KEY")
    private String sfaKey;

    @Column(name = "SECRET")
    private String secret;

    @Column(name = "SFA_KEY_EXP_TS")
    private java.sql.Timestamp sfaKeyExpTs;

    @Column(name = "MFA_KEY1")
    private String mfaKey1;

    @Column(name = "MFA_KEY2")
    private String mfaKey2;

    @Column(name = "MFA_KEY3")
    private String mfaKey3;

    @Column(name = "SECURITY_INDICATOR")
    private String securityIndicator;

    @Column(name = "CREATE_USERID")
    private String createUserid;

    @Id
    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    @Column(name = "UPDATE_USERID")
    private String updateUserid;

    @Column(name = "UPDATE_TS")
    private java.sql.Timestamp updateTs;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }


    public String getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
    }


    public String getSecurityRole() {
        return securityRole;
    }

    public void setSecurityRole(String securityRole) {
        this.securityRole = securityRole;
    }


    public String getSfaKey() {
        return sfaKey;
    }

    public void setSfaKey(String sfaKey) {
        this.sfaKey = sfaKey;
    }


    public java.sql.Timestamp getSfaKeyExpTs() {
        return sfaKeyExpTs;
    }

    public void setSfaKeyExpTs(java.sql.Timestamp sfaKeyExpTs) {
        this.sfaKeyExpTs = sfaKeyExpTs;
    }


    public String getMfaKey1() {
        return mfaKey1;
    }

    public void setMfaKey1(String mfaKey1) {
        this.mfaKey1 = mfaKey1;
    }


    public String getMfaKey2() {
        return mfaKey2;
    }

    public void setMfaKey2(String mfaKey2) {
        this.mfaKey2 = mfaKey2;
    }


    public String getMfaKey3() {
        return mfaKey3;
    }

    public void setMfaKey3(String mfaKey3) {
        this.mfaKey3 = mfaKey3;
    }


    public String getSecurityIndicator() {
        return securityIndicator;
    }

    public void setSecurityIndicator(String securityIndicator) {
        this.securityIndicator = securityIndicator;
    }


    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }


    public java.sql.Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(java.sql.Timestamp createTs) {
        this.createTs = createTs;
    }


    public String getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid;
    }


    public java.sql.Timestamp getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(java.sql.Timestamp updateTs) {
        this.updateTs = updateTs;
    }

}
