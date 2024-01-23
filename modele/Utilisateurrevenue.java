package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Utilisateurrevenue {
    Integer  idutilisateur;
	Double revenue;

    public Utilisateurrevenue() {
    }

    public Utilisateurrevenue(Integer  idutilisateur,Double revenue) {
        this.idutilisateur = idutilisateur;
		this.revenue = revenue;
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

