package ar.edu.grupoesfera.cursospring.servicios;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ManejoHibernate {
	
	void GenerarUsuarios();
	void GenerarPublicaciones();
	Usuario TraerUsuarios(Long id);
	Usuario validarUsuario(String emailBuscado, String passwordBuscad);

}
