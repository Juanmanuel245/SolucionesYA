package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reputacion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReputacion;
	private Integer puntuacion[];
	
	
	public Integer getIdReputacion() {
		return idReputacion;
	}
	public void setIdReputacion(Integer idReputacion) {
		this.idReputacion = idReputacion;
	}
	public Integer[] getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Integer[] puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	


}
