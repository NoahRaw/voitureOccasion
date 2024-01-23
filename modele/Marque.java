package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Marque {
    @Id
	@GeneratedValue()
	Integer  idmarque;
	String description;

    public Marque() {
    }

    public Marque(Integer  idmarque,String description) {
        this.idmarque = idmarque;
		this.description = description;
    }

    public Integer  getIdmarque() {
        return this.idmarque;
    }

    public void setIdmarque(Integer  idmarque) {
        this.idmarque = idmarque;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

