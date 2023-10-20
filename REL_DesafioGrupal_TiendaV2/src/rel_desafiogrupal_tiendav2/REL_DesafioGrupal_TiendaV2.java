
package rel_desafiogrupal_tiendav2;

import servicio.TiendaService;

/**
Se necesita una app para una cadena de tiendas en la cual queremos almacenar los 
distintos productos que venderemos y el precio que tendran, Ademas, se necesita 
que la app cuente con las funciones basicas.
(Estas las realizaremos en la clase de servicio)
Las funciones son basicas son:
CrearProducto()
MostrarProductos()
ModificarProducto()
EliminarProducto()
Cada producto tiene que tener como atributos: id, nombre, y debe tener
asociado un precio.
* 
* 
La app, tambien debe contener las diferentes tiendas. Cada tienda, tendrá como 
atributos: ID de tienda, Lista de productos, direccion, representante de la tienda.
Las funciones de la tienda son:
CrearTienda()
MostrarTiendas()
ModificarTienda()
EliminarTienda()
Además:
AgregarProductos(): Agrega el producto elegido y la cantidad.
VenderProductos(): Vende cierta cantidad del producto.
EliminarProductos(): Elimina el Producto de esa tienda.
StockProductos(): Nos devuelve cuantos productos hay.
Nota:
- Cada tienda tendrá una lista de productos diferentes con sus respectivos stocks.
* 
* Una vez realizado el programa:
- Crear 3 tiendas.
- Crear 15 productos.
- Asociar a cada tienda, 5 productos de los creados. (algunos productos pueden repetirse, pero no todos)
- Agregar cantidad de stock de cada producto a la tienda
- Realizar algunas ventas
- Calcular el stock restante.
Nota: Agregar o modificar funciones para que se realice correctamente lo que se pide. (Por ejemplo; No se
puede vender cierto producto si es que no hay stock.)
* 
* Realizar pruebas unitarias con JUnit para cada uno de los metodos
creados.
Subir a GitHub todo el proyecto realizado con el grupo.
 */

public class REL_DesafioGrupal_TiendaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //        ProductoService ps = new ProductoService();
//        Scanner sc = new Scanner(System.in);
//        
//        ps.crearProducto();
//        ps.mostrarProducto();
//        System.out.println("Que producto desea modificar");
//        String nombre = sc.nextLine();
//        ps.modificarProducto(nombre);
//        ps.mostrarProducto();
//        System.out.println("Que producto desea eliminar");
//        String nombreEliminar = sc.nextLine();
//        ps.eliminarProducto(nombreEliminar);
//        
//        ps.mostrarProducto();

        TiendaService ts = new TiendaService();
        
        ts.crearTienda();
        
        ts.mostrartiendas();
        ts.modificarTiendas("representante");
        ts.mostrartiendas();

    }     
}
