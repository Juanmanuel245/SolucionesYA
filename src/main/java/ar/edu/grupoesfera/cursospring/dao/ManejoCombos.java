package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface ManejoCombos {
	
	List<Zona> traerZonas();
	List<Especialidad> traerEspecialidades();
	List<Zona> traerZonasPorId(Long id);
	List<Especialidad> traerEspecialidadPorId(Long id);

}
