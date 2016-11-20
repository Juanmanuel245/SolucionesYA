package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface PublicacionDao {
	
	void guardarPublicacion(PublicacionDTO publicacion, Zona zona, Especialidad especialidad);
	void guardarDatosContrato (Contratar contratar);
	List<Contratar> buscarPublicacionContratada(Long id);
	List<Publicacion> traerPublicacion();
	List<Publicacion> traerPublicacionPorId(Long id);
	List<Publicacion> traerPublicacionPorEspecialidad(Long id);
	List<Publicacion> traerPublicacionPorZona(Long id);
	List<Publicacion> traerPublicacionPorZonaYEspecialidad(Long idZona, Long idEsp);
	List<Publicacion> traerPublicacionPorUsuario(Long id);
	List<Zona> buscarZonaPorId(Long id);
	void actualizarVisitas(Publicacion pub);

}
