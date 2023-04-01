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
@Table(name="DOCUMENT")
public class Document {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_DOC", nullable = false)
    private int idDoc;
    @Column(name = "IDENTITY_DOCUMENT", nullable = false)
    private String documentId;
    @Column(name = "ENABLE", nullable = false)
    private Boolean enable;

}
