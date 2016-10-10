package ar.edu.grupoesfera.cursospring.modelo;

public class Publicacion {
	private Integer IdPublicacion;
	private Especialista especialista;
	private Zona zona;
	private Especialidad especialidad;
	private String contenido;
	private Galeria galeria;
	public Integer getIdPublicacion() {
		return IdPublicacion;
	}
	public void setIdPublicacion(Integer idPublicacion) {
		IdPublicacion = idPublicacion;
	}
	public Especialista getEspecialista() {
		return especialista;
	}
	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Galeria getGaleria() {
		return galeria;
	}
	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}
	
	
	
	
}
