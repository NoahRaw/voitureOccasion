package com.voiture.voiture.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiture.voiture.modele.VoitureUtilisateur;


public interface VoitureUtilisateurRepository extends JpaRepository<VoitureUtilisateur,Integer>{
    
    @Modifying
    @Query(value = "UPDATE VoitureUtilisateur SET statut = :status WHERE idUtilisateur = :idUtilisateur",nativeQuery = true)
    void validation(@Param("status") int status, @Param("idUtilisateur") int idUtilisateur);
}
