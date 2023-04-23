package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.wrapper.response.HealthResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Tag(
        name = "Health",
        description = "Endpoint to validate service status"
)
@RestController
@Slf4j
public class HealthController {

    @Operation(
            summary = "Get health endpoint",
            description = "Get status 200 - OK if service is active"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 OK"
    )
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
