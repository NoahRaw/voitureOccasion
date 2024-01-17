package com.voiture.voiture.modele;

import javax.persistence.*;

@Entity
@Table(name = "annoncefavoris")
public class AnnonceFavoris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idannoncefavoris")
    int idannonceFavoris;

    @Column(name = "idutilisateur" , nullable = false)
    int idutilisateur;

    @Column(name = "idvoitureutilisateur" , nullable = false)
    int idvoitureutilisateur;

    public AnnonceFavoris(int idannonceFavoris, int idutilisateur, int idvoitureutilisateur) {
        this.idannonceFavoris = idannonceFavoris;
        this.idutilisateur = idutilisateur;
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public AnnonceFavoris() {
    }

    public int getIdannonceFavoris() {
        return idannonceFavoris;
    }

    public int getIdvoitureutilisateur() {
        return idvoitureutilisateur;
    }

    public void setIdannonceFavoris(int idannonceFavoris) {
        this.idannonceFavoris = idannonceFavoris;
    }

    public void setIdvoitureutilisateur(int idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }
}
