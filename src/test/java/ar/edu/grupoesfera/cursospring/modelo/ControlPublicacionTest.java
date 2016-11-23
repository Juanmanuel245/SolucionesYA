package ar.edu.grupoesfera.cursospring.modelo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.controladores.ControlPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.BusquedaPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.CrearPublicacion;
import ar.edu.grupoesfera.cursospring.servicios.ManejoUsuarios;

public class ControlPublicacionTest extends SpringTest{
	
	@Test
	public void crearPublicacionYPersistirla() {
		CrearPublicacion servicioCrearPublicacionMock = mock(CrearPublicacion.class);
		PublicacionDTO mockPublicacion = mock(PublicacionDTO.class);
		Zona mockZona = mock(Zona.class);
		Especialidad mockEspecialidad = mock(Especialidad.class);

		servicioCrearPublicacionMock.guardarPublicacion(mockPublicacion, mockZona, mockEspecialidad);

		BusquedaPublicacion servicioBusquedaPublicacionMock = mock(BusquedaPublicacion.class);
		List<Publicacion> listaPublicaciones = servicioBusquedaPublicacionMock.buscarPublicacion();

		assertThat(listaPublicaciones).isNotNull();

	}
	
	@Test
	public void contratarCorrectamenteDevuelveMisEspecialistas() {
		
		// preparacion
		ControlPublicacion controlador = new ControlPublicacion();
		HttpServletRequest requestMock = mock(HttpServletRequest.class);
		HttpSession sessionMock = mock(HttpSession.class);
		CrearPublicacion servicioPublicacionMock = mock(CrearPublicacion.class);
		ManejoUsuarios servicioUsuarioMock = mock(ManejoUsuarios.class);
		
		Long idMock = 1L;
		Long idPublicacion = 1L;
		Long idUsuarioPublicador= 2L;
		Long idUsuarioContratador= 3L;
		String nombreEspecialidad = "Plomero";
		
		Usuario u = new Usuario();
		u.setApellido("Pepe");
		List<Usuario> mockedList = new ArrayList<>();
		mockedList.add(u);		
		
		
		controlador.setServicioUsuarios(servicioUsuarioMock);
		controlador.setServicioCrearPublicacion(servicioPublicacionMock);
		
		when(requestMock.getSession()).thenReturn(sessionMock);
		when(servicioUsuarioMock.traerUsuarioPorId(idMock)).thenReturn(mockedList);
		
		
		// EJECUCION
		
		ModelAndView model = controlador.contratarUsuario(requestMock, idPublicacion, idUsuarioPublicador, idUsuarioContratador, nombreEspecialidad);
		
		// VERIFICACION

		assertThat(model.getViewName()).isEqualTo("redirect:misEspecialistas");

	}
	
	@SuppressWarnings("unchecked")
	@Test 
	public void listarPublicacionesConEspecialidadCeroYZonaCeroTraeTodas(){  // ZONA 0 | ESPECIALIDAD 0
	// preparacion
	Publicacion p = new Publicacion();
	p.setContenido("ALGO");
	List<Publicacion> lista = new LinkedList<Publicacion>();
	lista.add(p);

	BusquedaPublicacion busquedaPublicacionMock = mock(BusquedaPublicacion.class);
	when(busquedaPublicacionMock.buscarPublicacion()).thenReturn(lista);

	ControlPublicacion controlador = new ControlPublicacion();
	controlador.setServicioPublicacion(busquedaPublicacionMock);

	PublicacionDTO pub = new PublicacionDTO();
	pub.setIdZona(0L);
	pub.setIdEspecialidad(0L);

	// ejecucion
	ModelAndView modelAndView = controlador.listarPublicaciones(pub);

	// verificacion
	List<Publicacion> publicaciones = (List<Publicacion>)modelAndView.getModel().get("publicaciones");
	assertThat(publicaciones).hasSize(1);
	verify(busquedaPublicacionMock, times(1)).buscarPublicacion();
	}

