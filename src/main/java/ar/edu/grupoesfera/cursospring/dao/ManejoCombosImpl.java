package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

@Service
public class ManejoCombosImpl implements ManejoCombos{
	
	@Inject
    private SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Zona> traerZonas() {
		final Session session = sessionFactory.openSession();
		List zonas = session.createCriteria(Zona.class)
							.list();
		return zonas;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Especialidad> traerEspecialidades() {
		final Session session = sessionFactory.openSession();
		List especialidad = session.createCriteria(Especialidad.class)
							.list();
		return especialidad;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Zona> traerZonasPorId(Long id) {
		final Session session = sessionFactory.openSession();
		List zonas = session.createCriteria(Zona.class)
									.add(Restrictions.eq("idZona", id))
									.list();
				
		return zonas;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Especialidad> traerEspecialidadPorId(Long id) {
		final Session session = sessionFactory.openSession();
		List especialidades = session.createCriteria(Especialidad.class)
									.add(Restrictions.eq("idEspecialidad", id))
									.list();
		return especialidades;
	}

}
