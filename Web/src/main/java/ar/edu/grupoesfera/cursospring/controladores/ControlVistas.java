package ar.edu.grupoesfera.cursospring.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlVistas {
	
	@RequestMapping("/")
	public ModelAndView cargarInicio() {
		return new ModelAndView("index");
	}

	@RequestMapping("/inicio")
	public ModelAndView goHome() {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/galeria")
	public ModelAndView cargarGaleria(HttpServletRequest request) {
		if(request.getSession().getAttribute("id") != null){
			return new ModelAndView("galeria");
		}
		
		return new ModelAndView("error");
	}


}	

//	public void setPersonaService(ManejoHibernate servicioHibernate) {
//		this.servicioHibernate = servicioHibernate;
//	}
//}