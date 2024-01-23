package com.voiture.voiture.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Utilisateurrevenue {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int  idutilisateur;
    String nomutilisateur;
    Double revenue;

    public Utilisateurrevenue() {
    }

    public Utilisateurrevenue(int  idutilisateur,Double revenue,String nomutilisateur) {
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
    public int  getIdutilisateur() {
        return this.idutilisateur;
    }

    public void setIdutilisateur(int  idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

	public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }  
}

