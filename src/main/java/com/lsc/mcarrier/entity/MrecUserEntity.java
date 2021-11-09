package com.lsc.mcarrier.entity;

import com.lsc.mcarrier.entity.MrecUserEntityPK;

import javax.persistence.*;

@Entity
@Table(name = "MREC_USER")
@IdClass(MrecUserEntityPK.class)
public class MrecUserEntity {
    @Id
    @Column(name = "USERID")
    private String userId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "PHONE_EXT")
    private String phoneExt;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "FAX_EXT")
    private String faxExt;

    @Column(name = "ADDR_1")
    private String addr1;

    @Column(name = "ADDR_2")
    private String addr2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "COUNTRY")
    private String country;

    @Id
    @Column(name = "UPDATE_TS")
    private java.sql.Timestamp updateTs;

    @Column(name = "UPDATE_USERID")
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
