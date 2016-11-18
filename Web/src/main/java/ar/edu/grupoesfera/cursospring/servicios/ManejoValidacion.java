package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ManejoValidacion {
	
	Boolean validarLogin(List<Usuario> usuariosValidos, String email, String password);

}
