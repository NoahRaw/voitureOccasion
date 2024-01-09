package com.voiture.voiture.repository;

import com.voiture.voiture.modele.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
