package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface BusquedaPublicacion {
	
	List<Publicacion> buscarPublicacionPorId(Long id);
	List<Publicacion> buscarPublicacionPorZona(Long id);
	List<Publicacion> buscarPublicacionPorUsuario(Long id);
	List<Publicacion> buscarPublicacion();
	List<Publicacion> buscarPublicacionPorEspecialidad(Long id);
	List<Publicacion> buscarPublicacionZonaYEspecialidad(Long idZona, Long idEsp);
	List<Publicacion> buscarPublicacionDestacada();
	List<Zona> buscarZona();
	List<Especialidad> buscarEspecialidad();
	List<Contratar> buscarPublicacionContratada(Long id);
	List<Zona> buscarZonaporId(Long id);
	void actualizarVisitas(Publicacion pub);

}
