package controlador;


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import ejb.CategoriaFacade;
import modelo.Categoria;


/**
 *
 * @author 
 */
@ManagedBean
@RequestScoped
public class RegistroBeanProducto {
	private int codigo;
	private String nombre;
	private String descripcion;
    @Inject
    private CategoriaFacade registrofacade;

   
    
	public int getCodigo() {
		return codigo;
	}
	public List<Categoria> getProductos()
    {
        return this.registrofacade.findAll();
        
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String guardar()
    {
           Categoria c = new  Categoria();
           c.setNombre(nombre);
           c.setDescripcion(descripcion);
           this.registrofacade.create(c);
           this.codigo = c.getCodigo();
           return "CategoriaCreate";
          
    }
       
    public String prepareList() {
        return "CategoriaLista";
    }
    public String prepareCreate() {
        return "CategoriaCreate";
    }
    public String Eliminar(Long id)
    {
    	 Categoria p =  this.registrofacade.find(id);       
        this.registrofacade.remove(p);
       return "CategoriaLista";
    }
    public String Editar(Long id)
    {
    	 Categoria c =  this.registrofacade.find(id);       
        this.codigo = c.getCodigo();
        this.nombre = c.getNombre();
        this.descripcion= c.getDescripcion();
        
        
        return "CategoriaEdit";
    }
    public String GuardarEdicion(RegistroBeanProducto bp, Long id)
    {
    	 Categoria c = new  Categoria();
       c.setCodigo(bp.codigo);
       c.setNombre(bp.nombre);
       c.setDescripcion(bp.descripcion);
       
       this.registrofacade.edit(c);
       return "CategoriaLista";
    }
    
    
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public RegistroBeanProducto() {
    }
    
}
