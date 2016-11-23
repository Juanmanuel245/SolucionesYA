package ar.edu.grupoesfera.cursospring.modelo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.ControlRegistro;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;
import ar.edu.grupoesfera.cursospring.servicios.ManejoValidacion;

@SuppressWarnings("unused")
public class ControlRegistroTest extends SpringTest {
	
	@Test
	@Transactional
	@Rollback
	
	public void registroncorrectoDeberiaLlevarRegistroOk() {
		
		ControlRegistro controlador = new  ControlRegistro();
		
		Usuario usuarioMock = mock(Usuario.class);
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		HttpSession sessionMock = mock(HttpSession.class);
		ManejoValidacion validacionMock = mock(ManejoValidacion.class);
		ManejoUsuarios servicioUsuarioMock = mock(ManejoUsuarios.class);
		
		List<Usuario> mockedList = new ArrayList<>();
		mockedList.add(usuarioMock);
		
		when(servicioUsuarioMock.traerUsuario(usuarioMock)).thenReturn(mockedList);
		
		when(requestMock.getSession()).thenReturn(sessionMock);
	
		ModelAndView model = controlador.agregarUsuario(usuarioMock);
		
		assertThat(model.getViewName()).isEqualTo("redirect:registroOk");
		
	}

}
