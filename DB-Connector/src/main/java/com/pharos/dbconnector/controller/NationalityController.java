package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.service.NationalityService;
import com.pharos.dbconnector.wrapper.response.NationalityResponse;
import com.pharos.dbconnector.wrapper.response.NationalityResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "CRUD REST APIs for Gender Resource",
        description = "CRUD REST APIs - Create, Update, Get, Get List and Delete Gender"
)
@RestController
@RequestMapping(value = "/api/v1/nationality")
@Slf4j
public class NationalityController {

    @Autowired
    NationalityService nationalityService;

    @GetMapping(value = "/getNationality", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponse> getNationality(){

        NationalityResponse response = new NationalityResponse();

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/getNationalityList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponseList> getNationalityList(@RequestBody NationalityResponse nationalityResponse){

        NationalityResponseList responseList = new NationalityResponseList();

        return ResponseEntity.ok(responseList);

    }

    @PostMapping(value = "/createNationality", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponse> createNationality(@RequestBody NationalityResponse nationalityResponse){

        NationalityResponse response = new NationalityResponse();

        return ResponseEntity.ok(response);

    }

    @PutMapping(value = "/updateNationality", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponse> updateNationality(@RequestBody NationalityResponse nationalityResponse){

        NationalityResponse response = new NationalityResponse();

        return ResponseEntity.ok(response);

    }

}
