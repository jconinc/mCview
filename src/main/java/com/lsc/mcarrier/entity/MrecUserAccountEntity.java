package com.lsc.mcarrier.entity;

import javax.persistence.*;

@Entity
@Table(name = "MREC_USER_ACCOUNT")
@IdClass(MrecUserAccountEntityPK.class)
public class MrecUserAccountEntity {
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "MSCC_ORG")
    private String msccOrg;

    @Column(name = "ORGANIZATION_ROLE")
    private String organizationRole;

    @Column(name = "CREATE_USERID")
    private String createUserid;

    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    @Column(name = "UPDATE_USERID")
    private String updateUserid;

    @Id
    @Column(name = "UPDATE_TS")
    private java.sql.Timestamp updateTs;

    @Column(name = "ROLE_STATUS")
    private String roleStatus;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMsccOrg() {
        return this.msccOrg;
    }

    public void setMsccOrg(String msccOrg) {
        this.msccOrg = msccOrg;
    }

    public String getOrganizationRole() {
        return this.organizationRole;
    }

    public void setOrganizationRole(String organizationRole) {
        this.organizationRole = organizationRole;
    }

    public String getCreateUserid() {
        return this.createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    public java.sql.Timestamp getCreateTs() {
        return this.createTs;
    }

    public void setCreateTs(java.sql.Timestamp createTs) {
        this.createTs = createTs;
    }

    public String getUpdateUserid() {
        return this.updateUserid;
    }

    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid;
    }

    public java.sql.Timestamp getUpdateTs() {
        return this.updateTs;
    }

    public void setUpdateTs(java.sql.Timestamp updateTs) {
        this.updateTs = updateTs;
    }

    public String getRoleStatus() {
        return this.roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }
}
