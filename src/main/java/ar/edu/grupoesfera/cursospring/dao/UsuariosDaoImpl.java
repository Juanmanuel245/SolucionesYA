package ar.edu.grupoesfera.cursospring.dao;


import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service @Transactional
public class UsuariosDaoImpl implements UsuariosDao {
	
	@Inject
    private SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Usuario> traerUsuario(Usuario usuario) {
		final Session session = sessionFactory.openSession();
		List usuarios = session.createCriteria(Usuario.class)
								.add(Restrictions.eq("email", usuario.getEmail()))
								.add(Restrictions.eq("password", usuario.getPassword()))
								.list();
		
		return usuarios;				
	}

	@Override
	public void registrarUsuario(Usuario usuario) {
		final Session session = sessionFactory.openSession();
		session.save(usuario);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Usuario> traerUsuarioPorId(Long id) {
		final Session session = sessionFactory.openSession();
		List usuarios = session.createCriteria(Usuario.class)
								.add(Restrictions.eq("id", id))
								.list();
		
		return usuarios;				
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		final Session session = sessionFactory.getCurrentSession();
		session.update(usuario);
	}

}
