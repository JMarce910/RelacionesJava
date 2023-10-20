/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import entidades.Cuota;
import entidades.Poliza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class PolizaServicio {
    
    private List<Poliza> listaPolizas;

    public PolizaServicio() {
        listaPolizas = new ArrayList<>();
    }

    public void agregarPoliza(Poliza poliza) {
        listaPolizas.add(poliza);
    }

    public Poliza buscarPolizaPorNumero(String numeroPoliza) {
        for (Poliza poliza : listaPolizas) {
            if (poliza.getNumeroPoliza().equals(numeroPoliza)) {
                return poliza;
            }
        }
        return null; // Póliza no encontrada
    }

    public void actualizarPoliza(String numeroPoliza, Poliza polizaActualizada) {
        Poliza polizaExistente = buscarPolizaPorNumero(numeroPoliza);
        if (polizaExistente != null) {
            polizaExistente.setFechaInicio(polizaActualizada.getFechaInicio());
            polizaExistente.setFechaFin(polizaActualizada.getFechaFin());
            polizaExistente.setCantidadCuotas(polizaActualizada.getCantidadCuotas());
            polizaExistente.setFormaPago(polizaActualizada.getFormaPago());
            polizaExistente.setMontoTotalAsegurado(polizaActualizada.getMontoTotalAsegurado());
            polizaExistente.setIncluyeGranizo(polizaActualizada.isIncluyeGranizo());
            polizaExistente.setMontoMaximoGranizo(polizaActualizada.getMontoMaximoGranizo());
            polizaExistente.setTipoCobertura(polizaActualizada.getTipoCobertura());
            polizaExistente.setCliente(polizaActualizada.getCliente());
            polizaExistente.setVehiculo(polizaActualizada.getVehiculo());
        }
    }

    public void eliminarPoliza(String numeroPoliza) {
        Poliza polizaAEliminar = buscarPolizaPorNumero(numeroPoliza);
        if (polizaAEliminar != null) {
            listaPolizas.remove(polizaAEliminar);
        }
    }

    public List<Poliza> obtenerTodasLasPolizas() {
        return listaPolizas;
    }
    
    public List<Poliza> obtenerPolizasPorCliente(Cliente cliente) {
        List<Poliza> polizasCliente = new ArrayList<>();
        for (Poliza poliza : listaPolizas) {
            if (poliza.getCliente().equals(cliente)) {
                polizasCliente.add(poliza);
            }
        }
        return polizasCliente;
    }
    
    public List<Cuota> obtenerCuotasDePoliza(String numeroPoliza) {
        Poliza poliza = buscarPolizaPorNumero(numeroPoliza);
        if (poliza != null) {
            return poliza.getCuotas();
        }
        return null;
    }
    
}
