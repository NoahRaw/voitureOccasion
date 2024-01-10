package com.voiture.voiture.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="typedevehicule")
public class TypeDeVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtypedevehicule")
    private int idTypeDeVehicule;
    @Column(name = "description")
    private String description;

    
    


    public int getIdTypeDeVehicule() {
        return idTypeDeVehicule;
    }

    public void setIdTypeDeVehicule(int idTypeDeVehicule) {
        this.idTypeDeVehicule = idTypeDeVehicule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
