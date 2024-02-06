package modele;


import java.sql.ResultSet;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Voituredefini_view {
    
    @Id
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



    
}
