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
@RequestMapping("/photoVoitureUtilisateurs")
@AllArgsConstructor
@CrossOrigin
public class PhotoVoitureUtilisateurController {

    @Autowired
    private PhotoVoitureUtilisateurService photoVoitureUtilisateurService;

    @GetMapping
    public List<PhotoVoitureUtilisateur> getAllPhotosVoitureUtilisateur() {
        return photoVoitureUtilisateurService.getAllPhotosVoitureUtilisateur();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhotoVoitureUtilisateur> getPhotoVoitureUtilisateurById(@PathVariable Integer id) {
        PhotoVoitureUtilisateur photoVoitureUtilisateur = photoVoitureUtilisateurService.getPhotoVoitureUtilisateurById(id);
        return new ResponseEntity<>(photoVoitureUtilisateur, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PhotoVoitureUtilisateur> savePhotoVoitureUtilisateur(@RequestBody PhotoVoitureUtilisateur photoVoitureUtilisateur) {
        PhotoVoitureUtilisateur add= photoVoitureUtilisateurService.savePhotoVoitureUtilisateur(photoVoitureUtilisateur);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhotoVoitureUtilisateur> updatePhotoVoitureUtilisateur(@PathVariable("id") Integer id,@RequestBody PhotoVoitureUtilisateur photoVoitureUtilisateur){
         photoVoitureUtilisateur.setIdPhotovoitureutilisateur(id);
         PhotoVoitureUtilisateur update = photoVoitureUtilisateurService.updatePhotoVoitureUtilisateur(photoVoitureUtilisateur);
         return new ResponseEntity<>(update, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePhotoVoitureUtilisateurById(@PathVariable Integer id) {
        photoVoitureUtilisateurService.deletePhotoVoitureUtilisateurById(id);
        return new ResponseEntity<>("PhotoVoitureUtilisateur successfully deleted!", HttpStatus.OK);
        
    }
    
    @GetMapping("getPhotoVoitureUtilisateur/{idvoitureutilisateur}")
    public List<PhotoVoitureUtilisateur> getPhotoVoitureUtilisateur(@PathVariable Integer idvoitureutilisateur){
        return photoVoitureUtilisateurService.getPhotoVoitureUtilisateur(idvoitureutilisateur);
    }
}

