package com.voiture.voiture.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.voiture.modele.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    long count();
    Optional<Utilisateur> findByEmailAndMdpAndEtat(String login, String pwd,int etat);
}

