
package rel_ejer01_adoptarperro;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;
import servicios.ServicioAdopcion;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class REL_Ejer01_AdoptarPerro {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ServicioAdopcion servicio = new ServicioAdopcion();

        while (true) {
            System.out.println("1. Agregar perro");
            System.out.println("2. Agregar persona");
            System.out.println("3. Mostrar perros disponibles");
            System.out.println("4. Mostrar personas con perros");
            System.out.println("5. Adoptar perro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del perro: ");
                    String nombrePerro = scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadPerro = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Tamaño: ");
                    String tamaño = scanner.nextLine();
                    Perro perro = new Perro(nombrePerro, raza, edadPerro, tamaño);
                    servicio.agregarPerro(perro);
                    break;
                case 2:
                    System.out.print("Nombre de la persona: ");
                    String nombrePersona = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadPersona = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Documento: ");
                    int documento = scanner.nextInt();
                    Persona nuevaPersona = new Persona(nombrePersona, apellido, edadPersona, documento);
                    servicio.agregarPersona(nuevaPersona);
                    break;
                case 3:
                    servicio.mostrarPerrosDisponibles();
                    break;
                case 4:
                    servicio.mostrarPersonasConPerros();
                    break;
                case 5:
                    System.out.print("Ingrese el nombre de la persona que adoptará: ");
                    String nombreAdoptante = scanner.nextLine();
                    System.out.print("Ingrese el nombre del perro a adoptar: ");
                    String nombrePerroAdoptar = scanner.nextLine();
                    Persona adoptante = null;
                    Perro perroAdoptar = null;
                    for (Persona persona : servicio.personas) {
                        if (persona.getNombre().equals(nombreAdoptante)) {
                            adoptante = persona;
                            break;
                        }
                    }
                    for (Perro p : servicio.perrosDisponibles) {
                        if (p.getNombre().equals(nombrePerroAdoptar)) {
                            perroAdoptar = p;
                            break;
                        }
                    }
                    if (adoptante != null && perroAdoptar != null) {
                        servicio.adoptarPerro(adoptante, perroAdoptar);
                    } else {
                        System.out.println("No se encontró la persona o el perro especificado.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
    
}
