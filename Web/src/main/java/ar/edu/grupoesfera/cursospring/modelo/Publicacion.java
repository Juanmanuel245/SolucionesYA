package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicacion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPublicacion;
	
	@ManyToOne @JoinColumn(name="ID_USUARIO")
	private Usuario usuario;
	
	@ManyToOne @JoinColumn(name="ID_ZONA")
	private Zona zona;
	
	private String contenido;
	
	@ManyToOne @JoinColumn(name="ID_ESPECIALIDAD")
	private Especialidad especialidad;

	public Long getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(Long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	

}
