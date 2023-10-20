
package servicios;

import entidades.Dni;
import entidades.Persona;

/**
 *
 * @author Pc
 */
public class PersonaService {
    
    public Persona crearPersona(String nombre, String apellido, char serieDni, int numeroDni){
      Dni dni = new Dni(serieDni, numeroDni);
      return new Persona(nombre, apellido, dni);
    }    
}
