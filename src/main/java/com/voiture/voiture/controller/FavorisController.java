package com.voiture.voiture.controller;

import com.voiture.voiture.modele.AnnonceFavoris;
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
    public AnnonceFavoris create(@RequestBody AnnonceFavoris annonceFavoris){
        return favorisService.insertFavoris(annonceFavoris);
    }

    @GetMapping("/read")
    public List<AnnonceFavoris> read(){
        return favorisService.getAllFavoris();
    }

    @PostMapping("/delete/{idFavoris}")
    public void delete(@PathVariable int idFavoris){
        favorisService.deleteFavorisById(idFavoris);
    }
}
