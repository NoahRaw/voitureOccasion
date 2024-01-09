package com.voiture.voiture.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Boitedevitesse {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int  idboitedevitesse;
	String description;

    public Boitedevitesse() {
    }

    public Boitedevitesse(int  idboitedevitesse,String description) {
        this.idboitedevitesse = idboitedevitesse;
		this.description = description;
    }

    public int  getIdboitedevitesse() {
        return this.idboitedevitesse;
    }

    public void setIdboitedevitesse(int  idboitedevitesse) {
        this.idboitedevitesse = idboitedevitesse;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

