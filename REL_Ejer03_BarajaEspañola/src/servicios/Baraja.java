
package servicios;

import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Baraja {
    
    private List<Carta> cartas;
    private List<Carta> monton;
    
    public Baraja(){
        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        
        String[] palos = {"espadas", "bastos", "copas", "oros"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9){
                    cartas.add(new Carta(palo, numero));
                }
                
            }
            
        }
        barajar();
    }
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    
    public Carta siguienteCarta(){
        if (cartas.isEmpty()){
            System.out.println("No hay mas cartas en la baraja");
            return null;
        }
        Carta siguiente = cartas.remove(0);
        monton.add(siguiente);
        return siguiente;
    }
    
    public int cartasDisponibles(){
        return cartas.size();
    }
    
    public List<Carta> darCartas(int cantidad){
        List<Carta> cartasEntregadas = new ArrayList<>();
        if (cartasDisponibles() < cantidad) {
            System.out.println("No hay mas cartas disponibles");
        } else {
            for (int i = 0; i < cantidad; i++) {
                cartasEntregadas.add(siguienteCarta());
            }
        }
        return cartasEntregadas;
        
        }
    
    public void cartasMonton(){
        if (monton.isEmpty()) {
            System.out.println("No se han repartido cartas");
        }else{
            System.out.println("cartas en el monton: ");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }
    
    public void mostrarMazo(){
        System.out.println("Cartas en el mazo: ");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
    
}
