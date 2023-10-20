/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Voto {
    
    Alumno alumnoQueVota;
  List<Alumno> alumnosVotados;

    public Voto(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosVotados =  new ArrayList<>();
    }

    
  
    public void agregarVoto(Alumno alumnoVotado){
        alumnosVotados.add(alumnoVotado);
    }

    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public void setAlumnoQueVota(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
}
