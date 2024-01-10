package com.voiture.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.voiture.modele.TypeDeVehicule;

public interface TypeDeVehiculeRepository extends JpaRepository<TypeDeVehicule, Integer> {
    
}
