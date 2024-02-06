package com.voiture.voiture.modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Voituredefini {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer  idvoituredefini;
	Integer  idmarque;
	Integer  idmodele;
	Integer  idcarburant;
	Integer  idpuissance;
	Integer  idboitedevitesse;
	Integer  idtypedevehicule;
	Integer  nbrporte;
	Double puissance;

    public Voituredefini() {
    }

    public Voituredefini(Integer  idvoituredefini,Integer  idmarque,Integer  idmodele,Integer  idcarburant,Integer  idpuissance,Integer  idboitedevitesse,Integer  idtypedevehicule,Integer  nbrporte,Double puissance) {
        this.idvoituredefini = idvoituredefini;
		this.idmarque = idmarque;
		this.idmodele = idmodele;
		this.idcarburant = idcarburant;
		this.idpuissance = idpuissance;
		this.idboitedevitesse = idboitedevitesse;
		this.idtypedevehicule = idtypedevehicule;
		this.nbrporte = nbrporte;
		this.puissance = puissance;
    }

    public Integer  getIdvoituredefini() {
        return this.idvoituredefini;
    }

    public void setIdvoituredefini(Integer  idvoituredefini) {
        this.idvoituredefini = idvoituredefini;
    }

	public Integer  getIdmarque() {
        return this.idmarque;
    }

    public void setIdmarque(Integer  idmarque) {
        this.idmarque = idmarque;
    }

	public Integer  getIdmodele() {
        return this.idmodele;
    }

    public void setIdmodele(Integer  idmodele) {
        this.idmodele = idmodele;
    }

	public Integer  getIdcarburant() {
        return this.idcarburant;
    }

    public void setIdcarburant(Integer  idcarburant) {
        this.idcarburant = idcarburant;
    }

	public Integer  getIdpuissance() {
        return this.idpuissance;
    }

    public void setIdpuissance(Integer  idpuissance) {
        this.idpuissance = idpuissance;
    }

	public Integer  getIdboitedevitesse() {
        return this.idboitedevitesse;
    }

    public void setIdboitedevitesse(Integer  idboitedevitesse) {
        this.idboitedevitesse = idboitedevitesse;
    }

	public Integer  getIdtypedevehicule() {
        return this.idtypedevehicule;
    }

    public void setIdtypedevehicule(Integer  idtypedevehicule) {
        this.idtypedevehicule = idtypedevehicule;
    }

	public Integer  getNbrporte() {
        return this.nbrporte;
    }

    public void setNbrporte(Integer  nbrporte) {
        this.nbrporte = nbrporte;
    }

	public Double getPuissance() {
        return this.puissance;
    }

    public void setPuissance(Double puissance) {
        this.puissance = puissance;
    } 
    
    public boolean if_voiture_exist(Connection con) throws SQLException{

        String sql = "SELECT * FROM voituredefini WHERE idmarque = ? AND idmodele = ? AND idcarburant = ? AND idpuissance = ? AND idboitedevitesse = ? AND idtypedevehicule AND nbrporte = ? AND puissance = ?";

       try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, this.getIdmarque());
            pstmt.setInt(2, this.getIdmodele());
            pstmt.setInt(3, this.getIdcarburant());
            pstmt.setInt(4, this.getIdpuissance());
            pstmt.setInt(5, this.getIdboitedevitesse());
            pstmt.setInt(6, this.getIdtypedevehicule());
            pstmt.setInt(7, this.getNbrporte());
            pstmt.setDouble(8, this.getPuissance());

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return false;
   }
}

