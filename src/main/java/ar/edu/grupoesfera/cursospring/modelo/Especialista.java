package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Especialista {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idEspecialista;
	@Column
	private Zona zona;
	
	@Column
	private Reputacion reputacion;
	
	@Column
	private Especialidad especialidad;
	
	@Column
	private String telefono;
	
	@Column
	private String nombreEmpresa;
	
	@Column
	private String imagen;
	
	@Column
	private Galeria galeria;
	
	public Long getIdEspecialista() {
		return idEspecialista;
	}
	public void setIdEspecialista(Long idEspecialista) {
		this.idEspecialista = idEspecialista;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
