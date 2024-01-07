package com.voiture.voiture.modele;

import jakarta.persistence.*;

@Entity
@Table(name="VoitureDefini")
public class VoitureDefini {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "idVoitureDefini")
    int idVoitureDefini;

    @Column(name = "idMarque")
    int idMarque;

    @Column(name = "idModele")
    int idModele;

    @Column(name = "idCarburant")
    int idCarburant;

    @Column(name = "idPuissance")
    int idPuissance;

    @Column(name = "idboiteDeVitesse")
    int idboiteDeVitesse;

    @Column(name = "idTypeDeVehicule")
    int idTypeDeVehicule;

    @Column(name = "nbrPorte")
    int nbrPorte;

    @Column(name = "puissance")
    float puissance;

    public VoitureDefini(int idVoitureDefini, int idMarque, int idModele, int idCarburant, int idPuissance, int idboiteDeVitesse, int idTypeDeVehicule, int nbrPorte, float puissance) {
        this.idVoitureDefini = idVoitureDefini;
        this.idMarque = idMarque;
        this.idModele = idModele;
        this.idCarburant = idCarburant;
        this.idPuissance = idPuissance;
        this.idboiteDeVitesse = idboiteDeVitesse;
        this.idTypeDeVehicule = idTypeDeVehicule;
        this.nbrPorte = nbrPorte;
        this.puissance = puissance;
    }

    public VoitureDefini() {
    }

    public VoitureDefini(int idMarque, int idModele, int idCarburant, int idPuissance, int idboiteDeVitesse, int idTypeDeVehicule, int nbrPorte, float puissance) {
        this.idMarque = idMarque;
        this.idModele = idModele;
        this.idCarburant = idCarburant;
        this.idPuissance = idPuissance;
        this.idboiteDeVitesse = idboiteDeVitesse;
        this.idTypeDeVehicule = idTypeDeVehicule;
        this.nbrPorte = nbrPorte;
        this.puissance = puissance;
    }

    public int getIdVoitureDefini() {
        return idVoitureDefini;
    }

    public void setIdVoitureDefini(int idVoitureDefini) {
        this.idVoitureDefini = idVoitureDefini;
    }

    public int getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(int idMarque) {
        this.idMarque = idMarque;
    }

    public int getIdModele() {
        return idModele;
    }

    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }

    public int getIdCarburant() {
        return idCarburant;
    }

    public void setIdCarburant(int idCarburant) {
        this.idCarburant = idCarburant;
    }

    public int getIdPuissance() {
        return idPuissance;
    }

    public void setIdPuissance(int idPuissance) {
        this.idPuissance = idPuissance;
    }

    public int getIdboiteDeVitesse() {
        return idboiteDeVitesse;
    }

    public void setIdboiteDeVitesse(int idboiteDeVitesse) {
        this.idboiteDeVitesse = idboiteDeVitesse;
    }

    public int getIdTypeDeVehicule() {
        return idTypeDeVehicule;
    }

    public void setIdTypeDeVehicule(int idTypeDeVehicule) {
        this.idTypeDeVehicule = idTypeDeVehicule;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public void setNbrPorte(int nbrPorte) {
        this.nbrPorte = nbrPorte;
    }

    public float getPuissance() {
        return puissance;
    }

    public void setPuissance(float puissance) {
        this.puissance = puissance;
    }
    
}
