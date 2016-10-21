package ar.edu.grupoesfera.cursospring.servicios;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface PersonaService {
	
	Usuario validarUsuario(String usuario, String password);

}
