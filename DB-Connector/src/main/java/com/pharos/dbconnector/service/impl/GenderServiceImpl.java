package com.pharos.dbconnector.service.impl;

import com.pharos.dbconnector.entities.Gender;
import com.pharos.dbconnector.repository.GenderRepository;
import com.pharos.dbconnector.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    GenderRepository genderRepository;

    @Override
    public Gender createGender() {
        return null;
    }

    @Override
    public Gender updateGender() {
        return null;
    }

    @Override
    public Gender getGender() {
        return null;
    }

    @Override
    public Gender deleteGender() {
        return null;
    }

    @Override
    public List<Gender> getGenders() {
        return null;
    }
}
