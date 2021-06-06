package modelo;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaDetalle
 *
 */
@Entity

public class FacturaDetalle implements Serializable {


	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private double subtotal;
    private int cantidad;
    
    @JsonbTransient
    @ManyToOne
    private FacturaCabecera facturaCabecera;
    
    @ManyToOne
    private Producto producto;
    

    public FacturaDetalle() {
    }

    public FacturaDetalle(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSubtotal() {
		this.subtotal = Math.round((this.cantidad*this.producto.getPrecio()) * 100.0) / 100.0;
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [codigo=" + codigo + ", subtotal=" + subtotal + ", cantidad=" + cantidad
				+ ", facturaCabecera=" + facturaCabecera + ", producto=" + producto + "]";
	}
    
    
}
