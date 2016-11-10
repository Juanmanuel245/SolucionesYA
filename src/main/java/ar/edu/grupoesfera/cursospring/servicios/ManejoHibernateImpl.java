package ar.edu.grupoesfera.cursospring.servicios;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Especialista;
import ar.edu.grupoesfera.cursospring.modelo.Galeria;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.Reputacion;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

@Service("GenerarDatosImpl")
@Transactional
public class ManejoHibernateImpl implements ManejoHibernate {
	
	@Inject
    private SessionFactory sessionFactory;
	
	@PostConstruct
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })

	@Override
	public void GenerarUsuarios() {
		final Session session = sessionFactory.openSession();
		Usuario usuario1 = new Usuario();
		
		usuario1.setNombre("Juan Manuel");
		usuario1.setApellido("Caffi");
		usuario1.setEmail("JuanManuelCaffi@Gmail.com");
		usuario1.setPassword("123456");
		usuario1.setRol("user");
		
		session.save(usuario1);
		
		Especialidad esp1 = new Especialidad();
		esp1.setNombreEspecialidad("Plomero");
		
		Galeria gal1 = new Galeria();
		
		Reputacion rep1 = new Reputacion();
		
		
		Especialista especialista1 = new Especialista();
		
		especialista1.setApellido("Kuz");
		especialista1.setEmail("Kuz@Gmail.com");
		especialista1.setEspecialidad(esp1);
		especialista1.setGaleria(gal1);
		especialista1.setImagen("logo.png");
		especialista1.setNombre("Brian");
		especialista1.setNombreEmpresa("Reparaciones Kuz Kuz");
		especialista1.setPassword("123456");
		especialista1.setReputacion(rep1);
		especialista1.setRol("ESP");
		especialista1.setTelefono(1233444356);
		
		session.save(especialista1);
		return;
	}

	@Override
	public Usuario TraerUsuarios(Long id)  {
		
		final Session session = sessionFactory.openSession();
		
		Usuario usuario = (Usuario)session.get(Usuario.class,id);

		return usuario;
			
	}
	
	@Override
	public Usuario validarUsuario(String emailBuscado, String passwordBuscado) {
		
		if(emailBuscado == "juanmanuelcaffi@gmail.com" && passwordBuscado=="123456"){
			
			final Session session = sessionFactory.openSession();
			
			Usuario usuario = (Usuario)session.get(Usuario.class, 1);
			
			return usuario;
		}
		else{
			return null;
		}
		
	}

	@Override
	public void GenerarPublicaciones() {
		final Session session = sessionFactory.openSession();
		
		Especialidad esp1 = new Especialidad();
		esp1.setNombreEspecialidad("Plomero");
		
		Galeria gal1 = new Galeria();
		
		Reputacion rep1 = new Reputacion();
		
		Zona zona1 = new Zona ();
		zona1.setNombre("Ramos Mejia");
		
		
		Especialista especialista1 = new Especialista();
		especialista1.setApellido("Gonzales");
		especialista1.setEmail("ReparacionesGonzales@Gmail.com");
		especialista1.setEspecialidad(esp1);
		especialista1.setGaleria(gal1);
		especialista1.setImagen("http//:");
		especialista1.setNombre("Juan");
		especialista1.setNombreEmpresa("Reparaciones Gonzales");
		especialista1.setPassword("mexicano1");
		especialista1.setRol("ESPECIALISTA");
		especialista1.setTelefono(1556654445);
		especialista1.setReputacion(rep1);
		
		
		Publicacion pub1 = new Publicacion();
		pub1.setContenido("Contenido de la Publicacion");
		pub1.setEspecialista(especialista1);
		pub1.setZona(zona1);

		session.save(pub1);
		
	}

}
