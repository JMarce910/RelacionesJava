
package servicios;

import entidades.Equipo;
import entidades.Jugador;

/**
 *
 * @author Pc
 */
public class EquipoService {
    
    public void mostrarEquipo(Equipo equipo){
        for (Jugador jugador : equipo.getJugadores()){
            System.out.println(jugador.toString());
        }
    }
    
}
