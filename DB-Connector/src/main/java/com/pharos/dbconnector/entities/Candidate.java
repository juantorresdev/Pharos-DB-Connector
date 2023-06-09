package com.pharos.dbconnector.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "CANDIDATE", schema = "PHAROS")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CANDIDATE_ID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "PHAROS_ID", nullable = false)
    private String pharosId;

    @Size(max = 255)
    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = "LASTNAME", nullable = false)
    private String lastname;

    @NotNull
    @Column(name = "BIRTHDATE", nullable = false)
    //private LocalDate birthdate;
    private Date birthdate;

    @Size(max = 255)
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Size(max = 255)
    @NotNull
    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Size(max = 255)
    @NotNull
    @Column(name = "STATUS", nullable = false)
    private String status;

    @Size(max = 5)
    @NotNull
    @Column(name = "ENABLE", nullable = false, length = 5)
    private String enable;

    @Size(max = 255)
    @Column(name = "ACTIVATIONCODE")
    private String activationcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GENDER_ID")
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NATIONALITY_ID")
    private Nationality nationality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_ID")
    private Document document;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

}