package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "Login",
        description = "Endpoint to login to the service status"
)
@RestController(value="/api/v1")
@Slf4j
public class LoginController {


    @ApiResponse(
            responseCode = "200",
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
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> login(){

        return ResponseEntity.ok("SUCCESS");

    }

}
