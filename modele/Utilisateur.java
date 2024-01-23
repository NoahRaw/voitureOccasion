package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Utilisateur {
    @Id
	@GeneratedValue()
	Integer  idutilisateur;
	String email;
	String mdp;

    public Utilisateur() {
    }

    public Utilisateur(Integer  idutilisateur,String email,String mdp) {
        this.idutilisateur = idutilisateur;
		this.email = email;
		this.mdp = mdp;
    }

    public Integer  getIdutilisateur() {
        return this.idutilisateur;
    }

    public void setIdutilisateur(Integer  idutilisateur) {
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

