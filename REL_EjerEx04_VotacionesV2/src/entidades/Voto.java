/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.HashSet;

/**
 *
 * @author Pc
 */
public class Voto {
    
    private Alumno alumno;
    private HashSet<String> alumnosVotos = new HashSet<>();

    public Alumno  getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno  alumno) {
        this.alumno = alumno;
    }
    public void mostrarData(){
        for (String i : alumnosVotos
             ) {
            System.out.println(i);
        }
    }
    public HashSet<String>  getAlumnosVotos() {
        return alumnosVotos;
    }

    public void setAlumnosVotos(HashSet<String> alumnosVotos) {
        this.alumnosVotos = alumnosVotos;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                '}';
    }
    
}
