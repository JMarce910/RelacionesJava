
package rel_ejerex02_saladecine;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.Scanner;
import servicios.CineService;

/**
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son 
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en 
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta 
ocupado se muestra una X, sino un espacio vacío.
* 
8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F 
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X
2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F 
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
* 
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos
 */
public class REL_EjerEx02_SalaDeCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crear una instancia de Pelicula para pasarla al constructor de Cine
        Pelicula peliculaInicial = new Pelicula("Avatar", 162, 13, "James Cameron");
        //Crear una instancia de Cine con la pelicula inicial y el precio de entrada
        Cine cine = new Cine(peliculaInicial, 10); //Por ejemplo, un precio de entrada de 10
        
        
        int opcion;
        do{
            System.out.println("Menú: ");
            System.out.println("1. Simular cine");
            System.out.println("2. Ver Matriz de la sala");
            System.out.println("3. Agregar Pelicula");
            System.out.println("4. Cargar Espectador");
            System.out.println("5. Elegir Pelicula");
            System.out.println("6. Ver Asientos Disponibles");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    CineService.elegirPelicula(cine, scanner);
                    
                    System.out.print("Ingrese la cantidad de espectadores a simular: ");
                    int cantidadEspectadores = scanner.nextInt();
                    CineService.ubicarEspectadoresAleatorio(cine, cantidadEspectadores);
                    
                    break;
                    
                case 2:
                    CineService.mostrarSalaConEtiquetas(cine);
                    break;
                    
                case 3:
                    System.out.print("Ingrese el título de la pelicula: ");
                    String tituloPelicula = scanner.nextLine();
                    
                    System.out.print("Ingrese la duración de la pelicula en minutos: ");
                    int duracion = scanner.nextInt();
                    
                    System.out.print("Ingrese la edad mínima para la película: ");
                    int edadMinima = scanner.nextInt();
                    
                    System.out.print("Ingrese el nombre del director de la película: ");
                    String director = scanner.nextLine();
                    
                    Pelicula nuevaPelicula = new Pelicula(tituloPelicula, duracion, edadMinima, director);
                    CineService.agregarPelicula(cine, nuevaPelicula);
                    break;
                    
                case 4:
                    Espectador espectador = CineService.cargarEspectadorManualmente(scanner);
                    boolean ubicado = CineService.ubicarEpectador(cine, espectador);
                    if (ubicado) {
                        System.out.println("Espectador ubicado correctamente.");
                    }else {
                        System.out.println("No se puede ubicar al espectador.");
                    }
                    break;
                    
                case 5:
                    CineService.elegirPelicula(cine, scanner);
                    break;
                    
                case 6:
                    CineService.mostrarAsientosDisponibles(cine);
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while (opcion != 0);
        
    }
    
}
