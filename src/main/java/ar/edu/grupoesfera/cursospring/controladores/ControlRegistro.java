package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;

@Controller
public class ControlRegistro {
	
	@Inject
	private ManejoUsuarios servicioUsuarios;
	
	
	@RequestMapping("/irRegistro")
	public ModelAndView insertarUsuario() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("registro", model);
	}
	
	@RequestMapping(path = "/registroOk", method = RequestMethod.POST)
	public ModelAndView agregarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuario.setLogoEmpresa("images/sinLogo.jpg");
		usuario.setNombreEmpresa("N/A");
		usuario.setTelefono("N/A");
		usuario.setBalance(0);
		usuario.setVecesContratado(0);
		
		ModelMap modeloRegistroUsuario = new ModelMap();
		modeloRegistroUsuario.put("nombre", usuario.getNombre());
		modeloRegistroUsuario.put("apellido", usuario.getApellido());
		modeloRegistroUsuario.put("password", usuario.getPassword());
		modeloRegistroUsuario.put("email", usuario.getEmail());
		
		servicioUsuarios.registrarUsuario(usuario);
		return new ModelAndView("confirmacionRegistro", modeloRegistroUsuario);
	}

}
