package com.pharos.dbconnector.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Builder;
@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_DOC", nullable = false)
    private int idDoc;
    private String documentId;
    private Boolean enable;

}
