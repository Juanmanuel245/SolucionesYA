package ar.edu.grupoesfera.cursospring.modelo;

public class Especialista {
	private Integer IdEspecialista;
	private Zona zona;
	private Reputacion reputacion;
	private Especialidad especialidad;
	private String telefono;
	private String nombreEmpresa;
	private String imagen;
	private Galeria galeria;
	public Integer getIdEspecialista() {
		return IdEspecialista;
	}
	public void setIdEspecialista(Integer idEspecialista) {
		IdEspecialista = idEspecialista;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
