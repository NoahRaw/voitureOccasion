package com.voiture.voiture.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.Utilisateur;
import com.voiture.voiture.repository.UtilisateurRepository;

@Service
public class UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;
    
    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    public Optional<Utilisateur> findById(Integer idUtilisateur){
        return this.utilisateurRepository.findById(idUtilisateur);
    }

    public Utilisateur insertion(Utilisateur utilisateur){
        return this.utilisateurRepository.save(utilisateur);
    } 

    public List<Utilisateur> listeUtilisateur(){
        return this.utilisateurRepository.findAll();
    }

    public Utilisateur update(Integer idUtilisateur,Utilisateur modifier){
        return this.utilisateurRepository.findById(idUtilisateur).map(
            newUtilisateur ->{
                newUtilisateur.setNomutilisateur(modifier.getNomutilisateur());
                newUtilisateur.setEmail(modifier.getEmail());
                newUtilisateur.setMdp(modifier.getMdp());
                newUtilisateur.setEtat(modifier.getEtat());
                return utilisateurRepository.save(newUtilisateur);
            }
        ).orElseThrow(() -> new RuntimeException("utilisateur pas trouver"));
    }

    public void delete(Integer idUtilisateur){
        this.utilisateurRepository.deleteById(idUtilisateur);
    }

    public Optional<Utilisateur> findByEmailAndMdp(String login,String pwd,Integer etat)
    {
        return utilisateurRepository.findByEmailAndMdpAndEtat(login, pwd, etat);
    }

    public List<Utilisateur> findUtilisateursByIdutilisateurList(List<Integer> ids) {
        return utilisateurRepository.findAllByIdutilisateurIn(ids);
    }
}
