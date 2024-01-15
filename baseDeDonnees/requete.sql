SELECT VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description as nomMarque,modele.description as nomModele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.id_voituredefini = VoitureDefini.id_voituredefini
JOIN marque ON VoitureDefini.id_marque = marque.id_marque
JOIN modele ON VoitureDefini.id_modele = modele.id_modele
GROUP BY VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description,modele.id_modele
ORDER BY COUNT(*) DESC
;

select idutilisateur,email,sum(nombredeventes) as nombredeventes from Vuestatistiquevente vu
WHERE vu.dateVenteDebut >= '2024-01-01' AND vu.dateVenteFin <= '2024-01-10'
GROUP BY idutilisateur,email;

SELECT
    idUtilisateur,
    email,
    SUM(nombreDeVentes) AS nombreDeVentes
FROM
    Vuestatistiquevente
WHERE
    dateVenteDebut BETWEEN '2024-02-06' AND '2024-05-10'
    or dateVenteFin BETWEEN '2024-02-06' AND '2024-05-10'
GROUP BY
    idUtilisateur, email;