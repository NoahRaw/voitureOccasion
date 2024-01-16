package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.VoitureDefiniStatView;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/VoitureDefiniStatView")
@CrossOrigin
public class VoitureDefiniStatViewController {

    @GetMapping("/liste/{dateMin}/{dateMax}")
    public List<VoitureDefiniStatView> getListeVoitureDefiniStatView(@PathVariable String dateMin,@PathVariable String dateMax) throws Exception{ 
        VoitureDefiniStatView v = new VoitureDefiniStatView();
        return v.getVentetolal(null, dateMin, dateMax);
    }

}
