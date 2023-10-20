/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Clientes {
    
    private String name;
    private String apellido;
    private int documento;
    private String email;
    private String domicilio;
    private int telefono;
    private ArrayList<Vehiculo> vehiculos;
    public Clientes(){

    }

    public Clientes(String name, String apellido, int documento, String email, String domicilio, int telefono) {
        this.name = name;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", email='" + email + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono=" + telefono +
                ", vehiculos=" + vehiculos +
                '}';
    }
    
}
