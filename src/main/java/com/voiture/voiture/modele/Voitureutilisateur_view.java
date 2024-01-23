package com.voiture.voiture.modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.voiture.voiture.connexion.ConnexionBdd;

public class Voitureutilisateur_view {
    int idvoitureutilisateur;
    int idutilisateur;
    int idvoituredefini;
    Date dateventedebut;
    Date dateventefin;
    String matricule;
    double kilometrage;
    double prix;
    int statut;
    String nommarque;
    String nommodele;
    String nomcarburant;
    double kw;
    double cv;
    String nomboitedevitesse;
    String nomtypedevehicule;
    int nbrporte;
    double puissance;
    int idmarque;
    int idcarburant;
    int idpuissance;
    int idboitedevitesse;
    int idtypedevehicule;
    String nomutilisateur;
    


    ConnexionBdd connexionBdd = new ConnexionBdd();

    public Voitureutilisateur_view(int idvoitureutilisateur, int idutilisateur, int idvoituredefini,
        Date dateventedebut, Date dateventefin, String matricule, double kilometrage, double prix, int statut,
        String nommarque, String nommodele, String nomcarburant, double kw, double cv, String nomboitedevitesse,
        String nomtypedevehicule, int nbrporte, double puissance) {
        this.idvoitureutilisateur = idvoitureutilisateur;
        this.idutilisateur = idutilisateur;
        this.idvoituredefini = idvoituredefini;
        this.dateventedebut = dateventedebut;
        this.dateventefin = dateventefin;
        this.matricule = matricule;
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.statut = statut;
        this.nommarque = nommarque;
        this.nommodele = nommodele;
        this.nomcarburant = nomcarburant;
        this.kw = kw;
        this.cv = cv;
        this.nomboitedevitesse = nomboitedevitesse;
        this.nomtypedevehicule = nomtypedevehicule;
        this.nbrporte = nbrporte;
        this.puissance = puissance;
    }
    
    
    public String getNomutilisateur() {
        return nomutilisateur;
    }

    public void setNomutilisateur(String nomutilisateur) {
        this.nomutilisateur = nomutilisateur;
    }

    public int getIdtypedevehicule() {
        return idtypedevehicule;
    }

    public void setIdtypedevehicule(int idtypedevehicule) {
        this.idtypedevehicule = idtypedevehicule;
    }


