package com.lsc.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Component
public class CviewComplianceRulesHelper {
    private static List<Integer> oosMcsipLevelList = new ArrayList<Integer>();

    static {
        oosMcsipLevelList.add(52);
        oosMcsipLevelList.add(53);
        oosMcsipLevelList.add(54);
        oosMcsipLevelList.add(55);
        oosMcsipLevelList.add(56);
        oosMcsipLevelList.add(57);
        oosMcsipLevelList.add(58);
        oosMcsipLevelList.add(60);
        oosMcsipLevelList.add(61);
        oosMcsipLevelList.add(62);
        oosMcsipLevelList.add(63);
        oosMcsipLevelList.add(64);
        oosMcsipLevelList.add(65);
        oosMcsipLevelList.add(66);
        oosMcsipLevelList.add(67);
        oosMcsipLevelList.add(68);
    }

    public Boolean isBaseJurPassFailForUsdot(String USDOT) {
        Boolean flag = Boolean.TRUE;

        // CSS TODO: I. Check vin again CSS getCustomer(), and get CustomerId
        // CSS TODO: II. If Customer is found in CSS, this is Virginia Customer so do III.
        // CSS TODO: III. Check VA CSS to get alerts/stops for this customer
        // CSS TODO: IV. If Alerts/Stops found:
        // 				 flag = Boolean.FALSE;
        return flag;
    }

    public String isCarrierPassFailForUsdot(String usdot, Integer mcsiplevelFromT0031, java.sql.Date mcsipLevelDate) {
        String returnFlag = CviewHelper.PASS;

        if (mcsipLevelDate != null) {
            if (mcsiplevelFromT0031 != null) {

                if (oosMcsipLevelList.contains(mcsiplevelFromT0031)) {
                    returnFlag = CviewHelper.FAIL;
                }
            }
        }


        return returnFlag;
    }

    public Boolean isVaPlateFlagByVin(String vin) {
        Boolean vaPlateFlag = Boolean.FALSE;

        // CSS TODO: Call CSS with vin

        return vaPlateFlag;
    }

    public Boolean isVaIrpVehicle(String vin) {
        Boolean vaIrpVehicle = Boolean.FALSE;
        // CSS TODO: Call CSS with vin

        return vaIrpVehicle;
    }

    // CSS TODO: To do when CSS interface is available
    public Boolean isVaPermitExist(String vin) {
        Boolean vaPermitExist = Boolean.FALSE;
        // CSS TODO: Call CSS with vin

        return vaPermitExist;
    }

    // CSS TODO: To do when CSS interface is available
    public Boolean isIrpActive(String usdot) {
        Boolean vaPermitExist = Boolean.FALSE;
        // Call CSS with USDOT

        return vaPermitExist;
    }


    public Boolean isIrpPassFailForVehicle(String vin, String usdot) {
        Boolean irpPassFailflag = Boolean.TRUE;
        Boolean VaIrpVehicleFlag = Boolean.FALSE;
        Boolean irpActiveFlag =  Boolean.FALSE;
        Boolean vaPermitExistFlag = Boolean.FALSE;
        Boolean irpPlateFlag = Boolean.FALSE;
        Boolean vaPlateFlag = Boolean.FALSE;

        VaIrpVehicleFlag = isVaIrpVehicle(vin);
        irpActiveFlag =  isIrpActive(usdot);
        vaPermitExistFlag = isVaPermitExist(vin);
        vaPlateFlag = isVaPlateFlagByVin(vin);

        if (VaIrpVehicleFlag && !irpActiveFlag) {
            irpPassFailflag = Boolean.FALSE;
        }
        if (vaPlateFlag && !irpActiveFlag) {
            irpPassFailflag = Boolean.FALSE;
        }
        if (vaPlateFlag && !irpPlateFlag && !vaPermitExistFlag) {
            irpPassFailflag = Boolean.FALSE;
        }

        return irpPassFailflag;
    }

    public Boolean isCarrierPassFailForVehicle(String vin, String usdot) {
        Boolean passFailFlag = Boolean.FALSE;
        Boolean vaVehicleFlag = Boolean.FALSE;
        Boolean irpActiveFlag =  Boolean.FALSE;

        //vaVehicleFlag = isVaPlateFlagByVin(vin);
        irpActiveFlag = isIrpActive(usdot);

        if (!vaVehicleFlag && !irpActiveFlag && usdot == null)
            passFailFlag = Boolean.FALSE;

        return passFailFlag;
    }

    public Boolean isCarrierPassFailForVehicle(String plate, String state, String usdot) {
        Boolean passFailFlag = Boolean.FALSE;
        Boolean vaVehicleFlag = Boolean.FALSE;
        Boolean irpActiveFlag =  Boolean.FALSE;

        irpActiveFlag = isIrpActive(usdot);

        if (!irpActiveFlag && usdot == null)
            passFailFlag = Boolean.FALSE;

        return passFailFlag;
    }



}
