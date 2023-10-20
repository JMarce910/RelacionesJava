
package entidad;

/**
 *
 * @author Pc
 */
public class Producto {
    
    private String nombre;
    private int id;
    private double precio;

    public Producto(String nombre, int ID, double precio) {
        this.nombre = nombre;
        this.id = ID;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", id=" + id + ", precio=" + precio + '}';
    }
    
}
