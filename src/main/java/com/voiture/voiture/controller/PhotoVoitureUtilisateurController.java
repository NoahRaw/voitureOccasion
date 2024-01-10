package com.voiture.voiture.controller;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;
import com.voiture.voiture.modele.TypeDeVehicule;
import com.voiture.voiture.service.PhotoVoitureUtilisateurService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PhotoVoitureUtilisateurController {

    @Autowired
    private PhotoVoitureUtilisateurService photoVoitureUtilisateurService;

    @GetMapping("/photoVoitureUtilisateurs")
    public List<PhotoVoitureUtilisateur> getAllPhotosVoitureUtilisateur() {
        return photoVoitureUtilisateurService.getAllPhotosVoitureUtilisateur();
    }

    @GetMapping("/photoVoitureUtilisateurs/{id}")
    public ResponseEntity<PhotoVoitureUtilisateur> getPhotoVoitureUtilisateurById(@PathVariable int id) {
        PhotoVoitureUtilisateur photoVoitureUtilisateur = photoVoitureUtilisateurService.getPhotoVoitureUtilisateurById(id);
        return new ResponseEntity<>(photoVoitureUtilisateur, HttpStatus.OK);
    }

    @PostMapping("/photoVoitureUtilisateurs")
    public ResponseEntity<PhotoVoitureUtilisateur> savePhotoVoitureUtilisateur(@RequestBody PhotoVoitureUtilisateur photoVoitureUtilisateur) {
        PhotoVoitureUtilisateur add= photoVoitureUtilisateurService.savePhotoVoitureUtilisateur(photoVoitureUtilisateur);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/photoVoitureUtilisateurs/{id}")
    public ResponseEntity<PhotoVoitureUtilisateur> updatePhotoVoitureUtilisateur(@PathVariable("id") int id,@RequestBody PhotoVoitureUtilisateur photoVoitureUtilisateur){
         photoVoitureUtilisateur.setIdPhotovoitureutilisateur(id);
         PhotoVoitureUtilisateur update = photoVoitureUtilisateurService.updatePhotoVoitureUtilisateur(photoVoitureUtilisateur);
         return new ResponseEntity<>(update, HttpStatus.OK);
    }

    @DeleteMapping("/photoVoitureUtilisateurs/{id}")
    public ResponseEntity<String> deletePhotoVoitureUtilisateurById(@PathVariable int id) {
        photoVoitureUtilisateurService.deletePhotoVoitureUtilisateurById(id);
        return new ResponseEntity<>("PhotoVoitureUtilisateur successfully deleted!", HttpStatus.OK);
        
    }
    
}
