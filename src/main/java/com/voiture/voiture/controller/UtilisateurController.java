package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Utilisateur;
import com.voiture.voiture.service.UtilisateurService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/create")
    public Utilisateur create(@RequestBody Utilisateur vehicule){
        return this.utilisateurService.insertion(vehicule);
    }

    @PostMapping("/liste")
    public List<Utilisateur> getListeUtilisateur(){ 
        return this.utilisateurService.listeUtilisateur();
    }

    @PostMapping("/updateUtilisateur/{idUtilisateur}")
    public Utilisateur updateUtilisateur(@PathVariable int idUtilisateur,@RequestBody Utilisateur modifier){
        return this.utilisateurService.update(idUtilisateur, modifier);
    }

    @PostMapping("/deleteUtilisateur/{idUtilisateur}")
    public void deleteUtilisateur(@PathVariable int idUtilisateur){
        this.utilisateurService.delete(idUtilisateur);
    }
}
