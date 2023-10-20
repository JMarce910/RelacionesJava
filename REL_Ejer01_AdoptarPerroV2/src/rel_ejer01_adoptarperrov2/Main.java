
package rel_ejer01_adoptarperrov2;

import entidades.Perro;
import entidades.Persona;
import servicios.RazasPerro;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Main {

    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Luisa", "Valderrama", 27, 1094922);
        Persona p2 = new Persona("Daniela", "Valderrama", 28, 1094890);
        
        Perro mascota1 = new Perro("Tomy", RazasPerro.COCKER, 2, "Mediano");
        Perro mascota2 = new Perro("Lulu", RazasPerro.LABRADOR, 4, "Grande");
        
        p1.setPerro(mascota1);
        p2.setPerro(mascota2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
    
}
