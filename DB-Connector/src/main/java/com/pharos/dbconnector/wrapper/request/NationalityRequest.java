package com.pharos.dbconnector.wrapper.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NationalityRequest {
    @JsonProperty("pharosid")
    public String pharosId;
    @JsonProperty("nationality")
    public String nationality;
    @JsonProperty("nationalitydesc")
    public String nationalityDescription;
}
