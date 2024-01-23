package com.voiture.voiture.modele;

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
@Table(name="photovoitureutilisateur")
public class PhotoVoitureUtilisateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idphotovoitureutilisateur")
    private Integer idPhotovoitureutilisateur;
    @Column(name = "idvoitureutilisateur")
    private Integer idVoitureUtilisateur;
    @Column(name = "nomphoto")
    private String nomPhoto;

    

    // Getters et Setters
    public Integer getIdPhotovoitureutilisateur() {
        return idPhotovoitureutilisateur;
    }

    public void setIdPhotovoitureutilisateur(Integer idPhotoVoitureUtilisateur) {
        this.idPhotovoitureutilisateur = idPhotoVoitureUtilisateur;
    }

    public Integer getIdVoitureUtilisateur() {
        return idVoitureUtilisateur;
    }

    public void setIdVoitureUtilisateur(Integer idVoitureUtilisateur) {
        this.idVoitureUtilisateur = idVoitureUtilisateur;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    
}
