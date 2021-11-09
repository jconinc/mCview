package com.lsc.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class HelperEnum {

    /**
     * Fee calculation are different for IRP and IFTA
     */
    public enum ProgramType {
        IRP, IFTA;

        private static Map<String, ProgramType> programMap = new HashMap<>();

        static {
            programMap.put("IFTA", IFTA);
            programMap.put("IRP", IRP);
        }

        @JsonCreator
        public static ProgramType forValue(String value) {
            return programMap.get(value.toUpperCase());
        }


        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, ProgramType> entry : programMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }

    }

    public enum CviewModes {
        USDOTSummary, USDOTDetail, USDOTPartialSummary, VINSummary,
        VINDetail, plateSummary, plateDetail;
    }

    public enum CviewParams {
        USDOT, VIN, plate, jurisdiction,
        infoFlag;
    }

    /**
     * Different currency denominations
     */
    public enum CurrencyType {
        US, CN;

        private static Map<String, CurrencyType> currencyMap = new HashMap<>();

        static {
            currencyMap.put("US", US);
            currencyMap.put("CN", CN);
        }

        @JsonCreator
        public static CurrencyType forValue(String value) {
            return currencyMap.get(value.toUpperCase());
        }


        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, CurrencyType> entry : currencyMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }

    }

    /**
     * MCarrier Inter - Jurisdictional Fee Names
     */
    public enum FeeName {

        TITLE("001", "TITLE", "Title"), LIEN("002", "LIEN", "Lien"), REG("003", "REG", "Primary Weight Fee"),
        SPF("004", "SPF", "Special Plate Fee"), MVT("005", "MVT", "BC Multi Jurisdictional Vehicle Tax (MVT)"),
        OWN("005", "OWN", "CO Ownership Tax"), CVET("005", "CVET", "IN Commercial Vehicle Excise Tax"),
        ADV("005", "ADD_VEHICLE", "Ad Valorem Fee"), PVT("005", "PVT", "Prorate Vehicle Tax"),
        BGST("005", "BGST", "Nevada Basic Government Services Tax"), AAVT("005", "AAVT", "GA Alternate Ad Valorem Tax"),
        TM("005", "TM", "Road Use Fee Mileage Rate"), TD("005", "TD", "Road Use Fee Depreciation"),
        BJFO("999", "BJFO", "Base IRPJuris Fee Only"), BSS("116", "BSS", "Bridge Safety Surcharge Fee"),
        CVEH("116", "CVEH", "Commercial Vehicle Fee"), RSS("117", "RSS", "Road Safety Surcharge"),
        DHBTF("118", "DHBTF", "Dedicated Highway and Bridge Trust Fund"), REG1("119", "REG1", "Additional Registration Surcharge Fee"),
        PRIV("119", "PRIV", "Additional Privilege Tax"), RNB("120", "RNB", "Road and Bridge Fee"),
        AGE("121", "AGE", "Age Fee"), EHUT("121", "EHUT", "Equalized Highway Use Tax"), REG2("122", "REG2", "Additional Reg Fee 2"),
        PART2("122", "PART2", "Part II Fee"), PW("119", "PW", "Propane Weight Fee"), PF("120", "PW", "Propane Fee")
        , ARCS("119", "AF", "ARCS Fee"), FH("122", "FH", "Hybrid Fee"), FE("122", "FE", "Electric Fee"), SF("116", "SF", "Safety Fee")
        , ICIF("119", "TR", "Interstate 81 Corridor Improvement Fund");

        private final String code;
        private final String abbr;
        private final String desc;

        FeeName(String code, String abbr, String desc) {
            this.code = code;
            this.abbr = abbr;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public String getAbbr() {
            return abbr;
        }

        public String getDesc() {
            return desc;
        }
    }


    /**
     * mFees requests needs to be one of the following service
     */
    public enum ServiceType {
        NEW_CARRIER("NEW_CARRIER", "NEW CARRIER"), NEW_FLEET("NEW_FLEET", "NEW FLEET"), ADD_VEHICLE("ADD_VEHICLE", "ADD_VEHICLE"), RENEWAL("RENEWAL", "RENEWAL"),
        AMEND_VEHICLE("AMEND_VEHICLE", "AMEND VEHICLE"), FLEET_TRANSFER("FLEET_TRANSFER", "FLEET TRANSFER"), ADD_TRANSFER("ADD_TRANSFER", "ADD WITH TRANSFER"),
        DELETE_VEHICLE("DELETE_VEHICLE", "DELETE VEHICLE"), ERROR_CORRECTION("ERROR_CORRECTION", "ERROR CORRECTION"), AUDIT("AUDIT", "AUDIT"), CHANGE_CARRIER("CHANGE_CARRIER", "CHANGE CARRIER");

        private static Map<String, ServiceType> servicesMap = new HashMap<>();

        static {
            servicesMap.put("NEW", NEW_CARRIER);
            servicesMap.put("NFL", NEW_FLEET);
            servicesMap.put("ADV", ADD_VEHICLE);
            servicesMap.put("REN", RENEWAL);
            servicesMap.put("AMF", AMEND_VEHICLE);
            servicesMap.put("FTF", FLEET_TRANSFER);
            servicesMap.put("ADX", ADD_TRANSFER);
            servicesMap.put("DEV", DELETE_VEHICLE);
            servicesMap.put("ERC", ERROR_CORRECTION);
            servicesMap.put("AUD", AUDIT);
            servicesMap.put("CHC", CHANGE_CARRIER);
        }
        private String code, desc;

        ServiceType(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @JsonCreator
        public static ServiceType forValue(String value) {
            return servicesMap.get(value.toUpperCase());
        }


        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, ServiceType> entry : servicesMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }
    }

    /**
     * Set of fee names are mapped to one mm25 code
     */
    public enum MM25 {

        ONE, TWO, THREE, FOUR, FIVE, NINE99, ONE16, ONE17, ONE18, ONE19, ONE20, ONE21, ONE22, ONE23, CAB_CARD, ADMIN_FEE, TRANSFER, PERMIT, GRADE_CROSS,
        REPLACE_PLATE, REVENUE_TRANSFER, WRECKER_FEE, REG_INSP, REN_INSP, INVALID, TECHSUR;

        private static Map<String, MM25> mm25Map = new HashMap<>();

        static {
            mm25Map.put("001", ONE);
            mm25Map.put("002", TWO);
            mm25Map.put("003", THREE);
            mm25Map.put("004", FOUR);
            mm25Map.put("005", FIVE);
            mm25Map.put("999", NINE99);
            mm25Map.put("116", ONE16);
            mm25Map.put("117", ONE17);
            mm25Map.put("118", ONE18);
            mm25Map.put("119", ONE19);
            mm25Map.put("120", ONE20);
            mm25Map.put("121", ONE21);
            mm25Map.put("122", ONE22);
            mm25Map.put("123", ONE23); // AZ baseJuris
            /* Bill wants the mFees Office to be able to send invalid data, which is not in the list of finite
             * mm25. So all those will be mapped to INVALID and will help external clients who compare the results
             * with mFees to identify the error */
            mm25Map.put("CAB", CAB_CARD);
            mm25Map.put("TECHSUR", TECHSUR);

            mm25Map.put("ADMIN", ADMIN_FEE);
            mm25Map.put("TRANSFER", TRANSFER);
            mm25Map.put("PERMIT", PERMIT);
            mm25Map.put("GRC", GRADE_CROSS);
            mm25Map.put("REP", REPLACE_PLATE);
            mm25Map.put("PTR", REVENUE_TRANSFER);
            mm25Map.put("TOW", WRECKER_FEE);
            mm25Map.put("RGI", REG_INSP);
            mm25Map.put("RNI", REN_INSP);
            mm25Map.put("INVALID", INVALID);

        }

        @JsonCreator
        public static MM25 forValue(String value) {
            if (mm25Map.get(value) == null)
                return INVALID;
            else
                return mm25Map.get(value);
        }

        @JsonValue
        public String getCode() {
            for (Map.Entry<String, MM25> entry : mm25Map.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }
    }

    /**
     * Fee Credit Exceptions
     */
    public enum FeeCreditException {

        BLANK("", "Blank"), NC("NC", "No Transfer Credit"), CM("CM", "No Current Month Credit"),
        IN("IN", "Credit not allowed for diff Veh Type/Fleet type"), FF("FF", "No Fleet to Fleet Credit");

        private final String code;
        private final String desc;

        FeeCreditException(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }


        public String getDesc() {
            return desc;
        }

        public static FeeCreditException forValue(String feeCreditException){
            if(feeCreditException == null || BLANK.getCode().equals(feeCreditException)){
                return BLANK;
            }else if(CM.getCode().equals(feeCreditException)){
                return CM;
            }else if(NC.getCode().equals(feeCreditException)){
                return NC;
            }else if(IN.getCode().equals(feeCreditException)){
                return IN;
            }else if(FF.getCode().equals(feeCreditException)){
                return FF;
            }else {
                return null;
            }
        }
    }

    /**
     * Fee codes to represent base jurisdiction fees
     */
    public enum CreditRule {

        FULL_CREDIT, GENERAL_RULE, CURRENT_MONTH_CREDIT_NOT_ALLOWED, BOTH_PRIVATE_BUS_OR_BOTH_NOT;

        private static Map<String, CreditRule> creditRuleMap = new HashMap<>();

        static {
            creditRuleMap.put("FULL_CREDIT", FULL_CREDIT);
            creditRuleMap.put("GENERAL_RULE", GENERAL_RULE);
            creditRuleMap.put("CURRENT_MONTH_CREDIT_NOT_ALLOWED", CURRENT_MONTH_CREDIT_NOT_ALLOWED);
            creditRuleMap.put("BOTH_PRIVATE_BUS_OR_BOTH_NOT", BOTH_PRIVATE_BUS_OR_BOTH_NOT);


        }

        @JsonCreator
        public static CreditRule forValue(String value) {
            return creditRuleMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getRule() {
            for (Map.Entry<String, CreditRule> entry : creditRuleMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }
            return null; // or fail
        }
    }

    /**
     * Fee codes to represent base jurisdiction fees
     */
    public enum JurisFeeCd {

        CAB_CARD, ADMIN_FEE, TRANSFER, PERMIT, GRADE_CROSS, REPLACE_PLATE, REVENUE_TRANSFER, WRECKER_FEE, REG_INSP, REN_INSP;

        private static Map<String, JurisFeeCd> jurisFeeMap = new HashMap<>();

        static {
            jurisFeeMap.put("CAB", CAB_CARD);
            jurisFeeMap.put("ADMIN", ADMIN_FEE);
            jurisFeeMap.put("TRANSFER", TRANSFER);
            jurisFeeMap.put("PERMIT", PERMIT);
            jurisFeeMap.put("GRC", GRADE_CROSS);
            jurisFeeMap.put("REP", REPLACE_PLATE);
            jurisFeeMap.put("PTR", REVENUE_TRANSFER);
            jurisFeeMap.put("TOW", WRECKER_FEE);
            jurisFeeMap.put("RGI", REG_INSP);
            jurisFeeMap.put("RNI", REN_INSP);
        }

        @JsonCreator
        public static JurisFeeCd forValue(String value) {
            return jurisFeeMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getCode() {
            for (Map.Entry<String, JurisFeeCd> entry : jurisFeeMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }
            return null; // or fail
        }
    }

    /**
     * All the jurisdictions both the canadian and US
     */
    public enum CviewSearchOptions {

        usdot, plate, carrierLegalName, carrierDBAName, vin, tin;

        private static Map<String, CviewSearchOptions> searchOptions = new HashMap<>();

        static {
            searchOptions.put("usdot", usdot);
            searchOptions.put("plate", plate);
            searchOptions.put("carrierLegalName", carrierLegalName);
            searchOptions.put("carrierDBAName", carrierDBAName);
            searchOptions.put("vin", vin);
            searchOptions.put("tin", tin);
        }

        @JsonCreator
        public static CviewSearchOptions forValue(String value) {
            return searchOptions.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, CviewSearchOptions> entry : searchOptions.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }
            return null; // or fail
        }

    }

    /**
     * All the jurisdictions both the canadian and US
     */
    public enum IRPJuris {

        ALABAMA, ARKANSAS, ARIZONA, CALIFORNIA, COLORADO, CONNECTICUT, DISTRICT_OF_COLUMBIA, DELAWARE, FLORIDA, GEORGIA,
        IOWA, IDAHO, ILLINOIS, INDIANA, KANSAS, KENTUCKY, LOUISIANA, MASSACHUSETTS, MARYLAND, MAINE, MICHIGAN, MINNESOTA,
        MISSOURI, MISSISSIPPI, MONTANA, NORTH_CAROLINA, NORTH_DAKOTA, NEBRASKA, NEW_HAMPSHIRE, NEW_JERSEY, NEW_MEXICO,
        NEVADA, NEW_YORK, OHIO, OKLAHOMA, OREGON, PENNSYLVANIA, RHODE_ISLAND, SOUTH_CAROLINA, SOUTH_DAKOTA, TENNESSEE, TEXAS,
        UTAH, VIRGINIA, VERMONT, WASHINGTON, WISCONSIN, WEST_VIRGINIA, WYOMING, ALBERTA, BRITISH_COLUMBIA, MANITOBA,
        NEW_BRUNSWICK, NEWFOUNDLAND, NOVA_SCOTIA, ONTARIO, PRINCE_EDWARD_ISLAND, QUEBEC, SASKATCHEWAN;

        private static Map<String, IRPJuris> irpJurisMap = new HashMap<>();

        static {
            irpJurisMap.put("AL", ALABAMA);
            irpJurisMap.put("AR", ARKANSAS);
            irpJurisMap.put("AZ", ARIZONA);
            irpJurisMap.put("CA", CALIFORNIA);
            irpJurisMap.put("CO", COLORADO);
            irpJurisMap.put("CT", CONNECTICUT);
            irpJurisMap.put("DC", DISTRICT_OF_COLUMBIA);
            irpJurisMap.put("DE", DELAWARE);
            irpJurisMap.put("FL", FLORIDA);
            irpJurisMap.put("GA", GEORGIA);
            irpJurisMap.put("IA", IOWA);
            irpJurisMap.put("ID", IDAHO);
            irpJurisMap.put("IL", ILLINOIS);
            irpJurisMap.put("IN", INDIANA);
            irpJurisMap.put("KS", KANSAS);
            irpJurisMap.put("KY", KENTUCKY);
            irpJurisMap.put("LA", LOUISIANA);
            irpJurisMap.put("MA", MASSACHUSETTS);
            irpJurisMap.put("MD", MARYLAND);
            irpJurisMap.put("ME", MAINE);
            irpJurisMap.put("MI", MICHIGAN);
            irpJurisMap.put("MN", MINNESOTA);
            irpJurisMap.put("MO", MISSOURI);
            irpJurisMap.put("MS", MISSISSIPPI);
            irpJurisMap.put("MT", MONTANA);
            irpJurisMap.put("NC", NORTH_CAROLINA);
            irpJurisMap.put("ND", NORTH_DAKOTA);
            irpJurisMap.put("NE", NEBRASKA);
            irpJurisMap.put("NH", NEW_HAMPSHIRE);
            irpJurisMap.put("NJ", NEW_JERSEY);
            irpJurisMap.put("NM", NEW_MEXICO);
            irpJurisMap.put("NV", NEVADA);
            irpJurisMap.put("NY", NEW_YORK);
            irpJurisMap.put("OH", OHIO);
            irpJurisMap.put("OK", OKLAHOMA);
            irpJurisMap.put("OR", OREGON);
            irpJurisMap.put("PA", PENNSYLVANIA);
            irpJurisMap.put("RI", RHODE_ISLAND);
            irpJurisMap.put("SC", SOUTH_CAROLINA);
            irpJurisMap.put("SD", SOUTH_DAKOTA);
            irpJurisMap.put("TN", TENNESSEE);
            irpJurisMap.put("TX", TEXAS);
            irpJurisMap.put("UT", UTAH);
            irpJurisMap.put("VA", VIRGINIA);
            irpJurisMap.put("VT", VERMONT);
            irpJurisMap.put("WA", WASHINGTON);
            irpJurisMap.put("WI", WISCONSIN);
            irpJurisMap.put("WV", WEST_VIRGINIA);
            irpJurisMap.put("WY", WYOMING);
            irpJurisMap.put("AB", ALBERTA);
            irpJurisMap.put("BC", BRITISH_COLUMBIA);
            irpJurisMap.put("MB", MANITOBA);
            irpJurisMap.put("NB", NEW_BRUNSWICK);
            irpJurisMap.put("NL", NEWFOUNDLAND);
            irpJurisMap.put("NS", NOVA_SCOTIA);
            irpJurisMap.put("ON", ONTARIO);
            irpJurisMap.put("PE", PRINCE_EDWARD_ISLAND);
            irpJurisMap.put("QC", QUEBEC);
            irpJurisMap.put("SK", SASKATCHEWAN);
        }

        @JsonCreator
        public static IRPJuris forValue(String value) {
            return irpJurisMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, IRPJuris> entry : irpJurisMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }
            return null; // or fail
        }

    }


    public enum CANJuris {
        AB("ALBERTA", "AB", 49),
        BC("BRITISH_COLUMBIA", "BC", 50), MB("MANITOBA", "MB", 51), NB("NEW_BRUNSWICK", "NB", 52), NL("NEWFOUNDLAND", "NL", 53),
        NS("NOVA_SCOTIA", "NS", 54), ON("ONTARIO", "ON", 55), PE("PRINCE_EDWARD_ISLAND", "PE", 56),
        QC("QUEBEC", "QC", 57), SK("SASKATCHEWAN", "SK", 58);

        private String name;
        private String abbr;
        private int jurisIndex;

        CANJuris(String name, String abbr, int jurisIndex) {
            this.name = name;
            this.abbr = abbr;
            this.jurisIndex = jurisIndex;
        }

        public String getName() {
            return name;
        }

        public String getAbbr() {
            return abbr;
        }

        public int getJurisIndex() {
            return jurisIndex;
        }
    }

    /**
     * Distance type can take Actual, E1, E2(pre FRP), AVERAGE distance types
     */
    public enum DistanceType {
        ACTUAL, E1, E2, AVERAGE, FEE_TEST;

        private static Map<String, DistanceType> distancesMap = new HashMap<>();

        static {
            distancesMap.put("ACT", ACTUAL);
            distancesMap.put("AVG", AVERAGE);
            distancesMap.put("E1", E1);
            distancesMap.put("E2", E2);
            distancesMap.put("TST", FEE_TEST);
        }

        @JsonCreator
        public static DistanceType forValue(String value) {
            return distancesMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, DistanceType> entry : distancesMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }
    }

    /**
     * Few jurisdictions use specialized body styles
     */
    public enum SpecVehType {
        WRECKER, DUMP_TRUCK;

        private static Map<String, SpecVehType> SpecVehTypeMap = new HashMap<>();

        static {
            SpecVehTypeMap.put("DT", DUMP_TRUCK);
            SpecVehTypeMap.put("WR", WRECKER);
        }

        @JsonCreator
        public static SpecVehType forValue(String value) {
            return SpecVehTypeMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, SpecVehType> entry : SpecVehTypeMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }


    }

    /**
     * Vehicle type also referred as Body Style
     */
    public enum VehicleType {
        TRACTOR, TRUCK, BUS, TRUCK_TRACTOR, MILK_HAULER,

        // Database purpose
        ALL;

        private static Map<String, VehicleType> bodyStyleMap = new HashMap<>();

        static {
            bodyStyleMap.put("TR", TRACTOR);
            bodyStyleMap.put("TK", TRUCK);
            bodyStyleMap.put("BS", BUS);
            bodyStyleMap.put("AA", ALL);
            bodyStyleMap.put("TT", TRUCK_TRACTOR);
            bodyStyleMap.put("MH", MILK_HAULER);
        }

        @JsonCreator
        public static VehicleType forValue(String value) {
            return bodyStyleMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, VehicleType> entry : bodyStyleMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }

    }

    /**
     * abbr and desc both needs to be checked. Bills orders, I tried to explain
     * All external clients only work with Abbreviations, only FeeCalc(Excel) sends descriptions.
     */
    public enum FuelType {
        HYBRID, DIESEL, GAS, PROPANE, GASOHOL, LNG, CNG, ETHANOL, METHANOL, E85, M85, A55, BIO_DIESEL, ELECTRIC, OTHER;

        private static Map<String, FuelType> fuelMap = new HashMap<>();

        static {
            fuelMap.put("H", HYBRID);
            fuelMap.put("HYBRID", HYBRID);
            fuelMap.put("D", DIESEL);
            fuelMap.put("G", GAS);
            fuelMap.put("P", PROPANE);
            fuelMap.put("GH", GASOHOL);
            fuelMap.put("LNG", LNG);
            fuelMap.put("CNG", CNG);
            fuelMap.put("E", ETHANOL);
            fuelMap.put("M", METHANOL);
            fuelMap.put("E85", E85);
            fuelMap.put("M85", M85);
            fuelMap.put("A55", A55);
            fuelMap.put("B", BIO_DIESEL);
            fuelMap.put("EL", ELECTRIC);
            fuelMap.put("OT", OTHER);
            fuelMap.put("Hybrid", HYBRID);

        }

        @JsonCreator
        public static FuelType forValue(String value) {
            return fuelMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, FuelType> entry : fuelMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }
    }

    /**
     * Commodity class of the vehicle
     */
    public enum CommodityClass {
        CC_ALL, HOUSEHOLD_GOODS, EXEMPT_GOODS, LOGS, PASSENGERS;

        private static Map<String, CommodityClass> commodityMap = new HashMap<>();

        static {
            commodityMap.put("A", CC_ALL);
            commodityMap.put("H", HOUSEHOLD_GOODS);
            commodityMap.put("X", EXEMPT_GOODS);
            commodityMap.put("L", LOGS);
            commodityMap.put("P", PASSENGERS);
        }

        @JsonCreator
        public static CommodityClass forValue(String value) {
            return commodityMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, CommodityClass> entry : commodityMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }
    }

    /**
     * Database abbreviation is different
     */
    public enum CarrierType {
        PRIVATE("P"), COMMON_CARRIER("A"), CONTRACT_CARRIER("A"), FOR_HIRE_EXEMPT("A"), FOR_HIRE_RENTAL("A"),
        FOR_HIRE("H"), C_ALL("A"), HOUSE_NY("M");

        private static Map<String, CarrierType> carrierMap = new HashMap<>();

        static {
            carrierMap.put("PVT", PRIVATE);
            carrierMap.put("COM", COMMON_CARRIER);
            carrierMap.put("CON", CONTRACT_CARRIER);
            carrierMap.put("FHE", FOR_HIRE_EXEMPT);
            carrierMap.put("FH", FOR_HIRE_RENTAL);
            carrierMap.put("FHR", FOR_HIRE_RENTAL);
            carrierMap.put("FOR", FOR_HIRE);
            carrierMap.put("ALL", C_ALL);
            carrierMap.put("HOU", HOUSE_NY);

        }

        private final String dbAbbr;

        CarrierType(String dbAbbr) {
            this.dbAbbr = dbAbbr;
        }

        public String getDbAbbr() {
            return dbAbbr;
        }

        @JsonCreator
        public static CarrierType forValue(String value) {
            return carrierMap.get(value.toUpperCase());
        }

        @JsonValue
        public String getAbbr() {
            for (Map.Entry<String, CarrierType> entry : carrierMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null; // or fail
        }

    }

    public enum IRPFeeType {
        REGISTRATION_FEE("RF"), A1("A1"), AE("AE"), AO("AO"),AH("AH"), AF("AF"), CARRIER_FEE("CF"), GF("GF"), TAX_RATE("TR"), UNLADEN_FEE("UF"), BUS_FEE("BF"), BUS_RATE("BR"),
        DR("DR"), DIESEL_FEE("DF"), RS("RS"), BS("BS"), AG("AG"), VR("VR"), V2("V2"), RB("RB"), PURCHASE_PRICE("PP"), PROPANE_WEIGHT("PW"),
        PROPANE_FEE("PF"), SEAT_FACTOR("SF"), UR("UR"), DH("DH"), TIME_FACTOR("TF"), OTHER_FEE("OF"), EQUALIZATION_TAX("ET"), WRECKER_FEE("WF"),

        /* Parameters for base jurisdiction use 3 letters*/
        ADMINISTRATION_FEES("AD"), CAB_CARD("CC"), TRANSFER_FEES("TA"), GRADE_CROSSING_FEE("GC"), REVENUE_TRANSFER("RT"),
        REPLACE_PLATE("RP"),
        /* NJ */
        WRECKER_FEES("WF"), REG_INSP("GI"), REN_ISNP("NI"),
        /* IN */
        FUEL_HYBRID("FH"), FUEL_ELECTRIC("FE"), TRANSPORTATION_INFRASTRUCTURE("TI"), SAFETY_FEE("SF"), ICIF("TR");


        private final String abbr;

        IRPFeeType(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }
    }

    public enum DistanceUnit {
        KILOMETER("KM"), MILES("M");

        private String abbr;

        DistanceUnit(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }
    }

    public enum WeightType {
        KILOGRAM("KG"), POUNDS("POUNDS");

        private String abbr;

        WeightType(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }
    }


    public enum TwoFactorAuthentication {
        EMAIL("E"), NONE("N"), TWO_FACTOR_AUTHENTICATION("T");

        private final String abbr;

        TwoFactorAuthentication(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }

    }

    public enum MsccMetaType {
        APP_ASSIGNED_NAME("MSCC_NAME"), ISSUED_CCYYMMDD("ISSUED_CCYYMMDD"), ACCNT_NBR("PROGRAM_ACCOUNT_NBR"),
        SUBACCNT_NBR("PROGRAM_SUB_ACCOUNT");

        private final String abbr;

        MsccMetaType(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }

    }

    public enum ListTypes {
        MAXWEGHT("maxWeight"), IRPCOMCL("commodityClass"), SGMNTCFG("segmentConfig"),
        FLTTYPE("carrierType"),  BDYSTYL("vehicleType"), MAKE("make"), FUELTYPE("fuelType"),
        JURIS("juris"), FUEL("fuel"), TXIDTYPE("taxIdType"), SVCTYPE("serviceType"), SUPPTYPE("supplementType"),
        DSTTYPE("distanceType"), JURIS_REGDT("jurRegDateRules"), DEFAULT("defaults"), VSUBTYP("vehicleSubType"),
        REGISTRATION_TYPE("registrationType"), VEHFIELDS("vehicleFields"), MCENT("entityTypes"), MCSIP("mcsip"),
        MCSTS("carrierStatus"), IRPSTSCD("irpStatusCode"), IFTACVST("iftaStatusCode"), ;

        private String tableName;

        // Reverse-lookup map for getting a day from an abbreviation
        private static final Map<String, ListTypes> lookup = new HashMap<String, ListTypes>();

        static {
            for (ListTypes d : ListTypes.values()) {
                lookup.put(d.getTableName(), d);
            }
        }


        ListTypes(String tableName){this.tableName = tableName;}

        public String getTableName(){ return this.name(); }

        public String getKeyName(){ return this.tableName; }
    }

    public enum ScreenSections {
        VEHICLE_SCREEN_SECTIONS("VEHICLE_SCREEN_SECTIONS"), VEHICLE_TYPE("VEHICLE_TYPE");


        private final String abbr;

        ScreenSections(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }
    }

}