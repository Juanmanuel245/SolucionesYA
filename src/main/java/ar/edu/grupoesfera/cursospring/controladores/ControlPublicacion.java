package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Contratar;
import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.modelo.Zona;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.CrearPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;

@Controller
public class ControlPublicacion {
	
	@Inject
	private BusquedaPublicacion servicioPublicacion;
	@Inject
	private ManejoUsuarios servicioUsuarios;
	@Inject
	private CrearPublicacion servicioCrearPublicacion;

	// POR ALGUNA RAZON EL MENUPRINCIPAL CONSIDERA QUE IDSESION ES IGUAL A NULLL PERO SI VERIFICAMOS EL ID LLEGA AL JSP PUBLICACION
	@RequestMapping("/publicacion")
	public ModelAndView cargarPublicacion(@RequestParam(value= "id") Long id, HttpServletRequest request) {
		Publicacion publicacion = servicioPublicacion.buscarPublicacionPorId(id);
		ModelMap model = new ModelMap();
		model.put("publicacion", publicacion.getIdPublicacion());
		model.put("logoEmpresa", publicacion.getUsuario().getLogoEmpresa());
		model.put("nombreEmpresa", publicacion.getUsuario().getNombreEmpresa());
		model.put("zona", publicacion.getZona().getNombre());
		model.put("contenido", publicacion.getContenido());
		model.put("idPublicador", publicacion.getUsuario().getId());
		model.put("idSesion", request.getSession().getAttribute("idSesion"));
		return new ModelAndView("publicacion", model);
	}
	
	@RequestMapping("/crearPublicacion")
	public ModelAndView crearPublicacion(HttpServletRequest request) {
		List<Zona> zona = servicioPublicacion.buscarZona();
		List<Especialidad> especialidad = servicioPublicacion.buscarEspecialidad();
		Long id = (Long) request.getSession().getAttribute("idSesion");
		List<Usuario> user = servicioUsuarios.traerUsuarioPorId(id);
		Usuario usuario = user.get(0);
		ModelMap model = new ModelMap();
		PublicacionDTO pub = new PublicacionDTO();
		model.put("publicacionDTO", pub);
		model.put("especialidad", especialidad);
		model.put("zona", zona);
		model.put("usuario", usuario);
		return new ModelAndView("crearPublicacion", model);
	}
	
	@RequestMapping(value = "/publicacionOk", method = RequestMethod.POST)
	public ModelAndView agregarPublicacion(@ModelAttribute("publicacion") PublicacionDTO publicacion, HttpServletRequest request) {
		List<Zona> zonas = servicioCrearPublicacion.traerZonaPorId(publicacion.getIdZona());
		List<Especialidad> especialidades = servicioCrearPublicacion.traerEspecialidadPorId(publicacion.getIdEspecialidad());
		Zona zona = zonas.get(0);
		Especialidad especialidad = especialidades.get(0);
		Long id = (Long) request.getSession().getAttribute("idSesion");
		List<Usuario> user = servicioUsuarios.traerUsuarioPorId(id);
		Usuario usuario = user.get(0);
		usuario.setBalance(usuario.getBalance() + 100);
		servicioUsuarios.actualizarUsuario(usuario);
		publicacion.setUsuario(usuario);
		servicioCrearPublicacion.guardarPublicacion(publicacion, zona, especialidad);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/contratar")
	public ModelAndView contratarUsuario(HttpServletRequest request, 
										 @RequestParam(value= "idp") Long idPublicacion, 
										 @RequestParam(value= "idup") Long idUsuarioPublicador, 
										 @RequestParam(value= "iduc") Long idUsuarioContratador) {
		
		if(request.getSession().getAttribute("idSesion") != null){
			
			List<Usuario> listaUsuarioContratado = servicioUsuarios.traerUsuarioPorId(idUsuarioPublicador);
			Usuario usuarioContratado = new Usuario();
			usuarioContratado = listaUsuarioContratado.get(0);
			
			Contratar contratar = new Contratar();
			contratar.setIdPublicacion(idPublicacion);
			contratar.setUsuarioContratado(usuarioContratado);
			contratar.setIdUsuarioContratador(idUsuarioContratador);
			
			servicioCrearPublicacion.guardarDatosContrato(contratar);
			
			return new ModelAndView("redirect:misEspecialistas");
		}
		
		
		return new ModelAndView("error");
	}
}
