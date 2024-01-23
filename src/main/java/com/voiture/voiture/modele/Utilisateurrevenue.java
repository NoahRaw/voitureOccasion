package com.voiture.voiture.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Utilisateurrevenue {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer  idutilisateur;
    String nomutilisateur;
    Double revenue;

    public Utilisateurrevenue() {
    }

    public Utilisateurrevenue(Integer  idutilisateur,Double revenue,String nomutilisateur) {
        this.idutilisateur = idutilisateur;
		this.revenue = revenue;
        this.nomutilisateur=nomutilisateur;
    }


    public String getNomutilisateur() {
        return nomutilisateur;
    }

    public void setNomutilisateur(String nomutilisateur) {
        this.nomutilisateur = nomutilisateur;
    }
    public Integer  getIdutilisateur() {
        return this.idutilisateur;
    }

    public void setIdutilisateur(Integer  idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

	public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }  
}

