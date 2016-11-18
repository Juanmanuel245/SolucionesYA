package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contratar {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContratar;
	
	private Long idUsuarioContratado;
	private Long idUsuarioContratador;
	private Long idPublicacion;
	
	public Long getIdContratar() {
		return idContratar;
	}
	public void setIdContratar(Long idContratar) {
		this.idContratar = idContratar;
	}
	public Long getIdUsuarioContratado() {
		return idUsuarioContratado;
	}
	public void setIdUsuarioContratado(Long idUsuarioContratado) {
		this.idUsuarioContratado = idUsuarioContratado;
	}
	public Long getIdUsuarioContratador() {
		return idUsuarioContratador;
	}
	public void setIdUsuarioContratador(Long idUsuarioContratador) {
		this.idUsuarioContratador = idUsuarioContratador;
	}
	public Long getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(Long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
}
