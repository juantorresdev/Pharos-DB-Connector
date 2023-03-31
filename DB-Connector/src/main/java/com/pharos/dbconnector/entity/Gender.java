package com.pharos.dbconnector.entity;

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
    private String genderVal;
    private Boolean enable;

}
