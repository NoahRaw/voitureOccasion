package com.voiture.voiture.service;

import java.util.List;

import com.voiture.voiture.modele.TypeDeVehicule;


public interface TypeDeVehiculeService {

    
    List<TypeDeVehicule> getAllTypesDeVehicules();

    TypeDeVehicule getTypeDeVehiculeById(Integer id);

    TypeDeVehicule saveTypeDeVehicule(TypeDeVehicule typeDeVehicule);

    TypeDeVehicule updateTypeDeVehicule(TypeDeVehicule typeDeVehicule);

    void deleteTypeDeVehiculeById(Integer id);
}
