
package entidad;

import java.util.List;

/**
 *
 * @author Pc
 */
public class Tienda {
    
    private int id;
    private List<Producto> listaProd;
    private String representante;
    private String direccion;

    public Tienda(int id, List<Producto> listaProd, String representante, String direccion) {
        this.id = id;
        this.listaProd = listaProd;
        this.representante = representante;
        this.direccion = direccion;
    }

    public List<Producto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(List<Producto> listaProd) {
        this.listaProd = listaProd;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
