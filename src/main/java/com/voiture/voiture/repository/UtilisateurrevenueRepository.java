package com.voiture.voiture.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiture.voiture.modele.Utilisateurrevenue;

public interface UtilisateurrevenueRepository extends JpaRepository<Utilisateurrevenue,Integer>{
    @Query(value = "select idutilisateur,nomutilisateur,sum(revenue) as revenue from UtilisateurRevenue where :dateDebut <=dateVenteFin and dateVenteFin<= :dateFin group by idUtilisateur,nomutilisateur order by sum(revenue) DESC", nativeQuery = true)
    List<Utilisateurrevenue> statistiqueUtilisateurRevenue(@Param("dateDebut") Date dateDebut,@Param("dateFin") Date dateFin);
}
