package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface ManejoCombos {
	
	List<Zona> TraerZonas();
	List<Especialidad> TraerEspecialidades();
	List<Zona> TraerZonasPorId(Long id);
	List<Especialidad> TraerEspecialidadPorId(Long id);

}
