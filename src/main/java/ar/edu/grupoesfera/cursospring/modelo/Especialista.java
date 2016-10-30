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
	private Zona zonaEspecialista;
	
	@Column
	private Reputacion reputacionEspecialista;
	
	@Column
	private Especialidad especialidadEspecialista;
	
	@Column
	private String telefonoEspecialista;
	
	@Column
	private String nombreEmpresaEspecialista;
	
	@Column
	private String logotipoEspecialista;
	
	@Column
	private Galeria galeriaEspecialista;
	
	public Long getIdEspecialista() {
		return idEspecialista;
	}
	public void setIdEspecialista(Long idEspecialista) {
		this.idEspecialista = idEspecialista;
	}
	public Zona getZona() {
		return zonaEspecialista;
	}
	public void setZona(Zona zona) {
		this.zonaEspecialista = zona;
	}
	public Reputacion getReputacion() {
		return reputacionEspecialista;
	}
	public void setReputacion(Reputacion reputacion) {
		this.reputacionEspecialista = reputacion;
	}
	public Especialidad getEspecialidad() {
		return especialidadEspecialista;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidadEspecialista = especialidad;
	}
	public String getTelefono() {
		return telefonoEspecialista;
	}
	public void setTelefono(String telefono) {
		this.telefonoEspecialista = telefono;
	}
	public String getNombreEmpresa() {
		return nombreEmpresaEspecialista;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresaEspecialista = nombreEmpresa;
	}
	public String getImagen() {
		return logotipoEspecialista;
	}
	public void setImagen(String imagen) {
		this.logotipoEspecialista = imagen;
	}
	public Galeria getGaleria() {
		return galeriaEspecialista;
	}
	public void setGaleria(Galeria galeria) {
		this.galeriaEspecialista = galeria;
	}
	
	
}
