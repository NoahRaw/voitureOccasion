package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.VoitureDefiniStatView;
import com.voiture.voiture.service.VoitureDefiniStatViewService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/VoitureDefiniStatView")
public class VoitureDefiniStatViewController {
    private final VoitureDefiniStatViewService voitureDefiniStatViewService;

    @Autowired
    public VoitureDefiniStatViewController(VoitureDefiniStatViewService voitureDefiniStatViewService){
        this.voitureDefiniStatViewService = voitureDefiniStatViewService;
    }

    @PostMapping("/liste")
    public List<VoitureDefiniStatView> getListeVoitureDefiniStatView(){ 
        return this.voitureDefiniStatViewService.listeVoitureDefiniStatView();
    }

}
