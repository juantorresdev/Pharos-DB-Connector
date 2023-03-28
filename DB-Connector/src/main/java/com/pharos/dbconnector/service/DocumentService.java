package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entity.Document;

public interface DocumentService {

    public Document createDocument();
    public Document updateDocument();
    public Document getDocument();
    public Document deleteDocument();
}
