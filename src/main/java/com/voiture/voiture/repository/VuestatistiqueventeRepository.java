package com.voiture.voiture.repository;

import com.voiture.voiture.modele.Vuestatistiquevente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VuestatistiqueventeRepository extends JpaRepository<Vuestatistiquevente, Integer> {

//    @Query(value = "SELECT * FROM VueStatistiqueVente WHERE email = :email AND nombredeventes > :nombreVentes", nativeQuery = true)
//    List<Vuestatistiquevente> findByEmailAndNombreDeVentesGreaterThan(@Param("email") String email, @Param("nombreVentes") int nombreVentes);
}