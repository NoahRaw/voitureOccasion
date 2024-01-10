package com.voiture.voiture.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.*;
import com.voiture.voiture.repository.ModeleRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModeleServiceImplement implements ModeleService{

    private final ModeleRepository voitureRepository;
    
    @Override
    public Modele Creer(Modele voiture){
        return voitureRepository.save(voiture);
    }

    @Override
    public List<Modele> Lire() {
        return voitureRepository.findAll();
    }

    @Override
    public Modele Modifier(Integer Id, Modele voiture) {
        return voitureRepository.findById(Id).map(
            p->{
                p.setIdmodele(voiture.getIdmodele());
                p.setDescription(voiture.getDescription());
                return voitureRepository.save(p);
            }
        ).orElseThrow(() -> new RuntimeException("Ce modele n'existe pas") );
    }

    @Override
    public String Supprimer(Integer Id) {
        voitureRepository.deleteById(Id);
        return "Voiture supprimer";
    }
}