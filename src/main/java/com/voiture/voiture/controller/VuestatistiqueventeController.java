package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Vuestatistiquevente;
import com.voiture.voiture.service.VuestatistiqueventeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vuestatistiquevente")
@CrossOrigin
public class VuestatistiqueventeController {
    private  final VuestatistiqueventeService vuestatistiqueventeService;

    public VuestatistiqueventeController(VuestatistiqueventeService vuestatistiqueventeService) {
        this.vuestatistiqueventeService = vuestatistiqueventeService;
    }

    @PostMapping("/read")
    public List<Vuestatistiquevente> read(){
        return  vuestatistiqueventeService.getAllVuestatistiquevente();
    }

    @PostMapping("/read/{idUtilisateur}")
    public Vuestatistiquevente readByIdUtilisateur(@PathVariable int idUtilisateur){
        return vuestatistiqueventeService.getVuestatistiqueventeByIdUtilisateur(idUtilisateur);
    }

//    @PostMapping("/findByEmailAndNombreDeVentesGreaterThan")
//    public List<Vuestatistiquevente> findByEmailAndNombreDeVentesGreaterThan(@RequestParam String email, @RequestParam int nombreVentes) {
//        return vuestatistiqueventeService.findByEmailAndNombreDeVentesGreaterThan(email, nombreVentes);
//    }
}
