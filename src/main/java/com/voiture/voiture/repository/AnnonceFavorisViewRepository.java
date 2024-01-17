package com.voiture.voiture.repository;

import com.voiture.voiture.modele.AnnonceFavoris;
import com.voiture.voiture.modele.AnnonceFavorisView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnnonceFavorisViewRepository extends JpaRepository<AnnonceFavorisView, Integer> {

    @Query(value = "SELECT * FROM annoncefavoris_view WHERE idutilisateur = :idutilisateur", nativeQuery = true)
    List<AnnonceFavorisView> findAnnonceFavorisByIdUser(@Param("idutilisateur") int idutilisateur);
}
