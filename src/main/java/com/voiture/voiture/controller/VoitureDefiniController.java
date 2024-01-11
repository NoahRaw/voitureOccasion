package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Voituredefini;
import com.voiture.voiture.service.VoitureDefiniService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/VoitureDefini")
@CrossOrigin
public class VoitureDefiniController {
    private final VoitureDefiniService voitureDefiniService;

    @Autowired
    public VoitureDefiniController(VoitureDefiniService voitureDefiniService){
        this.voitureDefiniService = voitureDefiniService;
    }

    @PostMapping("/create")
    public Voituredefini create(@RequestBody Voituredefini voitureDefini){
        return this.voitureDefiniService.insertion(voitureDefini);
    }

     @PostMapping("/liste")
    public List<Voituredefini> getListeVoitureDefini(){ 
        return this.voitureDefiniService.listeVoitureDefini();
    }

    @PostMapping("/updateVoitureDefini/{idVoitureDefini}")
    public Voituredefini updateVoitureDefini(@PathVariable int idVoitureDefini,@RequestBody Voituredefini modifier){
        return this.voitureDefiniService.update(idVoitureDefini, modifier);
    }

    @PostMapping("/deleteVoitureDefini/{idVoitureDefini}")
    public void deleteVoitureDefini(@PathVariable int idVoitureDefini){
        this.voitureDefiniService.delete(idVoitureDefini);
    }
}
