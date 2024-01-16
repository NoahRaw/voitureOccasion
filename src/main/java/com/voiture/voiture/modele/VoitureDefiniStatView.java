package com.voiture.voiture.modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.voiture.voiture.connexion.ConnexionBdd;



public class VoitureDefiniStatView {


    int idVoituredefini;

    int idMarque;

    String nomMarque;

    String nomModele;

    double nombre;

    ConnexionBdd connexionBdd = new ConnexionBdd();
    public VoitureDefiniStatView() {
    }

    public VoitureDefiniStatView(int idVoituredefini, int idMarque, String nomMarque, String nomModele,double nombre) {
        this.idVoituredefini = idVoituredefini;
        this.idMarque = idMarque;
        this.nomMarque = nomMarque;
        this.nomModele = nomModele;
        this.nombre = nombre;
    }

    public VoitureDefiniStatView(int idMarque, String nomMarque, String nomModele,double nombre) {
        this.idMarque = idMarque;
        this.nomMarque = nomMarque;
        this.nomModele = nomModele;
        this.nombre = nombre;
    }

    public int getIdVoituredefini() {
        return idVoituredefini;
    }

    public void setIdVoituredefini(int idVoituredefini) {
        this.idVoituredefini = idVoituredefini;
    }

    public int getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(int idMarque) {
        this.idMarque = idMarque;
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    public String getNomModele() {
        return nomModele;
    }

    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }

    public double getNombre(){
        return this.nombre;
    }

    public void setNombre(double nombre){
        this.nombre = nombre;
    }

    public List<VoitureDefiniStatView> getVentetolal(Connection con,String dateMin,String dateMax) throws Exception {
         List<VoitureDefiniStatView> liste = new ArrayList<>();
        String query = "SELECT VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description as nommarque,modele.description as nommodele,COUNT(*) as nombre \r\n" + //
                "FROM VoitureUtilisateur\r\n" + //
                "JOIN VoitureDefini ON VoitureUtilisateur.idvoituredefini = VoitureDefini.idvoituredefini\r\n" + //
                "JOIN marque ON VoitureDefini.idmarque = marque.idmarque\r\n" + //
                "JOIN modele ON VoitureDefini.idmodele = modele.idmodele\r\n" + //
                "WHERE voitureutilisateur.statut=1 AND dateventefin >= '"+dateMin+"' AND dateventefin <= '"+dateMax+"' \r\n" + //
                "GROUP BY VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description,modele.idmodele\r\n" + //
                "ORDER BY COUNT(*) DESC";

        try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }
         
            try (
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                VoitureDefiniStatView v = new VoitureDefiniStatView();
                v.setIdVoituredefini(resultSet.getInt("idvoituredefini"));
                v.setIdMarque(resultSet.getInt("idmarque"));
                v.setNomMarque(resultSet.getString("nommarque"));
                v.setNomModele(resultSet.getString("nommodele"));
                v.setNombre(resultSet.getDouble("nombre"));
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
}
