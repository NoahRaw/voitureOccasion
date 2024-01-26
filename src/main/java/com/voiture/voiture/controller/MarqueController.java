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

    @PostMapping
    public Marque create(@RequestBody Marque marque){
        return marqueService.insertMarque(marque);
    }

    @GetMapping
    public List<Marque> read(){
        return marqueService.getAllMarque();
    }

    @GetMapping("/{Id}")
    public Marque readById(@PathVariable Integer Id){
        return marqueService.getMarqueById(Id);
    }

    @PutMapping("/{Id}")
    public Marque update(@PathVariable Integer Id, @RequestBody Marque marque){
        return marqueService.update(Id, marque);
    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable Integer Id){
        marqueService.deleteMarqueById(Id);
    }
}
