package com.voiture.voiture.service;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.Voituredefini_view;
import com.voiture.voiture.repository.Voituredefini_viewRepository;

import java.util.List;


@Service
public class Voituredefini_viewService {
    private final Voituredefini_viewRepository  voituredefini_viewRepository;

    public Voituredefini_viewService(Voituredefini_viewRepository  voituredefini_viewRepository){
        this.voituredefini_viewRepository = voituredefini_viewRepository;
    }

    public List<Voituredefini_view> listeVoitureDefini(){
        return this.voituredefini_viewRepository.findAll();
    }
}
