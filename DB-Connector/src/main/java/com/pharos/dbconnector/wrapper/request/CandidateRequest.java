package com.pharos.dbconnector.wrapper.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CandidateRequest {
    @JsonProperty("name")
    public String name;
    @JsonProperty("lastname")
    public String lastname;
    @JsonProperty("birthdate")
    public Date birthdate;
    @JsonProperty("email")
    public String email;
    @JsonProperty("phone")
    public String phone;

}
