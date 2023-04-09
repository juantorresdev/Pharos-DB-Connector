package com.pharos.dbconnector.wrapper.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenderRequest {
    @JsonProperty("pharosid")
    public String pharosId;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("genderdesc")
    public String genderDescription;
}
