package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface BusquedaPublicacion {
	
	Publicacion BuscarPublicacionPorId(Long id);
	void BuscarPublicacionPorZona();
	void BuscarPublicacionPorEspecialidad();
	void BuscarPublicacionZonaYEspecialidad();
	List<Zona> BuscarZona();
	List<Especialidad> BuscarEspecialidad();

}
