package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Zona;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;

@Controller
public class ControlPublicacion {
	
	@Inject
	private BusquedaPublicacion servicioPublicacion;

	
	@RequestMapping(value = "/publicacion/{idPublicacion}", method = RequestMethod.GET)
	public ModelAndView cargarPublicacion(@PathVariable Long idPublicacion) {
		Long id = idPublicacion;
		Publicacion publicacion = servicioPublicacion.BuscarPublicacionPorId(id);
		ModelMap model = new ModelMap();
		model.put("id", publicacion.getIdPublicacion());
		model.put("nombreEmpresa", publicacion.getUsuario().getNombreEmpresa());
		model.put("zona", publicacion.getZona().getNombre());
		model.put("contenido", publicacion.getContenido());
		return new ModelAndView("publicacion", model);
	}
	
	@RequestMapping("/crearPublicacion")
	public ModelAndView crearPublicacion() {
		List<Zona> zona = servicioPublicacion.BuscarZona();
		ModelMap model = new ModelMap();
		Publicacion pub = new Publicacion();
		model.put("publicacion", pub);
		model.put("zona", zona);
		return new ModelAndView("crearPublicacion", model);
	}

}
