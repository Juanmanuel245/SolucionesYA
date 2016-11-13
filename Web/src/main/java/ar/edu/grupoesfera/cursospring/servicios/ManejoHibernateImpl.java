package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;


@Service("GenerarDatosImpl")
@Transactional
public class ManejoHibernateImpl implements ManejoHibernate {
	
	@Inject
    private SessionFactory sessionFactory;
	
//	@PostConstruct
//    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })

	@Override
	public Usuario TraerUsuarios(Long id)  {
		
		final Session session = sessionFactory.openSession();
		
		Usuario usuario = (Usuario)session.get(Usuario.class,id);

		return usuario;
			
	}


}
