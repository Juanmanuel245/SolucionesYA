package ar.edu.grupoesfera.cursospring.controladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;

@Controller
public class ControlVistas {
	
	@Inject
	private BusquedaPublicacion servicioPublicacion;
	
	@RequestMapping("/")
	public ModelAndView cargarInicio() {
		List<Zona> zona = servicioPublicacion.buscarZona();
		List<Especialidad> especialidad = servicioPublicacion.buscarEspecialidad();
		
		List<Publicacion> listaPublicaciones = servicioPublicacion.buscarPublicacionDestacada();
		Collections.reverse(listaPublicaciones);
		boolean valido = true;
		
		if(listaPublicaciones.isEmpty()){
			valido = false;
		}
		
		List<Publicacion> listaAcotada = new ArrayList<Publicacion>();
		Integer limite=0;
		  
		for (Publicacion objeto: listaPublicaciones){
			
			if(limite < 8){
				listaAcotada.add((limite), objeto);	
			}
			limite++;
		}	
	
		ModelMap model = new ModelMap();
		PublicacionDTO publicacion = new PublicacionDTO();
		model.put("zona", zona);
		model.put("valido", valido);
		model.put("especialidad", especialidad);
		model.put("publicacionDTO", publicacion);
		model.put("destacadas", listaAcotada);
		return new ModelAndView("index", model);
	}

	@RequestMapping("/inicio")
	public ModelAndView goHome() {
		return new ModelAndView("redirect:/");
	}

	
	
}