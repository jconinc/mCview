package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0026_NAME")
@IdClass(McsT0026NamePK.class)
public class McsT0026Name {

  @Id
  @Column(name = "IRP_BASE_COUNTRY")
  private String irpBaseCountry;

  @Id
  @Column(name = "IRP_BASE_STATE")
  private String irpBaseState;

  @Id
  @Column(name = "IRP_ACCOUNT_NUMBER")
  private String irpAccountNumber;

  @Id
  @Column(name = "NAME_TYPE")
  private String nameType;

  @Column(name = "NAME")
  private String name;


  public String getIrpBaseCountry() {
    return irpBaseCountry;
  }

  public void setIrpBaseCountry(String irpBaseCountry) {
    this.irpBaseCountry = irpBaseCountry;
  }


  public String getIrpBaseState() {
    return irpBaseState;
  }

  public void setIrpBaseState(String irpBaseState) {
    this.irpBaseState = irpBaseState;
  }


  public String getIrpAccountNumber() {
    return irpAccountNumber;
  }

  public void setIrpAccountNumber(String irpAccountNumber) {
    this.irpAccountNumber = irpAccountNumber;
  }


  public String getNameType() {
    return nameType;
  }

  public void setNameType(String nameType) {
    this.nameType = nameType;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
