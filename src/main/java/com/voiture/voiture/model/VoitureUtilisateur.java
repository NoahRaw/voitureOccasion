package com.voiture.voiture.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="voiturevtilisateur")
public class VoitureUtilisateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvoitureutilisateur")
    private int idVoitureUtilisateur;
    @Column(name = "idutilisateur")
    private int idUtilisateur;
    @Column(name = "idvoituredefini")
    private int idVoitureDefini;
    @Column(name = "dateventedebut")
    private Timestamp dateVenteDebut;
    @Column(name = "dateventefine")
    private Timestamp dateVenteFin;
    @Column(name = "matricule")
    private String matricule ;
    @Column(name = "kilometrage")
    private double kilometrage;
    @Column(name = "prix")
    private double prix;
    @Column(name = "statut")
    private int statut;





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
    public int getStatut() {
        return statut;
    }
    public void setStatut(int statut) {
        this.statut = statut;
    }


}
