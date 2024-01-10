package com.voiture.voiture.model.view;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.voiture.voiture.connexion.ConnexionBdd;

// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name="v_vente")
@Component
public class V_vente {
    
    // @Column(name = "total_price")
    private double total_price;
    // @Column(name = "status")
    private int status;
    // private Date dateDebut;
    // private Date dateFin;


    private ConnexionBdd connexionBdd = new ConnexionBdd();

    public V_vente getVentetolal(Connection con, String dateDebut, String dateFin) throws Exception {
        V_vente vente = new V_vente();
        String query = "SELECT SUM(prix) as total_price, statut FROM VoitureUtilisateur WHERE statut = 1 AND dateventefin BETWEEN ? AND ? GROUP BY statut";
    
        try {
            if (con == null) {
                con = connexionBdd.connexionPostgress();
            }
    
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                
                Timestamp timestampDebut = Timestamp.valueOf(dateDebut + " 00:00:00");
                Timestamp timestampFin = Timestamp.valueOf(dateFin + " 23:59:59");
    
                preparedStatement.setTimestamp(1, timestampDebut);
                preparedStatement.setTimestamp(2, timestampFin);
    
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        vente.setStatus(resultSet.getInt("statut"));
                        vente.setTotal_price(resultSet.getDouble("total_price"));
                    }
                }
            }
            return vente;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erreur lors de la récupération des enregistrements de vente", e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
        public List<V_vente> getAllVentes(Connection con) throws Exception {
        List<V_vente> list = new ArrayList<>();
        String query = "SELECT * FROM v_vente";

        try {
            if(con==null){
                con = connexionBdd.connexionPostgress();
            }
        
            try (
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                V_vente vente = new V_vente();
                vente.setStatus(resultSet.getInt("statut"));
                vente.setTotal_price(resultSet.getInt("total_price"));

                list.add(vente);
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


    public double getTotal_price() {
        return total_price;
    }
    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    // public Date getDateDebut() {
    //     return dateDebut;
    // }
    // public void setDateDebut(Date dateDebut) {
    //     this.dateDebut = dateDebut;
    // }
    // public Date getDateFin() {
    //     return dateFin;
    // }
    // public void setDateFin(Date dateFin) {
    //     this.dateFin = dateFin;
    // }
}
