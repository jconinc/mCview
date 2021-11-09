package com.lsc.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Helper {
    public final static int CONNECTION_TIMEOUT = 300000;
    public final static String LISTS_AND_CONFIG = "listsAndConfig";
    public final static String CODE_JURIS_FEES = "codeJurisFees";
    public final static String DISTANCE_INFO = "distanceInfo";
    public final static String RESULT = "result";
    public final static String RESULT_SUCCESS = "success";
    public final static String RESULT_FAIL = "failure";
    public static int SALT_LENGTH = 50;
    public final static String VEHICLE_SCREEN_SECTIONS = "vehicleScreenSections";
    public final static String VEHICLE_TYPES = "vehicleTypes";
    public final static String VEH_SUBTYPE = "vehicleSubTypes";

    public static String CVIEW_USDOT_SEARCH = "USDOT";
    public static String CVIEW_VEHICLE_SEARCH = "VEHICLE";


    public static String SUCCESS = "SUCCESS";
    public static String ERROR = "ERROR";
    public static String FLEET = "fleet";
    public static String CARRIER_LABEL = "Carrier";
    public static String CARGO = "Cargo";
    public static String CARGO_CODE = "cargoCode";


    public static String CLASSIFICATION = "Classification";
    public static String CLASS_CODE = "classCode";
    public static String VIN_REGISTRATION = "VIN_Registration";
    public static String VIN = "VIN";
    public static String JURIS = "JURIS";
    public static String JURIS_COUNTRY = "JURIS_COUNTRY";


    public static String FLEET_ROWS = "fleetRows";
    public static String VEHICLE_HISTORY = "vehicleHistory";
    public static String DISTANCES = "distances";
    public static String WEIGHTS = "weights";
    public static String VEHICLE_HISTORY_LIST = "vehicleHistoryList";

    public static String OPERATION_SUMMARY = "operationSummary";
    public static String OPERATION_SUMMARY_LIST = "operationSummaryList";
    public static String OPERATION_RECORD_LIST = "operationRecordList";
    public static String OPERATIONS_RECORD = "operationsRecord";
    public static String OPERATION = "operation";
    public static String OPERATIONS_JURIS_RECORD = "operationsJurisRecord";


    public static String VEHICLE = "vehicle";

    public final static int MAX_LIST_LENGTH = 50;

    public final static String USER = "user";
    public final static String ACCOUNT = "account";
    public final static String LISTS = "lists";

    public static Enum REQUEST_TYPE = null;
    public static HelperEnum.IRPJuris BASE_JURIS = null;
    public static BigDecimal usdToCanRate = BigDecimal.ONE;
    public static final BigDecimal KG_TO_POUND = new BigDecimal(2.204623);
    public static final BigDecimal POUND_TO_KG = new BigDecimal(0.453592);
    public static final BigDecimal BIG_THOUSAND = new BigDecimal(1_000);
    public static final BigDecimal BIG_HUNDRED = new BigDecimal(1_00);
    public static final BigDecimal BIG_TWOHUNDRED = new BigDecimal(2_00);
    public static final BigDecimal BIG_TEN = new BigDecimal(1_0);
    public static final BigDecimal BIG_TWELVE = new BigDecimal(12);
    public static final BigDecimal BIG_TWO = new BigDecimal(2);
    public static final BigDecimal AVG_DIST_RATIO = new BigDecimal(0.01695)
            .setScale(5, BigDecimal.ROUND_HALF_UP);

    public static final int THOUSAND = 1000;
    public static final int TWO_THOUSAND = 2000;
    public static final int FOUR_THOUSAND = 4000;
    public static final int TWELVE_THOUSAND = 12000;
    public static final int ELEVEN_THOUSAND = 11000;
    public static final int SIXTEEN_THOUSAND = 16000;
    public static final int TWENTY_FIVE_THOUSAND = 25000;
    public static final int TWENTY_SIX_THOUSAND = 26000;
    public static final int THIRTY_TWO_THOUSAND = 32000;
    public static final int FIFTY_SEVEN_THOUSAND_FIVE_HUNDRED = 57500;
    public static final int SIXTY_THREE_THOUSAND_FIVE_HUNDRED = 63500;
    public static final int HUNDRED = 100;
    public static final int TEN_THOUSAND = 10_000;
    public static final int EIGHTY_THOUSAND = 80_000;
    public static final int EIGHTY_FOUR_THOUSAND = 84000;
    public static final int ONE_HUNDRED_THOUSAND = 100000;
    public static final int ONE_HUNDRED = 100;
    public static final int ONE_HUNDRED_FIFTY = 150;


    public static final int THREE_SIXTY_FIVE = 365;
    public static final int TEN = 10;
    public static final int ZERO = 0;
    public static final int TWELVE = 12;
    public static final int SIX = 6;
    public static final int FIVE = 5;
    public static final int FOUR = 4;
    public static final int THREE = 3;
    public static final int TWO = 2;
    public static final int ONE = 1;

    public static final String SEAT_MAX = "0999";
    public static final String YEARS_IN_SERVICE_MAX = "9999";
    /*Due to the way data exists in Database */
    public static final int SIX_NINES = 999999;
    public static final int FIVE_NINES = 99999;

    public static final String NINE_STR = "9";
    public static final String EIGHT_STR = "8";


    public static final double ONE_CENT = 0.01;
    public static final double NINETY_NINE_CENTS = 0.99;
    public static final double FORTY_NINE_CENTS = 0.49;
    public static final double FIFTY_CENTS = 0.50;
    public static final double THIRTY_CENTS = 0.30;

    public static final char ZERO_CHAR = '0';

    public static final String INPUT_GROSS_WT = "The input gross weight: ";
    public static final String GRT_THAN_WT = "is greater than the max allowed gross weight: ";

    public static final String INPUT_TERM = "The input registration period: ";
    public static final String GRT_THAN_TERM = "is greater than the max allowed registration term: ";

    public static final String INPUT_SEATS = "The input seats: ";
    public static final String GRT_THAN_SEATS = "is greater than the max allowed seats: ";

    public static final String ERROR_JURIS = "Error while calculating Fees for";

    public static final String YYYY_MM_DD = "yyyyMMdd";
    public static final String YYYY = "yyyy";
    public static final String S_ZERO = "0";

    public static final String CREDITING_VEHICLE = "CREDITING_VEHICLE_";
    public static final String SUBJECT_VEHICLE = "SUBJECT_VEHICLE_";
    /**
     * Commodity Class and Carrier Class
     */
    public static final String CARRIER_COMMODITY_ALL = HelperEnum.CarrierType.C_ALL.getDbAbbr();

    /**
     * JURISDICTIONS
     */
    public static final String ALABAMA = "AL";
    public static final String ARKANSAS = "AR";
    public static final String ARIZONA = "AZ";
    public static final String CALIFORNIA = "CA";
    public static final String COLORADO = "CO";
    public static final String CONNECTICUT = "CT";
    public static final String DISTRICT_OF_COLUMBIA = "DC";
    public static final String DELAWARE = "DE";
    public static final String FLORIDA = "FL";
    public static final String GEORGIA = "GA";
    public static final String IOWA = "IA";
    public static final String IDAHO = "ID";
    public static final String ILLINOIS = "IL";
    public static final String INDIANA = "IN";
    public static final String KANSAS = "KS";
    public static final String KENTUCKY = "KY";
    public static final String LOUISIANA = "LA";
    public static final String MASSACHUSETTS = "MA";
    public static final String MARYLAND = "MD";
    public static final String MAINE = "ME";
    public static final String MICHIGAN = "MI";
    public static final String MINNESOTA = "MN";
    public static final String MISSOURI = "MO";
    public static final String MISSISSIPPI = "MS";
    public static final String MONTANA = "MT";
    public static final String NORTH_CAROLINA = "NC";
    public static final String NORTH_DAKOTA = "ND";
    public static final String NEBRASKA = "NE";
    public static final String NEW_HAMPSHIRE = "NH";
    public static final String NEW_JERSEY = "NJ";
    public static final String NEW_MEXICO = "NM";
    public static final String NEVADA = "NV";
    public static final String NEW_YORK = "NY";
    public static final String OHIO = "OH";
    public static final String OKLAHOMA = "OK";
    public static final String OREGON = "OR";
    public static final String PENNSYLVANIA = "PA";
    public static final String RHODE_ISLAND = "RI";
    public static final String SOUTH_CAROLINA = "SC";
    public static final String SOUTH_DAKOTA = "SD";
    public static final String TENNESSEE = "TN";
    public static final String TEXAS = "TX";
    public static final String UTAH = "UT";
    public static final String VIRGINIA = "VA";
    public static final String VERMONT = "VT";
    public static final String WASHINGTON = "WA";
    public static final String WISCONSIN = "WI";
    public static final String WEST_VIRGINIA = "WV";
    public static final String WYOMING = "WY";
    public static final String ALBERTA = "AB";
    public static final String BRITISH_COLUMBIA = "BC";
    public static final String MANITOBA = "MB";
    public static final String NEW_BRUNSWICK = "NB";
    public static final String NEWFOUNDLAND = "NL";
    public static final String NOVA_SCOTIA = "NS";
    public static final String ONTARIO = "ON";
    public static final String PRINCE_EDWARD_ISLAND = "PE";
    public static final String QUEBEC = "QC";
    public static final String SASKATCHEWAN = "SK";

    public static final String DB_ALL_JURIS = "AA";

    /**
     * Combined representation when states have similar parameters
     */
    public static final String COMBINED_STATE = "CS1";

    /**
     * DATABASE HELPER
     */
    public static final String IRP_STAGGERED_RATE = "IRP_STAGGERED_RATE";
    public static final String IRP_EXCHANGE_RATE = "IRP_EXCHANGE_RATE";
    public static final String IRP_APVD = "IRP_APVD";
    public static final String CODE_TABLE = "CODE_TABLE";
    public static final String FEE_CREDIT_EXCEPTION_RULES_TABLE = "FEE_CREDIT_EXCEPTION_RULES";
    public static final String IRP_CODE_JURISDICTION_TABLE = "IRP_CODE_JURISDICTION";

    public static final String AND = " AND ";
    public static final String EQUAL_PARAM = " =? ";
    public static final String EQUAL = " = ";
    public static final String GT_EQUAL_PARAM = " >=? ";
    public static final String LT_EQUAL_PARAM = " <=? ";
    public static final String ORDER_BY = " ORDER BY ";
    public static final String FROM = "FROM ";
    public static final String DESC = " DESC ";
    public static final String COMMA = ", ";
    public static final String SEMI_COLON = " ;";
    public static final String WHERE = " WHERE ";
    public static final String SELECT_STAR_FROM = "SELECT * FROM ";
    public static final String SELECT = "SELECT ";
    public static final String MAX = "MAX";
    public static final String LIMIT = " LIMIT ";
    public static final String STR_ONE = "1";
    public static final String LEFT_PARANTHESIS = "(";
    public static final String RIGHT_PARANTHESIS = ") ";
    public static final String APOSTROPE = "'";

    /**
     * CODE TABLE
     */
    public static final String MFEES = "MFEES";
    public static final String DISTANCES_NULL_CD = "8450";

    public static final String YES = "Yes";

    /**
     * ERROR CODES
     */
    public static final String DISTANCE_TYPE = "8464";
    public static final String VEH_DISTANCE_TYPE = "8489";
    public static final String DISTANCES_NOT_VALID = "8450";
    public static final String DISTANCE_JURIS = "8490";
    public static final String BASE_JURIS_CD = "8461";
    public static final String SERVICE_TYPE_CD = "8460";
    public static final String VIN_CD = "8469";
    public static final String GROSS_WT_CD = "8466";
    public static final String UNLDN_WT_CD = "8465";
    public static final String FACTORY_PRICE_CD = "8465";
    public static final String PURCHASE_PRICE_CD = "8472";
    public static final String REG_EFF_DATE = "8470";
    public static final String MODEL_YEAR = "8471";
    public static final String RI_LEGAL_WEIGHT = "8484";
    public static final String EXCEED_WEIGHT_LIMIT = "8459";
    public static final String TOTAL_DIST = "8483";
    public static final String PDATE_GT_EFFDT = "8484";
    public static final String EFFDT_GT_EXPDT = "8485";
    public static final String ADJUSTED_TO_100 = "8486";
    public static final String LESS_THAN_100 = "8487";
    public static final String MORE_THAN_100 = "8488";
    public static final String CARRIER = "8462";
    public static final String COMMODITY = "8463";
    public static final String FUEL_TYPE = "8475";
    public static final String SEATS = "8474";
    public static final String AXLES = "8468";
    public static final String INTERPRETED_PERCENTAGE = "8454";
    public static final String INTERPRETED_RATIO = "8453";
    public static final String NOT_VALID_FRP_DIST = "8491";
    public static final String VEH_TYPE_NOT_VALID = "8493";
    public static final String FRP_E1_E2 = "8494";
    public static final String PRE_FRP_AVG = "8495";
    public static final String PDYR_GT_MDYR = "8496";

    public static long roundToNearestHundred(double input) {
        long i = (long) Math.ceil(input);
        return ((i + 99) / 100) * 100;
    };
    public static int parseInt(String number){
        int toReturn = 0;
        try {
            if(number != null && !"null".equals(number)){
                toReturn = Integer.parseInt(number);
            }
        }catch(Exception e){

        }
        return toReturn;
    }
    public static int parseInt(JsonNode number){
        int toReturn = 0;
        try {
            if (number != null) {
                toReturn = Integer.parseInt(number.asText());
            }
        }catch(Exception e){

        }
            return toReturn;
    }
    public static LocalDate parseDate(String aDate){
        LocalDate toReturn = null;
        if(aDate.matches("\\d{2}/\\d{2}/\\d{4}")){
            toReturn = LocalDate.parse(aDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        }else if(aDate.matches("\\d{4}-\\d{2}-\\d{2}")){
            toReturn = LocalDate.parse(aDate);
        }
        return toReturn;
    }

    public static double roundToTwoDecimalPlaces(double input) {
        double roundOff = Math.round(input * 100.0) / 100.0;
        return roundOff;
    };

    public static String sanitizeString(String toSanitize) {
        return toSanitize.replaceAll("\\<[^>]*>","");
    }
    public static String getText(ObjectNode node, String key){
        String toReturn = null;
        if(node != null && node.get(key) != null ){
            toReturn = node.get(key).asText();
        }
        return toReturn;
    }

    public static Timestamp getTimestampNow() {
        Calendar cal = Calendar.getInstance();
        long ts = cal.getTimeInMillis();
        Timestamp timestamp = new Timestamp(ts);
        return timestamp;
    }

    public static Timestamp setHoursAndMinutes(String timeStr, Timestamp  theTimeStamp){
        Timestamp toReturn = theTimeStamp;
        try {
            if(timeStr != null) {
                timeStr = timeStr.replaceAll("[^\\.TZ0-9:]", "");
                LocalTime aTime = null;
                if(timeStr.matches("\b\\d+:\\d+/b")){
                    aTime = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm"));
                }else {
                    aTime = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("yyyyMMdd'T'HH:mm:ss.SSS'Z'"));
                }

                //LocalTime aTime = LocalTime.parse(timeStr);
                Calendar cal = Calendar.getInstance();
                cal.setTimeInMillis(theTimeStamp.getTime());
                cal.set(Calendar.HOUR_OF_DAY, aTime.getHour());
                cal.set(Calendar.MINUTE, aTime.getMinute());
                cal.set(Calendar.SECOND, 0);
                toReturn = new Timestamp(cal.getTimeInMillis());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return toReturn;
    }
}
