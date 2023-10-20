
package rel_ejer01_adoptarperrov3;

import servicios.PerroService;
import servicios.PersonaService;

/**
 * Maethor300
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class REL_Ejer01_AdoptarPerroV3 {

    
    public static void main(String[] args) {
        
        PerroService DS = new PerroService();
        PersonaService PS = new PersonaService();
        System.out.println("-------DataPerro------");
        DS.llenarData();
        System.out.println("-------DataPersona------");
        PS.llenarDataPersona();
        PS.Adoptar(PerroService.perros);
        PS.mostrarDataPersona();
        DS.MostrarData();
        
    }
    
}
