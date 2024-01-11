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
    u.idutilisateur,
    u.email,
    COUNT(vu.idvoitureUtilisateur) AS nombreDeVentes
FROM
    Utilisateur u
JOIN
    VoitureUtilisateur vu ON u.idutilisateur = vu.idutilisateur
WHERE
    vu.statut = 2
GROUP BY
    u.idutilisateur, u.email
ORDER BY
    nombreDeVentes DESC;

-----------------------FIN VIEW FY ANTRA-----------------