package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entities.Document;

import java.util.List;

public interface DocumentService {

    public Document createDocument();
    public Document updateDocument();
    public Document getDocument();
    public Document deleteDocument();
    public List<Document> getDocuments();
}
