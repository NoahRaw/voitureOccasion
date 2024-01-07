package com.voiture.voiture.modele;

import jakarta.persistence.*;

@Entity
@Table(name="voitureDefiniStatView")
public class VoitureDefiniStatView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = " idVoituredefini")
    int idVoituredefini;

    @Column(name = " idMarque")
    int idMarque;

    @Column(name = " nomMarque")
    String nomMarque;

    @Column(name = " nomModele")
    String nomModele;


    public VoitureDefiniStatView() {
    }

    public VoitureDefiniStatView(int idVoituredefini, int idMarque, String nomMarque, String nomModele) {
        this.idVoituredefini = idVoituredefini;
        this.idMarque = idMarque;
        this.nomMarque = nomMarque;
        this.nomModele = nomModele;
    }

    public VoitureDefiniStatView(int idMarque, String nomMarque, String nomModele) {
        this.idMarque = idMarque;
        this.nomMarque = nomMarque;
        this.nomModele = nomModele;
    }

    public int getIdVoituredefini() {
        return idVoituredefini;
    }

    public void setIdVoituredefini(int idVoituredefini) {
        this.idVoituredefini = idVoituredefini;
    }

    public int getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(int idMarque) {
        this.idMarque = idMarque;
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    public String getNomModele() {
        return nomModele;
    }

    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }
}
