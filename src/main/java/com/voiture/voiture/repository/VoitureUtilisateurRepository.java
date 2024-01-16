package com.voiture.voiture.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiture.voiture.modele.Voitureutilisateur;


public interface VoitureUtilisateurRepository extends JpaRepository<Voitureutilisateur,Integer>{
    
    @Modifying
    @Query(value = "UPDATE VoitureUtilisateur SET statut = :status WHERE idvoitureutilisateur = :idvoitureutilisateur", nativeQuery = true)
    void validation(@Param("status") int status, @Param("idvoitureutilisateur") int idvoitureutilisateur);    
}
