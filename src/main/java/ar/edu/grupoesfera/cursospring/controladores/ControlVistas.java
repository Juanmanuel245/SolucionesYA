package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Controller
public class ControlVistas {

	@RequestMapping("/registro")
	public ModelAndView cargarRegistro(){
		ModelMap model = new ModelMap();
		model.put("usuario", new Usuario());
		return new ModelAndView("registro", model);
	}
	

	@RequestMapping(value="/registross", method=RequestMethod.POST)
	public ModelAndView crearUsuario(@ModelAttribute Usuario usuario){
	return null;		
	}

	@RequestMapping("/publicacion")
	public ModelAndView cargarPublicacion(){
		ModelMap model = new ModelMap();
		model.put("Usuario", new Usuario());
		return new ModelAndView("publicacion", model);
	}

	@RequestMapping("/login")
	public ModelAndView cargarLogin(){
		ModelMap model = new ModelMap();
		model.put("Usuario", new Usuario());
		return new ModelAndView("login", model);
	}
	
	@RequestMapping("/galeria")
	public ModelAndView cargarGaleria(){
		ModelMap model = new ModelMap();
		return new ModelAndView("galeria", model);
	}
	
	@RequestMapping("/miCuenta")
	public ModelAndView cargarMiCuenta(){
		ModelMap model = new ModelMap();
		return new ModelAndView("miCuenta", model);
	}
}