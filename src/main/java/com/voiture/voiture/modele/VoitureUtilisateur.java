package com.voiture.voiture.modele;

import java.sql.Date;

import javax.persistence.*;

@Entity()
public class Voitureutilisateur {
    @Id
	@GeneratedValue()
	int  idvoitureutilisateur;
	int  idutilisateur;
	int  idvoituredefini;
	Date dateventedebut;
	Date dateventefin;
	String matricule;
	Double kilometrage;
	Double prix;
	int  statut;

    public Voitureutilisateur() {
    }

    public Voitureutilisateur(int  idvoitureutilisateur,int  idutilisateur,int  idvoituredefini,Date dateventedebut,Date dateventefin,String matricule,Double kilometrage,Double prix,int  statut) {
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

    public int  getIdvoitureutilisateur() {
        return this.idvoitureutilisateur;
    }

    public void setIdvoitureutilisateur(int  idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

	public int  getIdutilisateur() {
        return this.idutilisateur;
    }

    public void setIdutilisateur(int  idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

	public int  getIdvoituredefini() {
        return this.idvoituredefini;
    }

    public void setIdvoituredefini(int  idvoituredefini) {
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

	public int  getStatut() {
        return this.statut;
    }

    public void setStatut(int  statut) {
        this.statut = statut;
    }  
}

