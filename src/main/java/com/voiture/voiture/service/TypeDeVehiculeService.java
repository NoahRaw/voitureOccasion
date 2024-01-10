package com.voiture.voiture.service;

import com.voiture.voiture.model.TypeDeVehicule;

import java.util.List;


public interface TypeDeVehiculeService {

    
    List<TypeDeVehicule> getAllTypesDeVehicules();

    TypeDeVehicule getTypeDeVehiculeById(int id);

    TypeDeVehicule saveTypeDeVehicule(TypeDeVehicule typeDeVehicule);

    TypeDeVehicule updateTypeDeVehicule(TypeDeVehicule typeDeVehicule);

    void deleteTypeDeVehiculeById(int id);
}
