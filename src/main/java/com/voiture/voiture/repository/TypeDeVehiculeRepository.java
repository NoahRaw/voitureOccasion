package com.voiture.voiture.repository;

import com.voiture.voiture.model.TypeDeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeDeVehiculeRepository extends JpaRepository<TypeDeVehicule, Integer> {
    
}
