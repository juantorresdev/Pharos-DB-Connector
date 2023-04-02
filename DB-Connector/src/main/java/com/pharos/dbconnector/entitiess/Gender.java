package com.pharos.dbconnector.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@Table(name="GENDER")
public class Gender {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "GENDER_ID", nullable = false)
    private int idGender;
    @Column(name = "GENDERVAL", nullable = false)
    private String genderVal;
    @Column(name = "ENABLE", nullable = false)
    private Boolean enable;

}
