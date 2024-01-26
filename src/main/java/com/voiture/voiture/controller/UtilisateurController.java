package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.MyToken;
import com.voiture.voiture.modele.Utilisateur;
import com.voiture.voiture.modele.Utilisateurrevenue;
import com.voiture.voiture.service.BoiteDeVitesseService;
import com.voiture.voiture.service.MyTokenService;
import com.voiture.voiture.service.MyTokenServiceIplement;
import com.voiture.voiture.service.UtilisateurService;

import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/Utilisateurs")
@CrossOrigin
public class UtilisateurController {
    private final UtilisateurService utilisateurService;
    private final MyTokenService myTokenService;
    private final BoiteDeVitesseService boiteDeVitesseService;

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService,MyTokenService myTokenService,BoiteDeVitesseService boiteDeVitesseService){
        this.utilisateurService = utilisateurService;
        this.myTokenService = myTokenService;
        this.boiteDeVitesseService=boiteDeVitesseService;
    }

    @PostMapping
    public Utilisateur create(@RequestBody Utilisateur vehicule){
        return this.utilisateurService.insertion(vehicule);
    }

    @GetMapping
    public List<Utilisateur> getListeUtilisateur(){ 
        return this.utilisateurService.listeUtilisateur();
    }

    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable Integer id,@RequestBody Utilisateur modifier){
        return this.utilisateurService.update(id, modifier);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Integer idUtilisateur){
        this.utilisateurService.delete(idUtilisateur);
    }

    @GetMapping("/authenticateAdmin")
    public String authenticate(@RequestParam String login,@RequestParam String pwd) throws NoSuchAlgorithmException {
        Optional<Utilisateur> u=utilisateurService.findByEmailAndMdp(login, pwd, 1);
        if(u.isPresent()){
            // Récupérer la date et l'heure actuelles
            Date dateActuelle = new Date();

            // Ajouter une heure à la date actuelle
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateActuelle);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            Date dateHeureExpiration = calendar.getTime();

            // Générer une valeur (tu peux la générer comme tu veux)
            String token=MyTokenServiceIplement.generateToken(pwd, login+pwd);

            // Insérer le token avec la valeur, la date actuelle et la date d'expiration
            MyToken myToken = new MyToken();
            myToken.setValeur(token);
            myToken.setDateHeureExpiration(dateHeureExpiration);
            myToken.setIdutilisateur(u.get().getIdutilisateur());
            myTokenService.Creer(myToken);

            return token;
        }
		return null;
    }

    @GetMapping("/authenticateSimpleUser")
    public ResponseEntity<String> authenticateSimpleUser(@RequestParam String login,@RequestParam String pwd) throws NoSuchAlgorithmException {
        Optional<Utilisateur> u=utilisateurService.findByEmailAndMdp(login, pwd, 0);
        if(u.isPresent()){
            // Récupérer la date et l'heure actuelles
            Date dateActuelle = new Date();

            // Ajouter une heure à la date actuelle
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateActuelle);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            Date dateHeureExpiration = calendar.getTime();

            // Générer une valeur (tu peux la générer comme tu veux)
            String token=MyTokenServiceIplement.generateToken(pwd, login+pwd);

            // Insérer le token avec la valeur, la date actuelle et la date d'expiration
            MyToken myToken = new MyToken();
            myToken.setValeur(token);
            myToken.setDateHeureExpiration(dateHeureExpiration);
            myToken.setIdutilisateur(u.get().getIdutilisateur());
            myTokenService.Creer(myToken);

            return ResponseEntity.ok(token);
        }
		// Retourner une réponse avec un statut non autorisé (401) en cas de token non valide
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

    @GetMapping("/isTokenValide")
    public boolean isTokenValide(HttpServletRequest request) {
        // MyToken token=myTokenService.getToken(request);
        return myTokenService.isTokenValide(request);
    }

    @GetMapping("/getToken")
    public MyToken getToken(HttpServletRequest request) {
        // MyToken token=myTokenService.getToken(request);
        return myTokenService.getToken(request);
    }

    @PostMapping("/deconnection")
    public void deconnection(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String token=null;
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7); // Extrait le token
            // Utilisez le token
        }
        // Continuez votre logique de méthode
        Date dateActuelle = new Date();
        Optional<MyToken> monTokenObjet=myTokenService.findByDateHeureExpirationAfterAndValeur(dateActuelle, token);
        if(monTokenObjet.isPresent()){
            myTokenService.Supprimer(monTokenObjet.get().getIdMyToken());
        }
    }

    @GetMapping("/revenue")
    public List<Utilisateurrevenue> statistiqueUtilisateurRevenue(
            @RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,
            @RequestParam("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin
    ) {
        return boiteDeVitesseService.statistiqueUtilisateurRevenue(dateDebut, dateFin);
    }
}
