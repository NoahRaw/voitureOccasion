INSERT INTO Utilisateur (nomutilisateur,email, mdp) VALUES
    ('Noah Raw','noah@gmail.com', '0000'),
    ('Thony','thony@gmail.com', '1111'),
    ('Rodriguez','rod@gmail.com', '2222'),
    ('Fy Amtra','antra@gmail.com', '3333'),
    ('Jean','jean@gmail.com', '4444');

    UPDATE utilisateur
    SET etat = 0
    WHERE idutilisateur = 5;

INSERT INTO Carburant (description) VALUES
    ('Essence'),
    ('Diesel'),
    ('Hybride'),
    ('electrique'),
    ('GPL'),
    ('Hydrogène'),
    ('ethanol'),
    ('GNV (Gaz naturel comprimé)'),
    ('Biodiesel');


INSERT INTO Marque (description) VALUES
    ('Toyota'),
    ('Ford'),
    ('Honda'),
    ('Volkswagen'),
    ('Chevrolet'),
    ('BMW'),
    ('Mercedes-Benz'),
    ('Audi'),
    ('Nissan'),
    ('Hyundai'),
    ('Mazda'),
    ('Subaru'),
    ('Kia'),
    ('Fiat'),
    ('tesla'),
    ('Porsche');


INSERT INTO Modele (description) VALUES
    ('Camry'),
    ('F-150'),
    ('Civic'),
    ('Golf'),
    ('Malibu'),
    ('3 Series'),
    ('E-Class'),
    ('A4'),
    ('Altima'),
    ('Elantra');


INSERT INTO Puissance (kw, cv) VALUES
    (81.6, 110.0),
    (150.0, 204.0),
    (66.2, 90.0),
    (77.0, 105.0),
    (120.0, 163.0),
    (147.0, 200.0),
    (180.0, 245.0),
    (200.0, 272.0),
    (90.0, 122.0),
    (190.0, 258.0);

INSERT INTO boiteDeVitesse (description) VALUES
    ('Manuelle'),
    ('Automatique'),
    ('Séquentielle'),
    ('CVT (Continuously Variable Transmission)'),
    ('DCT (Dual-Clutch Transmission)'),
    ('Boîte robotisée'),
    ('Boîte semi-automatique'),
    ('Boîte hydraulique'),
    ('Boîte électrique'),
    ('Variateur');

INSERT INTO TypeDeVehicule (description) VALUES
    ('Berline'),
    ('SUV'),
    ('Coupé'),
    ('Cabriolet'),
    ('Monospace'),
    ('Break'),
    ('Utilitaire'),
    ('Crossover'),
    ('Sportive'),
    ('Hybride');



INSERT INTO Comission (date, pourcentage) VALUES
    ('2024-01-06', 10),
    ('2024-01-07', 3.0),
    ('2024-01-08', 5),
    ('2024-01-09', 15),
    ('2024-01-10', 7),
    ('2024-01-11', 12),
    ('2024-01-12', 6),
    ('2024-01-13', 7),
    ('2024-01-14', 2.5),
    ('2024-01-15', 20);

    INSERT INTO VoitureDefini (idMarque, idModele, idCarburant, idPuissance, idboiteDeVitesse, idTypeDeVehicule, nbrPorte, puissance)VALUES
    (11, 1, 1, 1, 2, 1, 4, 120.0),
    (12, 3, 2, 2, 6, 2, 5, 150.0),
    (13, 5, 3, 3, 3, 3, 4, 130.0),
    (14, 7, 4, 4, 4, 4, 3, 170.0),
    (15, 9, 5, 5, 5, 5, 5, 200.0);

INSERT INTO VoitureDefini (idMarque, idModele, idCarburant, idPuissance, idboiteDeVitesse, idTypeDeVehicule, nbrPorte, puissance)VALUES
   (2, 3, 2, 2, 2, 2, 5, 150.0);

    INSERT INTO VoitureUtilisateur (idUtilisateur, idVoitureDefini, dateVenteDebut, dateVenteFin, matricule, kilometrage, prix, statut)VALUES
    (1, 11, '2024-01-06', '2024-02-06', 'ABC123', 50000.5, 25000.0, 2),
    (2, 12, '2024-01-07', '2025-01-07', 'XYZ789', 60000.3, 30000.0, 0),
    (3, 13, '2024-01-08', '2025-01-08', '123DEF', 75000.2, 18000.0, 1),
    (4, 14, '2024-01-09', '2025-01-09', '456GHI', 80000.8, 22000.0, 1),
    (5, 15, '2024-01-10', '2025-01-10', 'JKL321', 65000.1, 28000.0, 0),
    (2, 16, '2024-05-10', '2024-07-07', 'XYZ789', 80000.3, 50000.0, 2),
    (1, 17, '2024-01-08', '2025-01-08', '123DEF', 75000.2, 18000.0, 2);

    INSERT INTO VoitureUtilisateur (idUtilisateur, idVoitureDefini, dateVenteDebut, dateVenteFin, matricule, kilometrage, prix, statut)VALUES
    (1, 6, '2024-01-06', '2024-01-08', 'ABE124', 30000.0, 10000.0, 1);


INSERT INTO photoVoitureUtilisateur (idVoitureUtilisateur, nomPhoto) VALUES
    (1, 'photo1.jpg'),
    (1, 'photo2.jpg'),
    (2, 'photo3.jpg'),
    (3, 'photo4.jpg');

INSERT INTO annoncefavoris (idUtilisateur, idVoitureUtilisateur) VALUES
    (1, 15), (2,16), (3,17), (4,18), (5, 18);
    