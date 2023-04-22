package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.service.GenderService;
import com.pharos.dbconnector.wrapper.request.GenderRequest;
import com.pharos.dbconnector.wrapper.response.GenderResponse;
import com.pharos.dbconnector.wrapper.response.GenderResponseList;
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
@RequestMapping(value = "/api/v1/gender")
@Slf4j
public class GenderController {

    @Autowired
    GenderService genderService;

    @Operation(
            summary = "Get gender endpoint",
            description = "Get document saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 OK"
    )
    @GetMapping(value = "/getGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> getGender(@RequestParam(value = "id") int id){

        log.trace("/api/v1/gender/getGender Requested");

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Get gender list endpoint",
            description = "Get list of gender saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 OK"
    )
    @PostMapping(value = "/getGenderList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponseList> getGenderList(){

        GenderResponseList responseList = new GenderResponseList();

        return ResponseEntity.ok(responseList);

    }

    @Operation(
            summary = "Create gender endpoint",
            description = "Create gender and save it in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PostMapping(value = "/createGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> createGender(@RequestBody GenderRequest genderRequest){

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Update gender endpoint",
            description = "Update gender in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PutMapping(value = "/updateGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> updateGender(@RequestBody GenderRequest genderRequest){

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Delete gender endpoint",
            description = "Delete gender in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @DeleteMapping(value = "/deleteGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> deleteGender(@RequestBody GenderRequest genderRequest){

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

}
