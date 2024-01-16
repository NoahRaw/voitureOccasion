package com.voiture.voiture.repository;

import com.voiture.voiture.modele.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorisRepository extends JpaRepository<Favoris, Integer> {

}
