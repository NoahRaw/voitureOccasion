package com.voiture.voiture.service;

import org.springframework.stereotype.Service;

import com.voiture.voiture.modele.MyToken;
import com.voiture.voiture.repository.MyTokenRepository;

import lombok.AllArgsConstructor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MyTokenServiceIplement implements MyTokenService{
    private final MyTokenRepository myTokenRepository;

    @Override
    public MyToken Creer(MyToken voiture){
        return myTokenRepository.save(voiture);
    }

    @Override
    public List<MyToken> Lire() {
        return myTokenRepository.findAll();
    }

    @Override
	public Optional<MyToken> getMyTokenByValeur(String valeur) {
        return myTokenRepository.findByValeur(valeur);
    }

    @Override
    public MyToken Modifier(String valeur, MyToken voiture) {
        return myTokenRepository.findByValeur(valeur).map(
            p->{
                p.setDateHeureExpiration(voiture.getDateHeureExpiration());
                p.setValeur(voiture.getValeur());
                return myTokenRepository.save(p);
            }
        ).orElseThrow(() -> new RuntimeException("Ce token n'existe pas"));
    }

    @Override
    public String Supprimer(Long Id) {
        myTokenRepository.deleteById(Id);
        return "Token supprimer";
    }

    @Override
    public List<MyToken> getTokensExpirantAvantDate(Date date){
        return myTokenRepository.findByDateHeureExpirationBefore(date);
    }

    // generer un token
    public static String generateToken(String password, String userRequest) throws NoSuchAlgorithmException {
        // Générer un sel aléatoire
        byte[] salt = generateSalt();

        // Ajouter le sel au mot de passe
        String passwordWithSalt = password + userRequest + new String(salt);

        // Appliquer la fonction de hachage (SHA-256 dans cet exemple)
        String hashedToken = hashPassword(passwordWithSalt, "SHA-256");

        return hashedToken;
    }

    private static byte[] generateSalt() {
        // Générer un sel aléatoire à l'aide de SecureRandom
        byte[] salt = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        return salt;
    }

    private static String hashPassword(String password, String algorithm) throws NoSuchAlgorithmException {
            // Créer une instance de MessageDigest avec l'algorithme spécifié
            MessageDigest md = MessageDigest.getInstance(algorithm);

            // Appliquer le hachage au mot de passe
            byte[] hashedBytes = md.digest(password.getBytes());

            // Convertir les bytes hachés en une représentation hexadécimale
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
    }

    @Override
    public Optional<MyToken> findByDateHeureExpirationAfterAndValeur(Date date, String valeur) {
        return myTokenRepository.findByDateHeureExpirationAfterAndValeur(date, valeur);
    }

    @Override
    public Optional<MyToken> findByDateHeureExpirationBeforeAndValeur(Date date, String valeur) {
        return myTokenRepository.findByDateHeureExpirationBeforeAndValeur(date, valeur);
    }
}