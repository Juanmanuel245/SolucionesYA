package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;

@Controller
public class ControlCuenta {
	
	@Inject
	private ManejoUsuarios servicioUsuarios;
	
	@RequestMapping("/miCuenta")
	public ModelAndView cargarMiCuenta(HttpServletRequest request) {
		if(request.getSession().getAttribute("id") != null){
		return new ModelAndView("miCuenta");
		}
		return new ModelAndView("error");	
	}
	
	@RequestMapping("/editarCuenta")
	public ModelAndView editarCuenta(HttpServletRequest request){
		if(request.getSession().getAttribute("id") != null){
			
			Long id = (Long) request.getSession().getAttribute("id");
			List<Usuario> listaUsuarios = servicioUsuarios.TraerUsuarioPorId(id);
			Usuario usuario = listaUsuarios.get(0);
			ModelMap model = new ModelMap();
			model.put("usuario", usuario);
			
			return new ModelAndView("editarCuenta", model);
		}
		
		return new ModelAndView("error");
	}
	
	// NO FUNCIONA EL UPDATE
	@RequestMapping("/edicionOk")
	public ModelAndView edicionOk(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request){
		if(request.getSession().getAttribute("id") != null){
			Long id = (Long) request.getSession().getAttribute("id");
			usuario.setId(id);
			System.out.println(usuario.getId());
			servicioUsuarios.ActualizarUsuario(usuario);
			return new ModelAndView("miCuenta");
		}
		
		return new ModelAndView("error");
	}
	
	@RequestMapping("/misEspecialistas")
	public ModelAndView misEspecialistas(HttpServletRequest request){
		if(request.getSession().getAttribute("id") != null){
			
			return new ModelAndView("misEspecialistas");
		}
		
		return new ModelAndView("error");
	}
	

}
