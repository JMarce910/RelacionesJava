
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Tienda {
    
    private int id;
    private String direccion;
    private String Nombre;
    private List<Producto> productos;

    public Tienda(int id,String direccion, String Nombre, List<Producto> productos) {
        this.id = id;
        this.direccion = direccion;
        this.Nombre = Nombre;
        this.productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", representante='" + Nombre + '\'' +
                ", productos=" + productos +
                '}';
    }
}
