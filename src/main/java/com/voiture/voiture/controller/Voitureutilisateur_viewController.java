package com.voiture.voiture.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Voitureutilisateur_view;


@RestController
@RequestMapping("/Voitureutilisateur_view")
@CrossOrigin
public class Voitureutilisateur_viewController {
    
    @GetMapping
    public List<Voitureutilisateur_view> read() throws Exception{
        Voitureutilisateur_view v = new Voitureutilisateur_view(); 
        return v.getAllVoitureUtilisateutNonVendu(null);
    }

    @GetMapping("/rechercheMultiple/{prixmin}/{prixmax}")
    public List<Voitureutilisateur_view> rechercheMultiple(@RequestBody Voitureutilisateur_view v,@PathVariable double prixmin,@PathVariable double prixmax) throws Exception{
        return v.rechercheMultiple(null,prixmin,prixmax);
    }
    
    @PostMapping("/annonce/{idUtilisateur}")
    public List<Voitureutilisateur_view> get_annonce_autre_utilisateur(@PathVariable int idUtilisateur) throws Exception{
        Voitureutilisateur_view v = new Voitureutilisateur_view(); 
        return v.get_annonce_autre_utilisateur(null,idUtilisateur);
    }
}
