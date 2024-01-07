package com.voiture.voiture.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.VoitureDefiniStatView;
import com.voiture.voiture.repository.VoitureDefiniStatViewRepository;

@Service
public class VoitureDefiniStatViewService {
    private final VoitureDefiniStatViewRepository voitureDefiniStatViewRepository;

    public VoitureDefiniStatViewService(VoitureDefiniStatViewRepository voitureDefiniStatViewRepository){
        this.voitureDefiniStatViewRepository = voitureDefiniStatViewRepository;
    }

    public List<VoitureDefiniStatView> listeVoitureDefiniStatView(){
        return this.voitureDefiniStatViewRepository.findAll();
    }
}
