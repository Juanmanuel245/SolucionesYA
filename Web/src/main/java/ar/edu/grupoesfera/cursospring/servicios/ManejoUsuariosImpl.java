package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.UsuariosDao;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class ManejoUsuariosImpl implements ManejoUsuarios{
	
	@Inject 
	public UsuariosDao servicioUsuariosDao;	

	@Override
	public void RegistrarUsuario(Usuario usuario) {
		
		servicioUsuariosDao.RegistrarUsuario(usuario);
		return;	
	}

	@Override
	public List<Usuario> TraerUsuario(Usuario usuario) {
		return servicioUsuariosDao.TraerUsuario(usuario);
	}

	@Override
	public List<Usuario> TraerUsuarioPorId(Long id) {
		return servicioUsuariosDao.TraerUsuarioPorId(id);
	}

	@Override
	public void ActualizarUsuario(Usuario usuario) {

		servicioUsuariosDao.ActualizarUsuario(usuario);
		
		return;
		
	}

}
