package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ManejoUsuarios {
	
	void registrarUsuario(Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	List<Usuario> traerUsuario(Usuario usuario);
	List<Usuario> traerUsuarioPorId(Long id);

}
