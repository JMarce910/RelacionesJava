
package servicio;

import entidad.Producto;
import entidad.Tienda;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class TiendaService {

    List<Tienda> tiendas = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public Tienda crearTienda() {
        Random random = new Random();
        int id = random.nextInt(1000) + 1;
        List<Producto> productos = new ArrayList();
        for (int i = 0; i < 5; i++) {

            ProductoService ps = new ProductoService();
            Producto prod = ps.crearProducto();
            productos.add(prod);

        }
        Tienda tienda = new Tienda(id, productos, "representante", "direccion");

//            System.out.println("Tienda ID: " + tienda.getId());
//            System.out.println("Productos:");
//            for (Producto producto : tienda.getListaProd()) {
//                System.out.println("- " + producto.getNombre() );
//            }
//            System.out.println();
        tiendas.add(tienda);

        return tienda;
    }

    public void mostrartiendas() {
        for (Tienda tienda : tiendas) {
            System.out.println("Tienda ID: " + tienda.getId());
            System.out.println("Productos:");
            for (Producto producto : tienda.getListaProd()) {
                System.out.println("- " + producto.getNombre());
            }
            System.out.println(" Stock: " + tienda.getListaProd().size());
            System.out.println();
        }

    }

    public void modificarTiendas(String nombre) {

        for (Tienda tienda1 : tiendas) {
            if (tienda1.getRepresentante().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo nombre");
                String representante = scanner.nextLine();
                tienda1.setRepresentante(representante);

            }

        }
    }

}
