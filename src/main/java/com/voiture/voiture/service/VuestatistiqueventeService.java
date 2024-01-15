package com.voiture.voiture.service;

import com.voiture.voiture.modele.Vuestatistiquevente;
import com.voiture.voiture.repository.VuestatistiqueventeRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class VuestatistiqueventeService {
    private final VuestatistiqueventeRepository vuestatistiqueventeRepository;

    public VuestatistiqueventeService(VuestatistiqueventeRepository vuestatistiqueventeRepository) {
        this.vuestatistiqueventeRepository = vuestatistiqueventeRepository;
    }

    public List<Vuestatistiquevente> getAllVuestatistiquevente(){
        return vuestatistiqueventeRepository.findAll();
    }

    public Vuestatistiquevente getVuestatistiqueventeByIdUtilisateur(int idUtilisateur){
        Optional<Vuestatistiquevente> optionalVuestatistiquevente = vuestatistiqueventeRepository.findById(idUtilisateur);
        return optionalVuestatistiquevente.orElseThrow(() -> new NoSuchElementException("optionalVuestatistiquevente non trouvé pour l'ID : " + idUtilisateur));
    }

    public List<Vuestatistiquevente> findByStatVenteUserBy2Date(Date date1, Date date2) {
        return vuestatistiqueventeRepository.findByStatVenteUserBy2Date(date1, date2);
    }

}
