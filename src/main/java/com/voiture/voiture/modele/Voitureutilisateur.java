package com.voiture.voiture.modele;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Voitureutilisateur {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer  idvoitureutilisateur;
	Integer  idutilisateur;
	Integer  idvoituredefini;
	Date dateventedebut;
	Date dateventefin;
	String matricule;
	Double kilometrage;
	Double prix;
	Integer  statut;

    public Voitureutilisateur() {
    }

    public Voitureutilisateur(Integer  idvoitureutilisateur,Integer  idutilisateur,Integer  idvoituredefini,Date dateventedebut,Date dateventefin,String matricule,Double kilometrage,Double prix,Integer  statut) {
        this.idvoitureutilisateur = idvoitureutilisateur;
		this.idutilisateur = idutilisateur;
		this.idvoituredefini = idvoituredefini;
		this.dateventedebut = dateventedebut;
		this.dateventefin = dateventefin;
		this.matricule = matricule;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.statut = statut;
    }

    public Integer  getIdvoitureutilisateur() {
        return this.idvoitureutilisateur;
    }

    public void setIdvoitureutilisateur(Integer  idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

	public Integer  getIdutilisateur() {
        return this.idutilisateur;
    }

    public void setIdutilisateur(Integer  idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

	public Integer  getIdvoituredefini() {
        return this.idvoituredefini;
    }

    public void setIdvoituredefini(Integer  idvoituredefini) {
        this.idvoituredefini = idvoituredefini;
    }

	public Date getDateventedebut() {
        return this.dateventedebut;
    }

    public void setDateventedebut(Date dateventedebut) {
        this.dateventedebut = dateventedebut;
    }

	public Date getDateventefin() {
        return this.dateventefin;
    }

    public void setDateventefin(Date dateventefin) {
        this.dateventefin = dateventefin;
    }

	public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

	public Double getKilometrage() {
        return this.kilometrage;
    }

    public void setKilometrage(Double kilometrage) {
        this.kilometrage = kilometrage;
    }

	public Double getPrix() {
        return this.prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

	public Integer  getStatut() {
        return this.statut;
    }

    public void setStatut(Integer  statut) {
        this.statut = statut;
    }  
}

