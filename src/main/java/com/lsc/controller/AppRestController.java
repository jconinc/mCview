package com.lsc.controller;

import com.lsc.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lsc.mcarrier.repository.CodeTableRepository;
import com.lsc.mcarrier.repository.MrecSecurityQuestionsRepository;
import com.lsc.mcarrier.repository.MrecUserRepository;

@RestController
public class AppRestController {

    Logger logger = LoggerFactory.getLogger(AppRestController.class);

    @Autowired
    UtilityService utilityService;

    @Autowired
    CodeTableRepository codeTableRepository;


    @Autowired
    KeycloakService keycloakService;

    @Autowired
    MrecUserRepository mrecUserRepository;

    @Autowired
    MrecSecurityQuestionsRepository mrecSecurityQuestionsRepository;



}
