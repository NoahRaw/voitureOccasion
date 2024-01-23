package com.voiture.voiture.service.imp;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;
import com.voiture.voiture.modele.TypeDeVehicule;
import com.voiture.voiture.repository.PhotoVoitureUtilisateurRepository;
import com.voiture.voiture.service.PhotoVoitureUtilisateurService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PhotoVoitureUtilisateurServiceImp implements PhotoVoitureUtilisateurService{

    @Autowired
    private PhotoVoitureUtilisateurRepository photoVoitureUtilisateurRepository;


    @Override
    public List<PhotoVoitureUtilisateur> getAllPhotosVoitureUtilisateur() {
        return photoVoitureUtilisateurRepository.findAll();
    }

    @Override
    public PhotoVoitureUtilisateur getPhotoVoitureUtilisateurById(int id) {
        Optional<PhotoVoitureUtilisateur> optionalPhotoVoitureUtilisateur = photoVoitureUtilisateurRepository.findById(id);
        return optionalPhotoVoitureUtilisateur.get();
    }
    
    @Override
    public PhotoVoitureUtilisateur savePhotoVoitureUtilisateur(PhotoVoitureUtilisateur photoVoitureUtilisateur) {
        return photoVoitureUtilisateurRepository.save(photoVoitureUtilisateur);
    }

    @Override
    public PhotoVoitureUtilisateur updatePhotoVoitureUtilisateur(PhotoVoitureUtilisateur photoVoitureUtilisateur){
        PhotoVoitureUtilisateur existingPhotoVoitureUtilisateur = photoVoitureUtilisateurRepository.findById(photoVoitureUtilisateur.getIdPhotovoitureutilisateur()).get();
        existingPhotoVoitureUtilisateur.setNomPhoto(photoVoitureUtilisateur.getNomPhoto());
        existingPhotoVoitureUtilisateur.setIdVoitureUtilisateur(photoVoitureUtilisateur.getIdVoitureUtilisateur());
        PhotoVoitureUtilisateur updatedTypeDeVehicule = photoVoitureUtilisateurRepository.save(existingPhotoVoitureUtilisateur);
        return updatedTypeDeVehicule;
    } 
    
    @Override
    public void deletePhotoVoitureUtilisateurById(int id) {
        photoVoitureUtilisateurRepository.deleteById(id);
    }

    @Override
    public List<PhotoVoitureUtilisateur> getPhotoVoitureUtilisateur(int idvoitureutilisateur){
        return photoVoitureUtilisateurRepository.getPhotoVoitureUtilisateur(idvoitureutilisateur);
    }
    
}
