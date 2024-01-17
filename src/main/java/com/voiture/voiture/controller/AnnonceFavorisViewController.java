package com.voiture.voiture.controller;

import com.voiture.voiture.modele.AnnonceFavorisView;
import com.voiture.voiture.service.AnnonceFavorisViewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AnnonceFavorisView")
@CrossOrigin
public class AnnonceFavorisViewController {
    private final AnnonceFavorisViewService annonceFavorisViewService;

    public AnnonceFavorisViewController(AnnonceFavorisViewService annonceFavorisViewService) {
        this.annonceFavorisViewService = annonceFavorisViewService;
    }

    @GetMapping("/read")
    public List<AnnonceFavorisView> read(){
        return annonceFavorisViewService.getAllAnnonceFavorisView();
    }

    @GetMapping("/findAnnonceFavorisByIdUser/{idutilisateur}")
    public List<AnnonceFavorisView> findAnnonceFavorisByIdUser(@PathVariable int idutilisateur){
        return annonceFavorisViewService.findAnnonceFavorisByIdUser(idutilisateur);
    }
}
