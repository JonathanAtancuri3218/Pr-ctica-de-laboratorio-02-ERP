package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaCabecera
 *
 */
@Entity

public class FacturaCabecera implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private LocalDate fecha;
    private double iva;
    private double subTotal;
    private double total;
    private String estado;
    
    @JsonbTransient
    @ManyToOne
    private Usuario usuario;
    
    @JsonbTransient
    @OneToMany(mappedBy = "facturaCabecera", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FacturaDetalle> facturaDetalles;
    
    //@OneToOne
    //private Localidad localidad;

    public FacturaCabecera() {
        this.facturaDetalles = new ArrayList<>();
        this.iva = 0.12;
        this.estado = "pendiente";
    }

    public FacturaCabecera(LocalDate fecha,double total, Usuario usuario, List<FacturaDetalle> facturaDetalles) {
        this.fecha = fecha;
        this.total = total;
        this.usuario = usuario;
        this.facturaDetalles = facturaDetalles;
        this.iva = 0.12;
        this.estado = "pendiente";
    }

   
}
