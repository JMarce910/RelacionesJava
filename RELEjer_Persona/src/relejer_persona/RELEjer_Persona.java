
package relejer_persona;


import entidades.Persona;
import servicios.PersonaService;

/**
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main
 */
public class RELEjer_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService personaService = new PersonaService();
        Persona persona1 = personaService.crearPersona("Victoria", "Agudelo", 'A', 12345678);
        Persona persona2 = personaService.crearPersona("Sebastian", "Lopez", 'B', 87654321);

        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("DNI: " + persona1.getDni() + persona1.getDni());

        System.out.println("\nPersona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.println("DNI: " + persona2.getDni() + persona2.getDni());
    }   
}
