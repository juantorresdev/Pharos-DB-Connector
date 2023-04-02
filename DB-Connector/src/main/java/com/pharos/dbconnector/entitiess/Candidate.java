package com.pharos.dbconnector.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@Table(name="candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CANDIDATE_ID", nullable = false)
    private int idCandidate;

    @Column(name = "PHAROS_ID", nullable = false)
    private String pharosId;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "LASTNAME", nullable = false)
    private String lastname;
    @Column(name = "BIRTHDATE", nullable = false)
    private Date birthdate;
    @Column(name = "EMAIL", nullable = false)
    private String email;
    @Column(name = "PHONE", nullable = false)
    private String phone;
    @Column(name = "ENABLE", nullable = false)
    private Boolean enable;
    @Column(name = "STATUS", nullable = false)
    private Boolean status;
    @Column(name = "ACTIVATIONCODE", nullable = false)
    private String activationCode;
    @Column(name = "ID_DOC")
    private int documentId;
    @Column(name = "GENDER_ID")
    private int genderId;
    @Column(name = "NATIONALITY_ID")
    private int nationalityId;

}
