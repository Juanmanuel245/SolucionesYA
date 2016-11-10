package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Publicacion;


@Service
public class BusquedaPublicacionImpl implements BusquedaPublicacion{
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Publicacion BuscarPublicacionPorId(Long id) {
		
		final Session session = sessionFactory.openSession();
				
		Publicacion pub1 = (Publicacion)session.get(Publicacion.class, id);
				
		return pub1;
			

	}

}
