
package entidades;

import java.time.LocalTime;

/**
 *
 * @author Pc
 */
public class Peliculas {
    
    private String titulo;
    private LocalTime time;
    private Espectador espectador;
    private double precio;
    private String director;
    private int edadMinima;
    public Peliculas(){

    }

    public Peliculas(String titulo, LocalTime time,  Espectador   espectador, double precio, String director) {
        this.titulo = titulo;
        this.time = time;
        this.espectador = espectador;
        this.precio = precio;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Espectador  getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", time=" + time +
                ", precio=" + precio +
                ", director='" + director + '\'' +
                ", edadMaxima=" + edadMinima +
                '}';
    }
    
}
