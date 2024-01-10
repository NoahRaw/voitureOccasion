Create view UtilisateurRevenue as
select 
    Utilisateur.idUtilisateur, VoitureUtilisateur.dateVenteFin, 
    (select pourcentage from Comission limit 1)*VoitureUtilisateur.prix/100 as revenue
        from VoitureUtilisateur
        join Utilisateur 
            on Utilisateur.idUtilisateur=VoitureUtilisateur.idUtilisateur
        where VoitureUtilisateur.statut=1
        order by revenue DESC;

-----------------------VIEW FY ANTRA---------------------
CREATE VIEW Vuestatistiquevente AS
SELECT
    u.idUtilisateur,
    u.email,
    COUNT(vu.idVoitureUtilisateur) AS nombreDeVentes
FROM
    Utilisateur u
JOIN
    VoitureUtilisateur vu ON u.idUtilisateur = vu.idUtilisateur
WHERE
    vu.statut = 2
GROUP BY
    u.idUtilisateur, u.email
ORDER BY
    nombreDeVentes DESC;

-----------------------FIN VIEW FY ANTRA-----------------