/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cuota;
import entidades.Poliza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class CuotaServicio {
    
    private List<Cuota> listaCuotas;

    public CuotaServicio() {
        listaCuotas = new ArrayList<>();
    }

    public void agregarCuota(Cuota cuota) {
        listaCuotas.add(cuota);
    }

    public Cuota buscarCuotaPorNumero(int numeroCuota) {
        for (Cuota cuota : listaCuotas) {
            if (cuota.getNumeroCuota() == numeroCuota) {
                return cuota;
            }
        }
        return null; // Cuota no encontrada
    }

    public void marcarCuotaComoPagada(int numeroCuota) {
        Cuota cuota = buscarCuotaPorNumero(numeroCuota);
        if (cuota != null) {
            cuota.setPagada(true);
        }
    }

    public List<Cuota> obtenerTodasLasCuotas() {
        return listaCuotas;
    }

    public List<Cuota> obtenerCuotasImpagas() {
        List<Cuota> cuotasImpagas = new ArrayList<>();
        for (Cuota cuota : listaCuotas) {
            if (!cuota.isPagada()) {
                cuotasImpagas.add(cuota);
            }
        }
        return cuotasImpagas;
    }
     public void agregarCuotaAPoliza(Poliza poliza, Cuota cuota) {
        List<Cuota> cuotasDePoliza = poliza.getCuotas();
        cuotasDePoliza.add(cuota);
    }
     public List<Cuota> obtenerCuotasDePoliza(String numeroPoliza) {
    List<Cuota> cuotasDePoliza = new ArrayList<>();
    for (Cuota cuota : listaCuotas) {
        if (cuota.getPoliza().getNumeroPoliza().equals(numeroPoliza)) {
            cuotasDePoliza.add(cuota);
        }
    }
    return cuotasDePoliza;

}
    
}
