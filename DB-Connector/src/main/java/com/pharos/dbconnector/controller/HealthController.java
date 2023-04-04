package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.wrapper.response.HealthResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HealthController {

    Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping(value = "/api/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HealthResponse> getHealthResponse(){

        logger.trace("/api/health Requested");

        HealthResponse response = new HealthResponse();

        UUID key = UUID.randomUUID();

        response.setKey(key);
        response.setStatus("TRUE");

        return ResponseEntity.ok(response);

    }

}
