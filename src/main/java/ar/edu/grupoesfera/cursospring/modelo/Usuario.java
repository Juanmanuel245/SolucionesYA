package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	// el @GeneratedValue sirve para hacerlo autoincremental y el @id para decir que va a ser el id el proximo valor
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column
	private String usuarioNick;
	
	@Column
	private String nombreUsuario;
	
	@Column
	private String apellidoUsuario;
	
	@Column
	private String passwordUsuario;
	
	@Column
	private String emailUsuario;
	
	@Column
	private String rolUsuario;
	
	@Column
	private Integer telefonoUsuario;
	
	public Integer getTelefono() {
		return telefonoUsuario;
	}
	public void setTelefono(Integer telefono) {
		this.telefonoUsuario = telefono;
	}
	public String getNombre() {
		return nombreUsuario;
	}
	public void setNombre(String nombre) {
		this.nombreUsuario = nombre;
	}
	public String getApellido() {
		return apellidoUsuario;
	}
	public void setApellido(String apellido) {
		this.apellidoUsuario = apellido;
	}
	public String getPassword() {
		return passwordUsuario;
	}
	public void setPassword(String password) {
		this.passwordUsuario = password;
	}
	public String getEmail() {
		return emailUsuario;
	}
	public void setEmail(String email) {
		this.emailUsuario = email;
	}
	public String getUsuario() {
		return usuarioNick;
	}
	public void setUsuario(String usuario) {
		this.usuarioNick = usuario;
	}
	public String getRol() {
		return rolUsuario;
	}
	public void setRol(String rol) {
		this.rolUsuario = rol;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}




