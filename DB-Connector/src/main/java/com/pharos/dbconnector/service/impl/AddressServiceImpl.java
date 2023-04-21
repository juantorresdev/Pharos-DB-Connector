package com.pharos.dbconnector.service.impl;

import com.pharos.dbconnector.entities.Address;
import com.pharos.dbconnector.repository.AddressRepository;
import com.pharos.dbconnector.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address createAddress() {
        return null;
    }

    @Override
    public Address updateAddress() {
        return null;
    }

    @Override
    public List<Address> getAddresses() {
        return null;
    }

    @Override
    public Address getAddress() {
        return null;
    }

    @Override
    public Address deleteAddress() {
        return null;
    }
}
