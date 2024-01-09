package com.voiture.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.voiture.modele.Voitureutilisateur;


public interface VoitureUtilisateurRepository extends JpaRepository<Voitureutilisateur,Integer>{
    
}
