package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
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
		ModelMap model = new ModelMap();
		PublicacionDTO publicacion = new PublicacionDTO();
		model.put("zona", zona);
		model.put("especialidad", especialidad);
		model.put("publicacionDTO", publicacion);
		return new ModelAndView("index", model);
	}

	@RequestMapping("/inicio")
	public ModelAndView goHome() {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/galeria")
	public ModelAndView cargarGaleria(HttpServletRequest request) {
		if(request.getSession().getAttribute("idSesion") != null){
			return new ModelAndView("galeria");
		}
		
		return new ModelAndView("error");
	}


}	

//	public void setPersonaService(ManejoHibernate servicioHibernate) {
//		this.servicioHibernate = servicioHibernate;
//	}
//}