	@SuppressWarnings("unused")
	@Test 
	public void listarPublicacionesConEspecialidadDistintoDeCeroYZonaCeroBuscaPorEspecialidad(){ // ZONA 0 | ESPECIALIDAD != 0

	// preparacion
	Publicacion p = new Publicacion();
	p.setContenido("ALGO");
	List<Publicacion> lista = new LinkedList<Publicacion>();
	lista.add(p);

	BusquedaPublicacion busquedaPublicacionMock = mock(BusquedaPublicacion.class);
	when(busquedaPublicacionMock.buscarPublicacion()).thenReturn(lista);

	ControlPublicacion controlador = new ControlPublicacion();
	controlador.setServicioPublicacion(busquedaPublicacionMock);

	PublicacionDTO pub = new PublicacionDTO();
	pub.setIdZona(0L);
	pub.setIdEspecialidad(10L);

	// ejecucion
	ModelAndView modelAndView = controlador.listarPublicaciones(pub);

	// verificacion
	verify(busquedaPublicacionMock, never()).buscarPublicacion();
	verify(busquedaPublicacionMock, times(1)).buscarPublicacionPorEspecialidad(pub.getIdEspecialidad());
	}
	
	@SuppressWarnings("unused")
	@Test 
	public void listarPublicacionesConEspecialidadDistintoDeCeroYZonaDistintoDeCeroBuscaPorEspecialidadYZona(){ // ZONA !=0 | ESPECIALIDAD !=0
		

	// PREPARACION
	Publicacion p = new Publicacion();
	p.setContenido("ALGO");
	List<Publicacion> lista = new LinkedList<Publicacion>();
	lista.add(p);

	BusquedaPublicacion busquedaPublicacionMock = mock(BusquedaPublicacion.class);
	when(busquedaPublicacionMock.buscarPublicacion()).thenReturn(lista);

	ControlPublicacion controlador = new ControlPublicacion();
	controlador.setServicioPublicacion(busquedaPublicacionMock);

	PublicacionDTO pub = new PublicacionDTO();
	pub.setIdZona(5L);
	pub.setIdEspecialidad(10L);

	// ejecucion
	ModelAndView modelAndView = controlador.listarPublicaciones(pub);

	// verificacion
	verify(busquedaPublicacionMock, never()).buscarPublicacion();
	verify(busquedaPublicacionMock, never()).buscarPublicacionPorEspecialidad(pub.getIdEspecialidad());
	verify(busquedaPublicacionMock, times(1)).buscarPublicacionZonaYEspecialidad(pub.getIdZona(), pub.getIdEspecialidad());
	}
	
	@SuppressWarnings("unused")
	@Test 
	public void listarPublicacionesConEspecialidadCeroYZonaDistintoDeCeroBuscaPorZona(){ // ZONA !=0 | ESPECIALIDAD 0
		

	// PREPARACION
	Publicacion p = new Publicacion();
	p.setContenido("ALGO");
	List<Publicacion> lista = new LinkedList<Publicacion>();
	lista.add(p);

	BusquedaPublicacion busquedaPublicacionMock = mock(BusquedaPublicacion.class);
	when(busquedaPublicacionMock.buscarPublicacion()).thenReturn(lista);

	ControlPublicacion controlador = new ControlPublicacion();
	controlador.setServicioPublicacion(busquedaPublicacionMock);

	PublicacionDTO pub = new PublicacionDTO();
	pub.setIdZona(5L);
	pub.setIdEspecialidad(0L);

	// ejecucion
	ModelAndView modelAndView = controlador.listarPublicaciones(pub);

	// verificacion
	verify(busquedaPublicacionMock, never()).buscarPublicacion();
	verify(busquedaPublicacionMock, never()).buscarPublicacionPorEspecialidad(pub.getIdEspecialidad());
	verify(busquedaPublicacionMock, never()).buscarPublicacionZonaYEspecialidad(pub.getIdZona(), pub.getIdEspecialidad());
	verify(busquedaPublicacionMock, times(1)).buscarPublicacionPorZona(pub.getIdZona());
	}


}
