package com.voiture.voiture.controller;

import com.voiture.voiture.modele.AnnonceFavorisView;
import com.voiture.voiture.modele.MyToken;
import com.voiture.voiture.service.AnnonceFavorisViewService;
import com.voiture.voiture.service.MyTokenService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/AnnonceFavorisView")
@CrossOrigin
public class AnnonceFavorisViewController {
    private final AnnonceFavorisViewService annonceFavorisViewService;
    private final MyTokenService myTokenService;

    public AnnonceFavorisViewController(AnnonceFavorisViewService annonceFavorisViewService,MyTokenService myTokenService) {
        this.annonceFavorisViewService = annonceFavorisViewService;
        this.myTokenService =myTokenService;
    }

    @GetMapping("/read")
    public List<AnnonceFavorisView> read(){
        return annonceFavorisViewService.getAllAnnonceFavorisView();
    }

    @GetMapping("/findAnnonceFavorisByIdUser/{idutilisateur}")
    public ResponseEntity<List<AnnonceFavorisView>> findAnnonceFavorisByIdUser(@PathVariable int idutilisateur,HttpServletRequest request){
        MyToken token=myTokenService.getToken(request);
        if(token!=null){
            return ResponseEntity.ok(annonceFavorisViewService.findAnnonceFavorisByIdUser(idutilisateur));
        }

        // Retourner une réponse avec un statut non autorisé (401) en cas de token non valide
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }
}
