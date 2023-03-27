package com.pharos.dbconnector.repository;

import com.pharos.dbconnector.model.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
}
