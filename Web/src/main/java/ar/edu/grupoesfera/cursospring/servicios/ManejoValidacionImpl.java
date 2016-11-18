package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service
public class ManejoValidacionImpl implements ManejoValidacion{

	@Override
	public Boolean validarLogin(List<Usuario> list, String email, String password) {

		for (Usuario usuario: list){	
			if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
