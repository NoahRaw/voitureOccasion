package com.voiture.voiture.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.Utilisateur;
import com.voiture.voiture.repository.UtilisateurRepository;

@Service
public class UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;
    
    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur insertion(Utilisateur utilisateur){
        return this.utilisateurRepository.save(utilisateur);
    } 

    public List<Utilisateur> listeUtilisateur(){
        return this.utilisateurRepository.findAll();
    }

    public Utilisateur update(int idUtilisateur,Utilisateur modifier){
        return this.utilisateurRepository.findById(idUtilisateur).map(
            newUtilisateur ->{
                newUtilisateur.setEmail(modifier.getEmail());
                newUtilisateur.setMdp(modifier.getMdp());
                return utilisateurRepository.save(newUtilisateur);
            }
        ).orElseThrow(() -> new RuntimeException("utilisateur pas trouver"));
    }

    public void delete(int idUtilisateur){
        this.utilisateurRepository.deleteById(idUtilisateur);
    }
}
