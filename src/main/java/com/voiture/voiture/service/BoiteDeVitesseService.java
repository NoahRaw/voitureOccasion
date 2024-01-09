package com.voiture.voiture.service;

import java.util.Date;
import java.util.List;

import com.voiture.voiture.modele.Boitedevitesse;
import com.voiture.voiture.modele.Utilisateurrevenue;

public interface BoiteDeVitesseService {
    Boitedevitesse Creer(Boitedevitesse boiteDeVitesse);
    List<Boitedevitesse> Lire();
    Boitedevitesse Modifier(Integer Id,Boitedevitesse boiteDeVitesse);
    String Supprimer(Integer Id);

    List<Utilisateurrevenue> statistiqueUtilisateurRevenue(Date dateDebut,Date dateFin);
}
