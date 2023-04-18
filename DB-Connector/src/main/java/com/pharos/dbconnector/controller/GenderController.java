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

    @GetMapping(value = "/getGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> getGender(@RequestParam(value = "id") int id){

        log.trace("/api/v1/gender/getGender Requested");

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/getGenderList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponseList> getGenderList(){

        GenderResponseList responseList = new GenderResponseList();

        return ResponseEntity.ok(responseList);

    }

    @PostMapping(value = "/createGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> createGender(@RequestBody GenderRequest genderRequest){

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

    @PutMapping(value = "/updateGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> updateGender(@RequestBody GenderRequest genderRequest){

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

    @DeleteMapping(value = "/deleteGender", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenderResponse> deleteGender(@RequestBody GenderRequest genderRequest){

        GenderResponse response = new GenderResponse();

        return ResponseEntity.ok(response);

    }

}
