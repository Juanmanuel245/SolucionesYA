package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

@Service
public class PublicacionDaoImpl implements PublicacionDao{
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public void guardarPublicacion(PublicacionDTO publicacion, Zona zona, Especialidad especialidad) {
		final Session session = sessionFactory.openSession();
		Publicacion pub = new Publicacion();
		pub.setContenido(publicacion.getContenido());
		pub.setEspecialidad(especialidad);
		pub.setIdPublicacion(publicacion.getIdPublicacion());
		pub.setUsuario(publicacion.getUsuario());
		pub.setZona(zona);
		session.save(pub);
		
		return;
		
	}

	@Override
	public void guardarDatosContrato(Contratar contratar) {
		final Session session = sessionFactory.openSession();
		session.save(contratar);
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Contratar> buscarPublicacionContratada(Long id) {
		final Session session = sessionFactory.openSession();
		List publicaciones = session.createCriteria(Contratar.class)
								.add(Restrictions.eq("idUsuarioContratador", id))
								.list();
		return publicaciones;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Publicacion> traerPublicacion() {
		final Session session = sessionFactory.openSession();
		List publicaciones = session.createCriteria(Publicacion.class)
									.list();
		return publicaciones;	
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Publicacion> traerPublicacionPorEspecialidad(Long id) {
		final Session session = sessionFactory.openSession();
		List publicaciones = session.createCriteria(Publicacion.class)
									.add(Restrictions.eq("especialidad.idEspecialidad", id))
									.list();
		return publicaciones;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Publicacion> traerPublicacionPorZona(Long id) {
		final Session session = sessionFactory.openSession();
		List publicaciones = session.createCriteria(Publicacion.class)
									.add(Restrictions.eq("zona.idZona", id))
									.list();
		return publicaciones;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Publicacion> traerPublicacionPorZonaYEspecialidad(Long idZona, Long idEsp) {
		final Session session = sessionFactory.openSession();
		List publicaciones = session.createCriteria(Publicacion.class)
									.add(Restrictions.eq("zona.idZona", idZona))
									.add(Restrictions.eq("especialidad.idEspecialidad", idEsp))
									.list();
		return publicaciones;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Zona> buscarZonaPorId(Long id) {
			final Session session = sessionFactory.openSession();
			List zona = session.createCriteria(Zona.class)
										.add(Restrictions.eq("idZona", id))
										.list();
			return zona;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Publicacion> traerPublicacionPorUsuario(Long id) {
		final Session session = sessionFactory.openSession();
		List publicaciones = session.createCriteria(Publicacion.class)
									.add(Restrictions.eq("usuario.id", id))
									.list();
		return publicaciones;
	}

}
