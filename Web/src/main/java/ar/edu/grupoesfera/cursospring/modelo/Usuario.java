package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // el @GeneratedValue sirve para hacerlo autoincremental y el @id para decir que va a ser el id el proximo valor
	private Long id;
	private String nombre;
	private String apellido;
	private String password;
	private String email;
	private String telefono;
	private String nombreEmpresa;
	private String logoEmpresa;
	private Integer vecesContratado;
	private Integer balance;

	@OneToOne @JoinColumn(name="ID_REPUTACION")
	private Reputacion reputacion;
	
	@OneToOne @JoinColumn(name="ID_GALERIA")
	private Galeria galeria;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getLogoEmpresa() {
		return logoEmpresa;
	}

	public void setLogoEmpresa(String logoEmpresa) {
		this.logoEmpresa = logoEmpresa;
	}

	public Reputacion getReputacion() {
		return reputacion;
	}

	public void setReputacion(Reputacion reputacion) {
		this.reputacion = reputacion;
	}

	public Galeria getGaleria() {
		return galeria;
	}

	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}

	public Integer getVecesContratado() {
		return vecesContratado;
	}

	public void setVecesContratado(Integer vecesContratado) {
		this.vecesContratado = vecesContratado;
	}
	
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}



