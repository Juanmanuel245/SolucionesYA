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
	private Galeria galeriaPublicaicon;
	
	public Long getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(Long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	public Especialista getEspecialista() {
		return especialistaPublicacion;
	}
	public void setEspecialista(Especialista especialista) {
		this.especialistaPublicacion = especialista;
	}
	public Zona getZona() {
		return zonaPublicacion;
	}
	public void setZona(Zona zona) {
		this.zonaPublicacion = zona;
	}
	public Especialidad getEspecialidad() {
		return especialidadPublicacion;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidadPublicacion = especialidad;
	}
	public String getContenido() {
		return contenidoPublicacion;
	}
	public void setContenido(String contenido) {
		this.contenidoPublicacion = contenido;
	}
	public Galeria getGaleria() {
		return galeriaPublicaicon;
	}
	public void setGaleria(Galeria galeria) {
		this.galeriaPublicaicon = galeria;
	}
	
	
	
	
	
	
}
