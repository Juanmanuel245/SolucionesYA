package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ManejoUsuarios {
	
	List<Usuario> TraerUsuario(Usuario usuario);
	
	void RegistrarUsuario(Usuario usuario);
	

}
