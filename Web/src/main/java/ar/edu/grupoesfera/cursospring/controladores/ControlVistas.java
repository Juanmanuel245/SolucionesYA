package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.ManejoUsuarios;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.modelo.Zona;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaEspecialista;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.ManejoHibernate;
import ar.edu.grupoesfera.cursospring.servicios.ManejoValidacion;

@Controller
public class ControlVistas {
	@Inject
	private BusquedaEspecialista servicioBusqueda;
	@Inject
	private BusquedaPublicacion servicioPublicacion;
	@Inject
	private ManejoHibernate servicioHibernate;
	@Inject
	private ManejoUsuarios servicioUsuarios;
	@Inject
	private ManejoValidacion servicioValidacion;

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public ModelAndView traerUsuario(@PathVariable Long id) {
//		Integer id = id;
		Usuario usuario = servicioHibernate.TraerUsuarios(id);
		ModelMap model = new ModelMap();
		model.put("nombre", usuario.getNombre());
		model.put("apellido", usuario.getApellido());
		model.put("email", usuario.getEmail());
		return new ModelAndView("usuario", model);
	}
	
	@RequestMapping("/logout")
	public ModelAndView cerrarSesion(HttpServletRequest request){
		
		request.getSession().invalidate();
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/irRegistro")
	public ModelAndView insertarUsuario() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		servicioBusqueda.BuscarEspecialistaPorEspecialidad();
		return new ModelAndView("registro", model);
	}
	

	@RequestMapping(path = "/registroOk", method = RequestMethod.POST)
	public ModelAndView agregarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		ModelMap modeloRegistroUsuario = new ModelMap();
		modeloRegistroUsuario.put("nombre", usuario.getNombre());
		modeloRegistroUsuario.put("apellido", usuario.getApellido());
		modeloRegistroUsuario.put("password", usuario.getPassword());
		modeloRegistroUsuario.put("email", usuario.getEmail());
		servicioUsuarios.RegistrarUsuario(usuario);
		return new ModelAndView("confirmacionRegistro", modeloRegistroUsuario);
	}

	@Inject
	private BusquedaPublicacion servicioBusquedaPublicacion;

	@RequestMapping(value = "/publicacion/{idPublicacion}", method = RequestMethod.GET)
	public ModelAndView cargarPublicacion(@PathVariable Long idPublicacion) {
		Long id = idPublicacion;
		Publicacion publicacion = servicioBusquedaPublicacion.BuscarPublicacionPorId(id);
		ModelMap model = new ModelMap();
		model.put("id", publicacion.getIdPublicacion());
		model.put("nombreEmpresa", publicacion.getUsuario().getNombreEmpresa());
		model.put("zona", publicacion.getZona().getNombre());
		model.put("contenido", publicacion.getContenido());
		return new ModelAndView("publicacion", model);
	}

	@RequestMapping("/irLogin")
	public ModelAndView mostrarLogin() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
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

	@RequestMapping("/galeria")
	public ModelAndView cargarGaleria() {
		ModelMap model = new ModelMap();
		return new ModelAndView("galeria", model);
	}

	@RequestMapping("/miCuenta")
	public ModelAndView cargarMiCuenta(HttpServletRequest request) {
		if(request.getSession().isNew()){
		return new ModelAndView("miCuenta");
		}
		return new ModelAndView("error");	
	}

	@RequestMapping("/")
	public ModelAndView cargarInicio() {
		return new ModelAndView("index");
	}

	@RequestMapping("/inicio")
	public ModelAndView goHome() {
		return new ModelAndView("redirect:/");
	}


	@RequestMapping(path = "/loginOk", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request) {

		List<Usuario> usuariosValidos = servicioUsuarios.TraerUsuario(usuario);
		if ((usuariosValidos != null) && (servicioValidacion.ValidarLogin(usuariosValidos, usuario.getEmail(), usuario.getPassword()))) {
			Usuario usuarioValidado = usuariosValidos.get(0);
			request.getSession().setAttribute("id", usuarioValidado.getId());
			request.getSession().setAttribute("nombre", usuarioValidado.getNombre());
			return new ModelAndView("redirect:miCuenta");
		} else {
			ModelMap model = new ModelMap();
			model.put("error", "usuario-invalido");
			return new ModelAndView("login", model);
		}
	}
	
	
	
	

	public void setPersonaService(ManejoHibernate servicioHibernate) {
		this.servicioHibernate = servicioHibernate;
	}
}