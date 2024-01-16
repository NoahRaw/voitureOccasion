package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Vuestatistiquevente;
import com.voiture.voiture.service.VuestatistiqueventeService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @PostMapping("/findByStatVenteUserBy2Date")
//    public List<Vuestatistiquevente> findByStatVenteUserBy2Date(@RequestParam Date date1, @RequestParam Date date2) {
//        return vuestatistiqueventeService.findByStatVenteUserBy2Date(date1, date2);
//    }
    public List<Vuestatistiquevente> findByStatVenteUserBy2Date(
            @RequestParam("date1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
            @RequestParam("date2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {
        return vuestatistiqueventeService.findByStatVenteUserBy2Date(date1, date2);
    }
}
