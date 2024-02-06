package com.voiture.voiture.modele;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.voiture.voiture.connexion.ConnexionBdd;

@Entity()
public class Voituredefini_view {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idvoituredefini;
    Integer idmarque ;
    Integer idmodele ;
    Integer idcarburant ;
    Integer idpuissance ;
    Integer idboitedevitesse ;
    Integer idtypedevehicule;
    Integer nbrporte ;
    double puissance ;
    String nommarque ;
    String nommodele ;
    String nomcarburant ;
    double kw;
    double cv;
    String nomboitedevitesse;
    String nomtypedevehicule;



    public Voituredefini_view() {
    }

    public Voituredefini_view(Integer idmarque) {
        this.idmarque = idmarque;
    }

    public Voituredefini_view(Integer idvoituredefini, Integer idmarque, Integer idmodele, Integer idcarburant,
            Integer idpuissance, Integer idboitedevitesse, Integer idtypedevehicule, Integer nbrporte, double puissance,
            String nommarque, String nommodele, String nomcarburant, double kw, double cv, String nomboitedevitesse,
            String nomtypedevehicule) {
        this.idvoituredefini = idvoituredefini;
        this.idmarque = idmarque;
        this.idmodele = idmodele;
        this.idcarburant = idcarburant;
        this.idpuissance = idpuissance;
        this.idboitedevitesse = idboitedevitesse;
        this.idtypedevehicule = idtypedevehicule;
        this.nbrporte = nbrporte;
        this.puissance = puissance;
        this.nommarque = nommarque;
        this.nommodele = nommodele;
        this.nomcarburant = nomcarburant;
        this.kw = kw;
        this.cv = cv;
        this.nomboitedevitesse = nomboitedevitesse;
        this.nomtypedevehicule = nomtypedevehicule;
    }
    
    public Integer getIdvoituredefini() {
        return idvoituredefini;
    }


    public void setIdvoituredefini(Integer idvoituredefini) {
        this.idvoituredefini = idvoituredefini;
    }


    public Integer getIdmarque() {
        return idmarque;
    }


    public void setIdmarque(Integer idmarque) {
        this.idmarque = idmarque;
    }


    public Integer getIdmodele() {
        return idmodele;
    }


    public void setIdmodele(Integer idmodele) {
        this.idmodele = idmodele;
    }


    public Integer getIdcarburant() {
        return idcarburant;
    }


    public void setIdcarburant(Integer idcarburant) {
        this.idcarburant = idcarburant;
    }


    public Integer getIdpuissance() {
        return idpuissance;
    }


    public void setIdpuissance(Integer idpuissance) {
        this.idpuissance = idpuissance;
    }


    public Integer getIdboitedevitesse() {
        return idboitedevitesse;
    }


    public void setIdboitedevitesse(Integer idboitedevitesse) {
        this.idboitedevitesse = idboitedevitesse;
    }


    public Integer getIdtypedevehicule() {
        return idtypedevehicule;
    }


    public void setIdtypedevehicule(Integer idtypedevehicule) {
        this.idtypedevehicule = idtypedevehicule;
    }


    public Integer getNbrporte() {
        return nbrporte;
    }


    public void setNbrporte(Integer nbrporte) {
        this.nbrporte = nbrporte;
    }


    public double getPuissance() {
        return puissance;
    }


