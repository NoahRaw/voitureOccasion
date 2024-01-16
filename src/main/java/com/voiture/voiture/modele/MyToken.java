package com.voiture.voiture.modele;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "my_tokens")
public class MyToken implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMyToken;

    @Column(nullable = false)
    private String valeur;

    private Integer idutilisateur;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureExpiration;

    // Constructeurs, Getter, Setter, etc.
}