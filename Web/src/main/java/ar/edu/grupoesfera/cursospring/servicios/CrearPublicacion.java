package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface CrearPublicacion {
	void guardarPublicacion(PublicacionDTO publicacion, Zona zona, Especialidad especialidad);
	List<Zona> traerZonaPorId(Long id);
	List<Especialidad> traerEspecialidadPorId(Long id);
}
