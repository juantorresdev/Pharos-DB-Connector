package com.pharos.dbconnector.service;

import com.pharos.dbconnector.entities.Nationality;

public interface NationalityService {
    public Nationality createNationality();
    public Nationality updateNationality();
    public Nationality getNationality();
    public Nationality deleteNationality();

}
