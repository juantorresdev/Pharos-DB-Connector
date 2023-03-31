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
@Table(name="NATIONALITY")
public class Nationality {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "NATIONALITY_ID", nullable = false)
    private int idNationality;
    private String nationalityVal;
    private Boolean enable;

}
