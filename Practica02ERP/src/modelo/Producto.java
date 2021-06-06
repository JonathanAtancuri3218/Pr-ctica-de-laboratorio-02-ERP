package modelo;

import java.io.Serializable;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity

public class Producto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String unidadMedida;
	private String imagen;
	private double precio;
	
	 @JsonbTransient
	    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<FacturaDetalle> facturasDetalles;

	    @JsonbTransient
	    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Inventario> inventarios;
	    

	    @ManyToOne
	    private Categoria categoria;
	    
	    @JsonbTransient
	    @Transient
	    private boolean editable;

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	} 
}
