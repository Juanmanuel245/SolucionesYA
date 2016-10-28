package ar.edu.grupoesfera.cursospring.modelo;
import org.hibernate.Session;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.grupoesfera.cursospring.controladores.ControlVistas;
import ar.edu.grupoesfera.cursospring.servicios.PersonaService;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

// SE USA MOCK PARA HACER PRUEBAS UNITARIAS DE TEST QUE TIENEN DEPENDENCIAS

public class PersonaTest extends SpringTest {

	@Test
	public void loginConUsuarioYPasswordIncorrectoDeberiaLlevarAlLoginNuevamente(){

		ControlVistas controlador = new ControlVistas();
		
		Usuario usuario = new Usuario();
		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		PersonaService servicioMock = mock(PersonaService.class);
		when(servicioMock.validarUsuario(anyString(), anyString())).thenReturn(null);
		
		controlador.setPersonaService(servicioMock);
		
		ModelAndView modelControlador = controlador.login(usuario, requestMock);
		
		assertThat(modelControlador.getModel().get("error")).isEqualTo("usuario-invalido");
		assertThat(modelControlador.getViewName()).isEqualTo("login");
		
	}

	@Test
	public void loginConUsuarioYPasswordCorrectoDeberiaLlevarAHome(){

		ControlVistas controlador = new ControlVistas();
		
		Usuario usuario = new Usuario();
		usuario.setRol("ADMIN");
		
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		HttpSession sessionMock = mock(HttpSession.class);
		when(requestMock.getSession()).thenReturn(sessionMock);
		PersonaService servicioMock = mock(PersonaService.class);
		
		when(servicioMock.validarUsuario(anyString(), anyString())).thenReturn(usuario);
		
		controlador.setPersonaService(servicioMock);
		
		ModelAndView modelControlador = controlador.login(usuario, requestMock);
		
		assertThat(modelControlador.getViewName()).isEqualTo("home");
		verify(sessionMock, times(1)).setAttribute("ROL", "ADMIN");
	}

	@Test
	@Transactional
	@Rollback
	public void testDePersistencia(){
		Usuario seba = new Usuario();
		seba.setNombre("Sebastian");
		Session s = getSession();
		s.save(seba);
		
		assertThat(s.get(Usuario.class, seba.getId())).isNotNull();
	}
	
	
}
