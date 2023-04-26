package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.service.AddressService;
import com.pharos.dbconnector.wrapper.response.AddressResponse;
import com.pharos.dbconnector.wrapper.response.AddressResponseList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "CRUD REST APIs for Address Resource",
        description = "CRUD REST APIs - Create, Update, Get, Get List and Delete Address"
)
@RestController
@RequestMapping("/api/v1/address")
@Slf4j
public class AddressController {

    @Autowired
    AddressService addressService;

    @Operation(
        summary = "Get address endpoint",
        description = "Get address saved in PharosDB"
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
    @GetMapping(value = "/getAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> getAddress(@RequestParam(value = "id") int id){

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
        summary = "Get address list endpoint",
        description = "Get list of address saved in PharosDB"
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
    @PostMapping(value = "/getAddressList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponseList> getAddressList() {

        AddressResponseList responseList = new AddressResponseList();

        return ResponseEntity.ok(responseList);

    }

    @Operation(
        summary = "Create address endpoint",
        description = "Create address and save it in PharosDB"
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
    @PostMapping(value = "/createAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> createAddress() {

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
        summary = "Update address endpoint",
        description = "Update address in PharosDB"
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
    @PutMapping(value = "/updateAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> updateAddress() {

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
        summary = "Update address endpoint",
        description = "Update address in PharosDB"
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
    @DeleteMapping(value = "/deleteAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> deleteAddress() {

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

}
