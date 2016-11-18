package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuariosDao {
	
	List<Usuario> traerUsuario(Usuario usuario);
	
	List<Usuario> traerUsuarioPorId(Long id);
	
	void registrarUsuario(Usuario usuario);
	
	void actualizarUsuario (Usuario usuario);
	

}
