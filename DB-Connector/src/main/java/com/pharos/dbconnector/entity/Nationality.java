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
    @Column(name = "NATIONALITYVAL", nullable = false)
    private String nationalityVal;
    @Column(name = "ENABLE", nullable = false)
    private Boolean enable;

}
