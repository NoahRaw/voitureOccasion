package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Utilisateurrevenue;
import com.voiture.voiture.modele.view.V_vente;
import com.voiture.voiture.repository.UtilisateurRepository;
import com.voiture.voiture.service.BoiteDeVitesseService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/Statistique")
@AllArgsConstructor
@CrossOrigin
public class StatistiqueController {

    
    @Autowired
    private UtilisateurRepository up;
    
    private final BoiteDeVitesseService boiteDeVitesseService;

    V_vente v= new V_vente();

    @GetMapping("/utilisateur")
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
    @GetMapping("/vente")
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

    @GetMapping("/revenueUtilisateur")
    public List<Utilisateurrevenue> statistiqueUtilisateurRevenue(
            @RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,
            @RequestParam("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin
    ) {
        return boiteDeVitesseService.statistiqueUtilisateurRevenue(dateDebut, dateFin);
    }

}