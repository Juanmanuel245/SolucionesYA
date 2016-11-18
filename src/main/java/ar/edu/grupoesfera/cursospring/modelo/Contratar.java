package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contratar {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContratar;
	
	@ManyToOne @JoinColumn(name="ID_USUARIO_CONTRATADO")
	private Usuario usuarioContratado;
	private Long idUsuarioContratador;
	private Long idPublicacion;
	private String nombreEspecialidad;
	

	public Long getIdContratar() {
		return idContratar;
	}
	public void setIdContratar(Long idContratar) {
		this.idContratar = idContratar;
	}
	public Usuario getUsuarioContratado() {
		return usuarioContratado;
	}
	public void setUsuarioContratado(Usuario usuarioContratado) {
		this.usuarioContratado = usuarioContratado;
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
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}
	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	
}
