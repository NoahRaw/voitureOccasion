package com.voiture.voiture.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiture.voiture.modele.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    long count();
    Optional<Utilisateur> findByEmailAndMdpAndEtat(String login, String pwd,Integer etat);

    // Utilisez la clause IN de JPQL pour récupérer les utilisateurs par liste d'idutilisateur
    @Query("SELECT u FROM Utilisateur u WHERE u.idutilisateur IN :ids")
    List<Utilisateur> findAllByIdutilisateurIn(@Param("ids") List<Integer> ids);
}

