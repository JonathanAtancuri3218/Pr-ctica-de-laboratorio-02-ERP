package modelo;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Inventario
 *
 */
@Entity

public class Inventario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private int cantidad;
    
    @JsonbTransient
    @ManyToOne
    private Bodega bodega;
    
    @ManyToOne
    private Producto producto;
    
    @Transient
    private boolean editable;
    public Inventario() {
    }

    public Inventario(int cantidad, Bodega bodega, Producto producto) {
        this.cantidad = cantidad;
        this.bodega = bodega;
        this.producto = producto;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	@Override
	public String toString() {
		return "Inventario [codigo=" + codigo + ", cantidad=" + cantidad + ", bodega=" + bodega + ", producto="
				+ producto + ", editable=" + editable + "]";
	}
    
    
    
}
