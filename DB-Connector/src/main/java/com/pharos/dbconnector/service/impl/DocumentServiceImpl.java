package com.pharos.dbconnector.service.impl;

import com.pharos.dbconnector.entities.Document;
import com.pharos.dbconnector.repository.DocumentRepository;
import com.pharos.dbconnector.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public Document createDocument() {
        return null;
    }

    @Override
    public Document updateDocument() {
        return null;
    }

    @Override
    public Document getDocument() {
        return null;
    }

    @Override
    public Document deleteDocument() {
        return null;
    }

    @Override
    public List<Document> getDocuments() {
        return null;
    }
}
