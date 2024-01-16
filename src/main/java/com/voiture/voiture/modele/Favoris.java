package com.voiture.voiture.modele;

import javax.persistence.*;

@Entity
@Table(name = "Favoris")
public class Favoris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfavoris")
    int idfavoris;

    @Column(name = "idvoitureutilisateur" , nullable = false)
    int idvoitureutilisateur;

    public Favoris(int idfavoris, int idvoitureutilisateur) {
        this.idfavoris = idfavoris;
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public Favoris() {
    }

    public int getIdfavoris() {
        return idfavoris;
    }

    public int getIdvoitureutilisateur() {
        return idvoitureutilisateur;
    }

    public void setIdfavoris(int idfavoris) {
        this.idfavoris = idfavoris;
    }

    public void setIdvoitureutilisateur(int idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }
}
