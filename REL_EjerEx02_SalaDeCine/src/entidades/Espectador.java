
package entidades;

/**
 *
 * @author Pc
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private int dineroDisp;

    public Espectador(String nombre, int edad, int dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(int dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

//    @Override
//    public String toString() {
//        return "Espectador{" + "nombre=" + nombre + 
//                ", edad=" + edad + 
//                ", dineroDisp=" + dineroDisp + '}';
//    }
    
}
