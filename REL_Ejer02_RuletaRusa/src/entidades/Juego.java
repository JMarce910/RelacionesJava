
package entidades;

import java.util.ArrayList;

/**
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;
    
    
    public Juego(){
        jugadores = new ArrayList<>();
        revolver = new RevolverDeAgua();
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores){
        this.jugadores = jugadores;
        revolver.llenarRevolver();
    }
    
    public void ronda(){
        boolean juegoTerminado = false;
        while (!juegoTerminado){
            for (Jugador jugador : jugadores){
                juegoTerminado = jugador.disparo(revolver);
                if (juegoTerminado){
                    System.out.println("¡" + jugador.getNombre() + " se mojó y perdió!");
                    System.out.println(" ");
                    break;
                }
            }
        }
    }   
}
