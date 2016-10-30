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

	public Zona getZonaEspecialista() {
		return zonaEspecialista;
	}

	public void setZonaEspecialista(Zona zonaEspecialista) {
		this.zonaEspecialista = zonaEspecialista;
	}

	public Reputacion getReputacionEspecialista() {
		return reputacionEspecialista;
	}

	public void setReputacionEspecialista(Reputacion reputacionEspecialista) {
		this.reputacionEspecialista = reputacionEspecialista;
	}

	public Especialidad getEspecialidadEspecialista() {
		return especialidadEspecialista;
	}

	public void setEspecialidadEspecialista(Especialidad especialidadEspecialista) {
		this.especialidadEspecialista = especialidadEspecialista;
	}

	public String getTelefonoEspecialista() {
		return telefonoEspecialista;
	}

	public void setTelefonoEspecialista(String telefonoEspecialista) {
		this.telefonoEspecialista = telefonoEspecialista;
	}

	public String getNombreEmpresaEspecialista() {
		return nombreEmpresaEspecialista;
	}

	public void setNombreEmpresaEspecialista(String nombreEmpresaEspecialista) {
		this.nombreEmpresaEspecialista = nombreEmpresaEspecialista;
	}

	public String getLogotipoEspecialista() {
		return logotipoEspecialista;
	}

	public void setLogotipoEspecialista(String logotipoEspecialista) {
		this.logotipoEspecialista = logotipoEspecialista;
	}

	public Galeria getGaleriaEspecialista() {
		return galeriaEspecialista;
	}

	public void setGaleriaEspecialista(Galeria galeriaEspecialista) {
		this.galeriaEspecialista = galeriaEspecialista;
	}
	

	
}
