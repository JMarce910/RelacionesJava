
package rel_ejer03_barajaespañola;

import java.util.Scanner;
import servicios.Baraja;

/**
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.

 */
public class REL_Ejer03_BarajaEspañola {

    
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Scanner read = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("\nOpciones:");            
            System.out.println("1. Mezclar la baraja");            
            System.out.println("2. Repartir cartas");            
            System.out.println("3. Mostrar cartas disponibles");            
            System.out.println("4. Mostrar cartas repartidas");            
            System.out.println("5. Mostrar cartas en la baraja");            
            System.out.println("6. Salir");            
            System.out.println("Elija una opción: ");  
            opcion = read.nextInt();
            
            switch (opcion) {
                case 1:
                    baraja.barajar();
                    System.out.println("Baraja mezclada.");
                    break;
                    
                case 2:
                    System.out.println("Ingrese el numero de cartas a repartir: ");
                    int cantidad = read.nextInt();
                    baraja.darCartas(cantidad);
                    break;
                    
                case 3:
                    System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());
                    break;
                    
                case 4:
                    System.out.println("Cartas repartidas: ");
                    baraja.cartasMonton();
                    break;
                    
                case 5:
                    System.out.println("Número de cartas en la baraja: " + baraja.cartasDisponibles());
                    System.out.println("Cartas en la baraja: ");
                    baraja.mostrarMazo();
                    break;
                    
                case 6:
                    System.out.println("Saliendo del programa: ");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
            if (opcion != 6 && opcion != 2){
                System.out.println("Presione Enter para continuar...");
                read.nextLine();
                read.nextLine();
                
            }
            
        }while (opcion != 6);
        
        read.close();
        
    }
}
