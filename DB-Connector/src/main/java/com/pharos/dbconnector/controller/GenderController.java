package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderController {

    @Autowired
    GenderService genderService;


}
