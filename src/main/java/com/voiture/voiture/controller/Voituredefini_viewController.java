package com.voiture.voiture.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.Marque;
import com.voiture.voiture.modele.Voituredefini_view;
import com.voiture.voiture.service.Voituredefini_viewService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Voituredefini_view")
@AllArgsConstructor
@CrossOrigin
public class Voituredefini_viewController {
    private final Voituredefini_viewService voituredefini_viewService;

    @GetMapping
    public List<Voituredefini_view> read(){
        return voituredefini_viewService.listeVoitureDefini();
    }



    @PostMapping("/recherche_colonne_voiture")
    public List<Voituredefini_view> get_voiture_defini(@RequestBody Voituredefini_view voiture_defini) throws Exception{
        return voiture_defini.get_voiture_defini(null);
    }
}
