
package rel_ejerex04_votacionesv2;

import entidades.Voto;
import java.util.Scanner;
import servicios.Simulador;

/**
 Desarrollar un simulador del sistema de votación de facilitadores en Egg
 * El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.
13
• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes
 */
public class REL_EjerEx04_VotacionesV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Simulador simulador = new Simulador();
        Voto voto = new Voto();
        do {
            System.out.println("-----Menu-----");
            System.out.println("1: Introducir Info: Necesario para Ejecutar todo el programa");
            System.out.println("2: Mostrar Info");
            System.out.println("3: Mostrar Data votos");
            System.out.println("4: Recuento de votos: Necesario para Ejecutar el 5 ");
            System.out.println("5: Mostrar Data Facilitadores");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 : simulador.crearData(voto.getAlumnosVotos());
                case 2 : simulador.mostrarData();
                case 3 : voto.mostrarData();
                case 4 : simulador.recuentoVotos(10);
                case 5 : simulador.mostrarDataVotosBig();
            }
        }while(true);
    }
    
}