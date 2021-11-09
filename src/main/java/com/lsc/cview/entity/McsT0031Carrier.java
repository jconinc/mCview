package com.lsc.cview.entity;


import javax.persistence.*;

@Entity
@Table(name = "MCS_T0031_CARRIER")
@IdClass(McsT0031CarrierPK.class)
public class McsT0031Carrier {

  @Id
  @Column(name = "CARRIER_ID_NUMBER")
  private String carrierIdNumber;

  @Column(name = "ICC_NUMBER_1_OLD")
  private String iccNumber1Old;

  @Column(name = "ICC_NUMBER_2_OLD")
  private String iccNumber2Old;

  @Column(name = "ICC_NUMBER_3_OLD")
  private String iccNumber3Old;

  @Column(name = "STATE_CARRIER_ID")
  private String stateCarrierId;

  @Column(name = "TAX_ID_TYPE")
  private String taxIdType;

  @Column(name = "TAX_ID_NUMBER")
  private String taxIdNumber;

  @Column(name = "CARRIER_NAME")
  private String carrierName;

  @Column(name = "DBA_NAME")
  private String dbaName;

  @Column(name = "OIC_NUMBER")
  private String oicNumber;

  @Column(name = "REGION_CODE")
  private String regionCode;

  @Column(name = "TERRITORY_CODE")
  private String territoryCode;

  @Column(name = "STREET")
  private String street;

