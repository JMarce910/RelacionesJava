/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Pc
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private int numeroDeMotor;
    private String chasis;
    private String color;
    private String tipo;
    private Poliza poliza;
    public Vehiculo(){

    }
    public Vehiculo(String marca, String modelo, int año, int numeroDeMotor, String chasis, String color, String tipo, Poliza  poliza) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(int numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza  poliza) {
        this.poliza = poliza;
    }

    public void setPoliza(int polizaNumero, LocalDate timeStart, LocalDate timeFinal, int cantidadDeCuotas, String formaDePago, int montoTotalAsegurado, boolean granizadoDesicionFinal, int montoMaximoGranizado, String tipoDecobertura) {
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", numeroDeMotor=" + numeroDeMotor +
                ", chasis='" + chasis + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poliza=" + poliza +
                '}';
    }
    
}
