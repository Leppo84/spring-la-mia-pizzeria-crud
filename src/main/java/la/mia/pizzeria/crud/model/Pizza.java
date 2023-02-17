package la.mia.pizzeria.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="pizze")
public class Pizza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message="Nome non valido!")
	@NotEmpty(message="Nome non valido!")
	private String name;

	@NotNull(message="Descrizione non valida!")
	@NotEmpty(message="Descrizione non valida!")
	private String description;
	
	@NotNull(message="Foto non valida!")
	@NotEmpty(message="Foto non valida!")
	private String photo;
	
	@Min(0)
	@NotNull(message="Prezzo non valido!")
//	@NotEmpty(message="Prezzo non valido!")
	private Double price;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
	
	
	
}
	