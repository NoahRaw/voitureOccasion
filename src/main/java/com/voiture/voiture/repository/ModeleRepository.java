package com.voiture.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.voiture.modele.Modele;

public interface ModeleRepository extends JpaRepository<Modele,Integer>{
    
}
