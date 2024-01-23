package com.voiture.voiture.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Modele {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer  idmodele;
	String description;

    public Modele() {
    }

    public Modele(Integer  idmodele,String description) {
        this.idmodele = idmodele;
		this.description = description;
    }

    public Integer  getIdmodele() {
        return this.idmodele;
    }

    public void setIdmodele(Integer  idmodele) {
        this.idmodele = idmodele;
    }

	public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }  
}

