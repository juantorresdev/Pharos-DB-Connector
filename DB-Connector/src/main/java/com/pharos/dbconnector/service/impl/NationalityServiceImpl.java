package com.pharos.dbconnector.service.impl;

import com.pharos.dbconnector.entities.Nationality;
import com.pharos.dbconnector.repository.NationalityRepository;
import com.pharos.dbconnector.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalityServiceImpl implements NationalityService {

    @Autowired
    NationalityRepository nationalityRepository;

    @Override
    public Nationality createNationality() {
        return null;
    }

    @Override
    public Nationality updateNationality() {
        return null;
    }

    @Override
    public List<Nationality> getNationalities() {
        return null;
    }

    @Override
    public Nationality getNationality() {
        return null;
    }

    @Override
    public Nationality deleteNationality() {
        return null;
    }
}
