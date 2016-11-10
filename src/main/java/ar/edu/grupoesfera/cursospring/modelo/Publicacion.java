package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicacion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPublicacion;
	
//	@ManyToOne @JoinColumn(name="ID_ESPECIALISTA", nullable= false)
	@Transient
	private Especialista especialista;
	
	@ManyToOne @JoinColumn(name="ID_ZONA", nullable= false)
	private Zona zona;

	@ManyToOne @JoinColumn(name="ID_ESPECIALIDAD", nullable= false)
	private Especialidad especialidad;
	
	private String contenido;
	
	@ManyToOne @JoinColumn(name="ID_GALERIA", nullable= false)
	private Galeria galeria;
	
	public Long getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(Long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	public Especialista getEspecialista() {
		return especialista;
	}
	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Galeria getGaleria() {
		return galeria;
	}
	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}
	
	
	
	
	
	
}
