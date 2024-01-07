CREATE VIEW voiture_defini_stat_view AS 
SELECT VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description as nom_marque,modele.description as nom_modele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.id_voituredefini = VoitureDefini.id_voituredefini
JOIN marque ON VoitureDefini.id_marque = marque.id_marque
JOIN modele ON VoitureDefini.id_modele = modele.id_modele
GROUP BY VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description,modele.id_modele
ORDER BY COUNT(*) DESC
;