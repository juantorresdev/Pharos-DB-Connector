package com.pharos.dbconnector.wrapper.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentRequest {
    @JsonProperty("pharosid")
    public String pharosId;
    @JsonProperty("document")
    public String document;
}
