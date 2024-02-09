package com.voiture.voiture.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;
import com.voiture.voiture.modele.Voitureutilisateur;
import com.voiture.voiture.service.ImgBBService;
import com.voiture.voiture.service.MyTokenService;
import com.voiture.voiture.service.PhotoVoitureUtilisateurService;
import com.voiture.voiture.service.VoitureUtilisateurService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.voiture.voiture.modele.Annonce;
import com.voiture.voiture.modele.MyToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RequestPart;

@RestController
@RequestMapping("/VoitureUtilisateurs")
@CrossOrigin    
public class VoitureUtilisateurController {


    private final VoitureUtilisateurService voitureUtilisateurService;
        private final MyTokenService myTokenService;

    @Autowired
    private PhotoVoitureUtilisateurService photoVoitureUtilisateurService;

    private ImgBBService imgBBService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    public VoitureUtilisateurController(VoitureUtilisateurService voitureUtilisateurService,MyTokenService myTokenService,ImgBBService imgBBService){
        this.voitureUtilisateurService = voitureUtilisateurService;
        this.myTokenService =myTokenService;
        this.imgBBService = imgBBService;
    }

    @PostMapping
    public ResponseEntity<Voitureutilisateur> create(@RequestBody Voitureutilisateur voitureUtilisateur,HttpServletRequest request){
        MyToken token=myTokenService.getToken(request);
        if(token!=null){
            return  ResponseEntity.ok(this.voitureUtilisateurService.insertion(voitureUtilisateur));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

    @GetMapping
    public List<Voitureutilisateur> getListeVoitureUtilisateur(){ 
        return this.voitureUtilisateurService.listeVoitureUtilisateur();
    }

    @PutMapping("/{id}")
    public Voitureutilisateur updateVoitureUtilisateur(@PathVariable Integer id,@RequestBody Voitureutilisateur modifier){
        return this.voitureUtilisateurService.update(id, modifier);
    }

    @DeleteMapping("/{id}")
    public void deleteVoitureUtilisateur(@PathVariable Integer id){
        this.voitureUtilisateurService.delete(id);
    }

    @PostMapping("/validation/{idvoitureutilisateur}")
    public void validation(@PathVariable Integer idvoitureutilisateur){ 
        this.voitureUtilisateurService.validation(1,idvoitureutilisateur);
    }

@PostMapping("/createAnnonce")
public ResponseEntity<Voitureutilisateur> createAnnonce(@RequestPart("annonceRequest") Voitureutilisateur annonceRequest,@RequestPart("files") List<MultipartFile> response,HttpServletRequest request) throws IOException {
    MyToken token=myTokenService.getToken(request);


    if(token != null){
        annonceRequest.setIdutilisateur(token.getIdutilisateur());
        annonceRequest.setStatut(0);
        Voitureutilisateur voitureUtilc = voitureUtilisateurService.insertion(annonceRequest);
        PhotoVoitureUtilisateur photoVU = null;
        Integer idVoitureUtilc = voitureUtilc.getIdvoitureutilisateur();
        

        for (MultipartFile file : response) {
            System.out.println("--------------------------------------------file : "+file.getName());
            photoVU = new PhotoVoitureUtilisateur();
            photoVU.setIdVoitureUtilisateur(idVoitureUtilc);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(this.imgBBService.uploadImages(file));

            if (jsonNode.has("data")) {
                JsonNode dataNode = jsonNode.get("data");
                if (dataNode.has("display_url")) {
                    photoVU.setNomPhoto(dataNode.get("display_url").asText());
                }
            }
            photoVoitureUtilisateurService.savePhotoVoitureUtilisateur(photoVU);
        }
        return new ResponseEntity<>(voitureUtilc, HttpStatus.CREATED);
    }

    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
}


    @PostMapping("/vendu/{idvoitureutilisateur}")
    public ResponseEntity<Boolean> vendu(@PathVariable int idvoitureutilisateur,HttpServletRequest request){ 
        MyToken token=myTokenService.getToken(request);
        if(token!=null){
            long timestamp_aujourdhui = System.currentTimeMillis();
        Date date = new Date(timestamp_aujourdhui);
            this.voitureUtilisateurService.vendu(2,date,idvoitureutilisateur);
            return ResponseEntity.ok(true);
            
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }
}
