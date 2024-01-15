package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Marque;
import com.voiture.voiture.service.MarqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Marque")
@CrossOrigin
public class MarqueController {
    private final MarqueService marqueService;

    public MarqueController(MarqueService marqueService) {
        this.marqueService = marqueService;
    }

    @PostMapping("/create")
    public Marque create(@RequestBody Marque marque){
        return marqueService.insertMarque(marque);
    }

    @PostMapping("/read")
    public List<Marque> read(){
        return marqueService.getAllMarque();
    }

    @PostMapping("/read/{idMarque}")
    public Marque readById(@PathVariable int idMarque){
        return marqueService.getMarqueById(idMarque);
    }

    @PostMapping("/update/{idMarque}")
    public Marque update(@PathVariable int idMarque, @RequestBody Marque marque){
        return marqueService.update(idMarque, marque);
    }

    @PostMapping("/delete/{idMarque}")
    public void delete(@PathVariable int idMarque){
        marqueService.deleteMarqueById(idMarque);
    }
}
