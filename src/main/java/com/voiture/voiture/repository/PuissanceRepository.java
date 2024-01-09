package com.voiture.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.voiture.modele.Puissance;

public interface PuissanceRepository extends JpaRepository<Puissance,Integer>{
    
}
