package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Photovoitureutilisateur {
    int  idvoitureutilisateur;
	String nomphoto;

    public Photovoitureutilisateur() {
    }

    public Photovoitureutilisateur(int  idvoitureutilisateur,String nomphoto) {
        this.idvoitureutilisateur = idvoitureutilisateur;
		this.nomphoto = nomphoto;
    }

    public int  getIdvoitureutilisateur() {
        return this.idvoitureutilisateur;
    }

    public void setIdvoitureutilisateur(int  idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

	public String getNomphoto() {
        return this.nomphoto;
    }

    public void setNomphoto(String nomphoto) {
        this.nomphoto = nomphoto;
    }  
}