    public void setPuissance(double puissance) {
        this.puissance = puissance;
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


    public List<Voituredefini_view> get_voiture_defini(Connection con) throws Exception{

        //Voituredefini_view vv = new Voituredefini_view();

        List<Voituredefini_view> liste = new ArrayList<>();

        if(con==null){
            ConnexionBdd connexionBdd = new ConnexionBdd();
            con = connexionBdd.connexionPostgress();
        }

        Integer idmarque  = this.getIdmarque();
        Integer idmodele = this.getIdmodele();
        Integer idcarburant  = this.getIdcarburant();
        Integer idpuissance = this.getIdpuissance();
        Integer idboitedevitesse = this.getIdboitedevitesse() ;
        Integer idtypedevehicule = this.getIdtypedevehicule();
        Integer nbrporte  = this.getNbrporte();
        double puissanceVal = this.getPuissance();


   

        String sql = "";

        if(idmarque != 0 && idmodele == 0){
            
            sql = "SELECT idmodele,nommodele FROM voituredefini_view WHERE idmarque = "+idmarque+" GROUP BY idmodele,nommodele";
        
                        try (
                            PreparedStatement preparedStatement = con.prepareStatement(sql);
                            ResultSet resultSet = preparedStatement.executeQuery()) {

                                while(resultSet.next()) {
                                         Voituredefini_view vv = new Voituredefini_view();
                                        int id = resultSet.getInt("idmodele");
                                        String nommodele = resultSet.getString("nommodele");
                                        vv.setIdmodele(id);
                                        vv.setNommodele(nommodele);
                                        liste.add(vv);
                                }

                        } catch (SQLException e) {
                                e.printStackTrace();
                                throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                            }
        }

        if(idmodele != 0 && idcarburant==0){
            sql = "SELECT idcarburant,nomcarburant FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" GROUP BY idcarburant,nomcarburant";
        
                    try (
                        PreparedStatement preparedStatement = con.prepareStatement(sql);
                        ResultSet resultSet = preparedStatement.executeQuery()) {

                    System.out.println(sql);
                    while(resultSet.next()) {
                            Voituredefini_view vv = new Voituredefini_view();
                            int id = resultSet.getInt("idcarburant");
                            String nomcarburant = resultSet.getString("nomcarburant");
                            vv.setIdcarburant(id);
                            vv.setNomcarburant(nomcarburant);
                            liste.add(vv);
                    }

                    } catch (SQLException e) {
                            e.printStackTrace();
                            throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                    }
        
        }

        if(idcarburant != 0 && idpuissance==0){
            sql = "SELECT idpuissance,kw,cv FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" GROUP BY idpuissance,kw,cv";
        
                        try (
                            PreparedStatement preparedStatement = con.prepareStatement(sql);
                            ResultSet resultSet = preparedStatement.executeQuery()) {

                        while(resultSet.next()) {
                                Voituredefini_view vv = new Voituredefini_view();
                                int id = resultSet.getInt("idpuissance");
                                double kw = resultSet.getDouble("kw");
                                double cv = resultSet.getDouble("cv");
                                vv.setIdpuissance(id);
                                vv.setKw(kw);
                                vv.setCv(cv);
                                liste.add(vv);
                        }

                        } catch (SQLException e) {
                                e.printStackTrace();
                                throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                            }
        
        }

        if(idpuissance != 0 && idboitedevitesse==0){
            sql = "SELECT idboitedevitesse,nomboitedevitesse FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" GROUP BY idboitedevitesse,nomboitedevitesse";
        
            try (
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

                    while(resultSet.next()) {
                        Voituredefini_view vv = new Voituredefini_view();
                        int id = resultSet.getInt("idboitedevitesse");
                        String nomboitedevitesse = resultSet.getString("nomboitedevitesse");
                        vv.setIdboitedevitesse(id);
                        vv.setNomboitedevitesse(nomboitedevitesse);
                        liste.add(vv);
                    }

                    } catch (SQLException e) {
                            e.printStackTrace();
                            throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                    }
        }

        if(idboitedevitesse != 0 && idtypedevehicule==0){
            sql = "SELECT idtypedevehicule,nomtypedevehicule FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" AND idboitedevitesse="+idboitedevitesse+" GROUP BY idtypedevehicule,nomtypedevehicule";
        
            try (
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

                        while(resultSet.next()) {
                            Voituredefini_view vv = new Voituredefini_view();
                            int id = resultSet.getInt("idtypedevehicule");
                            String nomtypeDeVehicule = resultSet.getString("nomtypedevehicule");
                            vv.setIdtypedevehicule(id);
                            vv.setNomtypedevehicule(nomtypeDeVehicule);
                            liste.add(vv);
                        }

                        } catch (SQLException e) {
                                e.printStackTrace();
                                throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                        }
        }

        if(idtypedevehicule!=0 && nbrporte==0){
            sql = "SELECT nbrporte FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" AND idboitedevitesse="+idboitedevitesse+" AND idtypedevehicule = "+idtypedevehicule+" GROUP BY nbrporte";
        
            try (
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while(resultSet.next()) {
                Voituredefini_view vv = new Voituredefini_view();
                int nbr = resultSet.getInt("nbrporte");
                vv.setNbrporte(nbr);
                liste.add(vv);
            }

            } catch (SQLException e) {
                    e.printStackTrace();
                    throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                }
        
        }


        if(nbrporte!=0 && puissanceVal==0){
            sql = "SELECT puissance FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" AND idboitedevitesse="+idboitedevitesse+" AND idtypedevehicule = "+idtypedevehicule+" AND nbrporte = "+nbrporte+" GROUP BY puissance";
        
            try (
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            if(resultSet.next()) {
                Voituredefini_view vv = new Voituredefini_view();
                double p = resultSet.getDouble("puissance");
                vv.setPuissance(p);
                liste.add(vv);
            }

            } catch (SQLException e) {
                    e.printStackTrace();
                    throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
                }
        
        }


        if(puissanceVal!=0){
            sql = "SELECT * FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" AND idboitedevitesse="+idboitedevitesse+" AND idtypedevehicule = "+idtypedevehicule+" AND nbrporte = "+nbrporte+" AND puissance = "+puissanceVal;
        
            try (
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            if(resultSet.next()) {
                Voituredefini_view vv = new Voituredefini_view();
                int idVoitureDefini = resultSet.getInt("idvoituredefini");
                vv.setIdvoituredefini(idVoitureDefini);
                liste.add(vv);
            }

            } catch (SQLException e) {
                e.printStackTrace();
                throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
            }
        }

        if (con!=null) {
            con.close();
        } 
        System.out.println(sql);
        return liste;
    }


}
