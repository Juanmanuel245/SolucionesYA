package ar.edu.grupoesfera.cursospring.dao;


import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class UsuariosDaoImpl implements UsuariosDao {
	
	@Inject
    private SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Usuario> TraerUsuario(Usuario usuario) {
		final Session session = sessionFactory.openSession();
		List usuarios = session.createCriteria(Usuario.class)
								.add(Restrictions.eq("email", usuario.getEmail()))
								.add(Restrictions.eq("password", usuario.getPassword()))
								.list();
		
		return usuarios;				
	}

	@Override
	public void RegistrarUsuario(Usuario usuario) {
		final Session session = sessionFactory.openSession();
		
		session.save(usuario);
		
		return;
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Usuario> TraerUsuarioPorId(Long id) {
		final Session session = sessionFactory.openSession();
		List usuarios = session.createCriteria(Usuario.class)
								.add(Restrictions.eq("id", id))
								.list();
		
		return usuarios;				
	}

	@Override
	public void ActualizarUsuario(Usuario usuario) {
		final Session session = sessionFactory.openSession();
		session.update(usuario);
		return;
		
	}

}
