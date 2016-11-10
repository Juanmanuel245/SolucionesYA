package ar.edu.grupoesfera.cursospring.modelo;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Especialista extends Usuario{
	
	@OneToOne @JoinColumn(name="ID_REPUTACION")
	private Reputacion reputacion;
	
	@ManyToOne @JoinColumn(name="ID_ESPECIALIDAD")
	private Especialidad especialidad;
	
	private String nombreEmpresa;
	
	private String imagen;
	
	@OneToOne @JoinColumn(name="ID_GALERIA")
	private Galeria galeria;
	
	private Integer telefono;
	
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
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