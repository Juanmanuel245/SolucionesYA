package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView crearPublicacion(HttpServletRequest request) {
		List<Zona> zona = servicioPublicacion.BuscarZona();
		List<Especialidad> especialidad = servicioPublicacion.BuscarEspecialidad();
		Long id = (Long) request.getSession().getAttribute("id");
		List<Usuario> user = servicioUsuarios.TraerUsuarioPorId(id);
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
		Long id = (Long) request.getSession().getAttribute("id");
		List<Usuario> user = servicioUsuarios.TraerUsuarioPorId(id);
		Usuario usuario = user.get(0);
		publicacion.setUsuario(usuario);
		servicioCrearPublicacion.guardarPublicacion(publicacion, zona, especialidad);
		return new ModelAndView("redirect:/");
	}

}
