package com.voiture.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;

public interface PhotoVoitureUtilisateurRepository extends JpaRepository<PhotoVoitureUtilisateur, Integer> {
    
}

