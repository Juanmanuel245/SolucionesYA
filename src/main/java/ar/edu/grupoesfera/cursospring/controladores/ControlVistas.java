package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaEspecialista;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.ManejoHibernate;
import ar.edu.grupoesfera.cursospring.servicios.PersonaService;

@Controller
public class ControlVistas {
	@Inject
	private BusquedaEspecialista servicioBusqueda;
	@Inject
	private PersonaService personaService;
	@Inject
	private ManejoHibernate servicioHibernate;

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public ModelAndView traerUsuario(@PathVariable Long id) {
//		Integer id = id;
		Usuario usuario = servicioHibernate.TraerUsuarios(id);
		ModelMap model = new ModelMap();
		model.put("nombre", usuario.getNombre());
		model.put("apellido", usuario.getApellido());
		model.put("email", usuario.getEmail());
		model.put("telefono", usuario.getTelefono());
		model.put("rol", usuario.getRol());
		model.put("nick", usuario.getUsuario());
		return new ModelAndView("usuario", model);
	}
	
	
	@RequestMapping("/irRegistro")
	public ModelAndView insertarUsuario() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		servicioBusqueda.BuscarEspecialistaPorEspecialidad();
		return new ModelAndView("registro", model);
	}
	
	@RequestMapping("/generardatos")
	public ModelAndView generarDatos() {	
		servicioHibernate.GenerarUsuarios();
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(path = "/registroOk", method = RequestMethod.POST)
	public ModelAndView agregarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		ModelMap modeloRegistroUsuario = new ModelMap();
		modeloRegistroUsuario.put("nombre", usuario.getNombre());
		modeloRegistroUsuario.put("apellido", usuario.getApellido());
		modeloRegistroUsuario.put("password", usuario.getPassword());
		return new ModelAndView("confirmacionRegistro", modeloRegistroUsuario);
	}

	@RequestMapping(path = "/loginOk", method = RequestMethod.POST)
	public ModelAndView logearUsuario(@ModelAttribute("usuario") Usuario usuario) {
		// ModelMap modeloLoginUsuario = new ModelMap();
		// modeloLoginUsuario.put("nombre", usuario.getNombre());
		// modeloLoginUsuario.put("password", usuario.getPassword());
		return new ModelAndView("miCuenta"/* , modeloLoginUsuario */);
	}

	@Inject
	private BusquedaPublicacion servicioBusquedaPublicacion;

	@RequestMapping(value = "/publicacion/{idPublicacion}", method = RequestMethod.GET)
	public ModelAndView cargarPublicacion(@PathVariable Integer idPublicacion) {
		Integer id = idPublicacion;
		Publicacion publicacion = servicioBusquedaPublicacion.BuscarPublicacionPorId(id);
		ModelMap model = new ModelMap();
		model.put("id", publicacion.getIdPublicacion());
		model.put("especialista", publicacion.getEspecialista());
		model.put("zona", publicacion.getZona());
		model.put("especialidad", publicacion.getEspecialidad());
		model.put("contenido", publicacion.getContenido());
		model.put("galeria", publicacion.getGaleria());
		return new ModelAndView("publicacion", model);
	}

	@RequestMapping("/irLogin")
	public ModelAndView mostrarLogin() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
	}

	@RequestMapping("/galeria")
	public ModelAndView cargarGaleria() {
		ModelMap model = new ModelMap();
		return new ModelAndView("galeria", model);
	}

	@RequestMapping("/miCuenta")
	public ModelAndView cargarMiCuenta() {
		ModelMap model = new ModelMap();
		return new ModelAndView("miCuenta", model);
	}

	@RequestMapping("/")
	public ModelAndView cargarInicio() {
		return new ModelAndView("index");
	}

	@RequestMapping("/inicio")
	public ModelAndView goHome() {
		return new ModelAndView("redirect:/");
	}


	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request) {

		Usuario usuarioValidado = personaService.validarUsuario(usuario.getUsuario(), usuario.getPassword());
		if (usuarioValidado != null) {
			request.getSession().setAttribute("ROL", usuarioValidado.getRol());
			return new ModelAndView("home");
		} else {
			ModelMap model = new ModelMap();
			model.put("error", "usuario-invalido");
			return new ModelAndView("login", model);
		}
	}

	public void setPersonaService(PersonaService personaService) {
		this.personaService = personaService;
	}
}