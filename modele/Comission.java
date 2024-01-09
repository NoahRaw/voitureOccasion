package modele;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity()
public class Comission {
    @Id
	@GeneratedValue()
	int  idcomission;
	Date date;
	Double pourcentage;

    public Comission() {
    }

    public Comission(int  idcomission,Date date,Double pourcentage) {
        this.idcomission = idcomission;
		this.date = date;
		this.pourcentage = pourcentage;
    }

    public int  getIdcomission() {
        return this.idcomission;
    }

    public void setIdcomission(int  idcomission) {
        this.idcomission = idcomission;
    }

	public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

	public Double getPourcentage() {
        return this.pourcentage;
    }

    public void setPourcentage(Double pourcentage) {
        this.pourcentage = pourcentage;
    }  
}

