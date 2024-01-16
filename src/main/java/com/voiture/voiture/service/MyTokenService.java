package com.voiture.voiture.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.voiture.voiture.modele.MyToken;

public interface MyTokenService {
    MyToken Creer(MyToken voiture);
    List<MyToken> Lire();
    Optional<MyToken> getMyTokenByValeur(String valeur);
    MyToken Modifier(String valeur, MyToken voiture);
    List<MyToken> getTokensExpirantAvantDate(Date date);
    Optional<MyToken> findByDateHeureExpirationAfterAndValeur(Date date, String valeur);
    Optional<MyToken> findByDateHeureExpirationBeforeAndValeur(Date date, String valeur);
    String Supprimer(Long Id);
}
