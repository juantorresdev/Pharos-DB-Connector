package com.pharos.dbconnector.wrapper.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressRequest {
    @JsonProperty("pharosid")
    public String pharosId;
    @JsonProperty("street")
    public String street;
    @JsonProperty("city")
    public String city;
    @JsonProperty("province")
    public String province;
    @JsonProperty("postcode")
    public String postcode;
    @JsonProperty("country")
    public String country;
}
