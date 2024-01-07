create database voiture;

\c voiture;


CREATE TABLE Utilisateur (
    id_utilisateur SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    mdp VARCHAR(255) NOT NULL
);

CREATE TABLE Carburant (
    id_carburant SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE Marque (
    id_marque SERIAL PRIMARY KEY,
    description VARCHAR(64)
);

CREATE TABLE Modele (
    id_modele SERIAL PRIMARY KEY,
    description VARCHAR(64)
);

CREATE TABLE Puissance (
    id_puissance SERIAL PRIMARY KEY,
    kw FLOAT,
    cv FLOAT
);

CREATE TABLE boiteDeVitesse (
    id_boiteDeVitesse SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE TypeDeVehicule (
    id_typeDeVehicule SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE Comission (
    id_comission SERIAL PRIMARY KEY,
    date DATE,
    pourcentage FLOAT
);

CREATE TABLE VoitureDefini (
    id_voitureDefini SERIAL PRIMARY KEY,
    id_marque INT,
    id_modele INT,
    id_carburant INT,
    id_puissance INT,
    id_boiteDeVitesse INT,
    id_typeDeVehicule INT,
    nbrPorte INT,
    puissance FLOAT,
    FOREIGN KEY (id_marque) REFERENCES Marque(id_marque),
    FOREIGN KEY (id_modele) REFERENCES Modele(id_modele),
    FOREIGN KEY (id_carburant) REFERENCES Carburant(id_carburant),
    FOREIGN KEY (id_puissance) REFERENCES Puissance(id_puissance),
    FOREIGN KEY (id_boiteDeVitesse) REFERENCES boiteDeVitesse(id_boiteDeVitesse),
    FOREIGN KEY (id_typeDeVehicule) REFERENCES TypeDeVehicule(id_typeDeVehicule)
);


CREATE TABLE VoitureUtilisateur (
    id_voitureUtilisateur SERIAL PRIMARY KEY,
    id_utilisateur INT,
    id_voitureDefini INT ,
    dateVenteDebut DATE,
    dateVenteFin DATE,
    matricule VARCHAR(255),
    kilometrage DOUBLE PRECISION,
    prix DOUBLE PRECISION,
    statut INTEGER,
    FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur(id_utilisateur),
    FOREIGN KEY (id_voitureDefini) REFERENCES VoitureDefini(id_voitureDefini)
);

CREATE TABLE photoVoitureUtilisateur (
    id_voitureUtilisateur Int,
    nomPhoto VARCHAR(255)
);




