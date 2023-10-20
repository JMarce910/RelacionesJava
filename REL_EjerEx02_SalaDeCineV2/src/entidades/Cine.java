
package entidades;

/**
 *
 * @author Pc
 */
public class Cine {
    
    private double precio;
    private Peliculas peliculas;
    private String[][] Sala = new String[8][6];

    public Cine(){

    }
    public Cine(String[][] Sala, double precio, Peliculas  peliculas ) {
        this.Sala = Sala;
        this.precio = precio;
        this.peliculas = peliculas;

    }

    public String[][] getSala() {
        return Sala;
    }

    public void setSala(String[][] sala) {
        this.Sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Peliculas  getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Peliculas  peliculas) {
        this.peliculas = peliculas;
    }



    @Override
    public String toString() {
        return "Cine{" +
                "sala=" + Sala +
                ", peliculas=" + peliculas +
                '}';
    }
    
}
