package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entities.Nationality;

import java.util.List;

public interface NationalityService {
    public Nationality createNationality();
    public Nationality updateNationality();
    public List<Nationality> getNationalities();
    public Nationality getNationality();
    public Nationality deleteNationality();

}
