package com.lsc.mcarrier.entity;

import com.lsc.mcarrier.entity.MrecUserPasswordEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "MREC_USER_PASSWORD")
@IdClass(MrecUserPasswordEntityPK.class)
public class MrecUserPasswordEntity {
    @Id
    @Column(name = "USERID")
    private String userid;

    @Id
    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    @Column(name = "CREATE_USERID")
    private String createUserid;

    @Column(name = "PASSWORD_EXPIRY_TS")
    private java.sql.Timestamp passwordExpiryTs;

    @Column(name = "PASSWORD")
    private String password;


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

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }


    public java.sql.Timestamp getPasswordExpiryTs() {
        return passwordExpiryTs;
    }

    public void setPasswordExpiryTs(java.sql.Timestamp passwordExpiryTs) {
        this.passwordExpiryTs = passwordExpiryTs;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
