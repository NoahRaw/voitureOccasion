SELECT VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description as nomMarque,modele.description as nomModele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.id_voituredefini = VoitureDefini.id_voituredefini
JOIN marque ON VoitureDefini.id_marque = marque.id_marque
JOIN modele ON VoitureDefini.id_modele = modele.id_modele
GROUP BY VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description,modele.id_modele
ORDER BY COUNT(*) DESC
;

SELECT VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description as nommarque,modele.description as nommodele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.idvoituredefini = VoitureDefini.idvoituredefini
JOIN marque ON VoitureDefini.idmarque = marque.idmarque
JOIN modele ON VoitureDefini.idmodele = modele.idmodele
WHERE voitureutilisateur.statut=1 AND dateventefin >= '2023-03-19' AND dateventefin <= '2023-05-26' 
GROUP BY VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description,modele.idmodele
ORDER BY COUNT(*) DESC;


SELECT voitureutilisateur.*,marque.description as nommarque,modele.description as nommodele,
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

SELECT *
FROM voitureutilisateur;


SELECT *
FROM voitureutilisateur WHERE kilometrage = ;
