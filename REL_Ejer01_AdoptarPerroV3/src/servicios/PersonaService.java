
package servicios;


import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class PersonaService {
    
    ArrayList<Persona> personas = new ArrayList<>();
    
    public void llenarDataPersona(){
        Persona persona = new Persona("Dylan", "Ramirez", 22, 1095294);
        Persona persona1 = new Persona("Luisa", "Valderrama", 28, 1094946);
        Persona persona2 = new Persona("Juan", "Lopez", 30, 1094865);
        Persona persona3 = new Persona("Victor", "Madariaga", 42, 36903);
        Persona persona4 = new Persona("Marcela", "Mejia", 37, 1094888);
        
        personas.add(persona);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
    }
    
    public void mostrarDataPersona(){
        for (Persona i : personas) {
            System.out.println(i);    
        }
    }
    
    public void Adoptar(ArrayList<Perro> perros){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quieres adoptar perros: ");
        System.out.println("Mira la base de datos");
        for (Perro i : perros) {
            System.out.println(i); 
        }
        
        System.out.println("Escribe el nombre de la persona:");
        String name = scanner.next();
        
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equalsIgnoreCase(name)){
                
                System.out.println("Digita el nombre del perro: ");
                String nameDog = scanner.next();
                for (Perro j : perros) {
                    
                    if (j.getNombre().equalsIgnoreCase(nameDog) && !j.isAdoptado()) {
                        j.setAdoptado(true);
                        personas.get(i).setPerro(j);
                        break;  
                    }  
                }
            } 
        }
    } 
}
