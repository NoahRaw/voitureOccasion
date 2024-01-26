package com.voiture.voiture.controller;

import com.voiture.voiture.modele.AnnonceFavoris;
import com.voiture.voiture.modele.MyToken;
import com.voiture.voiture.service.FavorisService;
import com.voiture.voiture.service.MyTokenService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Favoris")
@CrossOrigin
public class FavorisController {
    private final FavorisService favorisService;
    private final MyTokenService myTokenService;

    public FavorisController(FavorisService favorisService,MyTokenService myTokenService) {
        this.favorisService = favorisService;
        this.myTokenService = myTokenService;
    }

    @PostMapping
    public ResponseEntity<AnnonceFavoris> create(@RequestBody AnnonceFavoris annonceFavoris,HttpServletRequest request){
        MyToken token=myTokenService.getToken(request);
        if(token!=null){
            return ResponseEntity.ok(favorisService.insertFavoris(annonceFavoris));
        }
        // Retourner une réponse avec un statut non autorisé (401) en cas de token non valide
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

    @GetMapping
    public List<AnnonceFavoris> read(){
        return favorisService.getAllFavoris();
    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable Integer Id){
        favorisService.deleteFavorisById(Id);
    }
}
