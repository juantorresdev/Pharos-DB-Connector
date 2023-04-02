package com.pharos.dbconnector.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "NATIONALITY", schema = "PHAROS")
public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NATIONALITY_ID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "NATIONALITYVAL", nullable = false)
    private String nationalityval;

    @Size(max = 5)
    @NotNull
    @Column(name = "ENABLE", nullable = false, length = 5)
    private String enable;

    @OneToMany(mappedBy = "nationality")
    private Set<Candidate> candidates = new LinkedHashSet<>();

}