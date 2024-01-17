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
    int idannoncefavoris;
    int idvoitureutilisateur;
    int idutilisateur;
    Date dateventedebut;
    Date dateventefin;
    String matricule;
    double kilometrage;
    double prix;
    int statut;
    String nommarque;
    String nommodele;
    String nomcarburant;
    double kw;
    double cv;
    String nomboitedevitesse;
    String nomtypedevehicule;
    int nbrporte;
    double puissance;

    public AnnonceFavorisView() {
    }

    public AnnonceFavorisView(int idannoncefavoris, int idvoitureutilisateur, int idutilisateur, Date dateventedebut, Date dateventefin, String matricule, double kilometrage, double prix, int statut, String nommarque, String nommodele, String nomcarburant, double kw, double cv, String nomboitedevitesse, String nomtypedevehicule, int nbrporte, double puissance) {
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
    }

    public int getIdannoncefavoris() {
        return idannoncefavoris;
    }

    public int getIdvoitureutilisateur() {
        return idvoitureutilisateur;
    }

    public int getIdutilisateur() {
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

    public int getStatut() {
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

    public int getNbrporte() {
        return nbrporte;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setIdannoncefavoris(int idannoncefavoris) {
        this.idannoncefavoris = idannoncefavoris;
    }

    public void setIdvoitureutilisateur(int idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
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

    public void setStatut(int statut) {
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

    public void setNbrporte(int nbrporte) {
        this.nbrporte = nbrporte;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }
}
