
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CineService {
    
    public static boolean ubicarEpectador(Cine cine, Espectador espectador){
        Espectador[][] sala = cine.getSala();
        int fila = new Random().nextInt(sala.length); //Generar fila aleatoria
        int columna = new Random().nextInt(sala[0].length); //Generar columna aleatoria
        
        if (sala[fila][columna] == null){
            sala[fila][columna] = espectador;
            return true;
        }else {
            return false;
        }
    }
    
    public static void ubicarEspectadoresAleatorio(Cine cine, int cantidadEspectadores){
        Espectador[][] sala = cine.getSala();
        int filas = sala.length;
        int columnas = sala[0].length;
        
        Random random = new Random();
        
        for (int i = 0; i < cantidadEspectadores; i++) {
            int fila = random.nextInt(filas); // fila aleatoria
            int columna = random.nextInt(columnas); //columna aleatoria
            
            if (sala[fila][columna] == null){
                //crea un nuevo espectador y ubícalo si el asiento está libre
                Espectador espectador = generarEspectadorAleatorio();
                sala[fila][columna] = espectador;
            }else{
                //si el asiento esta ocupado, disminuye le contador para repetir la iteracion
                i--;
            }   
        }
    }
    
    public static void mostrarSalaConEtiquetas(Cine cine){
        Espectador[][] sala = cine.getSala();
        int filas = sala.length;
        int columnas = sala[0].length;
        
        System.out.print(" "); //espacio en blanco para alinear las etiquetas de columna
        for (char colLabel = 'A'; colLabel < 'A' + columnas; colLabel++){
            System.out.print(" " + colLabel + " "); //mostrar etiquetas de columna
        }
        System.out.println(); //nueva linea despues de las etiquetas de columna
        
        char filaLabel = '8'; //etiqueta de fila inicial
        
        for (int i = filas - 1; i >= 0; i--) {
            System.out.print(filaLabel + " "); //mostrar etiqueta de fila
            
            for (int j = 0; j < columnas; j++) {
                if (sala[i][j] == null){
                    System.out.print(" - "); //asiento libre
                }else {
                    System.out.print(" X "); //asiento ocupado
                }
                
            }
            System.out.println(); //cambiar de fila
            filaLabel--; //decrementar la etiqueta de fila   
        }
    }
    
    public static void elegirPelicula(Cine cine, Scanner scanner){
        ArrayList<Pelicula> peliculas = cine.getPeliculasDisponibles();
        if (peliculas.isEmpty()){
            System.out.println("No hay peliculas disponibles.");
            return;
        }
        
        System.out.print("Elija el número de la pelicula: ");
        int numeroPelicula = scanner.nextInt();
        
        if (numeroPelicula >= 1 && numeroPelicula <= peliculas.size()){
            Pelicula peliculaElegida = peliculas.get(numeroPelicula - 1);
            cine.setPeliculaActual(peliculaElegida);
            System.out.println("Pelicula elegida: " + peliculaElegida.getTitulo());
        }else {
            System.out.println("Número de pelicula inválido.");
        }
    }
    
    public static Espectador cargarEspectadorManualmente(Scanner scanner){
        System.out.print("Ingrese el nombre del espectador: ");
        String nombre = scanner.next();
        
        System.out.print("Ingrese la edad del espectador: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese el dinero disponible del espectador: ");
        int dinero = scanner.nextInt();
        
        return new Espectador(nombre, edad, dinero);
    }
    
    public static void mostrarAsientosDisponibles(Cine cine){
        Espectador[][] sala = cine.getSala();
        int filas = sala.length;
        int columnas = sala[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (sala[i][j] == null){
                    System.out.print(" " + (i+1) + (char) ('A' + j) + " - ");
                }else {
                    System.out.print(" " + (i+1) + (char) ('A' + j) + " X ");
                }
                
            }
            System.out.println();
        }
    }
    
    public static void agregarPelicula(Cine cine, Pelicula pelicula){
        cine.agregarPelicula(pelicula);
        System.out.println("Pelicula agregada: " + pelicula.getTitulo());
    }
    
    public static Espectador generarEspectadorAleatorio(){
        String[] nombres = {"Alejandro", "Marcela", "Juan", "Jimena", "Sebastian", "Daniela", "Luisa", "Ana"};
        String nombre = nombres[new Random().nextInt(nombres.length)];
        
        int edad = new Random().nextInt(60) + 10; //Edad entre 10 y 69
        int dinero = (int) (Math.random() * 50 + 10); //Dinero entre 10 y 59
        
        return new Espectador(nombre, edad, dinero);
    }
    }

