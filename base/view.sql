CREATE OR REPLACE VIEW voiture_defini_stat_view AS 
SELECT VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description as nommarque,modele.description as nommodele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.idvoituredefini = VoitureDefini.idvoituredefini
JOIN marque ON VoitureDefini.idmarque = marque.idmarque
JOIN modele ON VoitureDefini.idmodele = modele.idmodele
GROUP BY VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description,modele.idmodele
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