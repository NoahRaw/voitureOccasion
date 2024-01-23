package com.voiture.voiture.service;

import com.voiture.voiture.modele.AnnonceFavoris;
import com.voiture.voiture.repository.FavorisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorisService {
    private final FavorisRepository favorisRepository;

    public FavorisService(FavorisRepository favorisRepository) {
        this.favorisRepository = favorisRepository;
    }

    public List<AnnonceFavoris> getAllFavoris(){
        return favorisRepository.findAll();
    }
    public AnnonceFavoris insertFavoris(AnnonceFavoris annonceFavoris){
        return favorisRepository.save(annonceFavoris);
    }

    public void deleteFavorisById(Integer idFavoris){
        favorisRepository.deleteById(idFavoris);
    }
}
