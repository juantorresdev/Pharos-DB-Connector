package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.service.CandidateService;
import com.pharos.dbconnector.wrapper.request.CandidateRequest;
import com.pharos.dbconnector.wrapper.response.CandidateResponse;
import com.pharos.dbconnector.wrapper.response.CandidateResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/apiV1/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @GetMapping(value = "/getCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> getCandidate(@RequestParam(value = "id") int candidateId){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/getCandidatesList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponseList> getCandidatesList(){

        CandidateResponseList response = new CandidateResponseList();

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/createCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> createCandidate(@RequestBody CandidateRequest candidateRequest){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/updateCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> updateCandidate(@RequestBody CandidateRequest candidateRequest){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/deleteCandidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CandidateResponse> deleteCandidate(@RequestBody CandidateRequest candidateRequest){

        CandidateResponse response = new CandidateResponse();

        return ResponseEntity.ok(response);
    }

}
