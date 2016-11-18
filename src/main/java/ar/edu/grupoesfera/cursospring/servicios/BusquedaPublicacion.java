package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface BusquedaPublicacion {
	
	Publicacion buscarPublicacionPorId(Long id);
	void buscarPublicacionPorZona();
	void buscarPublicacionPorEspecialidad();
	void buscarPublicacionZonaYEspecialidad();
	List<Zona> buscarZona();
	List<Especialidad> buscarEspecialidad();
	List<Contratar> buscarPublicacionContratada(Long id);

}
