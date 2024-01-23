create database voiture;

\c voiture;


CREATE TABLE Utilisateur (
    idUtilisateur SERIAL PRIMARY KEY,
    nomutilisateur VARCHAR(50),
    email VARCHAR(255) UNIQUE NOT NULL,
    mdp VARCHAR(255) NOT NULL,
    etat INTEGER
);

CREATE TABLE Carburant (
    idCarburant SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE Marque (
    idMarque SERIAL PRIMARY KEY,
    description VARCHAR(64)
);

CREATE TABLE Modele (
    idModele SERIAL PRIMARY KEY,
    description VARCHAR(64)
);

CREATE TABLE Puissance (
    idPuissance SERIAL PRIMARY KEY,
    kw FLOAT,
    cv FLOAT
);

CREATE TABLE boiteDeVitesse (
    idboiteDeVitesse SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE TypeDeVehicule (
    idTypeDeVehicule SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE Comission (
    idComission SERIAL PRIMARY KEY,
    date DATE,
    pourcentage FLOAT
);

CREATE TABLE VoitureDefini (
    idVoitureDefini SERIAL PRIMARY KEY,
    idMarque INT,
    idModele INT,
    idCarburant INT,
    idPuissance INT,
    idboiteDeVitesse INT,
    idTypeDeVehicule INT,
    nbrPorte INT,
    puissance FLOAT,
    FOREIGN KEY (idMarque) REFERENCES Marque(idMarque),
    FOREIGN KEY (idModele) REFERENCES Modele(idModele),
    FOREIGN KEY (idCarburant) REFERENCES Carburant(idCarburant),
    FOREIGN KEY (idPuissance) REFERENCES Puissance(idPuissance),
    FOREIGN KEY (idboiteDeVitesse) REFERENCES boiteDeVitesse(idboiteDeVitesse),
    FOREIGN KEY (idTypeDeVehicule) REFERENCES TypeDeVehicule(idTypeDeVehicule)
);


CREATE TABLE VoitureUtilisateur (
    idVoitureUtilisateur SERIAL PRIMARY KEY,
    idUtilisateur INT,
    idVoitureDefini INT,
    dateVenteDebut DATE,
    dateVenteFin DATE,
    matricule VARCHAR(255),
    kilometrage DOUBLE PRECISION,
    prix DOUBLE PRECISION,
    statut INT,
    FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur(idUtilisateur),
    FOREIGN KEY (idVoitureDefini) REFERENCES VoitureDefini(idVoitureDefini)
);

CREATE TABLE photoVoitureUtilisateur (
    idphotoVoitureUtilisateur SERIAL PRIMARY KEY,
    idVoitureUtilisateur INT,
    nomPhoto VARCHAR(255),
    FOREIGN KEY (idVoitureUtilisateur) REFERENCES VoitureUtilisateur(idVoitureUtilisateur)
);

CREATE TABLE annonceFavoris(
    idannonceFavoris serial primary key,
    idUtilisateur int,
    idVoitureUtilisateur int,
    FOREIGN KEY (idUtilisateur) REFERENCES Utilisateur (idUtilisateur),
    FOREIGN KEY (idVoitureUtilisateur) REFERENCES VoitureUtilisateur(idVoitureUtilisateur)
);

