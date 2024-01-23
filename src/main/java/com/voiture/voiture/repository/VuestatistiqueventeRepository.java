package com.voiture.voiture.repository;

import com.voiture.voiture.modele.Vuestatistiquevente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface VuestatistiqueventeRepository extends JpaRepository<Vuestatistiquevente, Integer> {

//    @Query(value = "SELECT * FROM VueStatistiqueVente WHERE email = :email AND nombredeventes > :nombreVentes", nativeQuery = true)
    @Query(value = "SELECT\n" +
            "    idUtilisateur,\n" +
            "    nomutilisateur,\n" +
            "    email,\n" +
            "    SUM(nombreDeVentes) AS nombreDeVentes\n" +
            "FROM\n" +
            "    Vuestatistiquevente\n" +
            "WHERE\n" +
            "    dateVenteDebut BETWEEN :date1 AND :date2\n" +
            "    or dateVenteFin BETWEEN :date1 AND :date2\n" +
            "GROUP BY\n" +
            "    idUtilisateur,nomutilisateur, email;", nativeQuery = true)
    List<Vuestatistiquevente> findByStatVenteUserBy2Date(@Param("date1") Date date1, @Param("date2") Date date2);
}
