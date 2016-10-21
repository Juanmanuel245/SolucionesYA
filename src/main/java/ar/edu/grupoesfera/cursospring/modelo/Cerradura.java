package ar.edu.grupoesfera.cursospring.modelo;

public class Cerradura {

	private Integer clave;
	private Integer cantidadErradas = 0;
	private Integer cantidadPermitidas;

	public Cerradura(Integer clave, Integer cantidadPermitidas) {

		this.clave = clave;
	}

	public Boolean abrirCerradura(Integer claveRecibida) {

			if (clave.equals(claveRecibida)) {
				return true;
			} else {
				cantidadErradas++;
				return false;
			}
		}
	

}
