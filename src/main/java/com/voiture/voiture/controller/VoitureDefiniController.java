package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.VoitureDefini;
import com.voiture.voiture.service.VoitureDefiniService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/VoitureDefini")
public class VoitureDefiniController {
    private final VoitureDefiniService voitureDefiniService;

    @Autowired
    public VoitureDefiniController(VoitureDefiniService voitureDefiniService){
        this.voitureDefiniService = voitureDefiniService;
    }

    @PostMapping("/create")
    public VoitureDefini create(@RequestBody VoitureDefini voitureDefini){
        return this.voitureDefiniService.insertion(voitureDefini);
    }

     @PostMapping("/liste")
    public List<VoitureDefini> getListeVoitureDefini(){ 
        return this.voitureDefiniService.listeVoitureDefini();
    }

    @PostMapping("/updateVoitureDefini/{idVoitureDefini}")
    public VoitureDefini updateVoitureDefini(@PathVariable int idVoitureDefini,@RequestBody VoitureDefini modifier){
        return this.voitureDefiniService.update(idVoitureDefini, modifier);
    }

    @PostMapping("/deleteVoitureDefini/{idVoitureDefini}")
    public void deleteVoitureDefini(@PathVariable int idVoitureDefini){
        this.voitureDefiniService.delete(idVoitureDefini);
    }
}
