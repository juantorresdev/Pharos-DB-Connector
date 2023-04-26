package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.service.NationalityService;
import com.pharos.dbconnector.wrapper.response.NationalityResponse;
import com.pharos.dbconnector.wrapper.response.NationalityResponseList;
import lombok.extern.slf4j.Slf4j;
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

    @Operation(
            summary = "Get nationality endpoint",
            description = "Get nationality saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @GetMapping(value = "/getNationality", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponse> getNationality(){

        NationalityResponse response = new NationalityResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Get nationality list endpoint",
            description = "Get list of gender saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PostMapping(value = "/getNationalityList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponseList> getNationalityList(@RequestBody NationalityResponse nationalityResponse){

        NationalityResponseList responseList = new NationalityResponseList();

        return ResponseEntity.ok(responseList);

    }

    @Operation(
            summary = "Create nationality endpoint",
            description = "Create nationality and save it in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PostMapping(value = "/createNationality", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponse> createNationality(@RequestBody NationalityResponse nationalityResponse){

        NationalityResponse response = new NationalityResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Create nationality endpoint",
            description = "Create nationality and save it in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PutMapping(value = "/updateNationality", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NationalityResponse> updateNationality(@RequestBody NationalityResponse nationalityResponse){

        NationalityResponse response = new NationalityResponse();

        return ResponseEntity.ok(response);

    }

}
