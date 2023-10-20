/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Poliza {
    
    private String numeroPoliza;
        private String fechaInicio;
        private String fechaFin;
        private int cantidadCuotas;
        private String formaPago;
        private double montoTotalAsegurado;
        private boolean incluyeGranizo;
        private double montoMaximoGranizo;
        private String tipoCobertura;
        private Cliente cliente;
        private Vehiculo vehiculo;
        private List<Cuota> cuotas;

    public Poliza() {
    }

    public Poliza(String numeroPoliza, String fechaInicio, String fechaFin, int cantidadCuotas, String formaPago, double montoTotalAsegurado, boolean incluyeGranizo, double montoMaximoGranizo, String tipoCobertura, Cliente cliente, Vehiculo vehiculo) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        cuotas = new ArrayList<>();
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantidadCuotas=" + cantidadCuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", tipoCobertura=" + tipoCobertura + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }
}
