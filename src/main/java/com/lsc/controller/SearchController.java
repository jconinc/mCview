package com.lsc.controller;

import com.lsc.mcarrier.repository.MrecSecurityQuestionsRepository;
import com.lsc.mcarrier.repository.MrecUserRepository;
import com.lsc.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/search")
public class SearchController {

    Logger logger = LoggerFactory.getLogger(SearchController.class);


    @Autowired
    UtilityService utilityService;

    @Autowired
    KeycloakService keycloakService;

    @Autowired
    MrecUserRepository mrecUserRepository;

    @Autowired
    MrecSecurityQuestionsRepository mrecSecurityQuestionsRepository;

    @Autowired
    SearchService searchService;

    @CrossOrigin(origins = {
            "http://localhost:3001",
    }, allowCredentials = "true")
    @PostMapping(path="/usdot")
    @ResponseBody
    public HashMap<String, Object> usdotSearch(@RequestBody HashMap<String, String> searchOptions) {
        HashMap<String, Object> toReturn = null;
        try {
            toReturn = searchService.searchUSDOT(searchOptions);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    @CrossOrigin(origins = {
            "http://localhost:3001",
    }, allowCredentials = "true")
    @PostMapping(path="/vehicle")
    @ResponseBody
    public HashMap<String, Object> vehicleSearch(@RequestBody HashMap<String, String> searchOptions) {
        HashMap<String, Object> toReturn = null;
        try {
            toReturn = searchService.searchVehicle(searchOptions);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    ////

    @CrossOrigin(origins = {
            "http://localhost:3001",
    }, allowCredentials = "true")
    @PostMapping(path="/carrierDetail")
    @ResponseBody
    public HashMap<String, Object> carrierDetail(@RequestBody HashMap<String, Object> detailData) {
        HashMap<String, Object> toReturn = null;
        try {
            toReturn = searchService.carrierDetail(detailData);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    @CrossOrigin(origins = {
            "http://localhost:3001",
    }, allowCredentials = "true")
    @PostMapping(path="/vehicleDetail")
    @ResponseBody
    public HashMap<String, Object> vehicleDetail(@RequestBody HashMap<String, HashMap<String, String>> detailData) {
        HashMap<String, Object> toReturn = null;
        try {
            toReturn = searchService.vehicleDetail(detailData);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }




}
