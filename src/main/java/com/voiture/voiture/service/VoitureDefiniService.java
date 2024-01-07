package com.voiture.voiture.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.VoitureDefini;
import com.voiture.voiture.repository.VoitureDefiniRepository;

@Service
public class VoitureDefiniService {
    private final VoitureDefiniRepository voitureDefiniRepository;

    public VoitureDefiniService(VoitureDefiniRepository voitureDefiniRepository){
        this.voitureDefiniRepository = voitureDefiniRepository;
    }

    public VoitureDefini insertion(VoitureDefini voitureDefini){
        return this.voitureDefiniRepository.save(voitureDefini);
    } 

    public List<VoitureDefini> listeVoitureDefini(){
        return this.voitureDefiniRepository.findAll();
    }


    public VoitureDefini update(int idVoitureDefini,VoitureDefini modifier){
        return this.voitureDefiniRepository.findById(idVoitureDefini).map(
            VoitureDefini ->{
                VoitureDefini.setIdVoitureDefini(modifier.getIdVoitureDefini());
                VoitureDefini.setIdMarque(modifier.getIdMarque());
                VoitureDefini.setIdModele(modifier.getIdModele());
                VoitureDefini.setIdCarburant(modifier.getIdCarburant());
                VoitureDefini.setIdPuissance(modifier.getIdPuissance());
                VoitureDefini.setIdboiteDeVitesse(modifier.getIdboiteDeVitesse());
                VoitureDefini.setIdTypeDeVehicule(modifier.getIdTypeDeVehicule());
                VoitureDefini.setNbrPorte(modifier.getNbrPorte());
                VoitureDefini.setPuissance(modifier.getPuissance());
                return voitureDefiniRepository.save(VoitureDefini);
            }
        ).orElseThrow(() -> new RuntimeException("VoitureDefini pas trouver"));
    }

    public void delete(int idVoitureDefini){
        this.voitureDefiniRepository.deleteById(idVoitureDefini);
    }
}
