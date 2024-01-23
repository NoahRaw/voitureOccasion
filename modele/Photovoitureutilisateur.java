package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Photovoitureutilisateur {
    Integer  idvoitureutilisateur;
	String nomphoto;

    public Photovoitureutilisateur() {
    }

    public Photovoitureutilisateur(Integer  idvoitureutilisateur,String nomphoto) {
        this.idvoitureutilisateur = idvoitureutilisateur;
		this.nomphoto = nomphoto;
    }

    public Integer  getIdvoitureutilisateur() {
        return this.idvoitureutilisateur;
    }

    public void setIdvoitureutilisateur(Integer  idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }

	public String getNomphoto() {
        return this.nomphoto;
    }

    public void setNomphoto(String nomphoto) {
        this.nomphoto = nomphoto;
    }  
}

