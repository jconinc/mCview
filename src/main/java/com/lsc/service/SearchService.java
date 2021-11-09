package com.lsc.service;

import com.lsc.cview.entity.McsT0028Registration;
import com.lsc.cview.entity.McsT0031Carrier;
import com.lsc.cview.entity.McsT0041P;
import com.lsc.cview.entity.McsT0042P;
import com.lsc.cview.repository.*;

import com.lsc.mapper.CommonMapper;
import com.lsc.mcarrier.repository.CodeTableRepository;
import com.lsc.model.CarrierVehicleVinContainer;
import com.lsc.util.CviewComplianceRulesHelper;
import com.lsc.util.CviewHelper;
import com.lsc.util.HelperEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private CodeTableRepository codeTableRepository;

    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private CviewRepository cviewRepository;


    @Autowired
    private McsT0041Repository vehicleAlertsRepository;

    @Autowired
    private McsT0042Repository carrierAlertsRepository;

    @Autowired
    private McsT0025AccountRepository mcsT0025AccountRepository;

    @Autowired
    private McsT0034UCRRegistrationRepository mcsT0034UCRRegistrationRepository;

    @Autowired
    private CviewComplianceRulesHelper cviewComplianceRulesHelper;

    public HashMap<String, Object> searchUSDOT(HashMap<String, String> searchOptions){
        HashMap<String, Object> toReturn = new HashMap<String, Object>();
        String criteria = searchOptions.get("usdotCriteria");
        String jurisdiction = searchOptions.get("usdotJurisdiction");

        int page = StringUtils.isEmpty(searchOptions.get("page"))? 0 : Integer.parseInt(searchOptions.get("page"));
        int pageSize = StringUtils.isEmpty(searchOptions.get("pageSize"))? 50 : Integer.parseInt(searchOptions.get("pageSize"));
        String usdotType = searchOptions.get("usdotType");
        toReturn.put("usdotType", usdotType);
        if(!StringUtils.isEmpty(criteria) && criteria.trim().length() >= 2) {
            criteria = criteria.trim().toUpperCase();
            if (HelperEnum.CviewSearchOptions.usdot.getAbbr().equals(usdotType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByCarrierIdNumber(criteria , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByCarrierIdNumber( criteria ));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByCarrierIdNumberAndState( criteria , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByCarrierIdNumberAndState( criteria , jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.carrierLegalName.getAbbr().equals(usdotType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByCarrierNameLike("%" + criteria + "%", PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByCarrierNameLike("%" + criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByCarrierNameLikeAndState("%" + criteria + "%", jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByCarrierNameLikeAndState("%" + criteria + "%", jurisdiction));

                }

            } else if (HelperEnum.CviewSearchOptions.carrierDBAName.getAbbr().equals(usdotType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByDbaNameLike("%" + criteria + "%", PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByDbaNameLike("%" + criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByDbaNameLikeAndState("%" + criteria + "%", jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByDbaNameLikeAndState("%" + criteria + "%", jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.plate.getAbbr().equals(usdotType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByPlate( criteria + "%" , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByPlate( criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByPlateAndState( criteria + "%" , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByPlateAndState( criteria + "%" , jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.vin.getAbbr().equals(usdotType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByVin( criteria + "%" , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByVin( criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByVinAndState( criteria + "%" , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByVinAndState( criteria + "%" , jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.tin.getAbbr().equals(usdotType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByTaxIdNumber(criteria , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByTaxIdNumber( criteria ));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByTaxIdNumberAndState( criteria , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByTaxIdNumberAndState( criteria , jurisdiction));

                }
            }
        }
        return toReturn;
    }



    public HashMap<String, Object> carrierDetail(HashMap<String, Object> carrierData){
        HashMap<String, Object> toReturn = new HashMap<String, Object>();
        McsT0031Carrier carrier = null;

        List<McsT0042P> alerts = carrierAlertsRepository.getMcsT0042ByCarrierIdNumber((String) carrierData.get("carrierIdNumber"));

        toReturn.put("carrier", getCarrier((String) carrierData.get("carrierIdNumber")));
        toReturn.put("alerts", alerts);
        toReturn.put("ucr", mcsT0034UCRRegistrationRepository.getMcsT0034UcrRegistrationByDotNumberOrderByRegistrationYearDesc((String) carrierData.get("carrierIdNumber")));
        toReturn.put("ifta", mcsT0025AccountRepository.getMcsT0025AccountByIftaCarrierIdNumber((String) carrierData.get("carrierIdNumber")));

        List<CarrierVehicleVinContainer> safetyCarrierContainer = cviewRepository.getSafetyVehiclesByCarrierId((String) carrierData.get("carrierIdNumber"));

        toReturn.put("registrant", cviewRepository.getRegistrantsVehiclesByCarrierId((String) carrierData.get("carrierIdNumber")));
        toReturn.put("safety", safetyCarrierContainer);


        McsT0031Carrier safetyCarrier = null;
        HashMap<String, String> anItem;
        ArrayList<HashMap<String, String>> safetyPassFail = new ArrayList<HashMap<String, String>>();

        if(safetyCarrierContainer != null && safetyCarrierContainer.size() > 0){
            safetyCarrier = safetyCarrierContainer.get(0).getCarrier();
        }

        toReturn.put("safetyCarrierCompliance", this.getSafetyCarrierCompliance(safetyCarrier, alerts));
        return toReturn;
    }

    private ArrayList<HashMap<String, String>> getSafetyCarrierCompliance(McsT0031Carrier safetyCarrier, List<McsT0042P> alerts){
        ArrayList<HashMap<String, String>> safetyPassFail = new ArrayList<>();
        HashMap<String, String> anItem;
        if (safetyCarrier != null && CviewHelper.FAIL.equals(cviewComplianceRulesHelper.isCarrierPassFailForUsdot(safetyCarrier.getCarrierIdNumber(), Integer.parseInt(safetyCarrier.getMcsipLevel()),
                safetyCarrier.getMcsipLevelDate()))) {
            anItem = new HashMap<String, String>();
            anItem.put(CviewHelper.TEST_MCSIP, CviewHelper.FAIL);
            safetyPassFail.add(anItem);
        }
        if(alerts != null && alerts.size() > 0){
            anItem = new HashMap<String, String>();
            anItem.put(CviewHelper.TEST_SAFETY_CARRIER_ALERTS, CviewHelper.FAIL);
            safetyPassFail.add(anItem);
        }
        return safetyPassFail;
    }
    private McsT0031Carrier getCarrier(String carrierId){
        McsT0031Carrier toReturn = null;
        List<McsT0031Carrier> carrierList = cviewRepository.getMcsT0031CarrierByCarrierIdNumber(carrierId, PageRequest.of(0, 1));
        if(carrierList != null && carrierList.size() > 0){
            toReturn = carrierList.get(0);
        }
        return toReturn;
    }
    public HashMap<String, Object> vehicleDetail(HashMap<String, HashMap<String, String>> vehicleData){
        HashMap<String, Object> toReturn = new HashMap<String, Object>();
        McsT0031Carrier carrier = null;
        String safetyCarrierId = vehicleData.get("registration").get("safetyCarrier");
        String registrant = vehicleData.get("registration").get("irpCarrierIdNumber");
        String licensePlate = vehicleData.get("registration").get("licensePlateNumber");
        String state = vehicleData.get("registration").get("irpBaseState");
        String vin = vehicleData.get("vin").get("vin");
        ArrayList<HashMap<String, String>> vehiclePassFail = new ArrayList<>();
        if(StringUtils.isEmpty(registrant) && !StringUtils.isEmpty(safetyCarrierId)){
            registrant = safetyCarrierId;
        }
        McsT0031Carrier safetyCarrier = getCarrier(safetyCarrierId);
        toReturn.put("safetyCarrier", safetyCarrier);

        toReturn.put("registrant", getCarrier(registrant));
        List<McsT0042P> safetyCarrierAlerts = carrierAlertsRepository.getMcsT0042ByCarrierIdNumber(safetyCarrierId);
        toReturn.put("registrantCarrierAlerts", carrierAlertsRepository.getMcsT0042ByCarrierIdNumber(registrant));
        toReturn.put("safetyCarrierAlerts", carrierAlertsRepository.getMcsT0042ByCarrierIdNumber(safetyCarrierId));
        HashMap<String, String> anItem;
        List<CarrierVehicleVinContainer> vehicleContainerList = cviewRepository.getVehicleWithVinByPlateAndState(licensePlate, state, PageRequest.of(0, 1));
        McsT0028Registration registration;
        if(vehicleContainerList.size() > 0){
            registration = vehicleContainerList.get(0).getRegistration();
            if(!CviewHelper.IRP_VEHICLE_ACTIVE.equals(registration.getIrpStatusCode())){
                anItem = new HashMap<String, String>();
                anItem.put(CviewHelper.TEST_IRP_STATUS, CviewHelper.FAIL);
                vehiclePassFail.add(anItem);
            }
            toReturn.put("vehicle", vehicleContainerList.get(0));
        }
        List<McsT0041P> vehicleAlerts = vehicleAlertsRepository.getMcsT0041ByVinAndLicensePlateNumberAndRegistrationJurisdiction(vin, licensePlate, state);
        if(vehicleAlerts != null && vehicleAlerts.size() > 0){
            anItem = new HashMap<String, String>();
            anItem.put(CviewHelper.TEST_VEHICLE_CARRIER_ALERTS, CviewHelper.FAIL);
            vehiclePassFail.add(anItem);
        }
        toReturn.put("vehicleAlerts", vehicleAlerts);

        ArrayList<HashMap<String, String>> safetyPassFail = this.getSafetyCarrierCompliance(safetyCarrier, safetyCarrierAlerts);
        toReturn.put("safetyCarrierCompliance", safetyPassFail);
        toReturn.put("vehicleCompliance", vehiclePassFail);



        return toReturn;
    }
    public HashMap<String, Object> searchVehicle(HashMap<String, String> searchOptions){
        HashMap<String, Object> toReturn = new HashMap<String, Object>();
        String criteria = searchOptions.get("vehicleCriteria");
        String jurisdiction = searchOptions.get("vehicleJurisdiction");

        int page = StringUtils.isEmpty(searchOptions.get("page"))? 0 : Integer.parseInt(searchOptions.get("page"));
        int pageSize = StringUtils.isEmpty(searchOptions.get("pageSize"))? 50 : Integer.parseInt(searchOptions.get("pageSize"));
        String vehicleType = searchOptions.get("vehicleType");
        toReturn.put("vehicleType", vehicleType);
        if(!StringUtils.isEmpty(criteria) && criteria.trim().length() >= 2) {
            criteria = criteria.trim().toUpperCase();
            if (HelperEnum.CviewSearchOptions.usdot.getAbbr().equals(vehicleType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierWithVinByCarrierIdNumber(criteria , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByCarrierIdNumber( criteria ));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierWithVinByCarrierIdNumberAndState( criteria , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByCarrierIdNumberAndState( criteria , jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.carrierLegalName.getAbbr().equals(vehicleType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031WithVinCarrierByCarrierLegalName("%" + criteria + "%", PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByCarrierLegalName("%" + criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierWithVinByCarrierLegalNameAndState("%" + criteria + "%", jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByCarrierLegalNameAndState("%" + criteria + "%", jurisdiction));

                }

            } else if (HelperEnum.CviewSearchOptions.carrierDBAName.getAbbr().equals(vehicleType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031WithVinCarrierByCarrierDBAName("%" + criteria + "%", PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByCarrierDBAName("%" + criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierWithVinByCarrierDBANameAndState("%" + criteria + "%", jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByCarrierDBANameAndState("%" + criteria + "%", jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.plate.getAbbr().equals(vehicleType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031WithVinCarrierByPlate( criteria + "%" , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByPlate( criteria + "%"));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierWithVinByPlateAndState( criteria + "%" , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierWithVinByPlateAndState( criteria + "%" , jurisdiction));

                }
            } else if (HelperEnum.CviewSearchOptions.vin.getAbbr().equals(vehicleType)) {
                jurisdiction = jurisdiction != null ? jurisdiction.trim() :  null;
                criteria = criteria.trim().toUpperCase();
                toReturn.put("page", Integer.toString(page));
                toReturn.put("pageSize", Integer.toString(pageSize));

                if(StringUtils.isEmpty(jurisdiction)){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByVin( "%" + criteria  , PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByVin( "%" + criteria));

                }else if(jurisdiction.length() > 1){
                    toReturn.put("results", cviewRepository.getMcsT0031CarrierByVinAndState(  "%" + criteria , jurisdiction, PageRequest.of(page, pageSize)));
                    toReturn.put("count", cviewRepository.countMcsT0031CarrierByVinAndState( "%" + criteria , jurisdiction));

                }

            }
        }
        return toReturn;
    }




}
