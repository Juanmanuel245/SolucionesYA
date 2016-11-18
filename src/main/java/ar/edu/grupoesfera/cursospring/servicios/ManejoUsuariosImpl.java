package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.UsuariosDao;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service @Transactional
public class ManejoUsuariosImpl implements ManejoUsuarios{
	
	@Inject 
	public UsuariosDao servicioUsuariosDao;	

	@Override
	public void registrarUsuario(Usuario usuario) {
		
		servicioUsuariosDao.registrarUsuario(usuario);
		return;	
	}

	@Override
	public List<Usuario> traerUsuario(Usuario usuario) {
		return servicioUsuariosDao.traerUsuario(usuario);
	}

	@Override
	public List<Usuario> traerUsuarioPorId(Long id) {
		return servicioUsuariosDao.traerUsuarioPorId(id);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {

		servicioUsuariosDao.actualizarUsuario(usuario);
		
		
	}

}
