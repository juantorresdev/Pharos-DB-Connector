package com.pharos.dbconnector.repository;

import com.pharos.dbconnector.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