  @Column(name = "COLONIA")
  private String colonia;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "ZIP_CODE")
  private String zipCode;

  @Column(name = "COUNTY_CODE")
  private String countyCode;

  @Column(name = "COUNTRY")
  private String country;

  @Column(name = "TELEPHONE_NUMBER")
  private String telephoneNumber;

  @Column(name = "FAX_NUMBER")
  private String faxNumber;

  @Column(name = "EMAIL_ADDRESS")
  private String emailAddress;

  @Column(name = "MAIL_STREET")
  private String mailStreet;

  @Column(name = "MAIL_COLONIA")
  private String mailColonia;

  @Column(name = "MAIL_CITY")
  private String mailCity;

  @Column(name = "MAIL_STATE")
  private String mailState;

  @Column(name = "MAIL_ZIP_CODE")
  private String mailZipCode;

  @Column(name = "MAIL_COUNTY_CODE")
  private String mailCountyCode;

  @Column(name = "MAIL_COUNTRY")
  private String mailCountry;

  @Column(name = "BUS")
  private String bus;

  @Column(name = "QUANTITY_POWER_UNITS")
  private String quantityPowerUnits;

  @Column(name = "QUANTITY_MOTOR_COACHES")
  private String quantityMotorCoaches;

  @Column(name = "QUANTITY_HAZMAT_TANK_TRAILERS")
  private String quantityHazmatTankTrailers;

  @Column(name = "QUANTITY_HAZMAT_TANK_TRUCKS")
  private String quantityHazmatTankTrucks;

  @Column(name = "QUANTITY_LIMOS")
  private String quantityLimos;

  @Column(name = "QUANTITY_SCHOOL_BUSES")
  private String quantitySchoolBuses;

  @Column(name = "QUANTITY_TRAILERS")
  private String quantityTrailers;

  @Column(name = "QUANTITY_TRUCK_TRACTORS")
  private String quantityTruckTractors;

  @Column(name = "QUANTITY_TRUCKS")
  private String quantityTrucks;

  @Column(name = "QUANTITY_VANS")
  private String quantityVans;

  @Column(name = "QUANTITY_CARS")
  private String quantityCars;

  @Column(name = "QUANTITY_DRIVERS")
  private String quantityDrivers;

  @Column(name = "QUANTITY_DRIVERS_CDL")
  private String quantityDriversCdl;

  @Column(name = "QUANTITY_DRIVERS_INTERSTATE")
  private String quantityDriversInterstate;

  @Column(name = "QUANTITY_DRIVERS_INTRASTATE")
  private String quantityDriversIntrastate;

  @Column(name = "MCMIS_STATUS")
  private String mcmisStatus;

  @Column(name = "MCMIS_REASON_INACTIVATED")
  private String mcmisReasonInactivated;

  @Column(name = "MCMIS_TRANSACTION_DATE")
  private java.sql.Date mcmisTransactionDate;

  @Column(name = "MCMIS_STATUS_DATE")
  private java.sql.Date mcmisStatusDate;

  @Column(name = "FILE_CREATE_DATE")
  private java.sql.Date fileCreateDate;

  @Column(name = "DATE_ADDED")
  private java.sql.Date dateAdded;

  @Column(name = "LAST_UPDATE_DATE")
  private java.sql.Date lastUpdateDate;

  @Column(name = "LAST_UPDATE_USERID")
  private String lastUpdateUserid;

  @Column(name = "CARRIER_HAZMAT_PLACARDED")
  private String carrierHazmatPlacarded;

  @Column(name = "CARRIER_RATEABLE")
  private String carrierRateable;

  @Column(name = "ENTITY_TYPE")
  private String entityType;

  @Column(name = "CARRIER_INTERSTATE")
  private String carrierInterstate;

  @Column(name = "CARRIER_INTRASTATE_NHM")
  private String carrierIntrastateNhm;

  @Column(name = "CARRIER_INTRASTATE_HM")
  private String carrierIntrastateHm;

  @Column(name = "SHIPPER_INTERSTATE")
  private String shipperInterstate;

  @Column(name = "SHIPPER_INTRASTATE_HM")
  private String shipperIntrastateHm;

  @Column(name = "HAZMAT_STATUS")
  private String hazmatStatus;

  @Column(name = "PRIOR_DATE")
  private java.sql.Date priorDate;

  @Column(name = "QUANTITY_INSPECTIONS_LAST24")
  private String quantityInspectionsLast24;

  @Column(name = "QUANTITY_HAZMAT_PRESENT_LAST24")
  private String quantityHazmatPresentLast24;

  @Column(name = "VEHICLE_INSPECTIONS_LAST24")
  private String vehicleInspectionsLast24;

  @Column(name = "DRIVER_INSPECTIONS_LAST24")
  private String driverInspectionsLast24;

  @Column(name = "OOS_ALL_TYPES_LAST24")
  private String oosAllTypesLast24;

  @Column(name = "OOS_VEHICLE_INSPECTIONS_LAST24")
  private String oosVehicleInspectionsLast24;

  @Column(name = "OOS_DRIVER_INSPECTIONS_LAST24")
  private String oosDriverInspectionsLast24;

  @Column(name = "OOS_HAZMAT_INSPECTIONS_LAST24")
  private String oosHazmatInspectionsLast24;

  @Column(name = "QUANTITY_INSPECTIONS_LAST30")
  private String quantityInspectionsLast30;

  @Column(name = "QUANTITY_HAZMAT_PRESENT_LAST30")
  private String quantityHazmatPresentLast30;

  @Column(name = "VEHICLE_INSPECTIONS_LAST30")
  private String vehicleInspectionsLast30;

  @Column(name = "DRIVER_INSPECTIONS_LAST30")
  private String driverInspectionsLast30;

  @Column(name = "OOS_ALL_TYPES_LAST30")
  private String oosAllTypesLast30;

  @Column(name = "OOS_VEHICLE_INSPECTIONS_LAST30")
  private String oosVehicleInspectionsLast30;

  @Column(name = "OOS_DRIVER_INSPECTIONS_LAST30")
  private String oosDriverInspectionsLast30;

  @Column(name = "OOS_HAZMAT_INSPECTIONS_LAST30")
  private String oosHazmatInspectionsLast30;

  @Column(name = "QUANTITY_INSPECTIONS_LAST15")
  private String quantityInspectionsLast15;

  @Column(name = "QUANTITY_HAZMAT_PRESENT_LAST15")
  private String quantityHazmatPresentLast15;

  @Column(name = "VEHICLE_INSPECTIONS_LAST15")
  private String vehicleInspectionsLast15;

  @Column(name = "DRIVER_INSPECTIONS_LAST15")
  private String driverInspectionsLast15;

  @Column(name = "OOS_ALL_TYPES_LAST15")
  private String oosAllTypesLast15;

  @Column(name = "OOS_VEHICLE_INSPECTIONS_LAST15")
  private String oosVehicleInspectionsLast15;

  @Column(name = "OOS_DRIVER_INSPECTIONS_LAST15")
  private String oosDriverInspectionsLast15;

  @Column(name = "OOS_HAZMAT_INSPECTIONS_LAST15")
  private String oosHazmatInspectionsLast15;

  @Column(name = "VIOLATION_BRAKES")
  private String violationBrakes;

  @Column(name = "VIOLATION_LIGHTS")
  private String violationLights;

  @Column(name = "VIOLATION_WHEELS")
  private String violationWheels;

  @Column(name = "VIOLATION_STEERING")
  private String violationSteering;

  @Column(name = "VIOLATION_MEDICAL_CERTIFICATE")
  private String violationMedicalCertificate;

  @Column(name = "VIOLATION_LOGS")
  private String violationLogs;

  @Column(name = "VIOLATION_HOURS")
  private String violationHours;

  @Column(name = "VIOLATION_LICENSE")
  private String violationLicense;

  @Column(name = "VIOLATION_DRUGS")
  private String violationDrugs;

  @Column(name = "VIOLATION_TRAFFIC")
  private String violationTraffic;

  @Column(name = "VIOLATION_PAPERS")
  private String violationPapers;

  @Column(name = "VIOLATION_PLACARDS")
  private String violationPlacards;

  @Column(name = "VIOLATION_OF_EMER_RESP")
  private String violationOfEmerResp;

  @Column(name = "VIOLATION_TANK")
  private String violationTank;

  @Column(name = "VIOLATION_OTHER")
  private String violationOther;

  @Column(name = "SAFETY_RATING")
  private String safetyRating;

  @Column(name = "RATING_DATE")
  private java.sql.Date ratingDate;

  @Column(name = "REVIEW_INVESTIGATOR_CODE")
  private String reviewInvestigatorCode;

  @Column(name = "REVIEW_TYPE")
  private String reviewType;

  @Column(name = "REVIEW_DATE")
  private java.sql.Date reviewDate;

  @Column(name = "REVIEW_RECORDABLE_CRASHES")
  private String reviewRecordableCrashes;

  @Column(name = "REVIEW_PREVENTABLE_CRASHES")
  private String reviewPreventableCrashes;

  @Column(name = "REVIEW_MILEAGE")
  private String reviewMileage;

  @Column(name = "REVIEW_MEDICAL_CERTIFICATE")
  private String reviewMedicalCertificate;

  @Column(name = "REVIEW_LOGS")
  private String reviewLogs;

  @Column(name = "REVIEW_HOURS")
  private String reviewHours;

  @Column(name = "REVIEW_DRUG_ALCOHOL")
  private String reviewDrugAlcohol;

  @Column(name = "REVIEW_LICENSE")
  private String reviewLicense;

  @Column(name = "REVIEW_TRAFFIC")
  private String reviewTraffic;

  @Column(name = "REVIEW_PAPERS")
  private String reviewPapers;

  @Column(name = "REVIEW_PLACARDS")
  private String reviewPlacards;

  @Column(name = "REVIEW_CARGO_TANK")
  private String reviewCargoTank;

  @Column(name = "REVIEW_OTHER")
  private String reviewOther;

  @Column(name = "PRIOR_ENFORCEMENT_CASES")
  private String priorEnforcementCases;

  @Column(name = "FOLLOW_UP_CODE")
  private String followUpCode;

  @Column(name = "MCSIP_FLAG")
  private String mcsipFlag;

  @Column(name = "MCSIP_LEVEL")
  private String mcsipLevel;

  @Column(name = "MCSIP_LEVEL_DATE")
  private java.sql.Date mcsipLevelDate;

  @Column(name = "MCSIP_ENTRY_DATE")
  private java.sql.Date mcsipEntryDate;

  @Column(name = "SAFESTAT_RUN_INDICATOR")
  private String safestatRunIndicator;

  @Column(name = "SAFESTAT_DATE")
  private java.sql.Date safestatDate;

  @Column(name = "SAFESTAT_ACCIDENT_SEA")
  private String safestatAccidentSea;

  @Column(name = "SAFESTAT_CATEGORY")
  private String safestatCategory;

  @Column(name = "SAFESTAT_DRIVER_SEA")
  private String safestatDriverSea;

  @Column(name = "SAFESTAT_LETTERS")
  private String safestatLetters;

  @Column(name = "SAFESTAT_LETTER_DATE")
  private java.sql.Date safestatLetterDate;

  @Column(name = "SAFESTAT_MANAGEMENT_SEA")
  private String safestatManagementSea;

  @Column(name = "SAFESTAT_INDICATOR")
  private String safestatIndicator;

  @Column(name = "SAFESTAT_VEHICLE_SEA")
  private String safestatVehicleSea;

  @Column(name = "HAZMAT_PASSENGER_SCORE")
  private String hazmatPassengerScore;

  @Column(name = "HAZMAT_PASSENGER_SCORE_DATE")
  private java.sql.Date hazmatPassengerScoreDate;

  @Column(name = "SNET_FATAL_ACCIDENTS_LAST24")
  private String snetFatalAccidentsLast24;

  @Column(name = "SNET_INJURY_ACCIDENTS_LAST24")
  private String snetInjuryAccidentsLast24;

  @Column(name = "SNET_TOWAWAY_ACCIDENTS_LAST24")
  private String snetTowawayAccidentsLast24;

  @Column(name = "SNET_OTHER_ACCIDENTS_LAST24")
  private String snetOtherAccidentsLast24;

  @Column(name = "SNET_TOTAL_ACCIDENTS_LAST24")
  private String snetTotalAccidentsLast24;

  @Column(name = "SNET_FATAL_ACCIDENTS_LAST15")
  private String snetFatalAccidentsLast15;

  @Column(name = "SNET_INJURY_ACCIDENTS_LAST15")
  private String snetInjuryAccidentsLast15;

  @Column(name = "SNET_TOWAWAY_ACCIDENTS_LAST15")
  private String snetTowawayAccidentsLast15;

  @Column(name = "SNET_OTHER_ACCIDENTS_LAST15")
  private String snetOtherAccidentsLast15;

  @Column(name = "SNET_TOTAL_ACCIDENTS_LAST15")
  private String snetTotalAccidentsLast15;

  @Column(name = "SNET_FATAL_ACCIDENTS_LAST30")
  private String snetFatalAccidentsLast30;

  @Column(name = "SNET_INJURY_ACCIDENTS_LAST30")
  private String snetInjuryAccidentsLast30;

  @Column(name = "SNET_TOWAWAY_ACCIDENTS_LAST30")
  private String snetTowawayAccidentsLast30;

  @Column(name = "SNET_OTHER_ACCIDENTS_LAST30")
  private String snetOtherAccidentsLast30;

  @Column(name = "SNET_TOTAL_ACCIDENTS_LAST30")
  private String snetTotalAccidentsLast30;

  @Column(name = "STATE_DATA")
  private String stateData;

  @Column(name = "ISS_SCORE")
  private String issScore;

  @Column(name = "ISS_SCORE_DATE")
  private java.sql.Date issScoreDate;

  @Column(name = "ISS_INDICATOR")
  private String issIndicator;

  @Column(name = "DUNS_NUMBER")
  private String dunsNumber;

  @Column(name = "HAZMAT_REG_DATE")
  private java.sql.Date hazmatRegDate;

  @Column(name = "OOS_RESCIND_DATE")
  private java.sql.Date oosRescindDate;

  @Column(name = "MCS150_MILEAGE")
  private String mcs150Mileage;

  @Column(name = "MCS150_MILEAGE_YEAR")
  private String mcs150MileageYear;

  @Column(name = "MCS150_UPDATE_DATE")
  private java.sql.Date mcs150UpdateDate;

  @Column(name = "MCS150_UPDATE_FLAG")
  private String mcs150UpdateFlag;

  @Column(name = "PREVENTABLE_CRASHES")
  private String preventableCrashes;

  @Column(name = "MILEAGE")
  private String mileage;

  @Column(name = "HM_PERMIT_EFFECTIVE_DATE")
  private java.sql.Date hmPermitEffectiveDate;

  @Column(name = "HM_PERMIT_EXPIRATION_DATE")
  private java.sql.Date hmPermitExpirationDate;

  @Column(name = "HM_PERMIT_NUMBER")
  private String hmPermitNumber;

  @Column(name = "HM_PERMIT_OPER_UNDER_APPEAL_F")
  private String hmPermitOperUnderAppealF;

  @Column(name = "HM_PERMIT_STATUS")
  private String hmPermitStatus;

  @Column(name = "QTY_HM_CARGO_TRUCKS_OWNED")
  private String qtyHmCargoTrucksOwned;

  @Column(name = "QTY_HM_CARGO_TRUCK_TERM_LEASED")
  private String qtyHmCargoTruckTermLeased;

  @Column(name = "QTY_HM_CARGO_TRUCK_TRIP_LEASED")
  private String qtyHmCargoTruckTripLeased;

  @Column(name = "QTY_LIMOS_16P_OWNED")
  private String qtyLimos16POwned;

  @Column(name = "QTY_LIMOS_16P_TERM_LEASED")
  private String qtyLimos16PTermLeased;

  @Column(name = "QTY_LIMOS_16P_TRIP_LEASED")
  private String qtyLimos16PTripLeased;

  @Column(name = "QTY_LIMOS_1TO8P_OWNED")
  private String qtyLimos1To8POwned;

  @Column(name = "QTY_LIMOS_1TO8P_TERM_LEASED")
  private String qtyLimos1To8PTermLeased;

  @Column(name = "QTY_LIMOS_1TO8P_TRIP_LEASED")
  private String qtyLimos1To8PTripLeased;

  @Column(name = "QTY_LIMOS_9TO15P_OWNED")
  private String qtyLimos9To15POwned;

  @Column(name = "QTY_LIMOS_9TO15P_TERM_LEASED")
  private String qtyLimos9To15PTermLeased;

  @Column(name = "QTY_LIMOS_9TO15P_TRIP_LEASED")
  private String qtyLimos9To15PTripLeased;

  @Column(name = "QTY_MINI_BUSES_OWNED")
  private String qtyMiniBusesOwned;

  @Column(name = "QTY_MINI_BUSES_TERM_LEASED")
  private String qtyMiniBusesTermLeased;

  @Column(name = "QTY_MINI_BUSES_TRIP_LEASED")
  private String qtyMiniBusesTripLeased;

  @Column(name = "QTY_MOTOR_COACHES_OWNED")
  private String qtyMotorCoachesOwned;

  @Column(name = "QTY_MOTOR_COACHES_TERM_LEASED")
  private String qtyMotorCoachesTermLeased;

  @Column(name = "QTY_MOTOR_COACHES_TRIP_LEASED")
  private String qtyMotorCoachesTripLeased;

  @Column(name = "QTY_SCH_BUS_16P_OWNED")
  private String qtySchBus16POwned;

  @Column(name = "QTY_SCH_BUS_16P_TERM_LEASED")
  private String qtySchBus16PTermLeased;

  @Column(name = "QTY_SCH_BUS_16P_TRIP_LEASED")
  private String qtySchBus16PTripLeased;

  @Column(name = "QTY_SCH_BUS_1TO8P_OWNED")
  private String qtySchBus1To8POwned;

  @Column(name = "QTY_SCH_BUS_1TO8P_TERM_LEASED")
  private String qtySchBus1To8PTermLeased;

  @Column(name = "QTY_SCH_BUS_1TO8P_TRIP_LEASED")
  private String qtySchBus1To8PTripLeased;

  @Column(name = "QTY_SCH_BUS_9TO15P_OWNED")
  private String qtySchBus9To15POwned;

  @Column(name = "QTY_SCH_BUS_9TO15P_TERM_LEASED")
  private String qtySchBus9To15PTermLeased;

  @Column(name = "QTY_SCH_BUS_9TO15P_TRIP_LEASED")
  private String qtySchBus9To15PTripLeased;

  @Column(name = "QTY_STRAIGHT_TRUCKS_OWNED")
  private String qtyStraightTrucksOwned;

  @Column(name = "QTY_STRAIGHT_TRUCK_TERM_LEASED")
  private String qtyStraightTruckTermLeased;

  @Column(name = "QTY_STRAIGHT_TRUCK_TRIP_LEASED")
  private String qtyStraightTruckTripLeased;

  @Column(name = "QTY_TRAILERS_HM_OWNED")
  private String qtyTrailersHmOwned;

  @Column(name = "QTY_TRAILERS_HM_TERM_LEASED")
  private String qtyTrailersHmTermLeased;

  @Column(name = "QTY_TRAILERS_HM_TRIP_LEASED")
  private String qtyTrailersHmTripLeased;

  @Column(name = "QTY_TRAILERS_OWNED")
  private String qtyTrailersOwned;

  @Column(name = "QTY_TRAILERS_TERM_LEASED")
  private String qtyTrailersTermLeased;

  @Column(name = "QTY_TRAILERS_TRIP_LEASED")
  private String qtyTrailersTripLeased;

  @Column(name = "QTY_TRUCK_TRACTORS_OWNED")
  private String qtyTruckTractorsOwned;

  @Column(name = "QTY_TRUCK_TRACTORS_TERM_LEASED")
  private String qtyTruckTractorsTermLeased;

  @Column(name = "QTY_TRUCK_TRACTORS_TRIP_LEASED")
  private String qtyTruckTractorsTripLeased;

  @Column(name = "QTY_VANS_1TO8P_OWNED")
  private String qtyVans1To8POwned;

  @Column(name = "QTY_VANS_1TO8P_TERM_LEASED")
  private String qtyVans1To8PTermLeased;

  @Column(name = "QTY_VANS_1TO8P_TRIP_LEASED")
  private String qtyVans1To8PTripLeased;

  @Column(name = "QTY_VANS_9TO15P_OWNED")
  private String qtyVans9To15POwned;

  @Column(name = "QTY_VANS_9TO15P_TERM_LEASED")
  private String qtyVans9To15PTermLeased;

  @Column(name = "QTY_VANS_9TO15P_TRIP_LEASED")
  private String qtyVans9To15PTripLeased;

  @Column(name = "TELEPHONE_NUMBER_CELLULAR")
  private String telephoneNumberCellular;

  @Column(name = "OFFICER_NAME_TITLE_1")
  private String officerNameTitle1;

  @Column(name = "OFFICER_NAME_TITLE_2")
  private String officerNameTitle2;

  @Column(name = "NEW_ENTRANT_CODE")
  private String newEntrantCode;

  @Column(name = "NEW_ENTRANT_END_DATE")
  private java.sql.Date newEntrantEndDate;

  @Column(name = "NEW_ENTRANT_START_DATE")
  private java.sql.Date newEntrantStartDate;

  @Column(name = "OOS_DATE")
  private java.sql.Date oosDate;

  @Column(name = "OOS_FLAG")
  private String oosFlag;

  @Column(name = "CSA_LETTERS")
  private String csaLetters;

  @Column(name = "CSA_LETTERS_DATE")
  private java.sql.Date csaLettersDate;

  @Column(name = "ICC_NUMBER_1")
  private String iccNumber1;

  @Column(name = "ICC_NUMBER_2")
  private String iccNumber2;

  @Column(name = "ICC_NUMBER_3")
  private String iccNumber3;


  public String getCarrierIdNumber() {
    return carrierIdNumber;
  }

  public void setCarrierIdNumber(String carrierIdNumber) {
    this.carrierIdNumber = carrierIdNumber;
  }


  public String getIccNumber1Old() {
    return iccNumber1Old;
  }

  public void setIccNumber1Old(String iccNumber1Old) {
    this.iccNumber1Old = iccNumber1Old;
  }


  public String getIccNumber2Old() {
    return iccNumber2Old;
  }

  public void setIccNumber2Old(String iccNumber2Old) {
    this.iccNumber2Old = iccNumber2Old;
  }


  public String getIccNumber3Old() {
    return iccNumber3Old;
  }

  public void setIccNumber3Old(String iccNumber3Old) {
    this.iccNumber3Old = iccNumber3Old;
  }


  public String getStateCarrierId() {
    return stateCarrierId;
  }

  public void setStateCarrierId(String stateCarrierId) {
    this.stateCarrierId = stateCarrierId;
  }


  public String getTaxIdType() {
    return taxIdType;
  }

  public void setTaxIdType(String taxIdType) {
    this.taxIdType = taxIdType;
  }


  public String getTaxIdNumber() {
    return taxIdNumber;
  }

  public void setTaxIdNumber(String taxIdNumber) {
    this.taxIdNumber = taxIdNumber;
  }


  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public String getDbaName() {
    return dbaName;
  }

  public void setDbaName(String dbaName) {
    this.dbaName = dbaName;
  }


  public String getOicNumber() {
    return oicNumber;
  }

  public void setOicNumber(String oicNumber) {
    this.oicNumber = oicNumber;
  }


  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public String getTerritoryCode() {
    return territoryCode;
  }

  public void setTerritoryCode(String territoryCode) {
    this.territoryCode = territoryCode;
  }


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public String getMailStreet() {
    return mailStreet;
  }

  public void setMailStreet(String mailStreet) {
    this.mailStreet = mailStreet;
  }


  public String getMailColonia() {
    return mailColonia;
  }

  public void setMailColonia(String mailColonia) {
    this.mailColonia = mailColonia;
  }


  public String getMailCity() {
    return mailCity;
  }

  public void setMailCity(String mailCity) {
    this.mailCity = mailCity;
  }


  public String getMailState() {
    return mailState;
  }

  public void setMailState(String mailState) {
    this.mailState = mailState;
  }


  public String getMailZipCode() {
    return mailZipCode;
  }

  public void setMailZipCode(String mailZipCode) {
    this.mailZipCode = mailZipCode;
  }


  public String getMailCountyCode() {
    return mailCountyCode;
  }

  public void setMailCountyCode(String mailCountyCode) {
    this.mailCountyCode = mailCountyCode;
  }


  public String getMailCountry() {
    return mailCountry;
  }

  public void setMailCountry(String mailCountry) {
    this.mailCountry = mailCountry;
  }


  public String getBus() {
    return bus;
  }

  public void setBus(String bus) {
    this.bus = bus;
  }


  public String getQuantityPowerUnits() {
    return quantityPowerUnits;
  }

  public void setQuantityPowerUnits(String quantityPowerUnits) {
    this.quantityPowerUnits = quantityPowerUnits;
  }


  public String getQuantityMotorCoaches() {
    return quantityMotorCoaches;
  }

  public void setQuantityMotorCoaches(String quantityMotorCoaches) {
    this.quantityMotorCoaches = quantityMotorCoaches;
  }


  public String getQuantityHazmatTankTrailers() {
    return quantityHazmatTankTrailers;
  }

  public void setQuantityHazmatTankTrailers(String quantityHazmatTankTrailers) {
    this.quantityHazmatTankTrailers = quantityHazmatTankTrailers;
  }


  public String getQuantityHazmatTankTrucks() {
    return quantityHazmatTankTrucks;
  }

  public void setQuantityHazmatTankTrucks(String quantityHazmatTankTrucks) {
    this.quantityHazmatTankTrucks = quantityHazmatTankTrucks;
  }


  public String getQuantityLimos() {
    return quantityLimos;
  }

  public void setQuantityLimos(String quantityLimos) {
    this.quantityLimos = quantityLimos;
  }


  public String getQuantitySchoolBuses() {
    return quantitySchoolBuses;
  }

  public void setQuantitySchoolBuses(String quantitySchoolBuses) {
    this.quantitySchoolBuses = quantitySchoolBuses;
  }


  public String getQuantityTrailers() {
    return quantityTrailers;
  }

  public void setQuantityTrailers(String quantityTrailers) {
    this.quantityTrailers = quantityTrailers;
  }


  public String getQuantityTruckTractors() {
    return quantityTruckTractors;
  }

  public void setQuantityTruckTractors(String quantityTruckTractors) {
    this.quantityTruckTractors = quantityTruckTractors;
  }


  public String getQuantityTrucks() {
    return quantityTrucks;
  }

  public void setQuantityTrucks(String quantityTrucks) {
    this.quantityTrucks = quantityTrucks;
  }


  public String getQuantityVans() {
    return quantityVans;
  }

  public void setQuantityVans(String quantityVans) {
    this.quantityVans = quantityVans;
  }


  public String getQuantityCars() {
    return quantityCars;
  }

  public void setQuantityCars(String quantityCars) {
    this.quantityCars = quantityCars;
  }


  public String getQuantityDrivers() {
    return quantityDrivers;
  }

  public void setQuantityDrivers(String quantityDrivers) {
    this.quantityDrivers = quantityDrivers;
  }


  public String getQuantityDriversCdl() {
    return quantityDriversCdl;
  }

  public void setQuantityDriversCdl(String quantityDriversCdl) {
    this.quantityDriversCdl = quantityDriversCdl;
  }


  public String getQuantityDriversInterstate() {
    return quantityDriversInterstate;
  }

  public void setQuantityDriversInterstate(String quantityDriversInterstate) {
    this.quantityDriversInterstate = quantityDriversInterstate;
  }


  public String getQuantityDriversIntrastate() {
    return quantityDriversIntrastate;
  }

  public void setQuantityDriversIntrastate(String quantityDriversIntrastate) {
    this.quantityDriversIntrastate = quantityDriversIntrastate;
  }


  public String getMcmisStatus() {
    return mcmisStatus;
  }

  public void setMcmisStatus(String mcmisStatus) {
    this.mcmisStatus = mcmisStatus;
  }


  public String getMcmisReasonInactivated() {
    return mcmisReasonInactivated;
  }

  public void setMcmisReasonInactivated(String mcmisReasonInactivated) {
    this.mcmisReasonInactivated = mcmisReasonInactivated;
  }


  public java.sql.Date getMcmisTransactionDate() {
    return mcmisTransactionDate;
  }

  public void setMcmisTransactionDate(java.sql.Date mcmisTransactionDate) {
    this.mcmisTransactionDate = mcmisTransactionDate;
  }


  public java.sql.Date getMcmisStatusDate() {
    return mcmisStatusDate;
  }

  public void setMcmisStatusDate(java.sql.Date mcmisStatusDate) {
    this.mcmisStatusDate = mcmisStatusDate;
  }


  public java.sql.Date getFileCreateDate() {
    return fileCreateDate;
  }

  public void setFileCreateDate(java.sql.Date fileCreateDate) {
    this.fileCreateDate = fileCreateDate;
  }


  public java.sql.Date getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(java.sql.Date dateAdded) {
    this.dateAdded = dateAdded;
  }


  public java.sql.Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(java.sql.Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public String getLastUpdateUserid() {
    return lastUpdateUserid;
  }

  public void setLastUpdateUserid(String lastUpdateUserid) {
    this.lastUpdateUserid = lastUpdateUserid;
  }


  public String getCarrierHazmatPlacarded() {
    return carrierHazmatPlacarded;
  }

  public void setCarrierHazmatPlacarded(String carrierHazmatPlacarded) {
    this.carrierHazmatPlacarded = carrierHazmatPlacarded;
  }


  public String getCarrierRateable() {
    return carrierRateable;
  }

  public void setCarrierRateable(String carrierRateable) {
    this.carrierRateable = carrierRateable;
  }


  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public String getCarrierInterstate() {
    return carrierInterstate;
  }

  public void setCarrierInterstate(String carrierInterstate) {
    this.carrierInterstate = carrierInterstate;
  }


  public String getCarrierIntrastateNhm() {
    return carrierIntrastateNhm;
  }

  public void setCarrierIntrastateNhm(String carrierIntrastateNhm) {
    this.carrierIntrastateNhm = carrierIntrastateNhm;
  }


  public String getCarrierIntrastateHm() {
    return carrierIntrastateHm;
  }

  public void setCarrierIntrastateHm(String carrierIntrastateHm) {
    this.carrierIntrastateHm = carrierIntrastateHm;
  }


  public String getShipperInterstate() {
    return shipperInterstate;
  }

  public void setShipperInterstate(String shipperInterstate) {
    this.shipperInterstate = shipperInterstate;
  }


  public String getShipperIntrastateHm() {
    return shipperIntrastateHm;
  }

  public void setShipperIntrastateHm(String shipperIntrastateHm) {
    this.shipperIntrastateHm = shipperIntrastateHm;
  }


  public String getHazmatStatus() {
    return hazmatStatus;
  }

  public void setHazmatStatus(String hazmatStatus) {
    this.hazmatStatus = hazmatStatus;
  }


  public java.sql.Date getPriorDate() {
    return priorDate;
  }

  public void setPriorDate(java.sql.Date priorDate) {
    this.priorDate = priorDate;
  }


  public String getQuantityInspectionsLast24() {
    return quantityInspectionsLast24;
  }

  public void setQuantityInspectionsLast24(String quantityInspectionsLast24) {
    this.quantityInspectionsLast24 = quantityInspectionsLast24;
  }


  public String getQuantityHazmatPresentLast24() {
    return quantityHazmatPresentLast24;
  }

  public void setQuantityHazmatPresentLast24(String quantityHazmatPresentLast24) {
    this.quantityHazmatPresentLast24 = quantityHazmatPresentLast24;
  }


  public String getVehicleInspectionsLast24() {
    return vehicleInspectionsLast24;
  }

  public void setVehicleInspectionsLast24(String vehicleInspectionsLast24) {
    this.vehicleInspectionsLast24 = vehicleInspectionsLast24;
  }


  public String getDriverInspectionsLast24() {
    return driverInspectionsLast24;
  }

  public void setDriverInspectionsLast24(String driverInspectionsLast24) {
    this.driverInspectionsLast24 = driverInspectionsLast24;
  }


  public String getOosAllTypesLast24() {
    return oosAllTypesLast24;
  }

  public void setOosAllTypesLast24(String oosAllTypesLast24) {
    this.oosAllTypesLast24 = oosAllTypesLast24;
  }


  public String getOosVehicleInspectionsLast24() {
    return oosVehicleInspectionsLast24;
  }

  public void setOosVehicleInspectionsLast24(String oosVehicleInspectionsLast24) {
    this.oosVehicleInspectionsLast24 = oosVehicleInspectionsLast24;
  }


  public String getOosDriverInspectionsLast24() {
    return oosDriverInspectionsLast24;
  }

  public void setOosDriverInspectionsLast24(String oosDriverInspectionsLast24) {
    this.oosDriverInspectionsLast24 = oosDriverInspectionsLast24;
  }


  public String getOosHazmatInspectionsLast24() {
    return oosHazmatInspectionsLast24;
  }

  public void setOosHazmatInspectionsLast24(String oosHazmatInspectionsLast24) {
    this.oosHazmatInspectionsLast24 = oosHazmatInspectionsLast24;
  }


  public String getQuantityInspectionsLast30() {
    return quantityInspectionsLast30;
  }

  public void setQuantityInspectionsLast30(String quantityInspectionsLast30) {
    this.quantityInspectionsLast30 = quantityInspectionsLast30;
  }


  public String getQuantityHazmatPresentLast30() {
    return quantityHazmatPresentLast30;
  }

  public void setQuantityHazmatPresentLast30(String quantityHazmatPresentLast30) {
    this.quantityHazmatPresentLast30 = quantityHazmatPresentLast30;
  }


  public String getVehicleInspectionsLast30() {
    return vehicleInspectionsLast30;
  }

  public void setVehicleInspectionsLast30(String vehicleInspectionsLast30) {
    this.vehicleInspectionsLast30 = vehicleInspectionsLast30;
  }


  public String getDriverInspectionsLast30() {
    return driverInspectionsLast30;
  }

  public void setDriverInspectionsLast30(String driverInspectionsLast30) {
    this.driverInspectionsLast30 = driverInspectionsLast30;
  }


  public String getOosAllTypesLast30() {
    return oosAllTypesLast30;
  }

  public void setOosAllTypesLast30(String oosAllTypesLast30) {
    this.oosAllTypesLast30 = oosAllTypesLast30;
  }


  public String getOosVehicleInspectionsLast30() {
    return oosVehicleInspectionsLast30;
  }

  public void setOosVehicleInspectionsLast30(String oosVehicleInspectionsLast30) {
    this.oosVehicleInspectionsLast30 = oosVehicleInspectionsLast30;
  }


  public String getOosDriverInspectionsLast30() {
    return oosDriverInspectionsLast30;
  }

  public void setOosDriverInspectionsLast30(String oosDriverInspectionsLast30) {
    this.oosDriverInspectionsLast30 = oosDriverInspectionsLast30;
  }


  public String getOosHazmatInspectionsLast30() {
    return oosHazmatInspectionsLast30;
  }

  public void setOosHazmatInspectionsLast30(String oosHazmatInspectionsLast30) {
    this.oosHazmatInspectionsLast30 = oosHazmatInspectionsLast30;
  }


  public String getQuantityInspectionsLast15() {
    return quantityInspectionsLast15;
  }

  public void setQuantityInspectionsLast15(String quantityInspectionsLast15) {
    this.quantityInspectionsLast15 = quantityInspectionsLast15;
  }


  public String getQuantityHazmatPresentLast15() {
    return quantityHazmatPresentLast15;
  }

  public void setQuantityHazmatPresentLast15(String quantityHazmatPresentLast15) {
    this.quantityHazmatPresentLast15 = quantityHazmatPresentLast15;
  }


  public String getVehicleInspectionsLast15() {
    return vehicleInspectionsLast15;
  }

  public void setVehicleInspectionsLast15(String vehicleInspectionsLast15) {
    this.vehicleInspectionsLast15 = vehicleInspectionsLast15;
  }


  public String getDriverInspectionsLast15() {
    return driverInspectionsLast15;
  }

  public void setDriverInspectionsLast15(String driverInspectionsLast15) {
    this.driverInspectionsLast15 = driverInspectionsLast15;
  }


  public String getOosAllTypesLast15() {
    return oosAllTypesLast15;
  }

  public void setOosAllTypesLast15(String oosAllTypesLast15) {
    this.oosAllTypesLast15 = oosAllTypesLast15;
  }


  public String getOosVehicleInspectionsLast15() {
    return oosVehicleInspectionsLast15;
  }

  public void setOosVehicleInspectionsLast15(String oosVehicleInspectionsLast15) {
    this.oosVehicleInspectionsLast15 = oosVehicleInspectionsLast15;
  }


  public String getOosDriverInspectionsLast15() {
    return oosDriverInspectionsLast15;
  }

  public void setOosDriverInspectionsLast15(String oosDriverInspectionsLast15) {
    this.oosDriverInspectionsLast15 = oosDriverInspectionsLast15;
  }


  public String getOosHazmatInspectionsLast15() {
    return oosHazmatInspectionsLast15;
  }

  public void setOosHazmatInspectionsLast15(String oosHazmatInspectionsLast15) {
    this.oosHazmatInspectionsLast15 = oosHazmatInspectionsLast15;
  }


  public String getViolationBrakes() {
    return violationBrakes;
  }

  public void setViolationBrakes(String violationBrakes) {
    this.violationBrakes = violationBrakes;
  }


  public String getViolationLights() {
    return violationLights;
  }

  public void setViolationLights(String violationLights) {
    this.violationLights = violationLights;
  }


  public String getViolationWheels() {
    return violationWheels;
  }

  public void setViolationWheels(String violationWheels) {
    this.violationWheels = violationWheels;
  }


  public String getViolationSteering() {
    return violationSteering;
  }

  public void setViolationSteering(String violationSteering) {
    this.violationSteering = violationSteering;
  }


  public String getViolationMedicalCertificate() {
    return violationMedicalCertificate;
  }

  public void setViolationMedicalCertificate(String violationMedicalCertificate) {
    this.violationMedicalCertificate = violationMedicalCertificate;
  }


  public String getViolationLogs() {
    return violationLogs;
  }

  public void setViolationLogs(String violationLogs) {
    this.violationLogs = violationLogs;
  }


  public String getViolationHours() {
    return violationHours;
  }

  public void setViolationHours(String violationHours) {
    this.violationHours = violationHours;
  }


  public String getViolationLicense() {
    return violationLicense;
  }

  public void setViolationLicense(String violationLicense) {
    this.violationLicense = violationLicense;
  }


  public String getViolationDrugs() {
    return violationDrugs;
  }

  public void setViolationDrugs(String violationDrugs) {
    this.violationDrugs = violationDrugs;
  }


  public String getViolationTraffic() {
    return violationTraffic;
  }

  public void setViolationTraffic(String violationTraffic) {
    this.violationTraffic = violationTraffic;
  }


  public String getViolationPapers() {
    return violationPapers;
  }

  public void setViolationPapers(String violationPapers) {
    this.violationPapers = violationPapers;
  }


  public String getViolationPlacards() {
    return violationPlacards;
  }

  public void setViolationPlacards(String violationPlacards) {
    this.violationPlacards = violationPlacards;
  }


  public String getViolationOfEmerResp() {
    return violationOfEmerResp;
  }

  public void setViolationOfEmerResp(String violationOfEmerResp) {
    this.violationOfEmerResp = violationOfEmerResp;
  }


  public String getViolationTank() {
    return violationTank;
  }

  public void setViolationTank(String violationTank) {
    this.violationTank = violationTank;
  }


  public String getViolationOther() {
    return violationOther;
  }

  public void setViolationOther(String violationOther) {
    this.violationOther = violationOther;
  }


  public String getSafetyRating() {
    return safetyRating;
  }

  public void setSafetyRating(String safetyRating) {
    this.safetyRating = safetyRating;
  }


  public java.sql.Date getRatingDate() {
    return ratingDate;
  }

  public void setRatingDate(java.sql.Date ratingDate) {
    this.ratingDate = ratingDate;
  }


  public String getReviewInvestigatorCode() {
    return reviewInvestigatorCode;
  }

  public void setReviewInvestigatorCode(String reviewInvestigatorCode) {
    this.reviewInvestigatorCode = reviewInvestigatorCode;
  }


  public String getReviewType() {
    return reviewType;
  }

  public void setReviewType(String reviewType) {
    this.reviewType = reviewType;
  }


  public java.sql.Date getReviewDate() {
    return reviewDate;
  }

  public void setReviewDate(java.sql.Date reviewDate) {
    this.reviewDate = reviewDate;
  }


  public String getReviewRecordableCrashes() {
    return reviewRecordableCrashes;
  }

  public void setReviewRecordableCrashes(String reviewRecordableCrashes) {
    this.reviewRecordableCrashes = reviewRecordableCrashes;
  }


  public String getReviewPreventableCrashes() {
    return reviewPreventableCrashes;
  }

  public void setReviewPreventableCrashes(String reviewPreventableCrashes) {
    this.reviewPreventableCrashes = reviewPreventableCrashes;
  }


  public String getReviewMileage() {
    return reviewMileage;
  }

  public void setReviewMileage(String reviewMileage) {
    this.reviewMileage = reviewMileage;
  }


  public String getReviewMedicalCertificate() {
    return reviewMedicalCertificate;
  }

  public void setReviewMedicalCertificate(String reviewMedicalCertificate) {
    this.reviewMedicalCertificate = reviewMedicalCertificate;
  }


  public String getReviewLogs() {
    return reviewLogs;
  }

  public void setReviewLogs(String reviewLogs) {
    this.reviewLogs = reviewLogs;
  }


  public String getReviewHours() {
    return reviewHours;
  }

  public void setReviewHours(String reviewHours) {
    this.reviewHours = reviewHours;
  }


  public String getReviewDrugAlcohol() {
    return reviewDrugAlcohol;
  }

  public void setReviewDrugAlcohol(String reviewDrugAlcohol) {
    this.reviewDrugAlcohol = reviewDrugAlcohol;
  }


  public String getReviewLicense() {
    return reviewLicense;
  }

  public void setReviewLicense(String reviewLicense) {
    this.reviewLicense = reviewLicense;
  }


  public String getReviewTraffic() {
    return reviewTraffic;
  }

  public void setReviewTraffic(String reviewTraffic) {
    this.reviewTraffic = reviewTraffic;
  }


  public String getReviewPapers() {
    return reviewPapers;
  }

  public void setReviewPapers(String reviewPapers) {
    this.reviewPapers = reviewPapers;
  }


  public String getReviewPlacards() {
    return reviewPlacards;
  }

  public void setReviewPlacards(String reviewPlacards) {
    this.reviewPlacards = reviewPlacards;
  }


  public String getReviewCargoTank() {
    return reviewCargoTank;
  }

  public void setReviewCargoTank(String reviewCargoTank) {
    this.reviewCargoTank = reviewCargoTank;
  }


  public String getReviewOther() {
    return reviewOther;
  }

  public void setReviewOther(String reviewOther) {
    this.reviewOther = reviewOther;
  }


  public String getPriorEnforcementCases() {
    return priorEnforcementCases;
  }

  public void setPriorEnforcementCases(String priorEnforcementCases) {
    this.priorEnforcementCases = priorEnforcementCases;
  }


  public String getFollowUpCode() {
    return followUpCode;
  }

  public void setFollowUpCode(String followUpCode) {
    this.followUpCode = followUpCode;
  }


  public String getMcsipFlag() {
    return mcsipFlag;
  }

  public void setMcsipFlag(String mcsipFlag) {
    this.mcsipFlag = mcsipFlag;
  }


  public String getMcsipLevel() {
    return mcsipLevel;
  }

  public void setMcsipLevel(String mcsipLevel) {
    this.mcsipLevel = mcsipLevel;
  }


  public java.sql.Date getMcsipLevelDate() {
    return mcsipLevelDate;
  }

  public void setMcsipLevelDate(java.sql.Date mcsipLevelDate) {
    this.mcsipLevelDate = mcsipLevelDate;
  }


  public java.sql.Date getMcsipEntryDate() {
    return mcsipEntryDate;
  }

  public void setMcsipEntryDate(java.sql.Date mcsipEntryDate) {
    this.mcsipEntryDate = mcsipEntryDate;
  }


  public String getSafestatRunIndicator() {
    return safestatRunIndicator;
  }

  public void setSafestatRunIndicator(String safestatRunIndicator) {
    this.safestatRunIndicator = safestatRunIndicator;
  }


  public java.sql.Date getSafestatDate() {
    return safestatDate;
  }

  public void setSafestatDate(java.sql.Date safestatDate) {
    this.safestatDate = safestatDate;
  }


  public String getSafestatAccidentSea() {
    return safestatAccidentSea;
  }

  public void setSafestatAccidentSea(String safestatAccidentSea) {
    this.safestatAccidentSea = safestatAccidentSea;
  }


  public String getSafestatCategory() {
    return safestatCategory;
  }

  public void setSafestatCategory(String safestatCategory) {
    this.safestatCategory = safestatCategory;
  }


  public String getSafestatDriverSea() {
    return safestatDriverSea;
  }

  public void setSafestatDriverSea(String safestatDriverSea) {
    this.safestatDriverSea = safestatDriverSea;
  }


  public String getSafestatLetters() {
    return safestatLetters;
  }

  public void setSafestatLetters(String safestatLetters) {
    this.safestatLetters = safestatLetters;
  }


  public java.sql.Date getSafestatLetterDate() {
    return safestatLetterDate;
  }

  public void setSafestatLetterDate(java.sql.Date safestatLetterDate) {
    this.safestatLetterDate = safestatLetterDate;
  }


  public String getSafestatManagementSea() {
    return safestatManagementSea;
  }

  public void setSafestatManagementSea(String safestatManagementSea) {
    this.safestatManagementSea = safestatManagementSea;
  }


  public String getSafestatIndicator() {
    return safestatIndicator;
  }

  public void setSafestatIndicator(String safestatIndicator) {
    this.safestatIndicator = safestatIndicator;
  }


  public String getSafestatVehicleSea() {
    return safestatVehicleSea;
  }

  public void setSafestatVehicleSea(String safestatVehicleSea) {
    this.safestatVehicleSea = safestatVehicleSea;
  }


  public String getHazmatPassengerScore() {
    return hazmatPassengerScore;
  }

  public void setHazmatPassengerScore(String hazmatPassengerScore) {
    this.hazmatPassengerScore = hazmatPassengerScore;
  }


  public java.sql.Date getHazmatPassengerScoreDate() {
    return hazmatPassengerScoreDate;
  }

  public void setHazmatPassengerScoreDate(java.sql.Date hazmatPassengerScoreDate) {
    this.hazmatPassengerScoreDate = hazmatPassengerScoreDate;
  }


  public String getSnetFatalAccidentsLast24() {
    return snetFatalAccidentsLast24;
  }

  public void setSnetFatalAccidentsLast24(String snetFatalAccidentsLast24) {
    this.snetFatalAccidentsLast24 = snetFatalAccidentsLast24;
  }


  public String getSnetInjuryAccidentsLast24() {
    return snetInjuryAccidentsLast24;
  }

  public void setSnetInjuryAccidentsLast24(String snetInjuryAccidentsLast24) {
    this.snetInjuryAccidentsLast24 = snetInjuryAccidentsLast24;
  }


  public String getSnetTowawayAccidentsLast24() {
    return snetTowawayAccidentsLast24;
  }

  public void setSnetTowawayAccidentsLast24(String snetTowawayAccidentsLast24) {
    this.snetTowawayAccidentsLast24 = snetTowawayAccidentsLast24;
  }


  public String getSnetOtherAccidentsLast24() {
    return snetOtherAccidentsLast24;
  }

  public void setSnetOtherAccidentsLast24(String snetOtherAccidentsLast24) {
    this.snetOtherAccidentsLast24 = snetOtherAccidentsLast24;
  }


  public String getSnetTotalAccidentsLast24() {
    return snetTotalAccidentsLast24;
  }

  public void setSnetTotalAccidentsLast24(String snetTotalAccidentsLast24) {
    this.snetTotalAccidentsLast24 = snetTotalAccidentsLast24;
  }


  public String getSnetFatalAccidentsLast15() {
    return snetFatalAccidentsLast15;
  }

  public void setSnetFatalAccidentsLast15(String snetFatalAccidentsLast15) {
    this.snetFatalAccidentsLast15 = snetFatalAccidentsLast15;
  }


  public String getSnetInjuryAccidentsLast15() {
    return snetInjuryAccidentsLast15;
  }

  public void setSnetInjuryAccidentsLast15(String snetInjuryAccidentsLast15) {
    this.snetInjuryAccidentsLast15 = snetInjuryAccidentsLast15;
  }


  public String getSnetTowawayAccidentsLast15() {
    return snetTowawayAccidentsLast15;
  }

  public void setSnetTowawayAccidentsLast15(String snetTowawayAccidentsLast15) {
    this.snetTowawayAccidentsLast15 = snetTowawayAccidentsLast15;
  }


  public String getSnetOtherAccidentsLast15() {
    return snetOtherAccidentsLast15;
  }

  public void setSnetOtherAccidentsLast15(String snetOtherAccidentsLast15) {
    this.snetOtherAccidentsLast15 = snetOtherAccidentsLast15;
  }


  public String getSnetTotalAccidentsLast15() {
    return snetTotalAccidentsLast15;
  }

  public void setSnetTotalAccidentsLast15(String snetTotalAccidentsLast15) {
    this.snetTotalAccidentsLast15 = snetTotalAccidentsLast15;
  }


  public String getSnetFatalAccidentsLast30() {
    return snetFatalAccidentsLast30;
  }

  public void setSnetFatalAccidentsLast30(String snetFatalAccidentsLast30) {
    this.snetFatalAccidentsLast30 = snetFatalAccidentsLast30;
  }


  public String getSnetInjuryAccidentsLast30() {
    return snetInjuryAccidentsLast30;
  }

  public void setSnetInjuryAccidentsLast30(String snetInjuryAccidentsLast30) {
    this.snetInjuryAccidentsLast30 = snetInjuryAccidentsLast30;
  }


  public String getSnetTowawayAccidentsLast30() {
    return snetTowawayAccidentsLast30;
  }

  public void setSnetTowawayAccidentsLast30(String snetTowawayAccidentsLast30) {
    this.snetTowawayAccidentsLast30 = snetTowawayAccidentsLast30;
  }


  public String getSnetOtherAccidentsLast30() {
    return snetOtherAccidentsLast30;
  }

  public void setSnetOtherAccidentsLast30(String snetOtherAccidentsLast30) {
    this.snetOtherAccidentsLast30 = snetOtherAccidentsLast30;
  }


  public String getSnetTotalAccidentsLast30() {
    return snetTotalAccidentsLast30;
  }

  public void setSnetTotalAccidentsLast30(String snetTotalAccidentsLast30) {
    this.snetTotalAccidentsLast30 = snetTotalAccidentsLast30;
  }


  public String getStateData() {
    return stateData;
  }

  public void setStateData(String stateData) {
    this.stateData = stateData;
  }


  public String getIssScore() {
    return issScore;
  }

  public void setIssScore(String issScore) {
    this.issScore = issScore;
  }


  public java.sql.Date getIssScoreDate() {
    return issScoreDate;
  }

  public void setIssScoreDate(java.sql.Date issScoreDate) {
    this.issScoreDate = issScoreDate;
  }


  public String getIssIndicator() {
    return issIndicator;
  }

  public void setIssIndicator(String issIndicator) {
    this.issIndicator = issIndicator;
  }


  public String getDunsNumber() {
    return dunsNumber;
  }

  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }


  public java.sql.Date getHazmatRegDate() {
    return hazmatRegDate;
  }

  public void setHazmatRegDate(java.sql.Date hazmatRegDate) {
    this.hazmatRegDate = hazmatRegDate;
  }


  public java.sql.Date getOosRescindDate() {
    return oosRescindDate;
  }

  public void setOosRescindDate(java.sql.Date oosRescindDate) {
    this.oosRescindDate = oosRescindDate;
  }


  public String getMcs150Mileage() {
    return mcs150Mileage;
  }

  public void setMcs150Mileage(String mcs150Mileage) {
    this.mcs150Mileage = mcs150Mileage;
  }


  public String getMcs150MileageYear() {
    return mcs150MileageYear;
  }

  public void setMcs150MileageYear(String mcs150MileageYear) {
    this.mcs150MileageYear = mcs150MileageYear;
  }


  public java.sql.Date getMcs150UpdateDate() {
    return mcs150UpdateDate;
  }

  public void setMcs150UpdateDate(java.sql.Date mcs150UpdateDate) {
    this.mcs150UpdateDate = mcs150UpdateDate;
  }


  public String getMcs150UpdateFlag() {
    return mcs150UpdateFlag;
  }

  public void setMcs150UpdateFlag(String mcs150UpdateFlag) {
    this.mcs150UpdateFlag = mcs150UpdateFlag;
  }


  public String getPreventableCrashes() {
    return preventableCrashes;
  }

  public void setPreventableCrashes(String preventableCrashes) {
    this.preventableCrashes = preventableCrashes;
  }


  public String getMileage() {
    return mileage;
  }

  public void setMileage(String mileage) {
    this.mileage = mileage;
  }


  public java.sql.Date getHmPermitEffectiveDate() {
    return hmPermitEffectiveDate;
  }

  public void setHmPermitEffectiveDate(java.sql.Date hmPermitEffectiveDate) {
    this.hmPermitEffectiveDate = hmPermitEffectiveDate;
  }


  public java.sql.Date getHmPermitExpirationDate() {
    return hmPermitExpirationDate;
  }

  public void setHmPermitExpirationDate(java.sql.Date hmPermitExpirationDate) {
    this.hmPermitExpirationDate = hmPermitExpirationDate;
  }


  public String getHmPermitNumber() {
    return hmPermitNumber;
  }

  public void setHmPermitNumber(String hmPermitNumber) {
    this.hmPermitNumber = hmPermitNumber;
  }


  public String getHmPermitOperUnderAppealF() {
    return hmPermitOperUnderAppealF;
  }

  public void setHmPermitOperUnderAppealF(String hmPermitOperUnderAppealF) {
    this.hmPermitOperUnderAppealF = hmPermitOperUnderAppealF;
  }


  public String getHmPermitStatus() {
    return hmPermitStatus;
  }

  public void setHmPermitStatus(String hmPermitStatus) {
    this.hmPermitStatus = hmPermitStatus;
  }


  public String getQtyHmCargoTrucksOwned() {
    return qtyHmCargoTrucksOwned;
  }

  public void setQtyHmCargoTrucksOwned(String qtyHmCargoTrucksOwned) {
    this.qtyHmCargoTrucksOwned = qtyHmCargoTrucksOwned;
  }


  public String getQtyHmCargoTruckTermLeased() {
    return qtyHmCargoTruckTermLeased;
  }

  public void setQtyHmCargoTruckTermLeased(String qtyHmCargoTruckTermLeased) {
    this.qtyHmCargoTruckTermLeased = qtyHmCargoTruckTermLeased;
  }


  public String getQtyHmCargoTruckTripLeased() {
    return qtyHmCargoTruckTripLeased;
  }

  public void setQtyHmCargoTruckTripLeased(String qtyHmCargoTruckTripLeased) {
    this.qtyHmCargoTruckTripLeased = qtyHmCargoTruckTripLeased;
  }


  public String getQtyLimos16POwned() {
    return qtyLimos16POwned;
  }

  public void setQtyLimos16POwned(String qtyLimos16POwned) {
    this.qtyLimos16POwned = qtyLimos16POwned;
  }


  public String getQtyLimos16PTermLeased() {
    return qtyLimos16PTermLeased;
  }

  public void setQtyLimos16PTermLeased(String qtyLimos16PTermLeased) {
    this.qtyLimos16PTermLeased = qtyLimos16PTermLeased;
  }


  public String getQtyLimos16PTripLeased() {
    return qtyLimos16PTripLeased;
  }

  public void setQtyLimos16PTripLeased(String qtyLimos16PTripLeased) {
    this.qtyLimos16PTripLeased = qtyLimos16PTripLeased;
  }


  public String getQtyLimos1To8POwned() {
    return qtyLimos1To8POwned;
  }

  public void setQtyLimos1To8POwned(String qtyLimos1To8POwned) {
    this.qtyLimos1To8POwned = qtyLimos1To8POwned;
  }


  public String getQtyLimos1To8PTermLeased() {
    return qtyLimos1To8PTermLeased;
  }

  public void setQtyLimos1To8PTermLeased(String qtyLimos1To8PTermLeased) {
    this.qtyLimos1To8PTermLeased = qtyLimos1To8PTermLeased;
  }


  public String getQtyLimos1To8PTripLeased() {
    return qtyLimos1To8PTripLeased;
  }

  public void setQtyLimos1To8PTripLeased(String qtyLimos1To8PTripLeased) {
    this.qtyLimos1To8PTripLeased = qtyLimos1To8PTripLeased;
  }


  public String getQtyLimos9To15POwned() {
    return qtyLimos9To15POwned;
  }

  public void setQtyLimos9To15POwned(String qtyLimos9To15POwned) {
    this.qtyLimos9To15POwned = qtyLimos9To15POwned;
  }


  public String getQtyLimos9To15PTermLeased() {
    return qtyLimos9To15PTermLeased;
  }

  public void setQtyLimos9To15PTermLeased(String qtyLimos9To15PTermLeased) {
    this.qtyLimos9To15PTermLeased = qtyLimos9To15PTermLeased;
  }


  public String getQtyLimos9To15PTripLeased() {
    return qtyLimos9To15PTripLeased;
  }

  public void setQtyLimos9To15PTripLeased(String qtyLimos9To15PTripLeased) {
    this.qtyLimos9To15PTripLeased = qtyLimos9To15PTripLeased;
  }


  public String getQtyMiniBusesOwned() {
    return qtyMiniBusesOwned;
  }

  public void setQtyMiniBusesOwned(String qtyMiniBusesOwned) {
    this.qtyMiniBusesOwned = qtyMiniBusesOwned;
  }


  public String getQtyMiniBusesTermLeased() {
    return qtyMiniBusesTermLeased;
  }

  public void setQtyMiniBusesTermLeased(String qtyMiniBusesTermLeased) {
    this.qtyMiniBusesTermLeased = qtyMiniBusesTermLeased;
  }


  public String getQtyMiniBusesTripLeased() {
    return qtyMiniBusesTripLeased;
  }

  public void setQtyMiniBusesTripLeased(String qtyMiniBusesTripLeased) {
    this.qtyMiniBusesTripLeased = qtyMiniBusesTripLeased;
  }


  public String getQtyMotorCoachesOwned() {
    return qtyMotorCoachesOwned;
  }

  public void setQtyMotorCoachesOwned(String qtyMotorCoachesOwned) {
    this.qtyMotorCoachesOwned = qtyMotorCoachesOwned;
  }


  public String getQtyMotorCoachesTermLeased() {
    return qtyMotorCoachesTermLeased;
  }

  public void setQtyMotorCoachesTermLeased(String qtyMotorCoachesTermLeased) {
    this.qtyMotorCoachesTermLeased = qtyMotorCoachesTermLeased;
  }


  public String getQtyMotorCoachesTripLeased() {
    return qtyMotorCoachesTripLeased;
  }

  public void setQtyMotorCoachesTripLeased(String qtyMotorCoachesTripLeased) {
    this.qtyMotorCoachesTripLeased = qtyMotorCoachesTripLeased;
  }


  public String getQtySchBus16POwned() {
    return qtySchBus16POwned;
  }

  public void setQtySchBus16POwned(String qtySchBus16POwned) {
    this.qtySchBus16POwned = qtySchBus16POwned;
  }


  public String getQtySchBus16PTermLeased() {
    return qtySchBus16PTermLeased;
  }

  public void setQtySchBus16PTermLeased(String qtySchBus16PTermLeased) {
    this.qtySchBus16PTermLeased = qtySchBus16PTermLeased;
  }


  public String getQtySchBus16PTripLeased() {
    return qtySchBus16PTripLeased;
  }

  public void setQtySchBus16PTripLeased(String qtySchBus16PTripLeased) {
    this.qtySchBus16PTripLeased = qtySchBus16PTripLeased;
  }


  public String getQtySchBus1To8POwned() {
    return qtySchBus1To8POwned;
  }

  public void setQtySchBus1To8POwned(String qtySchBus1To8POwned) {
    this.qtySchBus1To8POwned = qtySchBus1To8POwned;
  }


  public String getQtySchBus1To8PTermLeased() {
    return qtySchBus1To8PTermLeased;
  }

  public void setQtySchBus1To8PTermLeased(String qtySchBus1To8PTermLeased) {
    this.qtySchBus1To8PTermLeased = qtySchBus1To8PTermLeased;
  }


  public String getQtySchBus1To8PTripLeased() {
    return qtySchBus1To8PTripLeased;
  }

  public void setQtySchBus1To8PTripLeased(String qtySchBus1To8PTripLeased) {
    this.qtySchBus1To8PTripLeased = qtySchBus1To8PTripLeased;
  }


  public String getQtySchBus9To15POwned() {
    return qtySchBus9To15POwned;
  }

  public void setQtySchBus9To15POwned(String qtySchBus9To15POwned) {
    this.qtySchBus9To15POwned = qtySchBus9To15POwned;
  }


  public String getQtySchBus9To15PTermLeased() {
    return qtySchBus9To15PTermLeased;
  }

  public void setQtySchBus9To15PTermLeased(String qtySchBus9To15PTermLeased) {
    this.qtySchBus9To15PTermLeased = qtySchBus9To15PTermLeased;
  }


  public String getQtySchBus9To15PTripLeased() {
    return qtySchBus9To15PTripLeased;
  }

  public void setQtySchBus9To15PTripLeased(String qtySchBus9To15PTripLeased) {
    this.qtySchBus9To15PTripLeased = qtySchBus9To15PTripLeased;
  }


  public String getQtyStraightTrucksOwned() {
    return qtyStraightTrucksOwned;
  }

  public void setQtyStraightTrucksOwned(String qtyStraightTrucksOwned) {
    this.qtyStraightTrucksOwned = qtyStraightTrucksOwned;
  }


  public String getQtyStraightTruckTermLeased() {
    return qtyStraightTruckTermLeased;
  }

  public void setQtyStraightTruckTermLeased(String qtyStraightTruckTermLeased) {
    this.qtyStraightTruckTermLeased = qtyStraightTruckTermLeased;
  }


  public String getQtyStraightTruckTripLeased() {
    return qtyStraightTruckTripLeased;
  }

  public void setQtyStraightTruckTripLeased(String qtyStraightTruckTripLeased) {
    this.qtyStraightTruckTripLeased = qtyStraightTruckTripLeased;
  }


  public String getQtyTrailersHmOwned() {
    return qtyTrailersHmOwned;
  }

  public void setQtyTrailersHmOwned(String qtyTrailersHmOwned) {
    this.qtyTrailersHmOwned = qtyTrailersHmOwned;
  }


  public String getQtyTrailersHmTermLeased() {
    return qtyTrailersHmTermLeased;
  }

  public void setQtyTrailersHmTermLeased(String qtyTrailersHmTermLeased) {
    this.qtyTrailersHmTermLeased = qtyTrailersHmTermLeased;
  }


  public String getQtyTrailersHmTripLeased() {
    return qtyTrailersHmTripLeased;
  }

  public void setQtyTrailersHmTripLeased(String qtyTrailersHmTripLeased) {
    this.qtyTrailersHmTripLeased = qtyTrailersHmTripLeased;
  }


  public String getQtyTrailersOwned() {
    return qtyTrailersOwned;
  }

  public void setQtyTrailersOwned(String qtyTrailersOwned) {
    this.qtyTrailersOwned = qtyTrailersOwned;
  }


  public String getQtyTrailersTermLeased() {
    return qtyTrailersTermLeased;
  }

  public void setQtyTrailersTermLeased(String qtyTrailersTermLeased) {
    this.qtyTrailersTermLeased = qtyTrailersTermLeased;
  }


  public String getQtyTrailersTripLeased() {
    return qtyTrailersTripLeased;
  }

  public void setQtyTrailersTripLeased(String qtyTrailersTripLeased) {
    this.qtyTrailersTripLeased = qtyTrailersTripLeased;
  }


  public String getQtyTruckTractorsOwned() {
    return qtyTruckTractorsOwned;
  }

  public void setQtyTruckTractorsOwned(String qtyTruckTractorsOwned) {
    this.qtyTruckTractorsOwned = qtyTruckTractorsOwned;
  }


  public String getQtyTruckTractorsTermLeased() {
    return qtyTruckTractorsTermLeased;
  }

  public void setQtyTruckTractorsTermLeased(String qtyTruckTractorsTermLeased) {
    this.qtyTruckTractorsTermLeased = qtyTruckTractorsTermLeased;
  }


  public String getQtyTruckTractorsTripLeased() {
    return qtyTruckTractorsTripLeased;
  }

  public void setQtyTruckTractorsTripLeased(String qtyTruckTractorsTripLeased) {
    this.qtyTruckTractorsTripLeased = qtyTruckTractorsTripLeased;
  }


  public String getQtyVans1To8POwned() {
    return qtyVans1To8POwned;
  }

  public void setQtyVans1To8POwned(String qtyVans1To8POwned) {
    this.qtyVans1To8POwned = qtyVans1To8POwned;
  }


  public String getQtyVans1To8PTermLeased() {
    return qtyVans1To8PTermLeased;
  }

  public void setQtyVans1To8PTermLeased(String qtyVans1To8PTermLeased) {
    this.qtyVans1To8PTermLeased = qtyVans1To8PTermLeased;
  }


  public String getQtyVans1To8PTripLeased() {
    return qtyVans1To8PTripLeased;
  }

  public void setQtyVans1To8PTripLeased(String qtyVans1To8PTripLeased) {
    this.qtyVans1To8PTripLeased = qtyVans1To8PTripLeased;
  }


  public String getQtyVans9To15POwned() {
    return qtyVans9To15POwned;
  }

  public void setQtyVans9To15POwned(String qtyVans9To15POwned) {
    this.qtyVans9To15POwned = qtyVans9To15POwned;
  }


  public String getQtyVans9To15PTermLeased() {
    return qtyVans9To15PTermLeased;
  }

  public void setQtyVans9To15PTermLeased(String qtyVans9To15PTermLeased) {
    this.qtyVans9To15PTermLeased = qtyVans9To15PTermLeased;
  }


  public String getQtyVans9To15PTripLeased() {
    return qtyVans9To15PTripLeased;
  }

  public void setQtyVans9To15PTripLeased(String qtyVans9To15PTripLeased) {
    this.qtyVans9To15PTripLeased = qtyVans9To15PTripLeased;
  }


  public String getTelephoneNumberCellular() {
    return telephoneNumberCellular;
  }

  public void setTelephoneNumberCellular(String telephoneNumberCellular) {
    this.telephoneNumberCellular = telephoneNumberCellular;
  }


  public String getOfficerNameTitle1() {
    return officerNameTitle1;
  }

  public void setOfficerNameTitle1(String officerNameTitle1) {
    this.officerNameTitle1 = officerNameTitle1;
  }


  public String getOfficerNameTitle2() {
    return officerNameTitle2;
  }

  public void setOfficerNameTitle2(String officerNameTitle2) {
    this.officerNameTitle2 = officerNameTitle2;
  }


  public String getNewEntrantCode() {
    return newEntrantCode;
  }

  public void setNewEntrantCode(String newEntrantCode) {
    this.newEntrantCode = newEntrantCode;
  }


  public java.sql.Date getNewEntrantEndDate() {
    return newEntrantEndDate;
  }

  public void setNewEntrantEndDate(java.sql.Date newEntrantEndDate) {
    this.newEntrantEndDate = newEntrantEndDate;
  }


  public java.sql.Date getNewEntrantStartDate() {
    return newEntrantStartDate;
  }

  public void setNewEntrantStartDate(java.sql.Date newEntrantStartDate) {
    this.newEntrantStartDate = newEntrantStartDate;
  }


  public java.sql.Date getOosDate() {
    return oosDate;
  }

  public void setOosDate(java.sql.Date oosDate) {
    this.oosDate = oosDate;
  }


  public String getOosFlag() {
    return oosFlag;
  }

  public void setOosFlag(String oosFlag) {
    this.oosFlag = oosFlag;
  }


  public String getCsaLetters() {
    return csaLetters;
  }

  public void setCsaLetters(String csaLetters) {
    this.csaLetters = csaLetters;
  }


  public java.sql.Date getCsaLettersDate() {
    return csaLettersDate;
  }

  public void setCsaLettersDate(java.sql.Date csaLettersDate) {
    this.csaLettersDate = csaLettersDate;
  }


  public String getIccNumber1() {
    return iccNumber1;
  }

  public void setIccNumber1(String iccNumber1) {
    this.iccNumber1 = iccNumber1;
  }


  public String getIccNumber2() {
    return iccNumber2;
  }

  public void setIccNumber2(String iccNumber2) {
    this.iccNumber2 = iccNumber2;
  }


  public String getIccNumber3() {
    return iccNumber3;
  }

  public void setIccNumber3(String iccNumber3) {
    this.iccNumber3 = iccNumber3;
  }

}
