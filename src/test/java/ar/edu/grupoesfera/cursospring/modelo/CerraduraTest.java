package ar.edu.grupoesfera.cursospring.modelo;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	@Test
	public void ingresarClaveCorrecta() {

		Cerradura cerradura = new Cerradura(1234, 3);
		Boolean abrio = cerradura.abrirCerradura(1234);
		Assert.assertTrue(abrio);

	}

	@Test
	public void ingresarClaveIncorrecta() {
		Cerradura cerradura = new Cerradura(1232, 3);
		Boolean abrio = cerradura.abrirCerradura(21432);

		Assert.assertFalse(abrio);
	}
	
	@Test
	public void ingresarClaveCorrectaConBloqueo(){
		
		Cerradura cerradura = new Cerradura (1111, 2);
		Boolean abrio = cerradura.abrirCerradura(1234);
		
		Assert.assertFalse(abrio);
		
	}
	
	@Test
	public void ingresarClaveCorrectaConBloqueo2(){
		
		Cerradura cerradura = new Cerradura (1111, 3);
		Boolean abrio = cerradura.abrirCerradura(1111);
		
		Assert.assertTrue(abrio);
		
	}
	
	@Test
	public void ingresarClaveCorrectaConBloqueo3(){
		
		Cerradura cerradura = new Cerradura (1111, 3);
		Boolean abrio = cerradura.abrirCerradura(11211);
		
		Assert.assertFalse(abrio);
		
	}
	
	@Test
	public void ingresarClaveCorrectaConBloqueo4(){
		
		Cerradura cerradura = new Cerradura (1111, 3);
		Boolean abrio = cerradura.abrirCerradura(1111);
		
		Assert.assertTrue(abrio);
		
	}
}
