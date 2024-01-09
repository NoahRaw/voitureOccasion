CREATE VIEW voiture_defini_stat_view AS 
SELECT VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description as nom_marque,modele.description as nom_modele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.id_voituredefini = VoitureDefini.id_voituredefini
JOIN marque ON VoitureDefini.id_marque = marque.id_marque
JOIN modele ON VoitureDefini.id_modele = modele.id_modele
GROUP BY VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description,modele.id_modele
ORDER BY COUNT(*) DESC
;

-----------------------VIEW FY ANTRA---------------------
CREATE VIEW Vuestatistiquevente AS
SELECT
    u.id_utilisateur,
    u.email,
    COUNT(vu.id_voitureUtilisateur) AS nombreDeVentes
FROM
    Utilisateur u
JOIN
    VoitureUtilisateur vu ON u.id_utilisateur = vu.id_utilisateur
WHERE
    vu.statut = 2
GROUP BY
    u.id_utilisateur, u.email
ORDER BY
    nombreDeVentes DESC;

-----------------------FIN VIEW FY ANTRA-----------------