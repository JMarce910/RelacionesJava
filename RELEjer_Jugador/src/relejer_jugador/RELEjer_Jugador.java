
package relejer_jugador;

import entidades.Equipo;
import entidades.Jugador;
import servicios.EquipoService;

/**
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
public class RELEjer_Jugador {

    
    public static void main(String[] args) {
        
        Equipo equipo = new Equipo();
        Jugador jugador1 = new Jugador ("Diego","Maradona","Delantero", 10);
        Jugador jugador2 = new Jugador ("Claudio Paul","Caniggia","Lateral", 9);
        Jugador jugador3 = new Jugador ("Lionel","Messi","Delantero", 19);
        
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        
        EquipoService equipoService = new EquipoService();
        equipoService.mostrarEquipo(equipo);
    }
    
}
