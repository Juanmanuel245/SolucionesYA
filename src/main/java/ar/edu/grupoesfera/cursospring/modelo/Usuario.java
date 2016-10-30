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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuarioNick() {
		return usuarioNick;
	}

	public void setUsuarioNick(String usuarioNick) {
		this.usuarioNick = usuarioNick;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getRolUsuario() {
		return rolUsuario;
	}

	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	public Integer getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(Integer telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}
	

	
	
	
}




