package com.pharos.dbconnector.entity;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Data
@Builder
public class Gender {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "GENDER_ID", nullable = false)
    private int idGender;
    private String genderVal;
    private Boolean enable;

}
