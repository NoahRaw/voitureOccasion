package com.voiture.voiture.service;

import com.voiture.voiture.modele.AnnonceFavorisView;
import com.voiture.voiture.repository.AnnonceFavorisViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceFavorisViewService {
    private final AnnonceFavorisViewRepository annonceFavorisViewRepository;

    public AnnonceFavorisViewService(AnnonceFavorisViewRepository annonceFavorisViewRepository) {
        this.annonceFavorisViewRepository = annonceFavorisViewRepository;
    }

    public List<AnnonceFavorisView> getAllAnnonceFavorisView(){
        return annonceFavorisViewRepository.findAll();
    }

    public List<AnnonceFavorisView> findAnnonceFavorisByIdUser(int iduser){
        return annonceFavorisViewRepository.findAnnonceFavorisByIdUser(iduser);
    }
}
