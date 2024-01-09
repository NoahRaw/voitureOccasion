package com.voiture.voiture.service;

import com.voiture.voiture.modele.Marque;
import com.voiture.voiture.repository.MarqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MarqueService {
    private final MarqueRepository marqueRepository;

    public MarqueService(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    public Marque insertMarque(Marque marque){
        return marqueRepository.save(marque);
    }

    public List<Marque> getAllMarque(){
        return marqueRepository.findAll();
    }

    public Marque getMarqueById(int idMarque) {
        Optional<Marque> optionalMarque = marqueRepository.findById(idMarque);
        return optionalMarque.orElseThrow(() -> new NoSuchElementException("marque non trouvé pour l'ID : " + idMarque));
    }

    public Marque update(int idMarque, Marque marque){
        return this.marqueRepository.findById(idMarque).map(
                newMarque ->{
                    newMarque.setId_marque(marque.getId_marque());
                    newMarque.setDescription(marque.getDescription());
                    return marqueRepository.save(newMarque);
                }
        ).orElseThrow(() -> new RuntimeException("marque pas trouver"));
    }

    public void deleteMarqueById(int idMarque){
        marqueRepository.deleteById(idMarque);
    }
}
