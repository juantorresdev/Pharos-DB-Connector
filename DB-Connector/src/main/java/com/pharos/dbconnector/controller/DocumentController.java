package com.pharos.dbconnector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.pharos.dbconnector.service.DocumentService;
import com.pharos.dbconnector.wrapper.request.DocumentRequest;
import com.pharos.dbconnector.wrapper.response.DocumentResponse;
import com.pharos.dbconnector.wrapper.response.DocumentResponseList;
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
@RequestMapping(value = "/api/v1/document")
@Slf4j
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @Operation(
            summary = "Get document endpoint",
            description = "Get document saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 OK"
    )
    @GetMapping(value = "/getDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> getDocument(@RequestParam(value = "id") int documentId){

        DocumentResponse response = new DocumentResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Get document list endpoint",
            description = "Get list of document saved in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 OK"
    )
    @PostMapping(value = "/getDocumentsList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponseList> getDocumentsList(){

        DocumentResponseList responseList = new DocumentResponseList();

        return ResponseEntity.ok(responseList);

    }

    @Operation(
            summary = "Create document endpoint",
            description = "Create document and save it in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PostMapping(value = "createDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> createDocument(@RequestBody DocumentRequest documentRequest){

        DocumentResponse response = new DocumentResponse();

        return ResponseEntity.ok(response);

    }

    @Operation(
            summary = "Update document endpoint",
            description = "Update document in PharosDB"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @ApiResponse(
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @PutMapping(value = "updateDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> updateDocument(@RequestBody DocumentRequest documentRequest){

        DocumentResponse response = new DocumentResponse();

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
            responseCode = "503",
            description = "HTTP Status 503"
    )
    @DeleteMapping(value = "deleteDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> deleteDocument(@RequestBody DocumentRequest documentRequest){

        DocumentResponse response = new DocumentResponse();

        return ResponseEntity.ok(response);

    }

}
