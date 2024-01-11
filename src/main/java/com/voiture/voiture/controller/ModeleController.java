package com.voiture.voiture.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Modele;
import com.voiture.voiture.service.ModeleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Modele")
@AllArgsConstructor
@CrossOrigin
public class ModeleController {
    private final ModeleService ModeleService;

    @PostMapping
    public Modele create(@RequestBody Modele modele){
        return ModeleService.Creer(modele) ;
    }

    @GetMapping
    public List<Modele> read(){
        return ModeleService.Lire();
    }

    @PutMapping("/{Id}")
    public Modele update(@PathVariable Integer Id,@RequestBody Modele modele){
        return ModeleService.Modifier(Id, modele);
    }

    @DeleteMapping("/{Id}")
    public String delete(@PathVariable Integer Id){
        return ModeleService.Supprimer(Id);
    }
}