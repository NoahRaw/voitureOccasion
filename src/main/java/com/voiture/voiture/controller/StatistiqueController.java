package com.voiture.voiture.controller;

import com.voiture.voiture.modele.TypeDeVehicule;
import com.voiture.voiture.modele.view.V_vente;
import com.voiture.voiture.repository.TypeDeVehiculeRepository;
import com.voiture.voiture.repository.UtilisateurRepository;
import com.voiture.voiture.service.TypeDeVehiculeService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StatistiqueController {

    
    @Autowired
    private UtilisateurRepository up; 

    V_vente v= new V_vente();

    @GetMapping("/statUtilisateur")
    public long getAllTypesDeVehicule() {
        // return 100;
        return up.count();
    }

    // @GetMapping("/statVente")
    // public V_vente getVentetolal() {
    //     V_vente vente= new V_vente();
    //     try {
    //          vente=v.getVentetolal(null);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return vente;
    // }
    @GetMapping("/statVente")
    public V_vente getVentetolals(
            @RequestParam("dateDebut")  String dateDebut,
            @RequestParam("dateFin")  String dateFin) {
        V_vente vente= new V_vente();
        try {
             vente=v.getVentetolal(null,dateDebut,dateFin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vente;
    }

}