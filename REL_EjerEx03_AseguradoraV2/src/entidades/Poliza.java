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
public class Poliza {
    
    private int numeroPoliza;
    private LocalDate inicio;
    private LocalDate finales;
    private int cantidadDeCuotas;
    private String formaDePago;
    private int montoTotalAsegurado;
    private boolean incluyeGranizado;
    private int montoMaximoGranizo;
    private String tipoDeCobertura;
    public Poliza(){

    }

    public Poliza(int numeroPoliza, LocalDate inicio, LocalDate finales, int cantidadDeCuotas, String formaDePago, int montoTotalAsegurado, boolean incluyeGranizado, int montoMaximoGranizo, String tipoDeCobertura) {
        this.numeroPoliza = numeroPoliza;
        this.inicio = inicio;
        this.finales = finales;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizado = incluyeGranizado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFinales() {
        return finales;
    }

    public void setFinales(LocalDate finales) {
        this.finales = finales;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizado() {
        return incluyeGranizado;
    }

    public void setIncluyeGranizado(boolean incluyeGranizado) {
        this.incluyeGranizado = incluyeGranizado;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "numeroPoliza=" + numeroPoliza +
                ", inicio=" + inicio +
                ", finales=" + finales +
                ", cantidadDeCuotas=" + cantidadDeCuotas +
                ", formaDePago='" + formaDePago + '\'' +
                ", montoTotalAsegurado=" + montoTotalAsegurado +
                ", incluyeGranizado=" + incluyeGranizado +
                ", montoMaximoGranizo=" + montoMaximoGranizo +
                ", tipoDeCobertura='" + tipoDeCobertura + '\'' +
                '}';
    }
    
}
