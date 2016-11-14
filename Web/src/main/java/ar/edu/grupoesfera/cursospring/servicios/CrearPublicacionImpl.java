package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.ManejoCombos;
import ar.edu.grupoesfera.cursospring.dao.PublicacionDao;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

@Service
public class CrearPublicacionImpl implements CrearPublicacion {
	
	@Inject
	private PublicacionDao servicioPublicacion;
	
	@Inject
	private ManejoCombos servicioCombos;

	@Override
	public void guardarPublicacion(PublicacionDTO publicacion, Zona zona, Especialidad especialidad) {
		servicioPublicacion.GuardarPublicacion(publicacion, zona, especialidad);
		return;
		
	}

	@Override
	public List<Zona> traerZonaPorId(Long id) {
			List<Zona> zonas = servicioCombos.TraerZonasPorId(id);
		return zonas;
	}

	@Override
	public List<Especialidad> traerEspecialidadPorId(Long id) {
		List<Especialidad> especialidades = servicioCombos.TraerEspecialidadPorId(id);
		return especialidades;
	}

}
