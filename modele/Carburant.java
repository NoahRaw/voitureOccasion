package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Carburant {
    @Id
	@GeneratedValue()
	Integer  idcarburant;
	String description;

    public Carburant() {
    }

    public Carburant(Integer  idcarburant,String description) {
        this.idcarburant = idcarburant;
		this.description = description;
    }

    public Integer  getIdcarburant() {
        return this.idcarburant;
    }

    public void setIdcarburant(Integer  idcarburant) {
        this.idcarburant = idcarburant;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

