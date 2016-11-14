package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ManejoUsuarios {
	
	void RegistrarUsuario(Usuario usuario);
	void ActualizarUsuario(Usuario usuario);
	List<Usuario> TraerUsuario(Usuario usuario);
	List<Usuario> TraerUsuarioPorId(Long id);

}
