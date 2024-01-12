SELECT VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description as nomMarque,modele.description as nomModele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.id_voituredefini = VoitureDefini.id_voituredefini
JOIN marque ON VoitureDefini.id_marque = marque.id_marque
JOIN modele ON VoitureDefini.id_modele = modele.id_modele
GROUP BY VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description,modele.id_modele
ORDER BY COUNT(*) DESC
;


----------------------- rod----------------------------

-- SELECT SUM(prix*(select pourcentage from comission where date<=VoitureUtilisateur.dateventefin order by date limit 1)) as total_price, statut FROM VoitureUtilisateur WHERE statut = 1 AND dateventefin BETWEEN '2024-01-06' AND '2024-01-10  ' GROUP BY statut;

-- SELECT dateventefin,SUM(prix),statut FROM VoitureUtilisateur WHERE statut = 1 AND dateventefin BETWEEN '2024-01-06' AND '2024-01-10  ' GROUP BY statut,dateventefin;


-- select pourcentage from comission where date<='2024-01-20' order by date DESC limit 1;


SELECT 
        datedevente,SUM(prix) as montant ,(select pourcentage from comission where date<=v_voiturevendu.datedevente order by date DESC limit 1) as comission
    FROM v_voiturevendu 
    WHERE datedevente BETWEEN '2024-01-06' AND '2024-01-10' 
    GROUP BY datedevente;
