package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.service.DocumentService;
import com.pharos.dbconnector.wrapper.request.DocumentRequest;
import com.pharos.dbconnector.wrapper.response.DocumentResponse;
import com.pharos.dbconnector.wrapper.response.DocumentResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/apiV1/document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @GetMapping(value = "/getDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> getDocument(@RequestParam(value = "id") int documentId){

        DocumentResponse response = new DocumentResponse();

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/getDocumentsList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponseList> getDocumentsList(){

        DocumentResponseList responseList = new DocumentResponseList();

        return ResponseEntity.ok(responseList);

    }

    @PostMapping(value = "createDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> createDocument(@RequestBody DocumentRequest documentRequest){

        DocumentResponse response = new DocumentResponse();

        return ResponseEntity.ok(response);

    }

    @PutMapping(value = "updateDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> updateDocument(@RequestBody DocumentRequest documentRequest){

        DocumentResponse resṕonse = new DocumentResponse();

        return ResponseEntity.ok(resṕonse);

    }

    @DeleteMapping(value = "deleteDocument", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DocumentResponse> deleteDocument(@RequestBody DocumentRequest documentRequest){

        DocumentResponse response = new DocumentResponse();

        return ResponseEntity.ok(response);

    }

}
