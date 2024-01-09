package com.voiture.voiture.modele;


import javax.persistence.*;

@Entity()
public class Utilisateur {
    @Id
	@GeneratedValue()
	int  idutilisateur;
	String email;
	String mdp;

    public Utilisateur() {
    }

    public Utilisateur(int  idutilisateur,String email,String mdp) {
        this.idutilisateur = idutilisateur;
		this.email = email;
		this.mdp = mdp;
    }

    public int  getIdutilisateur() {
        return this.idutilisateur;
    }

    public void setIdutilisateur(int  idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

	public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }  
}