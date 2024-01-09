package com.voiture.voiture.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.Puissance;
import com.voiture.voiture.repository.PuissanceRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PuissanceServiceImplement implements PuissanceService{

    private final PuissanceRepository voitureRepository;
    
    @Override
    public Puissance Creer(Puissance voiture){
        return voitureRepository.save(voiture);
    }

    @Override
    public List<Puissance> Lire() {
        return voitureRepository.findAll();
    }

    @Override
    public Puissance Modifier(Integer Id, Puissance voiture) {
        return voitureRepository.findById(Id).map(
            p->{
                p.setIdpuissance(voiture.getIdpuissance());
                p.setCv(voiture.getCv());
                p.setKw(voiture.getKw());
                return voitureRepository.save(p);
            }
        ).orElseThrow(() -> new RuntimeException("Ce Puissance n'existe pas") );
    }

    @Override
    public String Supprimer(Integer Id) {
        voitureRepository.deleteById(Id);
        return "Voiture supprimer";
    }
}