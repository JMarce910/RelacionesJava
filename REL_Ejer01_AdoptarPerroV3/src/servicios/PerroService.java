
package servicios;

import entidades.Perro;
import java.util.ArrayList;


public class PerroService {
    
    public static ArrayList<Perro> perros = new ArrayList<Perro>();
    
    public void llenarData(){
        
        Perro perro1 = new Perro("Pulgas", "Cocker spaniel", 2, "Mediano"); 
        Perro perro2 = new Perro("Lukas", "Labrador", 1, "Grande"); 
        Perro perro3 = new Perro("Princesa", "Beagle", 1, "Pequeño"); 
        Perro perro4 = new Perro("Sarita", "Border Collie", 4, "Mediano"); 
        Perro perro5 = new Perro("Socrates", "Golden Retriever", 6, "Grande");
        
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);
    }
    
    public void MostrarData(){
        for (Perro i : perros) {
            System.out.println(i);
            
        }
    }
    
}
