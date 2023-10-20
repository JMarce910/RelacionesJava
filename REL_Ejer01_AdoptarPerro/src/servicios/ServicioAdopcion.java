

package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

public class ServicioAdopcion {

    public List<Perro> perrosDisponibles;
    public List<Persona> personas;

    public ServicioAdopcion() {
        perrosDisponibles = new ArrayList<>();
        personas = new ArrayList<>();
    }

    public void agregarPerro(Perro perro) {
        perrosDisponibles.add(perro);
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarPerrosDisponibles() {
        System.out.println("Perros disponibles para adoptar:");
        for (Perro perro : perrosDisponibles) {
            if (!perro.isAdoptado()) {
                System.out.println(perro);
            }
        }
    }

    public void mostrarPersonasConPerros() {
        System.out.println("Personas con sus perros adoptados: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void adoptarPerro(Persona persona, Perro perro) {
        if (!perro.isAdoptado()) {
            persona.adoptarPerro(perro);
            System.out.println(persona.getNombre() + " ha adoptado a " + perro.getNombre());
        } else {
            System.out.println("El perro " + perro.getNombre() + " ya fue adoptado por otra persona.");
        }
    }

}
