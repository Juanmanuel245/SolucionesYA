package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Zona;

@Service
public class ManejoCombosImpl implements ManejoCombos{
	
	@Inject
    private SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Zona> TraerZonas() {
		final Session session = sessionFactory.openSession();
		List zonas = session.createCriteria(Zona.class)
							.list();
		return zonas;
	}

}
