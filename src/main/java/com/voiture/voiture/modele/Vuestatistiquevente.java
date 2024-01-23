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
    Integer id_utilisateur;

    @Column(name = "nomutilisateur" , nullable = false)
    String nomutilisateur;

    @Column(name = "email" , nullable = false)
    String email;

    @Column(name = "nombredeventes" , nullable = false)
    Integer nombredeventes;

    public Vuestatistiquevente(Integer id_utilisateur, String nomutilisateur, String email, Integer nombredeventes) {
        this.id_utilisateur = id_utilisateur;
        this.nomutilisateur = nomutilisateur;
        this.email = email;
        this.nombredeventes = nombredeventes;
    }

    public Vuestatistiquevente() {
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombredeventes(Integer nombredeventes) {
        this.nombredeventes = nombredeventes;
    }

    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public String getEmail() {
        return email;
    }

    public Integer getNombredeventes() {
        return nombredeventes;
    }

    public String getNomutilisateur() {
        return nomutilisateur;
    }

    public void setNomutilisateur(String nomutilisateur) {
        this.nomutilisateur = nomutilisateur;
    }
}
