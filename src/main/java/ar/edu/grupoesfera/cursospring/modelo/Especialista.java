package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Especialista extends Usuario{
	
	@Transient
	private Zona zona;
	
	@Transient
	private Reputacion reputacion;
	
	@Transient
	private Especialidad especialidad;
	
	private String nombreEmpresa;
	
	private String imagen;
	
	@Transient
	private Galeria galeria;
	private Integer telefono;
	
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Reputacion getReputacion() {
		return reputacion;
	}
	public void setReputacion(Reputacion reputacion) {
		this.reputacion = reputacion;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Galeria getGaleria() {
		return galeria;
	}
	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}
	
}