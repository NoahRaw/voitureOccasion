package com.voiture.voiture.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.Voitureutilisateur;
import com.voiture.voiture.repository.VoitureUtilisateurRepository;

@Service
public class VoitureUtilisateurService {
    private final VoitureUtilisateurRepository voitureUtilisateurRepository;

    public VoitureUtilisateurService(VoitureUtilisateurRepository voitureUtilisateurRepository){
        this.voitureUtilisateurRepository = voitureUtilisateurRepository;
    }

    public Voitureutilisateur insertion(Voitureutilisateur voitureUtilisateur){
        return this.voitureUtilisateurRepository.save(voitureUtilisateur);
    }
    
    public List<Voitureutilisateur> listeVoitureUtilisateur(){
        return this.voitureUtilisateurRepository.findAll();
    }
    
    public Voitureutilisateur update(int idVoitureUtilisateur,Voitureutilisateur modifier){
        return this.voitureUtilisateurRepository.findById(idVoitureUtilisateur).map(
            newVoitureUtilisateur ->{
                newVoitureUtilisateur.setIdutilisateur(modifier.getIdutilisateur());
                newVoitureUtilisateur.setIdvoituredefini(modifier.getIdvoituredefini());
                newVoitureUtilisateur.setDateventedebut(modifier.getDateventedebut());
                newVoitureUtilisateur.setDateventefin(modifier.getDateventefin());
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
}
