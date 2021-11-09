package com.lsc.controller;

import com.lsc.mcarrier.entity.ListItem;
import com.lsc.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/config")
public class ConfigController {

    Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Autowired
    UtilityService utilityService;

    @Autowired
    KeycloakService keycloakService;

    @Autowired
    CommonService commonService;

    @CrossOrigin(origins = {
            "http://localhost:3001",
    }, allowCredentials = "true")
    @GetMapping(path="/list")
    public HashMap<String, List<ListItem>> list(Principal principal, @RequestParam Optional<String> userid) {
        HashMap<String, List<ListItem>> lists = null;
        try {
            lists = commonService.getAppLists();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }



}
