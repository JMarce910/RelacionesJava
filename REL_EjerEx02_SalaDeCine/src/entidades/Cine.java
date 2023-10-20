
package entidades;

import java.util.ArrayList;


/**
 *
 * @author Pc
 */
public class Cine {
    
    private Pelicula peliculaActual;
    private Espectador[][] sala;
    private double precioEntrada;
    private ArrayList<Pelicula> peliculasDisponibles;
    
    

    public Cine(Pelicula peliculaActual, double precioEntrada) {
        this.peliculaActual = peliculaActual;
        this.sala = new Espectador[8][6]; //inicializar la matriz sala en este constructor
        this.precioEntrada = precioEntrada;
        this.peliculasDisponibles = new ArrayList<>();
        peliculasDisponibles.add(new Pelicula("Avatar", 162, 13, "James Cameron"));
        peliculasDisponibles.add(new Pelicula("Barbie", 140, 15, "Enrique S"));
        peliculasDisponibles.add(new Pelicula("Flash", 80, 14, "Sam"));
        peliculasDisponibles.add(new Pelicula("Jurassic Park", 200, 15, "Spielberg"));
        peliculasDisponibles.add(new Pelicula("Toy Story", 81, 3, "Lasseter"));
    }

    public Pelicula getPeliculaActual() {
        return peliculaActual;
    }

    public void setPeliculaActual(Pelicula peliculaActual) {
        this.peliculaActual = peliculaActual;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Pelicula> getPeliculasDisponibles() {
        return peliculasDisponibles;
    }

    public void setPeliculasDisponibles(ArrayList<Pelicula> peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }
    
    
    public void agregarPelicula(Pelicula pelicula){
        peliculasDisponibles.add(pelicula);
    }   
    
}
