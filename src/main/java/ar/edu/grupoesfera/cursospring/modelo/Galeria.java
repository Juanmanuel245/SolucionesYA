package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Galeria {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idGaleria;
	
	@Column
	private String imagenGaleria[];

	public Long getIdGaleria() {
		return idGaleria;
	}

	public void setIdGaleria(Long idGaleria) {
		this.idGaleria = idGaleria;
	}

	public String[] getImagenGaleria() {
		return imagenGaleria;
	}

	public void setImagenGaleria(String[] imagenGaleria) {
		this.imagenGaleria = imagenGaleria;
	}
	

	
}
