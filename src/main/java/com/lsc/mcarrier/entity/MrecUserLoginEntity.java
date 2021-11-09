package com.lsc.mcarrier.entity;

import com.lsc.mcarrier.entity.MrecUserLoginEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "MREC_USER_LOGIN")
@IdClass(MrecUserLoginEntityPK.class)
public class MrecUserLoginEntity {
    @Id
    @Column(name = "USERID")
    private String userid;

    @Id
    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    @Column(name = "LOGIN_STATUS")
    private String loginStatus;

    public MrecUserLoginEntity(){

    }

    public MrecUserLoginEntity(String userid, Timestamp createTs, String loginStatus) {
        this.userid = userid;
        this.createTs = createTs;
        this.loginStatus = loginStatus;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }


    public java.sql.Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(java.sql.Timestamp createTs) {
        this.createTs = createTs;
    }


    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

}
