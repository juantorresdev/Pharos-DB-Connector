package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.wrapper.response.HealthResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class HealthController {

    @GetMapping(value = "/api/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HealthResponse> getHealthResponse(){

        log.trace("/api/health Requested");

        HealthResponse response = new HealthResponse();

        UUID key = UUID.randomUUID();

        response.setKey(key);
        response.setStatus("TRUE");

        return ResponseEntity.ok(response);

    }

}
