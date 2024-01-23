package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Boitedevitesse {
    @Id
	@GeneratedValue()
	Integer  idboitedevitesse;
	String description;

    public Boitedevitesse() {
    }

    public Boitedevitesse(Integer  idboitedevitesse,String description) {
        this.idboitedevitesse = idboitedevitesse;
		this.description = description;
    }

    public Integer  getIdboitedevitesse() {
        return this.idboitedevitesse;
    }

    public void setIdboitedevitesse(Integer  idboitedevitesse) {
        this.idboitedevitesse = idboitedevitesse;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

