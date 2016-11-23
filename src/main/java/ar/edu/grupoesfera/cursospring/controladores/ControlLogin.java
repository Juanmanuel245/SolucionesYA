package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;
import ar.edu.grupoesfera.cursospring.servicios.ManejoValidacion;

@Controller
public class ControlLogin {
	
	@Inject
	private ManejoUsuarios servicioUsuarios;
	
	@Inject
	private ManejoValidacion servicioValidacion;
	
	@RequestMapping("/irLogin")
	public ModelAndView mostrarLogin() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
	}
	
	@RequestMapping(path = "/loginOk", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request) {

		List<Usuario> usuariosValidos = servicioUsuarios.traerUsuario(usuario);
		if ((!(usuariosValidos.isEmpty())) && (servicioValidacion.validarLogin(usuariosValidos, usuario.getEmail(), usuario.getPassword()))) {
			Usuario usuarioValidado = usuariosValidos.get(0);
			request.getSession().setAttribute("idSesion", usuarioValidado.getId());
			return new ModelAndView("redirect:miCuenta");
		} else {
			ModelMap model = new ModelMap();
			model.put("error", "usuario-invalido");
			return new ModelAndView("login", model);
		}
	}
	
	@RequestMapping("/logout")
	public ModelAndView cerrarSesion(HttpServletRequest request){
		
		request.getSession().invalidate();
		
		return new ModelAndView("redirect:/");
	}
	
	public void setPersonaTestValidacion(ManejoValidacion servicioValidacion) {
		this.servicioValidacion = servicioValidacion;
	}
	
	public void setServicioUsuario(ManejoUsuarios servicioUsuarioMock) {
		this.servicioUsuarios = servicioUsuarioMock;
	}

}
