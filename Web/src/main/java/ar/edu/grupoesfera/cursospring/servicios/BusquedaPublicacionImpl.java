package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.ManejoCombos;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;


@Service
public class BusquedaPublicacionImpl implements BusquedaPublicacion{
	
	@Inject
	private ManejoCombos servicioCombos;
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Publicacion BuscarPublicacionPorId(Long id) {
		
		final Session session = sessionFactory.openSession();
				
		Publicacion pub1 = (Publicacion)session.get(Publicacion.class, id);
				
		return pub1;
			

	}

	@Override
	public List<Zona> BuscarZona() {
		List<Zona> zonas = servicioCombos.TraerZonas();
		return zonas;
	}

	@Override
	public void BuscarPublicacionPorZona() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuscarPublicacionPorEspecialidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuscarPublicacionZonaYEspecialidad() {
		// TODO Auto-generated method stub
		
	}

}
