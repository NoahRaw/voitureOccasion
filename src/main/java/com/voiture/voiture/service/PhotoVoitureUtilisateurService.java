package com.voiture.voiture.service;

import com.voiture.voiture.model.PhotoVoitureUtilisateur;
import com.voiture.voiture.model.TypeDeVehicule;
import com.voiture.voiture.repository.PhotoVoitureUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PhotoVoitureUtilisateurService {

    List<PhotoVoitureUtilisateur> getAllPhotosVoitureUtilisateur();

    PhotoVoitureUtilisateur getPhotoVoitureUtilisateurById(int id);

    PhotoVoitureUtilisateur savePhotoVoitureUtilisateur(PhotoVoitureUtilisateur photoVoitureUtilisateur);

    PhotoVoitureUtilisateur updatePhotoVoitureUtilisateur(PhotoVoitureUtilisateur photoVoitureUtilisateur);

    void deletePhotoVoitureUtilisateurById(int id);
}
