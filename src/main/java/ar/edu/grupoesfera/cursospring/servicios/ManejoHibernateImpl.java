package ar.edu.grupoesfera.cursospring.servicios;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

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
		usuario1.setTelefono(1569241006);
		usuario1.setUsuario("JuanManuel245");
		
		session.save(usuario1);
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setNombre("Brian");
		usuario2.setApellido("Kuz");
		usuario2.setEmail("BrianKuz@Gmail.com");
		usuario2.setPassword("123456");
		usuario2.setRol("esp");
		usuario2.setTelefono(1539341064);
		usuario2.setUsuario("Kuz024");
		
		session.save(usuario2);
		return;
	}

	@Override
	public Usuario TraerUsuarios(Long id)  {
		
		final Session session = sessionFactory.openSession();
		
		Usuario usuario = (Usuario)session.get(Usuario.class,id);

		return usuario;
			
	}

}
