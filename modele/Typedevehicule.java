package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Typedevehicule {
    @Id
	@GeneratedValue()
	int  idtypedevehicule;
	String description;

    public Typedevehicule() {
    }

    public Typedevehicule(int  idtypedevehicule,String description) {
        this.idtypedevehicule = idtypedevehicule;
		this.description = description;
    }

    public int  getIdtypedevehicule() {
        return this.idtypedevehicule;
    }

    public void setIdtypedevehicule(int  idtypedevehicule) {
        this.idtypedevehicule = idtypedevehicule;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

