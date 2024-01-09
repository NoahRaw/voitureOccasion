package com.voiture.voiture.modele;


import javax.persistence.*;

@Entity
@Table(name="utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "idutilisateur")
    int idUtilisateur;

    @Column(name = "email")
    String email;

    @Column(name = "mdp")
    String mdp;

    public Utilisateur() {
    }

    public Utilisateur(int idUtilisateur, String email, String mdp) {
        this.idUtilisateur = idUtilisateur;
        this.email = email;
        this.mdp = mdp;
    }

    public Utilisateur(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    

}
