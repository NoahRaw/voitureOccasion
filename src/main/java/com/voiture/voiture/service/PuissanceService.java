package com.voiture.voiture.service;

import java.util.List;

import com.voiture.voiture.modele.Puissance;

public interface PuissanceService {
    Puissance Creer(Puissance puissance);
    List<Puissance> Lire();
    Puissance Modifier(Integer Id,Puissance puissance);
    String Supprimer(Integer Id);
}