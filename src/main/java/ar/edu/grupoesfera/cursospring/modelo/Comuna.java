package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class Comuna {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	/* mappedBy el barrio conoce sus comunas y las comunas conoces los barrios que la componene, solo va si es bidireccional */
	/* orphanRemoval, eliminar los huerfanos, si elimino una factura que se eliminen los items por que solos no tienen sentido */
	/* fetchType EAGER para no colecciones, no recomendable poner */
	/* fetch=FetchType.LAZY significa tardio (perezoso) , es defoult para coleccines, hibernate no te traie la coleccion, hace el select de los elementos de la coleccion cuando alguien queire acceder...trae las colecicones dle objetos cuando los llaman, no te trae todo */
	
	
	@OneToMany(mappedBy="comuna", orphanRemoval=true, fetch=FetchType.LAZY)
	@Cascade(value = CascadeType.ALL)
	private List<Barrio> barrio = new ArrayList<Barrio>();
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Barrio> getBarrio() {
		return barrio;
	}


	public void setBarrio(List<Barrio> barrio) {
		this.barrio = barrio;
	}

	public void addBarrio(Barrio barrio){
		this.barrio.add(barrio);
		
	}


	
}
