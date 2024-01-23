package com.voiture.voiture.modele;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Comission")
public class Comission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomission")
    Integer id_comission;

    @Column(name = "date" , nullable = false)
    Timestamp date;

    @Column(name = "pourcentage" , nullable = false)
    float pourcentage;

    public Comission() {
    }

    public Comission(Integer id_comission, Timestamp date, float pourcentage) {
        super();
        this.id_comission = id_comission;
        this.date = date;
        this.pourcentage = pourcentage;
    }

    public Integer getId_comission() {
        return id_comission;
    }

    public Timestamp getDate() {
        return date;
    }

    public float getPourcentage() {
        return pourcentage;
    }

    public void setId_comission(Integer id_comission) {
        this.id_comission = id_comission;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setPourcentage(float pourcentage) {
        this.pourcentage = pourcentage;
    }
}
