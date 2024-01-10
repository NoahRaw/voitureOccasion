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

import com.voiture.voiture.modele.Puissance;
import com.voiture.voiture.service.PuissanceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Puissance")
@AllArgsConstructor
@CrossOrigin
public class PuissanceController {
    private final PuissanceService PuissanceService;

    @PostMapping
    public Puissance create(@RequestBody Puissance Puissance){
        return PuissanceService.Creer(Puissance) ;
    }

    @GetMapping
    public List<Puissance> read(){
        return PuissanceService.Lire();
    }

    @PutMapping("/{Id}")
    public Puissance update(@PathVariable Integer Id,@RequestBody Puissance Puissance){
        return PuissanceService.Modifier(Id, Puissance);
    }

    @DeleteMapping("/{Id}")
    public String delete(@PathVariable Integer Id){
        return PuissanceService.Supprimer(Id);
    }
}