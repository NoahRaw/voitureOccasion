package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Voituredefini;
import com.voiture.voiture.service.VoitureDefiniService;

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
@RequestMapping("/VoitureDefinis")
@CrossOrigin
public class VoitureDefiniController {
    private final VoitureDefiniService voitureDefiniService;

    @Autowired
    public VoitureDefiniController(VoitureDefiniService voitureDefiniService){
        this.voitureDefiniService = voitureDefiniService;
    }

    @PostMapping
    public Voituredefini create(@RequestBody Voituredefini voitureDefini){
        return this.voitureDefiniService.insertion(voitureDefini);
    }

     @GetMapping
    public List<Voituredefini> getListeVoitureDefini(){ 
        return this.voitureDefiniService.listeVoitureDefini();
    }

    @PutMapping("/{id}")
    public Voituredefini updateVoitureDefini(@PathVariable Integer id,@RequestBody Voituredefini modifier){
        return this.voitureDefiniService.update(id, modifier);
    }

    @DeleteMapping("/{id}")
    public void deleteVoitureDefini(@PathVariable Integer id){
        this.voitureDefiniService.delete(id);
    }
}
