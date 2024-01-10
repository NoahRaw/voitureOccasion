package com.voiture.voiture.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Boitedevitesse;
import com.voiture.voiture.modele.Utilisateurrevenue;
import com.voiture.voiture.service.BoiteDeVitesseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Boitedevitesse")
@AllArgsConstructor
@CrossOrigin
public class BoitedevitesseController {
    private final BoiteDeVitesseService boiteDeVitesseService;

    @PostMapping
    public Boitedevitesse create(@RequestBody Boitedevitesse boitedevitesse){
        return boiteDeVitesseService.Creer(boitedevitesse) ;
    }

    @GetMapping
    public List<Boitedevitesse> read(){
        return boiteDeVitesseService.Lire();
    }

    @PutMapping("/{Id}")
    public Boitedevitesse update(@PathVariable Integer Id,@RequestBody Boitedevitesse boitedevitesse){
        return boiteDeVitesseService.Modifier(Id, boitedevitesse);
    }

    @DeleteMapping("/{Id}")
    public String delete(@PathVariable Integer Id){
        return boiteDeVitesseService.Supprimer(Id);
    }

    // @GetMapping("/statistiqueUtilisateurRevenue")
    // public List<Utilisateurrevenue> statistiqueUtilisateurRevenue(){
    //     return boiteDeVitesseService.statistiqueUtilisateurRevenue();
    // }

    @GetMapping("/utilisateur-revenue")
    public List<Utilisateurrevenue> statistiqueUtilisateurRevenue(
            @RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,
            @RequestParam("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin
    ) {
        return boiteDeVitesseService.statistiqueUtilisateurRevenue(dateDebut, dateFin);
    }
}