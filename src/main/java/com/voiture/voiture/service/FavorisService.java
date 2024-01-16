package com.voiture.voiture.service;

import com.voiture.voiture.modele.Favoris;
import com.voiture.voiture.repository.FavorisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorisService {
    private final FavorisRepository favorisRepository;

    public FavorisService(FavorisRepository favorisRepository) {
        this.favorisRepository = favorisRepository;
    }

    public List<Favoris> getAllFavoris(){
        return favorisRepository.findAll();
    }

    public Favoris insertFavoris(Favoris favoris){
        return favorisRepository.save(favoris);
    }

    public void deleteFavorisById(int idFavoris){
        favorisRepository.deleteById(idFavoris);
    }
}
