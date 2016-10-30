package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zona {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idZona;
	
	@Column
	private String nombreZona;
	
	public Long getIdZona() {
		return idZona;
	}
	public void setIdZona(Long idZona) {
		this.idZona = idZona;
	}
	public String getNombre() {
		return nombreZona;
	}
	public void setNombre(String nombre) {
		this.nombreZona = nombre;
	}
	
	

}
