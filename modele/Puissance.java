package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Puissance {
    @Id
	@GeneratedValue()
	Integer  idpuissance;
	Double kw;
	Double cv;

    public Puissance() {
    }

    public Puissance(Integer  idpuissance,Double kw,Double cv) {
        this.idpuissance = idpuissance;
		this.kw = kw;
		this.cv = cv;
    }

    public Integer  getIdpuissance() {
        return this.idpuissance;
    }

    public void setIdpuissance(Integer  idpuissance) {
        this.idpuissance = idpuissance;
    }

	public Double getKw() {
        return this.kw;
    }

    public void setKw(Double kw) {
        this.kw = kw;
    }

	public Double getCv() {
        return this.cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }  
}

