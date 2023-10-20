/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Clientes;
import entidades.Poliza;
import entidades.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ClientesServices {
    
    ArrayList<Clientes> clientes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void createCliente(){
        do {
            Clientes clientes1 = new Clientes();
            System.out.println("Digita el documento:");
            int documeto = scanner.nextInt();
            ArrayList<Vehiculo> vehiculosActual = new ArrayList<>();
            boolean salir = false;
            for (int i = 0; i <= clientes.size();i++
            ) {
                    System.out.println("¿Quieres Registrarte a la poliza? 1 para si o 0 para no");
                    int opcion = scanner.nextInt();
                    if(opcion == 1){

                        clientes1.setDocumento(documeto);
                        System.out.println("Digita tu Nombre:");
                        String name = scanner.next();
                        clientes1.setName(name);
                        System.out.println("Digita tu Apellido");
                        String apellido = scanner.next();
                        clientes1.setApellido(apellido);
                        System.out.println("Digita tu Email");
                        String email = scanner.next();
                        clientes1.setEmail(email);
                        System.out.println("Digita tu direccion");
                        String direccion = scanner.nextLine();
                        scanner.nextLine();
                        clientes1.setDomicilio(direccion);
                        System.out.println("Digita tu telefono");
                        int telefono = scanner.nextInt();
                        clientes1.setTelefono(telefono);
                        System.out.println("----------------------------------------");
                        System.out.println("¿Cuantos vehiculos quieres registrar?");
                        int cantidad = scanner.nextInt();
                        for (int j = 1; j <= cantidad; j++) {

                            Poliza poliza = new Poliza();
                            Vehiculo vehiculo = new Vehiculo();
                            System.out.println("Marca del vehiculo");
                            vehiculo.setMarca(scanner.nextLine());
                            System.out.println("Modelo:");
                            vehiculo.setModelo(scanner.nextLine());
                            System.out.println("Año de salida:");
                            vehiculo.setAño(scanner.nextInt());
                            System.out.println("Numero de motor");
                            vehiculo.setNumeroDeMotor(scanner.nextInt());
                            System.out.println("Chasis:");
                            vehiculo.setChasis(scanner.nextLine());
                            scanner.nextLine();
                            System.out.println("Color: ");
                            vehiculo.setColor(scanner.nextLine());
                            System.out.println("Tipo: ");
                            vehiculo.setTipo(scanner.nextLine());
                            System.out.println("----------------------------------");
                            System.out.println("Vamos a completar la poliza para este Auto");

                            System.out.println("Numero de poliza:");
                            int polizaNumero = scanner.nextInt();
                            System.out.println("Fecha de inicio:");
                            System.out.println("Año");
                            int añosInicio = scanner.nextInt();
                            System.out.println("Mes");
                            int mesInicio = scanner.nextInt();
                            System.out.println("Dia");
                            int diaInicio = scanner.nextInt();
                            LocalDate timeStart = LocalDate.of(añosInicio,mesInicio,diaInicio);
                            System.out.println("Fecha fin de la poliza");
                            System.out.println("Año");
                            int añosFinal = scanner.nextInt();
                            System.out.println("Mes");
                            int mesFinal = scanner.nextInt();
                            System.out.println("Dia");
                            int diaFinal = scanner.nextInt();
                            LocalDate timeFinal = LocalDate.of(añosFinal,mesFinal,diaFinal);
                            System.out.println("Cantidad de cuotas");
                            int cantidadDeCuotas = scanner.nextInt();
                            System.out.println("Forma de pago");
                            String formaDePago = scanner.nextLine();
                            System.out.println("Monto total Asegurado");
                            int montoTotalAsegurado = scanner.nextInt();
                            System.out.println("Incluye granizado 1 para si o 0 para no");
                            int desicionGranizado = scanner.nextInt();
                            boolean granizadoDesicionFinal = true;
                            if(desicionGranizado == 0){
                                granizadoDesicionFinal = false;
                            }
                            System.out.println("Monto maximo del granizado");
                            int montoMaximoGranizado = scanner.nextInt();
                            System.out.println("Tipo de cobertura");
                            scanner.nextInt();
                            String tipoDecobertura = scanner.nextLine();
                            vehiculo.setPoliza(new Poliza(polizaNumero,timeStart,timeFinal,cantidadDeCuotas,formaDePago,montoTotalAsegurado,granizadoDesicionFinal,montoMaximoGranizado,tipoDecobertura));
                            vehiculosActual.add(vehiculo);
                            clientes1.setVehiculos(vehiculosActual);
                        }
                        clientes.add(clientes1);
                    }else {
                        salir = true;
                    }

            }
            if(salir){
                break;
            }
        }while(true);
    }
    public void mostrarData(){
        for (Clientes i: clientes
             ) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "ClientesServices{" +
                "clientes=" + clientes +
                '}';
    }
    
}
