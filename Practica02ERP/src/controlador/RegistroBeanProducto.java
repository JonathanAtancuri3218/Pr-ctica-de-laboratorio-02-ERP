package controlador;


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import facade.ProductoFacade;
import modelo.Producto;

/**
 *
 * @author 
 */
@ManagedBean
@RequestScoped
public class RegistroBeanProducto {
	private int codigo;
	private String nombre;
	private String unidadMedida;
	private String imagen;
	private double precio;
    @Inject
    private ProductoFacade registrofacade;

   
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

	public String guardar()
    {
           Producto p = new Producto();
           p.setNombre(nombre);
           p.setUnidadMedida(unidadMedida);
           p.setImagen(imagen);
           p.setPrecio(precio);
           this.registrofacade.create(p);
           this.codigo = p.getCodigo();
           return "ProductoCreate";
          
    }
       
    public String prepareList() {
        return "ProductoLista";
    }
    public String prepareCreate() {
        return "ProductoCreate";
    }
    public String Eliminar(Long id)
    {
        Producto p =  this.registrofacade.find(id);       
        this.registrofacade.remove(p);
       return "ProductoLista";
    }
    public String Editar(Long id)
    {
        Producto p =  this.registrofacade.find(id);       
        this.codigo = p.getCodigo();
        this.nombre = p.getNombre();
        this.unidadMedida = p.getUnidadMedida();
        this.imagen= p.getImagen();
        this.precio = p.getPrecio();
        
        return "ProductoEdit";
    }
    public String GuardarEdicion(RegistroBeanProducto bp, Long id)
    {
       Producto p = new Producto();
       p.setCodigo(bp.codigo);
       p.setNombre(bp.nombre);
       p.setUnidadMedida(bp.unidadMedida);
       p.setImagen(bp.imagen);
       p.setPrecio(bp.precio);
       
       this.registrofacade.edit(p);
       return "ProductoLista";
    }
    
    
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public RegistroBeanProducto() {
    }
    
}
