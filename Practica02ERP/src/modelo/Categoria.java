package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
@Entity

public class Categoria implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;
	private String nombre;
	private String descripcion;
	private boolean editable; 
   
}
