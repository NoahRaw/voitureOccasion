package com.voiture.voiture.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Voituredefini {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int  idvoituredefini;
	int  idmarque;
	int  idmodele;
	int  idcarburant;
	int  idpuissance;
	int  idboitedevitesse;
	int  idtypedevehicule;
	int  nbrporte;
	Double puissance;

    public Voituredefini() {
    }

    public Voituredefini(int  idvoituredefini,int  idmarque,int  idmodele,int  idcarburant,int  idpuissance,int  idboitedevitesse,int  idtypedevehicule,int  nbrporte,Double puissance) {
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

    public int  getIdvoituredefini() {
        return this.idvoituredefini;
    }

    public void setIdvoituredefini(int  idvoituredefini) {
        this.idvoituredefini = idvoituredefini;
    }

	public int  getIdmarque() {
        return this.idmarque;
    }

    public void setIdmarque(int  idmarque) {
        this.idmarque = idmarque;
    }

	public int  getIdmodele() {
        return this.idmodele;
    }

    public void setIdmodele(int  idmodele) {
        this.idmodele = idmodele;
    }

	public int  getIdcarburant() {
        return this.idcarburant;
    }

    public void setIdcarburant(int  idcarburant) {
        this.idcarburant = idcarburant;
    }

	public int  getIdpuissance() {
        return this.idpuissance;
    }

    public void setIdpuissance(int  idpuissance) {
        this.idpuissance = idpuissance;
    }

	public int  getIdboitedevitesse() {
        return this.idboitedevitesse;
    }

    public void setIdboitedevitesse(int  idboitedevitesse) {
        this.idboitedevitesse = idboitedevitesse;
    }

	public int  getIdtypedevehicule() {
        return this.idtypedevehicule;
    }

    public void setIdtypedevehicule(int  idtypedevehicule) {
        this.idtypedevehicule = idtypedevehicule;
    }

	public int  getNbrporte() {
        return this.nbrporte;
    }

    public void setNbrporte(int  nbrporte) {
        this.nbrporte = nbrporte;
    }

	public Double getPuissance() {
        return this.puissance;
    }

    public void setPuissance(Double puissance) {
        this.puissance = puissance;
    }  
}

