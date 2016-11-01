package ar.edu.grupoesfera.cursospring.servicios;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ManejoHibernate {
	
	void GenerarUsuarios();
	Usuario TraerUsuarios(Long id);

}
