package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;
import com.voiture.voiture.modele.Voitureutilisateur;
import com.voiture.voiture.service.PhotoVoitureUtilisateurService;
import com.voiture.voiture.service.VoitureUtilisateurService;
import com.voiture.voiture.modele.Annonce;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/VoitureUtilisateurs")
@CrossOrigin    
public class VoitureUtilisateurController {


    private final VoitureUtilisateurService voitureUtilisateurService;
    @Autowired
    private PhotoVoitureUtilisateurService photoVoitureUtilisateurService;

    @Autowired
    public VoitureUtilisateurController(VoitureUtilisateurService voitureUtilisateurService){
        this.voitureUtilisateurService = voitureUtilisateurService;
    }

    @PostMapping
    public Voitureutilisateur create(@RequestBody Voitureutilisateur voitureUtilisateur){
        return this.voitureUtilisateurService.insertion(voitureUtilisateur);
    }

    @GetMapping
    public List<Voitureutilisateur> getListeVoitureUtilisateur(){ 
        return this.voitureUtilisateurService.listeVoitureUtilisateur();
    }

    @PutMapping("/{id}")
    public Voitureutilisateur updateVoitureUtilisateur(@PathVariable int id,@RequestBody Voitureutilisateur modifier){
        return this.voitureUtilisateurService.update(id, modifier);
    }

    @DeleteMapping("/{id}")
    public void deleteVoitureUtilisateur(@PathVariable int id){
        this.voitureUtilisateurService.delete(id);
    }

    @PostMapping("/validation/{idvoitureutilisateur}")
    public void validation(@PathVariable int idvoitureutilisateur){ 
        this.voitureUtilisateurService.validation(1,idvoitureutilisateur);
    }

@PostMapping("/createAnnonce")
public ResponseEntity<Voitureutilisateur> createAnnonce(@RequestBody Annonce annonceRequest) {
    Voitureutilisateur voitureUtilc = voitureUtilisateurService.insertion(annonceRequest.getVoitureUtilisateur());
    PhotoVoitureUtilisateur photoVU = null;
    int idVoitureUtilc = voitureUtilc.getIdvoitureutilisateur();
    // 
    for (int i = 0; i < annonceRequest.getPhoto().length; i++) {
        photoVU = new PhotoVoitureUtilisateur();
        photoVU.setIdVoitureUtilisateur(idVoitureUtilc);
        photoVU.setNomPhoto(annonceRequest.getPhoto()[i]);
        photoVoitureUtilisateurService.savePhotoVoitureUtilisateur(photoVU);
    }

    return new ResponseEntity<>(voitureUtilc, HttpStatus.CREATED);
}


    @PostMapping("/vendu/{idvoitureutilisateur}")
    public void vendu(@PathVariable int idvoitureutilisateur){ 
        Date aujourdhui = new Date();
        this.voitureUtilisateurService.vendu(2,aujourdhui,idvoitureutilisateur);
    }
}
