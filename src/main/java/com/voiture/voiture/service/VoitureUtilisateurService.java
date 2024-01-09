package com.voiture.voiture.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.VoitureUtilisateur;
import com.voiture.voiture.repository.VoitureUtilisateurRepository;

@Service
public class VoitureUtilisateurService {
    private final VoitureUtilisateurRepository voitureUtilisateurRepository;

    public VoitureUtilisateurService(VoitureUtilisateurRepository voitureUtilisateurRepository){
        this.voitureUtilisateurRepository = voitureUtilisateurRepository;
    }

    public VoitureUtilisateur insertion(VoitureUtilisateur voitureUtilisateur){
        return this.voitureUtilisateurRepository.save(voitureUtilisateur);
    }
    
    public List<VoitureUtilisateur> listeVoitureUtilisateur(){
        return this.voitureUtilisateurRepository.findAll();
    }
    
    public VoitureUtilisateur update(int idVoitureUtilisateur,VoitureUtilisateur modifier){
        return this.voitureUtilisateurRepository.findById(idVoitureUtilisateur).map(
            newVoitureUtilisateur ->{
                newVoitureUtilisateur.setIdVoitureUtilisateur(modifier.getIdVoitureUtilisateur());
                newVoitureUtilisateur.setIdUtilisateur(modifier.getIdUtilisateur());
                newVoitureUtilisateur.setIdVoitureDefini(modifier.getIdVoitureDefini());
                newVoitureUtilisateur.setDateVenteDebut(modifier.getDateVenteDebut());
                newVoitureUtilisateur.setDateVenteFin(modifier.getDateVenteFin());
                newVoitureUtilisateur.setMatricule(modifier.getMatricule());
                newVoitureUtilisateur.setKilometrage(modifier.getKilometrage());
                newVoitureUtilisateur.setPrix(modifier.getPrix());
                newVoitureUtilisateur.setStatut(modifier.getStatut());

                return voitureUtilisateurRepository.save(newVoitureUtilisateur);
            }
        ).orElseThrow(() -> new RuntimeException("VoitureUtilisateur pas trouver"));
    }

    public void delete(int idVoitureUtilisateur){
        this.voitureUtilisateurRepository.deleteById(idVoitureUtilisateur);
    }

    @Transactional
    public void validation(int status,int idutilisateur){
        this.voitureUtilisateurRepository.validation(status, idutilisateur);
    }
}
