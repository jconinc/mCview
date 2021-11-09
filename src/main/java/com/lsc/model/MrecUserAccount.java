package com.lsc.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Keeps a record of a user's role with regard to an organization
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MrecUserAccount {

  private String userId;
  private String msccOrg;
    /**
     * The user's role in the organization
     */
  private String organizationRole;
  private String createdUserid;
  private java.sql.Timestamp createTs;
  private String updateUserid;
  private java.sql.Timestamp updateTs;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getMsccOrg() {
    return msccOrg;
  }

  public void setMsccOrg(String msccOrg) {
    this.msccOrg = msccOrg;
  }

  public String getOrganizationRole() {
    return organizationRole;
  }

  public void setOrganizationRole(String organizationRole) {
    this.organizationRole = organizationRole;
  }

  public String getCreatedUserid() {
    return createdUserid;
  }

  public void setCreatedUserid(String createdUserid) {
    this.createdUserid = createdUserid;
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
