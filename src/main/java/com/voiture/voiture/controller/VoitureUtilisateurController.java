package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Voitureutilisateur;
import com.voiture.voiture.service.VoitureUtilisateurService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/VoitureUtilisateur")
@CrossOrigin
public class VoitureUtilisateurController {
    private final VoitureUtilisateurService voitureUtilisateurService;

    @Autowired
    public VoitureUtilisateurController(VoitureUtilisateurService voitureUtilisateurService){
        this.voitureUtilisateurService = voitureUtilisateurService;
    }

    @PostMapping("/create")
    public Voitureutilisateur create(@RequestBody Voitureutilisateur voitureUtilisateur){
        return this.voitureUtilisateurService.insertion(voitureUtilisateur);
    }

    @PostMapping("/liste")
    public List<Voitureutilisateur> getListeVoitureUtilisateur(){ 
        return this.voitureUtilisateurService.listeVoitureUtilisateur();
    }

    @PostMapping("/updateVoitureUtilisateur/{idVoitureUtilisateur}")
    public Voitureutilisateur updateVoitureUtilisateur(@PathVariable int idVoitureUtilisateur,@RequestBody Voitureutilisateur modifier){
        return this.voitureUtilisateurService.update(idVoitureUtilisateur, modifier);
    }

    @PostMapping("/deleteVoitureUtilisateur/{idVoitureUtilisateur}")
    public void deleteVoitureUtilisateur(@PathVariable int idVoitureUtilisateur){
        this.voitureUtilisateurService.delete(idVoitureUtilisateur);
    }

    @PostMapping("/validation/{idutilisateur}")
    public void validation(@PathVariable int idutilisateur){ 
        this.voitureUtilisateurService.validation(11,idutilisateur);
    }
}
