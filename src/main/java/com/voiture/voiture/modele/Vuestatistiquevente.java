package com.voiture.voiture.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vuestatistiquevente")
public class Vuestatistiquevente {
    @Id
    @Column(name = "idutilisateur" , nullable = false)
    int id_utilisateur;

    @Column(name = "email" , nullable = false)
    String email;

    @Column(name = "nombredeventes" , nullable = false)
    int nombredeventes;

    public Vuestatistiquevente(int id_utilisateur, String email, int nombredeventes) {
        this.id_utilisateur = id_utilisateur;
        this.email = email;
        this.nombredeventes = nombredeventes;
    }

    public Vuestatistiquevente() {
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombredeventes(int nombredeventes) {
        this.nombredeventes = nombredeventes;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public String getEmail() {
        return email;
    }

    public int getNombredeventes() {
        return nombredeventes;
    }
}
