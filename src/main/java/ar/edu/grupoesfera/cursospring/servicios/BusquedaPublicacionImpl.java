package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.ManejoCombos;
import ar.edu.grupoesfera.cursospring.dao.PublicacionDao;
import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;


@Service
public class BusquedaPublicacionImpl implements BusquedaPublicacion{
	
	@Inject
	private ManejoCombos servicioCombos;
	
	@Inject
	private PublicacionDao servicioPublicacion;
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Publicacion buscarPublicacionPorId(Long id) {
		
		final Session session = sessionFactory.openSession();
				
		Publicacion pub1 = (Publicacion)session.get(Publicacion.class, id);
				
		return pub1;
			

	}

	@Override
	public List<Zona> buscarZona() {
		List<Zona> zonas = servicioCombos.traerZonas();
		return zonas;
	}

	@Override
	public List<Especialidad> buscarEspecialidad() {
		List<Especialidad> especialidad = servicioCombos.traerEspecialidades();
		return especialidad;
	}

	@Override
	public List<Contratar> buscarPublicacionContratada(Long id) {
		return servicioPublicacion.buscarPublicacionContratada(id) ;
	}

	@Override
	public List<Publicacion> buscarPublicacion() {
		return servicioPublicacion.traerPublicacion();
	}

	@Override
	public List<Publicacion> buscarPublicacionPorZona(Long id) {
		return servicioPublicacion.traerPublicacionPorZona(id) ;
	}

	@Override
	public List<Publicacion> buscarPublicacionPorEspecialidad(Long id) {
		return servicioPublicacion.traerPublicacionPorEspecialidad(id);
	}

	@Override
	public List<Publicacion> buscarPublicacionZonaYEspecialidad(Long idZona, Long idEsp) {
		return servicioPublicacion.traerPublicacionPorZonaYEspecialidad(idZona, idEsp);
	}

	@Override
	public List<Zona> buscarZonaporId(Long id) {
		return servicioPublicacion.buscarZonaPorId(id);
	}

}
