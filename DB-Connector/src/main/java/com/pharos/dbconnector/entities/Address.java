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
@Table(name = "ADDRESS", schema = "PHAROS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "STREET", nullable = false)
    private String street;

    @Size(max = 100)
    @NotNull
    @Column(name = "CITY", nullable = false, length = 100)
    private String city;

    @Size(max = 100)
    @NotNull
    @Column(name = "PROVINCE", nullable = false, length = 100)
    private String province;

    @Size(max = 10)
    @NotNull
    @Column(name = "POSTCODE", nullable = false, length = 10)
    private String postcode;

    @Size(max = 100)
    @NotNull
    @Column(name = "COUNTRY", nullable = false, length = 100)
    private String country;

    @Size(max = 10)
    @NotNull
    @Column(name = "STATUS", nullable = false, length = 10)
    private String status;

    @OneToMany(mappedBy = "address")
    private Set<Candidate> candidates = new LinkedHashSet<>();

}