package ar.edu.grupoesfera.cursospring.modelo;

import static org.junit.Assert.*;

import java.text.Collator;

import org.junit.Test;

public class TestDeUsuario {

	@Test
	public void queUnNombreDeUsuarioSeCreeCorretamente() {
		Usuario usuario = new Usuario();
		Collator comparadorDeCadena = Collator.getInstance();
		comparadorDeCadena.setStrength(Collator.PRIMARY);
		
		usuario.setNombre("Roberto");
		String nombreEsperado = "Roberto";
	
		Integer resultadoEsperado = 0;
		Integer resultadoEsperadoDeLaComparacionDeCadena = comparadorDeCadena.compare(usuario.getNombre(), nombreEsperado); //Esto hace una comparación de cadena y devuelve un 0 si son iguales
		
		assertEquals(resultadoEsperado.intValue(),resultadoEsperadoDeLaComparacionDeCadena.intValue());
	}

}
