package com.pharos.dbconnector.controller;

import com.pharos.dbconnector.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    @Autowired
    DocumentService documentService;


}
