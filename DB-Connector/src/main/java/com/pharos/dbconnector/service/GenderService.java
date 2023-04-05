package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entities.Gender;

import java.util.List;

public interface GenderService {

    public Gender createGender();
    public Gender updateGender();
    public Gender getGender();
    public Gender deleteGender();
    public List<Gender> getGenders();
}
