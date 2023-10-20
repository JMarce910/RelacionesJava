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
public class Alumno {
    
    String nombreCompleto;
    String DNI;
    int cantidadVotos;
    List<Alumno> votosRealizados;

    public Alumno(String nombreCompleto, String DNI, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = 0;
        this.votosRealizados = new ArrayList<>();
    }
    
    public void incrementarVotos() {
        cantidadVotos++;
    }
    public void agregarVotoRealizado(Alumno votado) {
        votosRealizados.add(votado);
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }
    
    public List<Alumno> getVotosRealizados() {
        return votosRealizados;
    }
    
    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", cantidadVotos=" + cantidadVotos + '}';
    }
    
}
