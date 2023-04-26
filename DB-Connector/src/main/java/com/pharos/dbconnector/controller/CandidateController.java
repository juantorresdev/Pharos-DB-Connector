package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.service.CandidateService;
import com.pharos.dbconnector.wrapper.request.CandidateRequest;
import com.pharos.dbconnector.wrapper.response.CandidateResponse;
import com.pharos.dbconnector.wrapper.response.CandidateResponseList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "CRUD REST APIs for Candidate Resource",
        description = "CRUD REST APIs - Create, Update, Get, Get List and Delete Candidate"
)
@RestController
@RequestMapping(value = "/api/v1/candidate")
@Slf4j
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @Operation(
        summary = "Get candidate endpoint",
        description = "Get candidate saved in PharosDB"
    )
    @ApiResponse(
        responseCode = "201",
        description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "400",
            description = "HTTP Status 400 Error"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @GetMapping(value = "/getCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> getCandidate(@RequestParam(value = "id") int candidateId){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
        summary = "Get candidate list endpoint",
        description = "Get list of candidates saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "400",
            description = "HTTP Status 400 Error"
    )
    @ApiResponse(
            responseCode = "400",
            description = "HTTP Status 400"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @PostMapping(value = "/getCandidatesList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponseList> getCandidatesList(){

        CandidateResponseList response = new CandidateResponseList();

        return ResponseEntity.ok(response);

    }

    @Operation(
        summary = "Create candidate endpoint",
        description = "Create candidate and save it in PharosDB"
    )
    @ApiResponse(
        responseCode = "201",
        description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "400",
            description = "HTTP Status 400 Error"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
        responseCode = "503",
        description = "HTTP Status 503"
    )
    @PostMapping(value = "/createCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> createCandidate(@RequestBody CandidateRequest candidateRequest){

        CandidateResponse response = new CandidateResponse();

        try{
            response = candidateService.createCandidate(candidateRequest);
        } catch (Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.ok(response);
    }

    @Operation(
        summary = "Update candidate endpoint",
        description = "Update candidate in PharosDB"
    )
    @ApiResponse(
        responseCode = "201",
        description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "400",
            description = "HTTP Status 400 Error"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
        responseCode = "503",
        description = "HTTP Status 503"
    )
    @PutMapping(value = "/updateCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> updateCandidate(@RequestBody CandidateRequest candidateRequest){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);
    }

    @Operation(
        summary = "Delete candidate endpoint",
        description = "Delete candidate in PharosDB"
    )
    @ApiResponse(
        responseCode = "201",
        description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "400",
            description = "HTTP Status 400 Error"
    )
    @ApiResponse(
            responseCode = "403",
            description = "HTTP Status 403 Authentication Error"
    )
    @ApiResponse(
        responseCode = "503",
        description = "HTTP Status 503"
    )
    @DeleteMapping(value = "/deleteCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> deleteCandidate(@RequestBody CandidateRequest candidateRequest){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);
    }

}
