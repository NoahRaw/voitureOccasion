package com.voiture.voiture.service;

import java.util.List;

import com.voiture.voiture.modele.Modele;

public interface ModeleService {
    Modele Creer(Modele modele);
    List<Modele> Lire();
    Modele Modifier(Integer Id,Modele modele);
    String Supprimer(Integer Id);
}
