package com.lsc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MrecUser {

  private String userId;
  private String email;
  private String firstName;
  private String middleName;
  private String lastName;
  private String phone;
  private String phoneExt;
  private String fax;
  private String faxExt;
  private String addr1;
  private String addr2;
  private String city;
  private String postalCode;
  private String country;
  private java.sql.Timestamp updateTs;
  private String updateUserid;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPhoneExt() {
    return phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public String getFaxExt() {
    return faxExt;
  }

  public void setFaxExt(String faxExt) {
    this.faxExt = faxExt;
  }


  public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }


  public String getAddr2() {
    return addr2;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public java.sql.Timestamp getUpdateTs() {
    return updateTs;
  }

  public void setUpdateTs(java.sql.Timestamp updateTs) {
    this.updateTs = updateTs;
  }


  public String getUpdateUserid() {
    return updateUserid;
  }

  public void setUpdateUserid(String updateUserid) {
    this.updateUserid = updateUserid;
  }

}
