package com.voiture.voiture.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "annoncefavoris_view")
public class AnnonceFavorisView {
    @Id
//    @Column(name = "idannoncefavoris" , nullable = false)
    Integer idannoncefavoris;
    Integer idvoitureutilisateur;
    Integer idutilisateur;
    Date dateventedebut;
    Date dateventefin;
    String matricule;
    double kilometrage;
    double prix;
    Integer statut;
    String nomutilisateur;
    String nommarque;
    String nommodele;
    String nomcarburant;
    double kw;
    double cv;
    String nomboitedevitesse;
    String nomtypedevehicule;
    Integer nbrporte;
    double puissance;

    public AnnonceFavorisView() {
    }

    public AnnonceFavorisView(Integer idannoncefavoris, Integer idvoitureutilisateur, Integer idutilisateur, Date dateventedebut, Date dateventefin, String matricule, double kilometrage, double prix, Integer statut, String nommarque, String nommodele, String nomcarburant, double kw, double cv, String nomboitedevitesse, String nomtypedevehicule, Integer nbrporte, double puissance, String nom) {
        this.idannoncefavoris = idannoncefavoris;
        this.idvoitureutilisateur = idvoitureutilisateur;
        this.idutilisateur = idutilisateur;
        this.dateventedebut = dateventedebut;
        this.dateventefin = dateventefin;
        this.matricule = matricule;
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.statut = statut;
        this.nommarque = nommarque;
        this.nommodele = nommodele;
        this.nomcarburant = nomcarburant;
        this.kw = kw;
        this.cv = cv;
        this.nomboitedevitesse = nomboitedevitesse;
        this.nomtypedevehicule = nomtypedevehicule;
        this.nbrporte = nbrporte;
        this.puissance = puissance;
        this.nomutilisateur = nom;
    }

    public Integer getIdannoncefavoris() {
        return idannoncefavoris;
    }

    public Integer getIdvoitureutilisateur() {
        return idvoitureutilisateur;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public Date getDateventedebut() {
        return dateventedebut;
    }

    public Date getDateventefin() {
        return dateventefin;
    }

    public String getMatricule() {
        return matricule;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public double getPrix() {
        return prix;
    }

    public Integer getStatut() {
        return statut;
    }

    public String getNommarque() {
        return nommarque;
    }

    public String getNommodele() {
        return nommodele;
    }

    public String getNomcarburant() {
        return nomcarburant;
    }

    public double getKw() {
        return kw;
    }

    public double getCv() {
        return cv;
    }

    public String getNomboitedevitesse() {
        return nomboitedevitesse;
    }

    public String getNomtypedevehicule() {
        return nomtypedevehicule;
    }

    public Integer getNbrporte() {
        return nbrporte;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setIdannoncefavoris(Integer idannoncefavoris) {
        this.idannoncefavoris = idannoncefavoris;
    }

    public void setIdvoitureutilisateur(Integer idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public void setDateventedebut(Date dateventedebut) {
        this.dateventedebut = dateventedebut;
    }

    public void setDateventefin(Date dateventefin) {
        this.dateventefin = dateventefin;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setStatut(Integer statut) {
        this.statut = statut;
    }

    public void setNommarque(String nommarque) {
        this.nommarque = nommarque;
    }

    public void setNommodele(String nommodele) {
        this.nommodele = nommodele;
    }

    public void setNomcarburant(String nomcarburant) {
        this.nomcarburant = nomcarburant;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    public void setNomboitedevitesse(String nomboitedevitesse) {
        this.nomboitedevitesse = nomboitedevitesse;
    }

    public void setNomtypedevehicule(String nomtypedevehicule) {
        this.nomtypedevehicule = nomtypedevehicule;
    }

    public void setNbrporte(Integer nbrporte) {
        this.nbrporte = nbrporte;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public void setNomutilisateur(String nomutilisateur) {
        this.nomutilisateur = nomutilisateur;
    }

    public String getNomutilisateur() {
        return nomutilisateur;
    }
}
