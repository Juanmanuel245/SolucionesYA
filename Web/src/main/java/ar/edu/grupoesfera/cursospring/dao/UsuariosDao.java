package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuariosDao {
	
	List<Usuario> TraerUsuario(Usuario usuario);
	
	List<Usuario> TraerUsuarioPorId(Long id);
	
	void RegistrarUsuario(Usuario usuario);
	
	void actualizarUsuario (Usuario usuario);
	

}
