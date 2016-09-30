package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaEspecialista;

@Controller
public class ControlVistas {
	@Inject
	private BusquedaEspecialista servicioBusqueda;
	
	
	@RequestMapping("/irRegistro")
	public ModelAndView insertarUsuario(){
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		servicioBusqueda.BuscarEspecialistaPorEspecialidad();
		return new ModelAndView("registro", model);
	}
	

	@RequestMapping(path="/registroOk", method = RequestMethod.POST)
		public ModelAndView agregarUsuario(@ModelAttribute("usuario") Usuario usuario){
			ModelMap modeloRegistroUsuario = new ModelMap();
			modeloRegistroUsuario.put("nombre", usuario.getNombre());
			modeloRegistroUsuario.put("apellido", usuario.getApellido());
			modeloRegistroUsuario.put("password", usuario.getPassword());
			return new ModelAndView("confirmacionRegistro", modeloRegistroUsuario);
	}

	@RequestMapping(path="/loginOk", method = RequestMethod.POST)
	public ModelAndView logearUsuario(@ModelAttribute("usuario") Usuario usuario){
		ModelMap modeloLoginUsuario = new ModelMap();
		modeloLoginUsuario.put("nombre", usuario.getNombre());
		modeloLoginUsuario.put("password", usuario.getPassword());
		return new ModelAndView("miCuenta", modeloLoginUsuario);
}
	
	@RequestMapping("/publicacion")
	public ModelAndView cargarPublicacion(){
		ModelMap model = new ModelMap();
		model.put("Usuario", new Usuario());
		return new ModelAndView("publicacion", model);
	}

	@RequestMapping("/irLogin")
	public ModelAndView mostrarLogin(){
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
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
	
	@RequestMapping("/")
	public ModelAndView cargarInicio(){
		ModelMap model = new ModelMap();
		return new ModelAndView("index", model);
	}
	
	@RequestMapping("/inicio")
	public ModelAndView goHome(){
		return new ModelAndView("redirect:/");
	}
}