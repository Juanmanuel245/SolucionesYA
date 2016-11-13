package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

public interface BusquedaPublicacion {
	
	Publicacion BuscarPublicacionPorId(Long id);
	List<Zona> BuscarZona();

}
