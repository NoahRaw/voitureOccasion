package com.voiture.voiture.repository;

import com.voiture.voiture.modele.Carburant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarburantRepository extends JpaRepository<Carburant, Integer> {

}
