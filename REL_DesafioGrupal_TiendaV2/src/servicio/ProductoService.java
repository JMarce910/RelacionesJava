
package servicio;

import entidad.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ProductoService {
    
    private List<Producto> productos;
    Scanner scanner = new Scanner(System.in);
    String[] productosLista = {"Camiseta", "Pantalón", "Zapatos", "Gorra", "Reloj", "Bolso", "Bufanda", "Guantes", "Vestido", "Chaqueta", "Shorts", "Sombrero", "Calcetines", "Blusa", "Corbata", "Traje", "Collar", "Anillo", "Pulsera", "Medias", "Blazer", "Pijama", "Sandalias", "Billetera", "Cinturón", "Blusón", "Vestido largo", "Chaleco", "Camisa", "Falda", "Mochila", "Zapatillas", "Chancletas", "Lentes de sol", "Brazalete", "Zapatos de tacón", "Chaqueta de cuero", "Corbata de lazo", "Pañuelo", "Jersey"};
    
    public ProductoService(){
        productos = new ArrayList<>();
    }
    
    public Producto crearProducto(){
        Random random = new Random();
        int id = random.nextInt(1000) + 1;
        String nombre = productosLista[random.nextInt(productosLista.length)];
        double precio = random.nextDouble() * 1000;
        Producto producto = new Producto(nombre, id, precio);
        //productos.add(producto);
        //System.out.println("Producto creado: " + producto.getNombre());
        return producto;
    }
    
    public void mostrarProducto(){
        if (productos.isEmpty()) {
            System.out.println("La lista esta vacia");
            return;
        }
        
        for (Producto producto : productos) {
            System.out.println(producto.toString());
            
        }
    }
    public void modificarProducto(String nombre){
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo precio");
                Double nuevoPrecio = scanner.nextDouble();
                scanner.nextLine();
                producto.setPrecio(nuevoPrecio);
                
            }           
          
            
        }
    }
    
    public void eliminarProducto(String nombre){
            Iterator<Producto>itemAeliminar = productos.iterator() ;
            while (itemAeliminar.hasNext()) {
                //Producto producto = itemAeliminar.next();
                if (itemAeliminar.next().getNombre().equalsIgnoreCase(nombre)) {
                    itemAeliminar.remove();
                }
        }
        
    }
    
}
