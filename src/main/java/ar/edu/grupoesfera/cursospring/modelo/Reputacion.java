package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reputacion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idReputacion;
	
	@Column
	private Integer puntuacionReputacion[];
	
	
	public Long getIdReputacion() {
		return idReputacion;
	}
	public void setIdReputacion(Long idReputacion) {
		this.idReputacion = idReputacion;
	}
	public Integer[] getPuntuacion() {
		return puntuacionReputacion;
	}
	public void setPuntuacion(Integer[] puntuacion) {
		this.puntuacionReputacion = puntuacion;
	}
	
	


}
