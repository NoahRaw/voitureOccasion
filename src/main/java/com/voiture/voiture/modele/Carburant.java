package com.voiture.voiture.modele;

import javax.persistence.*;

@Entity
@Table(name = "Carburant")
public class Carburant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcarburant")
    Integer id_carburant;

    @Column(name = "description" , nullable = false)
    String description;

    public Carburant() {
    }

    public Carburant(Integer id_carburant, String description) {
        super();
        this.id_carburant = id_carburant;
        this.description = description;
    }

    public Integer getId_carburant() {
        return id_carburant;
    }

    public String getDescription() {
        return description;
    }

    public void setId_carburant(Integer id_carburant) {
        this.id_carburant = id_carburant;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
