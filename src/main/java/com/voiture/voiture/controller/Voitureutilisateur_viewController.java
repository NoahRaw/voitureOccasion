package com.voiture.voiture.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.MyToken;
import com.voiture.voiture.modele.Voitureutilisateur_view;
import com.voiture.voiture.service.AnnonceFavorisViewService;
import com.voiture.voiture.service.MyTokenService;


@RestController
@RequestMapping("/Voitureutilisateur_view")
@CrossOrigin
public class Voitureutilisateur_viewController {
    
    private final MyTokenService myTokenService;

    public Voitureutilisateur_viewController(MyTokenService myTokenService) {
        this.myTokenService =myTokenService;
    }
    
    @GetMapping
    public List<Voitureutilisateur_view> read() throws Exception{
        Voitureutilisateur_view v = new Voitureutilisateur_view(); 
        return v.getAllVoitureUtilisateutNonVendu(null);
    }

    @GetMapping("/voitureNonConfirmer")
    public List<Voitureutilisateur_view> voitureNonConfirmer() throws Exception{
        Voitureutilisateur_view v = new Voitureutilisateur_view(); 
        return v.getAllVoitureUtilisateutNonConfirmer(null);
    }

    @GetMapping("/rechercheMultiple")
    public List<Voitureutilisateur_view> rechercheMultiple(@RequestBody Voitureutilisateur_view v,@RequestParam double prixmin,@RequestParam double prixmax) throws Exception{
        return v.rechercheMultiple(null,prixmin,prixmax);
    }

    @GetMapping("/getHistoriqueAnnonce/{idutilisateur}")
    public List<Voitureutilisateur_view> getHistoriqueAnnonce(@PathVariable Integer idutilisateur) throws Exception{
        Voitureutilisateur_view v = new Voitureutilisateur_view();
        return v.getHistoriqueAnnonce(null,idutilisateur);
    }

    
    @PostMapping("/annonce/{idUtilisateur}")
    public List<Voitureutilisateur_view> get_annonce_autre_utilisateur(@PathVariable Integer idUtilisateur) throws Exception{
        Voitureutilisateur_view v = new Voitureutilisateur_view(); 
        return v.get_annonce_autre_utilisateur(null,idUtilisateur);
    }

    @GetMapping("/ces_annonces")
    public ResponseEntity<List<Voitureutilisateur_view>> get_liste_de_ces_annonces(HttpServletRequest request) throws Exception{
        MyToken token=myTokenService.getToken(request);
        if(token!=null){
            Voitureutilisateur_view v = new Voitureutilisateur_view(); 
            return ResponseEntity.ok(v.get_liste_de_ces_annonces(null,token.getIdutilisateur()));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

}