    public int getIdmarque() {
        return idmarque;
    }

    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }

    public int getIdcarburant() {
        return idcarburant;
    }

    public void setIdcarburant(int idcarburant) {
        this.idcarburant = idcarburant;
    }

    public int getIdpuissance() {
        return idpuissance;
    }

    public void setIdpuissance(int idpuissance) {
        this.idpuissance = idpuissance;
    }

    public int getIdboitedevitesse() {
        return idboitedevitesse;
    }

    public void setIdboitedevitesse(int idboitedevitesse) {
        this.idboitedevitesse = idboitedevitesse;
    }




    public Voitureutilisateur_view() {
    }

    public String getNommarque() {
        return nommarque;
    }

    public void setNommarque(String nommarque) {
        this.nommarque = nommarque;
    }

    public String getNommodele() {
        return nommodele;
    }

    public void setNommodele(String nommodele) {
        this.nommodele = nommodele;
    }

    public String getNomcarburant() {
        return nomcarburant;
    }

    public void setNomcarburant(String nomcarburant) {
        this.nomcarburant = nomcarburant;
    }

    public double getKw() {
        return kw;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    public String getNomboitedevitesse() {
        return nomboitedevitesse;
    }

    public void setNomboitedevitesse(String nomboitedevitesse) {
        this.nomboitedevitesse = nomboitedevitesse;
    }

    public String getNomtypedevehicule() {
        return nomtypedevehicule;
    }

    public void setNomtypedevehicule(String nomtypedevehicule) {
        this.nomtypedevehicule = nomtypedevehicule;
    }

    public int getNbrporte() {
        return nbrporte;
    }


    public void setNbrporte(int nbrporte) {
        this.nbrporte = nbrporte;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }
    
    public int getIdvoitureutilisateur() {
        return idvoitureutilisateur;
    }


    public void setIdvoitureutilisateur(int idvoitureutilisateur) {
        this.idvoitureutilisateur = idvoitureutilisateur;
    }


    public int getIdutilisateur() {
        return idutilisateur;
    }


    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }


    public int getIdvoituredefini() {
        return idvoituredefini;
    }


    public void setIdvoituredefini(int idvoituredefini) {
        this.idvoituredefini = idvoituredefini;
    }


    public Date getDateventedebut() {
        return dateventedebut;
    }


    public void setDateventedebut(Date dateventedebut) {
        this.dateventedebut = dateventedebut;
    }


    public Date getDateventefin() {
        return dateventefin;
    }


    public void setDateventefin(Date dateventefin) {
        this.dateventefin = dateventefin;
    }


    public String getMatricule() {
        return matricule;
    }


    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }


    public double getKilometrage() {
        return kilometrage;
    }


    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }


    public double getPrix() {
        return prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }


    public int getStatut() {
        return statut;
    }


    public void setStatut(int statut) {
        this.statut = statut;
    }

    public List<Voitureutilisateur_view> getAllVoitureUtilisateutNonVendu(Connection con) throws Exception {
         List<Voitureutilisateur_view> liste = new ArrayList<>();
        String query = "SELECT * FROM voitureutilisateur_view WHERE statut = 0";

        try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }
         

            try (
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Voitureutilisateur_view v = new Voitureutilisateur_view();
                v.setIdvoitureutilisateur(resultSet.getInt("idvoitureutilisateur"));
                v.setIdutilisateur((resultSet.getInt("idutilisateur")));
                v.setIdvoituredefini(resultSet.getInt("idvoituredefini"));
                v.setDateventedebut(resultSet.getDate("dateventedebut"));
                v.setDateventefin(resultSet.getDate("dateventefin"));
                v.setMatricule(resultSet.getString("matricule"));
                v.setKilometrage(resultSet.getDouble("kilometrage"));
                v.setPrix(resultSet.getDouble("prix"));
                v.setStatut(resultSet.getInt("statut"));
                v.setNommarque(resultSet.getString("nommarque"));
                v.setNommodele(resultSet.getString("nommodele"));
                v.setNomcarburant(resultSet.getString("nomcarburant"));
                v.setKw(resultSet.getDouble("kw"));
                v.setCv(resultSet.getDouble("cv"));
                v.setNomboitedevitesse(resultSet.getString("nomboitedevitesse"));
                v.setNomtypedevehicule(resultSet.getString("nomtypedevehicule"));
                v.setNbrporte(resultSet.getInt("nbrporte"));
                v.setPuissance(resultSet.getDouble("puissance"));
                v.setNomutilisateur(resultSet.getString("nomutilisateur"));
                liste.add(v);
            }
        }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements voiture defini", e);
        }finally{
            if (con!=null) {
                con.close();
            } 
        }
        return liste;
    }


    public List<Voitureutilisateur_view> rechercheMultiple(Connection con,double prixmin,double prixmax) throws Exception {
        List<Voitureutilisateur_view> liste = new ArrayList<>();

       String query = "SELECT * FROM voitureutilisateur_view WHERE \r\n"+
       "statut = 0";
       String dateventedebut = " dateventedebut >= '"+this.getDateventedebut()+"'";
       String kilometrageRequete = " kilometrage <= "+this.getKilometrage();
       String prixMaxRequete = " prix <= "+prixmax;
       String prixMinRequete = "prix >= "+prixmin;
       String idmarqueRequete = " idmarque = "+this.getIdmarque();
       String idcarburantRequete = " idcarburant = "+this.getIdcarburant();
       String idpuissanceRequete = " idpuissance = "+this.getIdpuissance();
       String idboitedevitesseRequete = " idboitedevitesse = "+this.getIdboitedevitesse();
       String nbrPorteRequete = " nbrporte = "+this.getNbrporte();
       String puissanceRequete = " puissance >= "+this.getPuissance();

        if(this.getDateventedebut() != null)
        {
            query = query+"AND \r\n"+dateventedebut;
        }  
        if(this.getKilometrage() != 0){
            query = query+"AND \r\n"+kilometrageRequete;
        }  
        if(prixmax != 0){
            query = query+"AND \r\n"+prixMaxRequete;
        }
        if(prixmin != 0){
            query = query+"AND \r\n"+prixMinRequete;
        }
        if(this.getIdmarque() != 0){
            query = query+"AND \r\n"+idmarqueRequete;
        }
        if(this.getIdcarburant() != 0){
            query = query+"AND \r\n"+idcarburantRequete;
        }
        if(this.getIdpuissance() != 0){
            query = query+"AND \r\n"+idpuissanceRequete;
        }
        if(this.getIdboitedevitesse() != 0){
            query = query+"AND \r\n"+idboitedevitesseRequete;
        }
        if(this.getNbrporte() != 0){
            query = query+"AND \r\n"+nbrPorteRequete;
        }
        if(this.getPuissance() != 0){
            query = query+"AND \r\n"+puissanceRequete;
        }

        System.out.println(query);
       try {
           if(con==null){
               con = connexionBdd.connexionPostgress();
           }
        

           try (
               PreparedStatement preparedStatement = con.prepareStatement(query);
               ResultSet resultSet = preparedStatement.executeQuery()) {

           while (resultSet.next()) {
               Voitureutilisateur_view v = new Voitureutilisateur_view();
               v.setIdvoitureutilisateur(resultSet.getInt("idvoitureutilisateur"));
               v.setIdutilisateur((resultSet.getInt("idutilisateur")));
               v.setIdvoituredefini(resultSet.getInt("idvoituredefini"));
               v.setDateventedebut(resultSet.getDate("dateventedebut"));
               v.setDateventefin(resultSet.getDate("dateventefin"));
               v.setMatricule(resultSet.getString("matricule"));
               v.setKilometrage(resultSet.getDouble("kilometrage"));
               v.setPrix(resultSet.getDouble("prix"));
               v.setStatut(resultSet.getInt("statut"));
               v.setNommarque(resultSet.getString("nommarque"));
               v.setNommodele(resultSet.getString("nommodele"));
               v.setNomcarburant(resultSet.getString("nomcarburant"));
               v.setKw(resultSet.getDouble("kw"));
               v.setCv(resultSet.getDouble("cv"));
               v.setNomboitedevitesse(resultSet.getString("nomboitedevitesse"));
               v.setNomtypedevehicule(resultSet.getString("nomtypedevehicule"));
               v.setNbrporte(resultSet.getInt("nbrporte"));
               v.setPuissance(resultSet.getDouble("puissance"));
               v.setNomutilisateur(resultSet.getString("nomutilisateur"));
               liste.add(v);
           }
       }

       } catch (SQLException e) {
           e.printStackTrace();
           throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
       }finally{
           if (con!=null) {
               con.close();
           } 
       }
       return liste;
   }

   //Historique des annonces
   public List<Voitureutilisateur_view> getHistoriqueAnnonce(Connection con, int idutilisateur) throws Exception {
        List<Voitureutilisateur_view> liste = new ArrayList<>();
        String query = "SELECT * FROM voitureutilisateur_view WHERE idutilisateur =" +idutilisateur;

        try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }


            try (
                    PreparedStatement preparedStatement = con.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    Voitureutilisateur_view v = new Voitureutilisateur_view();
                    v.setIdvoitureutilisateur(resultSet.getInt("idvoitureutilisateur"));
                    v.setIdutilisateur((resultSet.getInt("idutilisateur")));
                    v.setIdvoituredefini(resultSet.getInt("idvoituredefini"));
                    v.setDateventedebut(resultSet.getDate("dateventedebut"));
                    v.setDateventefin(resultSet.getDate("dateventefin"));
                    v.setMatricule(resultSet.getString("matricule"));
                    v.setKilometrage(resultSet.getDouble("kilometrage"));
                    v.setPrix(resultSet.getDouble("prix"));
                    v.setStatut(resultSet.getInt("statut"));
                    v.setNommarque(resultSet.getString("nommarque"));
                    v.setNommodele(resultSet.getString("nommodele"));
                    v.setNomcarburant(resultSet.getString("nomcarburant"));
                    v.setKw(resultSet.getDouble("kw"));
                    v.setCv(resultSet.getDouble("cv"));
                    v.setNomboitedevitesse(resultSet.getString("nomboitedevitesse"));
                    v.setNomtypedevehicule(resultSet.getString("nomtypedevehicule"));
                    v.setNbrporte(resultSet.getInt("nbrporte"));
                    v.setPuissance(resultSet.getDouble("puissance"));
                    liste.add(v);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements voiture defini", e);
        }finally{
            if (con!=null) {
                con.close();
            }
        }
        return liste;
    }


   public List<Voitureutilisateur_view> get_annonce_autre_utilisateur(Connection con,int id_utilisateur) throws Exception{
    List<Voitureutilisateur_view> liste = new ArrayList<>();
        
    try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }
        
            String query = "SELECT * FROM voitureutilisateur_view WHERE idutilisateur != "+id_utilisateur+" AND statut = 0";
            try (
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Voitureutilisateur_view v = new Voitureutilisateur_view();
                v.setIdvoitureutilisateur(resultSet.getInt("idvoitureutilisateur"));
                v.setIdutilisateur((resultSet.getInt("idutilisateur")));
                v.setIdvoituredefini(resultSet.getInt("idvoituredefini"));
                v.setDateventedebut(resultSet.getDate("dateventedebut"));
                v.setDateventefin(resultSet.getDate("dateventefin"));
                v.setMatricule(resultSet.getString("matricule"));
                v.setKilometrage(resultSet.getDouble("kilometrage"));
                v.setPrix(resultSet.getDouble("prix"));
                v.setStatut(resultSet.getInt("statut"));
                v.setNommarque(resultSet.getString("nommarque"));
                v.setNommodele(resultSet.getString("nommodele"));
                v.setNomcarburant(resultSet.getString("nomcarburant"));
                v.setKw(resultSet.getDouble("kw"));
                v.setCv(resultSet.getDouble("cv"));
                v.setNomboitedevitesse(resultSet.getString("nomboitedevitesse"));
                v.setNomtypedevehicule(resultSet.getString("nomtypedevehicule"));
                v.setNbrporte(resultSet.getInt("nbrporte"));
                v.setPuissance(resultSet.getDouble("puissance"));
                v.setNomutilisateur(resultSet.getString("nomutilisateur"));
                liste.add(v);
            }
        }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
        }finally{
            if (con!=null) {
                con.close();
            } 
        }
        return liste;
   }


   public List<Voitureutilisateur_view> get_liste_de_ces_annonces(Connection con,int id_utilisateur) throws Exception{
    List<Voitureutilisateur_view> liste = new ArrayList<>();
        
    try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }
        
            String query = "SELECT * FROM voitureutilisateur_view WHERE idutilisateur == "+id_utilisateur+" AND statut = 0";
            try (
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Voitureutilisateur_view v = new Voitureutilisateur_view();
                v.setIdvoitureutilisateur(resultSet.getInt("idvoitureutilisateur"));
                v.setIdutilisateur((resultSet.getInt("idutilisateur")));
                v.setIdvoituredefini(resultSet.getInt("idvoituredefini"));
                v.setDateventedebut(resultSet.getDate("dateventedebut"));
                v.setDateventefin(resultSet.getDate("dateventefin"));
                v.setMatricule(resultSet.getString("matricule"));
                v.setKilometrage(resultSet.getDouble("kilometrage"));
                v.setPrix(resultSet.getDouble("prix"));
                v.setStatut(resultSet.getInt("statut"));
                v.setNommarque(resultSet.getString("nommarque"));
                v.setNommodele(resultSet.getString("nommodele"));
                v.setNomcarburant(resultSet.getString("nomcarburant"));
                v.setKw(resultSet.getDouble("kw"));
                v.setCv(resultSet.getDouble("cv"));
                v.setNomboitedevitesse(resultSet.getString("nomboitedevitesse"));
                v.setNomtypedevehicule(resultSet.getString("nomtypedevehicule"));
                v.setNbrporte(resultSet.getInt("nbrporte"));
                v.setPuissance(resultSet.getDouble("puissance"));
                v.setNomutilisateur(resultSet.getString("nomutilisateur"));
                liste.add(v);
            }
        }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
        }finally{
            if (con!=null) {
                con.close();
            } 
        }
        return liste;
   }
}
