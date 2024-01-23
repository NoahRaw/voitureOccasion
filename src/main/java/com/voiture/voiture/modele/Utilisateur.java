package com.voiture.voiture.modele;


import javax.persistence.*;

@Entity()
public class Utilisateur {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int  idutilisateur;
    String nomutilisateur;
	String email;
	String mdp;
    Integer etat;

    public Utilisateur() {
    }

    public Utilisateur(int  idutilisateur,String email,String mdp,String nomutilisateur,int etat) {
        this.idutilisateur = idutilisateur;
		this.email = email;
		this.mdp = mdp;
        this.nomutilisateur = nomutilisateur;
        this.etat = etat;
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
    
    public String getNomutilisateur(){
        return this.nomutilisateur;
    }

    public void setNomutilisateur(String nomutilisateur){
        this.nomutilisateur = nomutilisateur;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
