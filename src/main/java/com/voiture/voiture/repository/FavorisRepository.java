package com.voiture.voiture.repository;

import com.voiture.voiture.modele.AnnonceFavoris;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorisRepository extends JpaRepository<AnnonceFavoris, Integer> {

}
