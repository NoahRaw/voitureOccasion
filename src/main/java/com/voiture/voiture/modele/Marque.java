package com.voiture.voiture.modele;

import javax.persistence.*;

@Entity
@Table(name = "Marque")
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmarque")
    Integer id_marque;

    @Column(name = "description" , nullable = false)
    String description;

    public Marque() {
    }

    public Marque(Integer id_marque, String description) {
        super();
        this.id_marque = id_marque;
        this.description = description;
    }

    public void setId_marque(Integer id_marque) {
        this.id_marque = id_marque;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId_marque() {
        return id_marque;
    }

    public String getDescription() {
        return description;
    }
}
