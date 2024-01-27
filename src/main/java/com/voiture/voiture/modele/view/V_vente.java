package com.voiture.voiture.modele.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.voiture.voiture.connexion.ConnexionBdd;

@Component
public class V_vente {
    
    private Date dateVente;
    private double vente;
    private float pourcentage;
    private double comission;
    
   


    
    private ConnexionBdd connexionBdd = new ConnexionBdd();

    public List<V_vente> getStatistiqueVentes(Connection con, String dateDebut, String dateFin) throws Exception {
        List<V_vente> list = new ArrayList<>();
        double comission=0;
        String query = "SELECT datedevente,SUM(prix) as montant ,(select pourcentage from comission where date<=v_voiturevendu.datedevente order by date DESC limit 1) as comission FROM v_voiturevendu  WHERE datedevente BETWEEN ? AND ? GROUP BY datedevente";
        try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }
    
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

                //Timestamp timestampDebut = Timestamp.valueOf(dateDebut + " 00:00:00");
                //Timestamp timestampFin = Timestamp.valueOf(dateFin + " 23:59:59");
                Date debut = Date.valueOf(dateDebut);
                Date fin = Date.valueOf(dateFin);


                preparedStatement.setDate(1, debut);
                preparedStatement.setDate(2, fin);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        V_vente vente = new V_vente();
                        vente.setDateVente(resultSet.getDate("datedevente"));
                        vente.setVente(resultSet.getDouble("montant"));
                        vente.setPourcentage(resultSet.getFloat("comission"));
                        comission=(vente.getPourcentage()*vente.getVente())/100;
                        vente.setComission(comission);
                        list.add(vente);
                    }
                }
            }
        return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements ventes", e);
        }finally{
            if (con!=null) {
                con.close();
            } 
        }
    }



    public Date getDateVente() {
        return dateVente;
    }
    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }
    public double getVente() {
        return vente;
    }
    public void setVente(double vente) {
        this.vente = vente;
    }
    public float getPourcentage() {
        return pourcentage;
    }
    public void setPourcentage(float pourcentage) {
        this.pourcentage = pourcentage;
    }
    public double getComission() {
        return comission;
    }
    public void setComission(double comission) {
        this.comission = comission;
    }

}
