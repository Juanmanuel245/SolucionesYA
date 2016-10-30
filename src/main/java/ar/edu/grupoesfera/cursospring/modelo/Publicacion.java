package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicacion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idPublicacion;
	
	@Column
	private Especialista especialistaPublicacion;
	
	@Column
	private Zona zonaPublicacion;
	
	@Column
	private Especialidad especialidadPublicacion;
	
	@Column
	private String contenidoPublicacion;
	
	@Column
	private Galeria galeriaPublicacion;

	public Long getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(Long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public Especialista getEspecialistaPublicacion() {
		return especialistaPublicacion;
	}

	public void setEspecialistaPublicacion(Especialista especialistaPublicacion) {
		this.especialistaPublicacion = especialistaPublicacion;
	}

	public Zona getZonaPublicacion() {
		return zonaPublicacion;
	}

	public void setZonaPublicacion(Zona zonaPublicacion) {
		this.zonaPublicacion = zonaPublicacion;
	}

	public Especialidad getEspecialidadPublicacion() {
		return especialidadPublicacion;
	}

	public void setEspecialidadPublicacion(Especialidad especialidadPublicacion) {
		this.especialidadPublicacion = especialidadPublicacion;
	}

	public String getContenidoPublicacion() {
		return contenidoPublicacion;
	}

	public void setContenidoPublicacion(String contenidoPublicacion) {
		this.contenidoPublicacion = contenidoPublicacion;
	}

	public Galeria getGaleriaPublicacion() {
		return galeriaPublicacion;
	}

	public void setGaleriaPublicacion(Galeria galeriaPublicacion) {
		this.galeriaPublicacion = galeriaPublicacion;
	}


	

	
	
	
	
}
