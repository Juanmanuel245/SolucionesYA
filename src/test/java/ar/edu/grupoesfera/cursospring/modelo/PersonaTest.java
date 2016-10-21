package ar.edu.grupoesfera.cursospring.modelo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.grupoesfera.cursospring.controladores.ControlVistas;
import ar.edu.grupoesfera.cursospring.servicios.PersonaService;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;

// SE USA MOCK PARA HACER PRUEBAS UNITARIAS DE TEST QUE TIENEN DEPENDENCIAS

public class PersonaTest {

	@Test
	public void loginConUsuarioYPasswordIncorrectoDeberiaLlevarAlLoginNuevamente(){

		ControlVistas controlador = new ControlVistas();
		
		Usuario usuario = new Usuario();

		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		PersonaService servicioMock = mock(PersonaService.class);
		
		when(servicioMock.validarUsuario(anyString(), anyString())).thenReturn(null);
		
		controlador.setPersonaService(servicioMock);
		
		ModelAndView modelControlador = controlador.login(usuario, requestMock);
		
		assertThat(modelControlador.getModel().get("Error")).isEqualTo("aaa");
		assertThat(modelControlador.getViewName()).isEqualTo("aassa");
		
		Assert.assertTrue(usuario);
		
	}
	
	
	
}
