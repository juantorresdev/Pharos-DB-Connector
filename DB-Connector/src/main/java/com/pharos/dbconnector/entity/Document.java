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
    private String documentId;
    private Boolean enable;

}
