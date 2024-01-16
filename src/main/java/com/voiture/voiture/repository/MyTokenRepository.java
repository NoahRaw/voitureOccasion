package com.voiture.voiture.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.voiture.voiture.modele.MyToken;

public interface MyTokenRepository extends JpaRepository<MyToken,Long>{
    List<MyToken> findByDateHeureExpirationBefore(Date date);
    Optional<MyToken> findByValeur(String valeur);
    Optional<MyToken> findByDateHeureExpirationAfterAndValeur(Date date, String valeur);
    Optional<MyToken> findByDateHeureExpirationBeforeAndValeur(Date date, String valeur);
}
