package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Utilisateur;
import com.voiture.voiture.service.UtilisateurService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Utilisateurs")
@CrossOrigin
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }

    @PostMapping
    public Utilisateur create(@RequestBody Utilisateur vehicule){
        return this.utilisateurService.insertion(vehicule);
    }

    @GetMapping
    public List<Utilisateur> getListeUtilisateur(){ 
        return this.utilisateurService.listeUtilisateur();
    }

    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable int id,@RequestBody Utilisateur modifier){
        return this.utilisateurService.update(id, modifier);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable int idUtilisateur){
        this.utilisateurService.delete(idUtilisateur);
    }
}
