package com.voiture.voiture.service;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;
import java.util.List;


public interface PhotoVoitureUtilisateurService {

    List<PhotoVoitureUtilisateur> getAllPhotosVoitureUtilisateur();

    PhotoVoitureUtilisateur getPhotoVoitureUtilisateurById(Integer id);

    PhotoVoitureUtilisateur savePhotoVoitureUtilisateur(PhotoVoitureUtilisateur photoVoitureUtilisateur);

    PhotoVoitureUtilisateur updatePhotoVoitureUtilisateur(PhotoVoitureUtilisateur photoVoitureUtilisateur);

    void deletePhotoVoitureUtilisateurById(Integer id);

    List<PhotoVoitureUtilisateur> getPhotoVoitureUtilisateur(Integer idvoitureutilisateur);
}
