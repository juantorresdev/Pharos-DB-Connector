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
public class Nationality {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "NATIONALITY_ID", nullable = false)
    private int idNationality;
    private String nationalityVal;
    private Boolean enable;

}
