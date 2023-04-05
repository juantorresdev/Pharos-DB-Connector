package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entities.Address;

import java.util.List;

public interface AddressService {

    public Address createAddress();
    public Address updateAddress();
    public List<Address> getAddresses();
    public Address getAddress();
    public Address deleteAddress();

}
