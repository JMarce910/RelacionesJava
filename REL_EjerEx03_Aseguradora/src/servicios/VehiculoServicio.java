/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class VehiculoServicio {
    
    private List<Vehiculo> listaVehiculos;

    public VehiculoServicio() {
        listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculoPorChasis(String chasis) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getChasis().equals(chasis)) {
                return vehiculo;
            }
        }
        return null; // Vehículo no encontrado
    }

    public void actualizarVehiculo(String chasis, Vehiculo vehiculoActualizado) {
        Vehiculo vehiculoExistente = buscarVehiculoPorChasis(chasis);
        if (vehiculoExistente != null) {
            vehiculoExistente.setMarca(vehiculoActualizado.getMarca());
            vehiculoExistente.setModelo(vehiculoActualizado.getModelo());
            vehiculoExistente.setAno(vehiculoActualizado.getAno());
            vehiculoExistente.setNumeroMotor(vehiculoActualizado.getNumeroMotor());
            vehiculoExistente.setColor(vehiculoActualizado.getColor());
            vehiculoExistente.setTipo(vehiculoActualizado.getTipo());
        }
    }

    public void eliminarVehiculo(String chasis) {
        Vehiculo vehiculoAEliminar = buscarVehiculoPorChasis(chasis);
        if (vehiculoAEliminar != null) {
            listaVehiculos.remove(vehiculoAEliminar);
        }
    }

    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return listaVehiculos;
    }
    
}
