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
CREATE or replace VIEW Vuestatistiquevente AS
SELECT
    u.idUtilisateur,
    u.email,vu.dateVenteDebut, vu.dateVenteFin,
    COUNT(vu.idVoitureUtilisateur) AS nombreDeVentes
FROM
    Utilisateur u
JOIN
    VoitureUtilisateur vu ON u.idUtilisateur = vu.idUtilisateur
WHERE
    vu.statut = 2
GROUP BY
    u.idUtilisateur, u.email, vu.dateVenteDebut, vu.dateVenteFin
ORDER BY
    nombreDeVentes DESC;

-----------------------FIN VIEW FY ANTRA-----------------

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



-----------------------VIEW Rod-----------------
CREATE VIEW v_voiturevendu AS 
SELECT 
        dateventefin as dateDeVente,idutilisateur,matricule,prix,statut 
    FROM VoitureUtilisateur 
    WHERE statut = 1 
    ORDER BY dateDeVente ASC;

   
    SELECT 
        datedevente,SUM(prix) as montant
    FROM v_voiturevendu 
    WHERE datedevente BETWEEN '2024-01-06' AND '2024-01-10' 
    GROUP BY datedevente;


CREATE VIEW voitureutilisateur_view AS 
SELECT voitureutilisateur.*,marque.description as nommarque,modele.description as nommodele,marque.idmarque,
carburant.idcarburant,puissance.idpuissance,boitedevitesse.idboitedevitesse,typedevehicule.idtypedevehicule,
carburant.description as nomcarburant,puissance.kw,puissance.cv,boitedevitesse.description as nomboitedevitesse,
typedevehicule.description as nomtypedevehicule,voituredefini.nbrporte,voituredefini.puissance
FROM voitureutilisateur
JOIN voituredefini ON voituredefini.idvoituredefini = voitureutilisateur.idvoituredefini
JOIN marque ON voituredefini.idmarque = marque.idmarque
JOIN modele ON voituredefini.idmodele = modele.idmodele
JOIN carburant ON voituredefini.idcarburant = carburant.idcarburant
JOIN puissance ON voituredefini.idpuissance = puissance.idpuissance
JOIN boitedevitesse ON voituredefini.idboitedevitesse = boitedevitesse.idboiteDeVitesse
JOIN typedevehicule ON voituredefini.idtypedevehicule = typedevehicule.idtypedevehicule
;

CREATE or replace VIEW annonceFavoris_view AS  --liste des annonces dans favoris
select idannoncefavoris, annonceFavoris.idvoitureutilisateur ,annonceFavoris.idutilisateur ,dateventedebut ,dateventefin ,matricule ,
kilometrage ,prix,statut ,nommarque,nommodele ,nomcarburant, kw, cv ,nomboitedevitesse,nomtypedevehicule,nbrporte,puissance
from voitureutilisateur_view join annonceFavoris on 
voitureutilisateur_view.idutilisateur = annonceFavoris.idutilisateur and voitureutilisateur_view.idvoitureUtilisateur = annonceFavoris.idvoitureUtilisateur;


