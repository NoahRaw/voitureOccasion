package com.voiture.voiture.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnexionBdd {
    
    public static Connection connexionOracle(String user, String mdp)
    throws Exception {
        Connection con=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL",user, mdp); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch(SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return con;
    }

    public Connection connexionPostgress()
    throws Exception {
        Connection con=null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://postgresql-testdeploiment.alwaysdata.net:5432/testdeploiment_voiture","testdeploiment","Majoreni3/"); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch(SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return con;
    }
}
