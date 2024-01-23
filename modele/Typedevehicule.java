package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Typedevehicule {
    @Id
	@GeneratedValue()
	Integer  idtypedevehicule;
	String description;

    public Typedevehicule() {
    }

    public Typedevehicule(Integer  idtypedevehicule,String description) {
        this.idtypedevehicule = idtypedevehicule;
		this.description = description;
    }

    public Integer  getIdtypedevehicule() {
        return this.idtypedevehicule;
    }

    public void setIdtypedevehicule(Integer  idtypedevehicule) {
        this.idtypedevehicule = idtypedevehicule;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

