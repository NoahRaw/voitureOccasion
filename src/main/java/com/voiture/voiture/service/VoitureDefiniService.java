package com.voiture.voiture.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.Voituredefini;
import com.voiture.voiture.repository.VoitureDefiniRepository;

@Service
public class VoitureDefiniService {
    private final VoitureDefiniRepository voitureDefiniRepository;

    public VoitureDefiniService(VoitureDefiniRepository voitureDefiniRepository){
        this.voitureDefiniRepository = voitureDefiniRepository;
    }

    public Voituredefini insertion(Voituredefini voitureDefini){
        return this.voitureDefiniRepository.save(voitureDefini);
    } 

    public List<Voituredefini> listeVoitureDefini(){
        return this.voitureDefiniRepository.findAll();
    }


    public Voituredefini update(int idVoitureDefini,Voituredefini modifier){
        return this.voitureDefiniRepository.findById(idVoitureDefini).map(
            VoitureDefini ->{
                VoitureDefini.setIdmarque(modifier.getIdmarque());
                VoitureDefini.setIdmodele(modifier.getIdmodele());
                VoitureDefini.setIdcarburant(modifier.getIdcarburant());
                VoitureDefini.setIdpuissance(modifier.getIdpuissance());
                VoitureDefini.setIdboitedevitesse(modifier.getIdboitedevitesse());
                VoitureDefini.setIdtypedevehicule(modifier.getIdtypedevehicule());
                VoitureDefini.setNbrporte(modifier.getNbrporte());
                VoitureDefini.setPuissance(modifier.getPuissance());
                return voitureDefiniRepository.save(VoitureDefini);
            }
        ).orElseThrow(() -> new RuntimeException("VoitureDefini pas trouver"));
    }

    public void delete(int idVoitureDefini){
        this.voitureDefiniRepository.deleteById(idVoitureDefini);
    }
}
