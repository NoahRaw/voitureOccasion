package com.voiture.voiture.modele;

import javax.persistence.*;

@Entity
@Table(name = "annoncefavoris")
public class AnnonceFavoris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idannoncefavoris")
    Integer idannonceFavoris;

    @Column(name = "idutilisateur" , nullable = false)
    Integer idutilisateur;

    @Column(name = "idvoitureutilisateur" , nullable = false)
    Integer idvoitureutilisateur;

    public AnnonceFavoris(Integer idannonceFavoris, Integer idutilisateur, Integer idvoitureutilisateur) {
        this.idannonceFavoris = idannonceFavoris;
        this.idutilisateur = idutilisateur;
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public AnnonceFavoris() {
    }

    public Integer getIdannonceFavoris() {
        return idannonceFavoris;
    }

    public Integer getIdvoitureutilisateur() {
        return idvoitureutilisateur;
    }

    public void setIdannonceFavoris(Integer idannonceFavoris) {
        this.idannonceFavoris = idannonceFavoris;
    }

    public void setIdvoitureutilisateur(Integer idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }
}
