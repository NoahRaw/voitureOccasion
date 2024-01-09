package com.voiture.voiture.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.*;
import com.voiture.voiture.repository.BoitedevitesseRepository;
import com.voiture.voiture.repository.UtilisateurrevenueRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoiteDeVitesseServiceImplement implements BoiteDeVitesseService{

    private final BoitedevitesseRepository voitureRepository;
    private final UtilisateurrevenueRepository utilisateurRevenueRepository;
    
    @Override
    public Boitedevitesse Creer(Boitedevitesse voiture){
        return voitureRepository.save(voiture);
    }

    @Override
    public List<Boitedevitesse> Lire() {
        return voitureRepository.findAll();
    }

    @Override
    public Boitedevitesse Modifier(Integer Id, Boitedevitesse voiture) {
        return voitureRepository.findById(Id).map(
            p->{
                p.setIdboitedevitesse(voiture.getIdboitedevitesse());
                p.setDescription(voiture.getDescription());
                return voitureRepository.save(p);
            }
        ).orElseThrow(() -> new RuntimeException("Cette boitedevitesse n'existe pas") );
    }

    @Override
    public String Supprimer(Integer Id) {
        voitureRepository.deleteById(Id);
        return "Voiture supprimer";
    }

    @Override
    public List<Utilisateurrevenue> statistiqueUtilisateurRevenue(Date dateDebut,Date dateFin) {
        // TODO Auto-generated method stub
        return utilisateurRevenueRepository.statistiqueUtilisateurRevenue(dateDebut,dateFin);
    }
}