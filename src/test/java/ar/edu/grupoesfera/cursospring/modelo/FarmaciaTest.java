package ar.edu.grupoesfera.cursospring.modelo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class FarmaciaTest extends SpringTest {
	
	
	@Test @Transactional @Rollback
	public void ProbarFarmaciaExistente(){
		
		Barrio barrio1 = new Barrio();
		barrio1.setNombre("Ramos Mejia");
		
		getSession().save(barrio1);
		
		Barrio barrio2 = new Barrio();
		barrio2.setNombre("Villa Luro");
		
		getSession().save(barrio2);
		
		Comuna comuna = new Comuna();
		comuna.setNombre("Comuna 10");
		comuna.addBarrio(barrio1);
		comuna.addBarrio(barrio2);
		
		
		getSession().save(comuna);
		
		
		Direccion direccion = new Direccion();
		
		direccion.setCalle("Alvarado");
		direccion.setPuerta("123");
		direccion.setBarrio(barrio2);
		
		Farmacia farmacia = new Farmacia();
		farmacia.setNombre("Pepito");
		farmacia.setDireccion(direccion);
		
		getSession().save(direccion);
		getSession().save(farmacia);
		
		assertThat(farmacia.getNombre()).isEqualTo("Pepito");
		assertThat(farmacia.getDireccion().getPuerta()).isEqualTo("123");
		assertThat(direccion.getPuerta()).isEqualTo("123");
		assertThat(direccion.getBarrio().getNombre()).isEqualTo("Villa Luro");
		
		assertThat().isEqualTo(2);
		
	}
	

	


}
