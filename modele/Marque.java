package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Marque {
    @Id
	@GeneratedValue()
	int  idmarque;
	String description;

    public Marque() {
    }

    public Marque(int  idmarque,String description) {
        this.idmarque = idmarque;
		this.description = description;
    }

    public int  getIdmarque() {
        return this.idmarque;
    }

    public void setIdmarque(int  idmarque) {
        this.idmarque = idmarque;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

