package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;

@Controller
public class ControlCuenta {
	
	@Inject
	private ManejoUsuarios servicioUsuarios;
	
	@Inject
	private BusquedaPublicacion servicioPublicacion;
	
	@RequestMapping("/miCuenta")
	public ModelAndView cargarMiCuenta(HttpServletRequest request) {
		if(request.getSession().getAttribute("idSesion") != null){
			
			List<Usuario> listaUsuarios = servicioUsuarios.traerUsuarioPorId((Long) request.getSession().getAttribute("idSesion"));
			Usuario usuario = listaUsuarios.get(0);
			
			List<Publicacion> listaPublicaciones = servicioPublicacion.buscarPublicacionPorUsuario((Long) request.getSession().getAttribute("idSesion"));
			boolean pubValida=true;
			
			if(listaPublicaciones.isEmpty()){
				pubValida = false;
			}

			ModelMap model = new ModelMap();
			model.put("usuario", usuario);
			model.put("publicaciones", listaPublicaciones);
			model.put("valido", pubValida);
			return new ModelAndView("miCuenta", model);
		}
		ModelMap model = new ModelMap();
		model.put("mensaje", "Error, Necesitas estar logeado para poder ingresar a este sitio");
		return new ModelAndView("error", model);	
	}
	
	@RequestMapping("/balance")
	public ModelAndView cargarBalance(HttpServletRequest request) {
		if(request.getSession().getAttribute("idSesion") != null){
			Long id = (Long) request.getSession().getAttribute("idSesion");
			List<Usuario> listaUsuarios = servicioUsuarios.traerUsuarioPorId(id);
			Usuario usuario = listaUsuarios.get(0);
			ModelMap model = new ModelMap();
			model.put("usuario", usuario);
			return new ModelAndView("balance", model);
		}
		ModelMap model = new ModelMap();
		model.put("mensaje", "Error, Necesitas estar logeado para poder ingresar a este sitio");
		return new ModelAndView("error", model);	
	}
	
	@RequestMapping("/editarCuenta")
	public ModelAndView editarCuenta(HttpServletRequest request){
		if(request.getSession().getAttribute("idSesion") != null){
			
			Long id = (Long) request.getSession().getAttribute("idSesion");
			List<Usuario> listaUsuarios = servicioUsuarios.traerUsuarioPorId(id);
			Usuario usuario = listaUsuarios.get(0);
			ModelMap model = new ModelMap();
			model.put("usuario", usuario);
			
			return new ModelAndView("editarCuenta", model);
		}
		
		ModelMap model = new ModelMap();
		model.put("mensaje", "Error, Necesitas estar logeado para poder ingresar a este sitio");
		return new ModelAndView("error", model);
	}
	
	@RequestMapping("/edicionOk")
	public ModelAndView edicionOk(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request){
		if(request.getSession().getAttribute("idSesion") != null){
			
			List<Usuario> listaUsuarios = servicioUsuarios.traerUsuarioPorId((Long) request.getSession().getAttribute("idSesion"));
			Usuario usuarioViejo = listaUsuarios.get(0);
			
			usuario.setId(usuarioViejo.getId());
			usuario.setBalance(usuarioViejo.getBalance());
			usuario.setVecesContratado(usuarioViejo.getVecesContratado());
			servicioUsuarios.actualizarUsuario(usuario);
			return new ModelAndView("miCuenta");
		}
		
		ModelMap model = new ModelMap();
		model.put("mensaje", "Error, Necesitas estar logeado para poder ingresar a este sitio");
		return new ModelAndView("error", model);
	}
	
	@RequestMapping("/misEspecialistas")
	public ModelAndView misEspecialistas(HttpServletRequest request){
		if(request.getSession().getAttribute("idSesion") != null){
			
			// Traigo una lista de las publicaciones contratadas pro el usuario
			Long idUsuario = (Long) request.getSession().getAttribute("idSesion");
			List<Contratar> contratados = servicioPublicacion.buscarPublicacionContratada(idUsuario);
			ModelMap model = new ModelMap();
			model.put("contratados", contratados);	
			return new ModelAndView("misEspecialistas", model);
		}
		
		ModelMap model = new ModelMap();
		model.put("mensaje", "Error, Necesitas estar logeado para poder ingresar a este sitio");
		return new ModelAndView("error", model);
	}
	

}
