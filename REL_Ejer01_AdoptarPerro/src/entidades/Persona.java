

package entidades;

import java.util.ArrayList;
import java.util.List;

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private List<Perro> perrosAdoptados;

    
    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perrosAdoptados = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public List<Perro> getPerrosAdoptados() {
        return perrosAdoptados;
    }

    public void setPerrosAdoptados(List<Perro> perrosAdoptados) {
        this.perrosAdoptados = perrosAdoptados;
    }

   
   public void adoptarPerro(Perro perro){
       perrosAdoptados.add(perro);
       perro.setAdoptado(true);
   }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", edad=" + edad + 
                ", documento=" + documento + 
                ", perrosAdoptados=" + perrosAdoptados + '}';
    }
    
}
