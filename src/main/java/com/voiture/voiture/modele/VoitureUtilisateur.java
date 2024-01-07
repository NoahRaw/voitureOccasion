package com.voiture.voiture.modele;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name="Utilisateur")
public class VoitureUtilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "idVoitureUtilisateur")
    int idVoitureUtilisateur;

    @Column(name = "idUtilisateur")
    int idUtilisateur;

    @Column(name = "idVoitureDefini")
    int idVoitureDefini;

    @Column(name = "dateVenteDebut")
    Timestamp dateVenteDebut;

    @Column(name = "dateVenteFin")
    Timestamp dateVenteFin;

    @Column(name = "matricule")
    String matricule;

    @Column(name = "kilometrage")
    double kilometrage;

    @Column(name = "prix")
    double prix;

    @Column(name = "statut")
    String statut;

    public VoitureUtilisateur() {
    }

    public VoitureUtilisateur(int idVoitureUtilisateur, int idUtilisateur, int idVoitureDefini, Timestamp dateVenteDebut, Timestamp dateVenteFin, String matricule, double kilometrage, double prix, String statut) {
        this.idVoitureUtilisateur = idVoitureUtilisateur;
        this.idUtilisateur = idUtilisateur;
        this.idVoitureDefini = idVoitureDefini;
        this.dateVenteDebut = dateVenteDebut;
        this.dateVenteFin = dateVenteFin;
        this.matricule = matricule;
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.statut = statut;
    }

    public VoitureUtilisateur(int idUtilisateur, int idVoitureDefini, Timestamp dateVenteDebut, Timestamp dateVenteFin, String matricule, double kilometrage, double prix, String statut) {
        this.idUtilisateur = idUtilisateur;
        this.idVoitureDefini = idVoitureDefini;
        this.dateVenteDebut = dateVenteDebut;
        this.dateVenteFin = dateVenteFin;
        this.matricule = matricule;
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.statut = statut;
    }

    public int getIdVoitureUtilisateur() {
        return idVoitureUtilisateur;
    }

    public void setIdVoitureUtilisateur(int idVoitureUtilisateur) {
        this.idVoitureUtilisateur = idVoitureUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdVoitureDefini() {
        return idVoitureDefini;
    }

    public void setIdVoitureDefini(int idVoitureDefini) {
        this.idVoitureDefini = idVoitureDefini;
    }

    public Timestamp getDateVenteDebut() {
        return dateVenteDebut;
    }

    public void setDateVenteDebut(Timestamp dateVenteDebut) {
        this.dateVenteDebut = dateVenteDebut;
    }

    public Timestamp getDateVenteFin() {
        return dateVenteFin;
    }

    public void setDateVenteFin(Timestamp dateVenteFin) {
        this.dateVenteFin = dateVenteFin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
