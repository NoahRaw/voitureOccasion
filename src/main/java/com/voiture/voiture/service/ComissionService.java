package com.voiture.voiture.service;

import com.voiture.voiture.modele.Comission;
import com.voiture.voiture.repository.ComissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ComissionService {
    private final ComissionRepository ComissionRepository;

    public ComissionService(ComissionRepository comissionRepository) {
        ComissionRepository = comissionRepository;
    }

    public List<Comission> getAllCommission(){
        return ComissionRepository.findAll();
    }

    public Comission insertCommission(Comission comission){
        return ComissionRepository.save(comission);
    }

    public Comission getCommissionById(int idCommission){
        Optional<Comission> optionalCommission = ComissionRepository.findById(idCommission);
        return optionalCommission.orElseThrow(() -> new NoSuchElementException("Commission non trouvé pour l'ID : " + idCommission));
    }

    public Comission update(int idCommission, Comission comission){
        return this.ComissionRepository.findById(idCommission).map(
                newCommision ->{
                    newCommision.setId_comission(comission.getId_comission());
                    newCommision.setDate(comission.getDate());
                    newCommision.setPourcentage(comission.getPourcentage());
                    return ComissionRepository.save(newCommision);
                }
        ).orElseThrow(() -> new RuntimeException("commission pas trouver"));
    }

    public void deleteCommissionById(int idCommission){
        ComissionRepository.deleteById(idCommission);
    }

}
