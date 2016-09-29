package ar.edu.grupoesfera.cursospring.modelo;


public class Usuario {
	private String nombreLogin;
	private String apellido;
	private String password;
	

	public String getNombreLogin() {
		return nombreLogin;
	}
	public void setNombreLogin(String nombreLogin) {
		this.nombreLogin = nombreLogin;
	}
	public void setNombre(String nombre) {
		this.nombreLogin = nombre;
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
	
}




