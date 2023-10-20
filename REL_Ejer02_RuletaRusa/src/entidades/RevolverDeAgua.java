
package entidades;

import java.util.Random;

/**
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
* Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
* 
 */
public class RevolverDeAgua {
    
    private int posicionActual;
    private int posicionAgua;

    
    public void llenarRevolver(){
        Random random = new Random();
        posicionActual = random.nextInt(6);
        posicionAgua = random.nextInt(6);
    }
    
    public boolean mojar(){
        return posicionActual == posicionAgua;
    }
    
    public void siguienteChorro(){
        posicionActual = (posicionActual + 1)%6;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "Posicion Actual: " + posicionActual + ", Posicion Agua: " + posicionAgua + '}';
    }
   
}
