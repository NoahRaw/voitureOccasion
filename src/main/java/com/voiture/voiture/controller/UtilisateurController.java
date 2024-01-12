package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;

import com.voiture.voiture.modele.MyToken;
import com.voiture.voiture.modele.Utilisateur;
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

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService,MyTokenService myTokenService){
        this.utilisateurService = utilisateurService;
        this.myTokenService = myTokenService;
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
    public Utilisateur updateUtilisateur(@PathVariable int id,@RequestBody Utilisateur modifier){
        return this.utilisateurService.update(id, modifier);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable int idUtilisateur){
        this.utilisateurService.delete(idUtilisateur);
    }

    @GetMapping("/authenticate")
    public String authenticate(@RequestParam String login,@RequestParam String pwd) throws NoSuchAlgorithmException {
        if(utilisateurService.findByEmailAndMdp(login, pwd).isPresent()){
            // Récupérer la date et l'heure actuelles
            Date dateActuelle = new Date();

            // Ajouter une heure à la date actuelle
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateActuelle);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            Date dateHeureExpiration = calendar.getTime();

            // Générer une valeur (tu peux la générer comme tu veux)
            String token=MyTokenServiceIplement.generateToken(pwd, "/props");

            // Insérer le token avec la valeur, la date actuelle et la date d'expiration
            MyToken myToken = new MyToken();
            myToken.setValeur(token);
            myToken.setDateHeureExpiration(dateHeureExpiration);
            myTokenService.Creer(myToken);

            return token;
        }
		return "";
    }

    @GetMapping("/isTokenValide")
    public boolean isTokenValide(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String token=null;
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7); // Extrait le token
            // Utilisez le token
        }
        // Continuez votre logique de méthode
        Date dateActuelle = new Date();
        if(myTokenService.findByDateHeureExpirationAfterAndValeur(dateActuelle, token).isPresent()){
            // Ajouter une heure à la date actuelle
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateActuelle);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            Date dateHeureExpiration = calendar.getTime();

            // Insérer le token avec la valeur, la date actuelle et la date d'expiration
            MyToken myToken = new MyToken();
            myToken.setValeur(token);
            myToken.setDateHeureExpiration(dateHeureExpiration);
            myTokenService.Modifier(token, myToken);
            return true;
        }
        Optional<MyToken> myToken=myTokenService.findByDateHeureExpirationBeforeAndValeur(dateActuelle, token);
        if(myToken.isPresent()){
            MyToken monTokenObjet = myToken.get();
            myTokenService.Supprimer(monTokenObjet.getIdMyToken());
        }
        return false;
    }
}
