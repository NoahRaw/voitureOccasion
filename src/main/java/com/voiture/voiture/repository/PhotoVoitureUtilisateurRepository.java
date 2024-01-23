package com.voiture.voiture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiture.voiture.modele.PhotoVoitureUtilisateur;

public interface PhotoVoitureUtilisateurRepository extends JpaRepository<PhotoVoitureUtilisateur, Integer> {

    @Query(value = "select * from photoVoitureUtilisateur where idvoitureutilisateur = :idvoitureutilisateur", nativeQuery = true)
    List<PhotoVoitureUtilisateur> getPhotoVoitureUtilisateur(@Param("idvoitureutilisateur") int idvoitureutilisateur);

}

