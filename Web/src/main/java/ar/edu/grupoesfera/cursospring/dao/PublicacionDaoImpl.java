package ar.edu.grupoesfera.cursospring.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Especialidad;
import ar.edu.grupoesfera.cursospring.modelo.Publicacion;
import ar.edu.grupoesfera.cursospring.modelo.PublicacionDTO;
import ar.edu.grupoesfera.cursospring.modelo.Zona;

@Service
public class PublicacionDaoImpl implements PublicacionDao{
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public void GuardarPublicacion(PublicacionDTO publicacion, Zona zona, Especialidad especialidad) {
		final Session session = sessionFactory.openSession();
		Publicacion pub = new Publicacion();
		pub.setContenido(publicacion.getContenido());
		pub.setEspecialidad(especialidad);
		pub.setIdPublicacion(publicacion.getIdPublicacion());
		pub.setUsuario(publicacion.getUsuario());
		pub.setZona(zona);
		session.save(pub);
		
		return;
		
	}
	
	

}
