/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class ClienteServicio {
    
    private List<Cliente> listaClientes;

    public ClienteServicio() {
        listaClientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Cliente buscarClientePorDocumento(String documento) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento().equals(documento)) {
                return cliente;
            }
        }
        return null; // Cliente no encontrado
    }

   public void actualizarCliente(String documento, Cliente clienteActualizado) {
        Cliente clienteExistente = buscarClientePorDocumento(documento);
        if (clienteExistente != null) {
            clienteExistente.setNombreApellido(clienteActualizado.getNombreApellido());
            clienteExistente.setMail(clienteActualizado.getMail());
            clienteExistente.setDomicilio(clienteActualizado.getDomicilio());
            clienteExistente.setTelefono(clienteActualizado.getTelefono());
        }
    }

    public void eliminarCliente(String documento) {
        Cliente clienteAEliminar = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento().equals(documento)) {
                clienteAEliminar = cliente;
                break;
            }
        }
        if (clienteAEliminar != null) {
            listaClientes.remove(clienteAEliminar);
        }
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return listaClientes;
    }
    
}
