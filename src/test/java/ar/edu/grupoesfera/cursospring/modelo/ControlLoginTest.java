package ar.edu.grupoesfera.cursospring.modelo;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.ControlLogin;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;
import ar.edu.grupoesfera.cursospring.servicios.ManejoValidacion;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class ControlLoginTest extends SpringTest {
	
	@SuppressWarnings("unchecked")
	@Test
	@Transactional
	@Rollback
	public void loginIncorrectoDeberiaLlevarALogin() {

		ControlLogin controlador = new ControlLogin();
		
		Usuario usuarioMock = mock(Usuario.class);
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		HttpSession sessionMock = mock(HttpSession.class);
		ManejoValidacion validacionMock = mock(ManejoValidacion.class);
		ManejoUsuarios servicioUsuarioMock = mock(ManejoUsuarios.class);
		
		List<Usuario> mockedList = new ArrayList<>();
		mockedList.add(usuarioMock);

			
		controlador.setPersonaTestValidacion(validacionMock);
		controlador.setServicioUsuario(servicioUsuarioMock);
		
		when(servicioUsuarioMock.traerUsuario(usuarioMock)).thenReturn(mockedList);
		when(validacionMock.validarLogin(any(List.class), anyString(), anyString())).thenReturn(false);
		when(requestMock.getSession()).thenReturn(sessionMock);

		
		ModelAndView model = controlador.login(usuarioMock, requestMock);

		assertThat(model.getViewName()).isEqualTo("login");
	}

	@SuppressWarnings("unchecked")
	@Test
	@Rollback
	public void loginCorrectoDeberiaLlevarAMiCuenta() {

		ControlLogin controlador = new ControlLogin();
		
		Usuario usuarioMock = mock(Usuario.class);
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		HttpSession sessionMock = mock(HttpSession.class);
		ManejoValidacion validacionMock = mock(ManejoValidacion.class);
		ManejoUsuarios servicioUsuarioMock = mock(ManejoUsuarios.class);
		
		List<Usuario> mockedList = new ArrayList<>();
		mockedList.add(usuarioMock);

			
		controlador.setPersonaTestValidacion(validacionMock);
		controlador.setServicioUsuario(servicioUsuarioMock);
		
		when(servicioUsuarioMock.traerUsuario(usuarioMock)).thenReturn(mockedList);
		when(validacionMock.validarLogin(any(List.class), anyString(), anyString())).thenReturn(true);
		when(requestMock.getSession()).thenReturn(sessionMock);

		
		ModelAndView model = controlador.login(usuarioMock, requestMock);

		assertThat(model.getViewName()).isEqualTo("redirect:miCuenta");
	}
	
	
	
	
}
