package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.service.AddressService;
import com.pharos.dbconnector.wrapper.response.AddressResponse;
import com.pharos.dbconnector.wrapper.response.AddressResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping(value = "/getAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> getAddress(@RequestParam(value = "id") int id){

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/getAddressList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponseList> getAddressList() {

        AddressResponseList responseList = new AddressResponseList();

        return ResponseEntity.ok(responseList);

    }

    @PostMapping(value = "/createAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> createAddress() {

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

    @PutMapping(value = "/updateAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> updateAddress() {

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

    @DeleteMapping(value = "/deleteAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddressResponse> deleteAddress() {

        AddressResponse response = new AddressResponse();

        return ResponseEntity.ok(response);

    }

}