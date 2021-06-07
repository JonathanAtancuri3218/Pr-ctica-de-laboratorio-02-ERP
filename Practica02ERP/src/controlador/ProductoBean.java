package controlador;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import ejb.CategoriaFacade;
import ejb.ProductoFacade;
import modelo.Categoria;
import modelo.Producto;


@ManagedBean
@RequestScoped
public class ProductoBean {

	private int codigo;
    private String nombre;
    private String unidadMedida;
    private String imagen;
    private double precio;
    //clave foranea
    private Categoria catgoria;
    @Inject
    private ProductoFacade registrofacade;
    @Inject
    private CategoriaFacade categoriafacade;
   
    public ProductoBean() {
    	Categoria p = new Categoria();
    }
	
	public List<Producto> getProductos()
    {
        return this.registrofacade.findAll();
        
    }     
	public int getCodigo() {
		return codigo;
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
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Categoria getCatgoria() {
		return catgoria;
	}

	public void setCatgoria(Categoria catgoria) {
		this.catgoria = catgoria;
	}

	public String guardar()
    {
           Producto c = new  Producto();
           c.setNombre(nombre);
           c.setUnidadMedida(unidadMedida);
           c.setImagen(imagen);
           c.setPrecio(precio);
           
           this.registrofacade.create(c);
           this.codigo = c.getCodigo();
           return "ProductoCreate";
          
    }
       
    public String prepareList() {
        return "ProductoLista";
    }
    public String prepareCreate() {
        return "ProductoCreate";
    }
    public String Eliminar(Producto c)
    {
    	registrofacade.remove(c);
    	 
    	registrofacade.findAll();
    	return null;
    }
    public String Editar(Producto c)
    {
    	c.setEditable(true);
        return null;
    }
    public String GuardarEdicion(ProductoBean bp)
    {
    	 Producto c = new  Producto();
       c.setCodigo(bp.codigo);
       c.setNombre(bp.nombre);
       c.setUnidadMedida(bp.unidadMedida);
       c.setImagen(bp.imagen);
       c.setPrecio(bp.precio);
       this.registrofacade.edit(c);
       return "ProductoLista";
    }
}
