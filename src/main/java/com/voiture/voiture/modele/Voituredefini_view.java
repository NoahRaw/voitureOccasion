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

    ConnexionBdd connexionBdd = new ConnexionBdd();


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


    public Voituredefini_view get_voiture_defini(Connection con) throws Exception{

        Voituredefini_view vv = new Voituredefini_view();

        if(con==null){
            con = connexionBdd.connexionPostgress();
        }

        Integer idmarque  = this.getIdmarque();
        Integer idmodele = this.getIdmodele();
        Integer idcarburant  = this.getIdcarburant();
        Integer idpuissance = this.getIdpuissance();
        Integer idboitedevitesse = this.getIdboitedevitesse() ;
        Integer idtypedevehicule = this.getIdtypedevehicule();
        Integer nbrporte  = this.getNbrporte();

        String sql = "SELECT idmarque,nommarque FROM voituredefini_view GROUP BY idmarque,nommarque";

        if(idmarque != 0){
            sql = "SELECT idmodele,nommodele FROM voituredefini_view WHERE idmarque = "+idmarque+" GROUP BY idmodele,nommodele";
        }

        if(idmodele != 0){
            sql = "SELECT idcarburant,nomcarburant FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" GROUP BY idcarburant,nomcarburant";
        }

        if(idcarburant != 0){
            sql = "SELECT idpuissance,kw,cv FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" GROUP BY idpuissance,kw,cv";
        }

        if(idpuissance != 0){
            sql = "SELECT idboitedevitesse,nomboitedevitesse FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" GROUP BY idboitedevitesse,nomboitedevitesse";
        }

        if(idboitedevitesse != 0){
            sql = "SELECT idtypedevehicule,nomtypedevehicule FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" AND idboitedevitesse="+idboitedevitesse+" GROUP BY idtypedevehicule,nomtypedevehicule";
        }

        if(idtypedevehicule!=0){
            sql = "SELECT nbrporte FROM voituredefini_view WHERE idmarque = "+idmarque+" AND idmodele = "+idmodele+" AND idcarburant = "+idcarburant+" AND idpuissance="+idpuissance+" AND idboitedevitesse="+idboitedevitesse+" AND idtypedevehicule = "+idtypedevehicule+" GROUP BY nbrporte";
        }


        try (
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while(resultSet.next()) {

                if(resultSet.findColumn("idmarque") > 0) {
                    idmarque = resultSet.getInt("idmodele");
                    String nommarque = resultSet.getString("nommarque");
                    vv.setIdmarque(idmarque);
                    vv.setNommarque(nommarque);
                }

                if(resultSet.findColumn("idmodele") > 0) {
                    idmodele = resultSet.getInt("idmodele");
                    String nommodele = resultSet.getString("nommodele");
                    vv.setIdmodele(idmodele);
                    vv.setNommodele(nommodele);
                }

                if(resultSet.findColumn("idcarburant") > 0) {
                    idcarburant = resultSet.getInt("idcarburant");
                    String nomcarburant = resultSet.getString("nomcarburant");
                    vv.setIdcarburant(idcarburant);
                    vv.setNomcarburant(nomcarburant);
                }

                if(resultSet.findColumn("idpuissance") > 0) {
                    idpuissance = resultSet.getInt("idpuissance");
                    double kw = resultSet.getDouble("kw");
                    double cv = resultSet.getDouble("cv");
                    vv.setIdpuissance(idpuissance);
                    vv.setKw(kw);
                    vv.setCv(cv);
                }
                
                if(resultSet.findColumn("idboitedevitesse") > 0) {
                    idboitedevitesse = resultSet.getInt("idboitedevitesse");
                    String nomboitedevitesse = resultSet.getString("nomboitedevitesse");
                   vv.setIdboitedevitesse(idboitedevitesse);
                   vv.setNomboitedevitesse(nomboitedevitesse);
                }

                if(resultSet.findColumn("idtypedevehicule") > 0) {
                    idtypedevehicule = resultSet.getInt("idtypedevehicule");
                    String nomtypeDeVehicule = resultSet.getString("nomtypedevehicule");
                   vv.setIdtypedevehicule(idtypedevehicule);
                   vv.setNomtypedevehicule(nomtypeDeVehicule);
                }

                if(resultSet.findColumn("nbrporte") > 0) {
                    nbrporte = resultSet.getInt("nbrporte");
                    vv.setNbrporte(nbrporte);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements voiture utilisateur", e);
        }finally{
            if (con!=null) {
                con.close();
            } 

            return vv;
        }

    }


}
