package ar.edu.grupoesfera.cursospring.modelo;

public class Reputacion {
	private Integer IdReputacion;
	private Integer Puntuacion[];
	public Integer getIdReputacion() {
		return IdReputacion;
	}
	public void setIdReputacion(Integer idReputacion) {
		IdReputacion = idReputacion;
	}
	public Integer[] getPuntuacion() {
		return Puntuacion;
	}
	public void setPuntuacion(Integer puntuacion[]) {
		Puntuacion = puntuacion;
	}

}
