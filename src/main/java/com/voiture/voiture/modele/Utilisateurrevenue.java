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
	Double revenue;

    public Utilisateurrevenue() {
    }

    public Utilisateurrevenue(int  idutilisateur,Double revenue) {
        this.idutilisateur = idutilisateur;
		this.revenue = revenue;
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

