
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Equipo {
    
    private List <Jugador> jugadores;

    public Equipo(){
        jugadores = new ArrayList<>();
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public List<Jugador> getJugadores(){
        return jugadores;
    }
}
