package com.voiture.voiture.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Modele {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int  idmodele;
	String description;

    public Modele() {
    }

    public Modele(int  idmodele,String description) {
        this.idmodele = idmodele;
		this.description = description;
    }

    public int  getIdmodele() {
        return this.idmodele;
    }

    public void setIdmodele(int  idmodele) {
        this.idmodele = idmodele;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

