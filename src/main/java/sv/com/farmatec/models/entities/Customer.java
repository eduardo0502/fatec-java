package sv.com.farmatec.models.entities;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Customer {
@Id
	private long id;
	 private String PrimerNombre;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrimerNombre() {
		return PrimerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}
	
	
}
