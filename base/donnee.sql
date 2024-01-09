INSERT INTO Utilisateur (email, mdp) VALUES
('utilisateur1@email.com', 'motdepasse1'),
('utilisateur2@email.com', 'motdepasse2'),
('utilisateur3@email.com', 'motdepasse3');


INSERT INTO Carburant (description) VALUES
('Essence'),
('Diesel'),
('electrique');


INSERT INTO Marque (description) VALUES
('Toyota'),
('Ford'),
('Volkswagen');


INSERT INTO Modele (description) VALUES
('Corolla'),
('Fiesta'),
('Golf');


INSERT INTO Puissance (kw, cv) VALUES
(75, 102),
(90, 122),
(110, 150);


INSERT INTO boiteDeVitesse (description) VALUES
('Manuelle'),
('Automatique'),
('Séquentielle');


INSERT INTO TypeDeVehicule (description) VALUES
('Berline'),
('SUV'),
('Hatchback');


INSERT INTO Comission (date, pourcentage) VALUES
('2023-01-01', 5),
('2023-02-01', 7),
('2023-03-01', 6.5);


INSERT INTO VoitureDefini (idmarque, idmodele, idcarburant, idpuissance, idboiteDeVitesse, idtypeDeVehicule, nbrPorte, puissance) VALUES
(1, 1, 1, 1, 1, 1, 4, 75),
(2, 2, 2, 2, 2, 2, 5, 90),
(3, 3, 3, 3, 3, 3, 3, 110);


INSERT INTO VoitureUtilisateur (idutilisateur, idvoitureDefini, dateVenteDebut, dateVenteFin, matricule, kilometrage, prix, statut) VALUES
(1, 1, '2023-01-15', '2023-03-20', 'ABC123', 50000, 12000, 1),
(2, 2, '2023-02-10', '2023-04-15', 'XYZ789', 60000, 15000, 1),
(3, 3, '2023-03-20', '2023-05-25', 'DEF456', 75000, 18000, 1);


INSERT INTO photoVoitureUtilisateur (idvoitureUtilisateur, nomPhoto) VALUES
(1, 'photo1.jpg'),
(2, 'photo2.jpg'),
(3, 'photo3.jpg');



