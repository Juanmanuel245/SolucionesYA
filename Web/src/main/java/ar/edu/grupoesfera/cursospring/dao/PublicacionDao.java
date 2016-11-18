package ar.edu.grupoesfera.cursospring.dao;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface PublicacionDao {
	
	void guardarPublicacion(PublicacionDTO publicacion, Zona zona, Especialidad especialidad);
	void guardarDatosContrato (Contratar contratar);

}
