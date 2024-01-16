package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Favoris;
import com.voiture.voiture.service.FavorisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Favoris")
@CrossOrigin
public class FavorisController {
    private final FavorisService favorisService;

    public FavorisController(FavorisService favorisService) {
        this.favorisService = favorisService;
    }

    @PostMapping("/create")
    public Favoris create(@RequestBody Favoris favoris){
        return favorisService.insertFavoris(favoris);
    }

    @PostMapping("/read")
    public List<Favoris> read(){
        return favorisService.getAllFavoris();
    }

    @PostMapping("/delete/{idFavoris}")
    public void delete(@PathVariable int idFavoris){
        favorisService.deleteFavorisById(idFavoris);
    }
}
