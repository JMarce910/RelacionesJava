
package rel_ejerex03_aseguradora;

import entidades.Cliente;
import entidades.Cuota;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.List;
import java.util.Scanner;
import servicios.ClienteServicio;
import servicios.CuotaServicio;
import servicios.PolizaServicio;
import servicios.VehiculoServicio;

/**
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema 
que quiere realizar la empresa. 
* 
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de 
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail, 
domicilio, teléfono. 
* 
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca, 
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.). 
* 
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un 
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de 
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra 
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las 
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de 
muchos a uno o de muchos a muchos.
* 
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza. 
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la 
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia, 
etc.). 
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los 
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes 
relaciones.
 */
public class REL_EjerEx03_Aseguradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ClienteServicio clienteServicio = new ClienteServicio();
        VehiculoServicio vehiculoServicio = new VehiculoServicio();
        PolizaServicio polizaServicio = new PolizaServicio();
        CuotaServicio cuotaServicio = new CuotaServicio();

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Gestionar vehículos");
            System.out.println("3. Gestionar pólizas");
            System.out.println("4. Gestionar cuotas");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea después del número

            switch (opcion) {
                case 1:
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Agregar cliente");
                        System.out.println("2. Buscar cliente por documento");
                        System.out.println("3. Actualizar cliente");
                        System.out.println("4. Eliminar cliente");
                        System.out.println("5. Mostrar todos los clientes");
                        int opcionClientes = scanner.nextInt();
                        scanner.nextLine(); // Consume la nueva línea después del número

                        switch (opcionClientes) {
                            case 1:
                                System.out.println("Ingrese el nombre y apellido del cliente:");
                                String nombreApellido = scanner.nextLine();
                                System.out.println("Ingrese el documento del cliente:");
                                String documento = scanner.nextLine();
                                System.out.println("Ingrese el correo electrónico del cliente:");
                                String mail = scanner.nextLine();
                                System.out.println("Ingrese el domicilio del cliente:");
                                String domicilio = scanner.nextLine();
                                System.out.println("Ingrese el teléfono del cliente:");
                                String telefono = scanner.nextLine();
                                Cliente nuevoCliente = new Cliente(nombreApellido, documento, mail, domicilio, telefono);
                                clienteServicio.agregarCliente(nuevoCliente);
                                System.out.println("Cliente agregado correctamente.");
                                break;
                            case 2:
                                System.out.println("Ingrese el documento del cliente a buscar:");
                                String documentoBusqueda = scanner.nextLine();
                                Cliente clienteEncontrado = clienteServicio.buscarClientePorDocumento(documentoBusqueda);
                                if (clienteEncontrado != null) {
                                    System.out.println("Cliente encontrado:");
                                    System.out.println(clienteEncontrado);
                                } else {
                                    System.out.println("Cliente no encontrado.");
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el documento del cliente a actualizar:");
                                String documentoActualizar = scanner.nextLine();
                                Cliente clienteExistente = clienteServicio.buscarClientePorDocumento(documentoActualizar);

                                if (clienteExistente != null) {
                                System.out.println("Cliente encontrado:");
                                System.out.println(clienteExistente);

                                System.out.println("Ingrese el nuevo nombre y apellido:");
                                String nuevoNombreApellido = scanner.nextLine();
                                System.out.println("Ingrese el nuevo correo electrónico:");
                                String nuevoMail = scanner.nextLine();
                                System.out.println("Ingrese el nuevo domicilio:");
                                String nuevoDomicilio = scanner.nextLine();
                                System.out.println("Ingrese el nuevo teléfono:");
                                String nuevoTelefono = scanner.nextLine();

                                // Crear un nuevo objeto Cliente con los datos actualizados
                                Cliente clienteActualizado = new Cliente(nuevoNombreApellido, documentoActualizar, nuevoMail, nuevoDomicilio, nuevoTelefono);

                                clienteServicio.actualizarCliente(documentoActualizar, clienteActualizado);
                                System.out.println("Cliente actualizado correctamente.");
                            } else {
                                System.out.println("Cliente no encontrado.");
                            }
                            break;
                            case 4:
                                System.out.println("Ingrese el documento del cliente a eliminar:");
                                String documentoEliminar = scanner.nextLine();
                                clienteServicio.eliminarCliente(documentoEliminar);
                                System.out.println("Cliente eliminado correctamente.");
                                break;
                            case 5:
                                List<Cliente> todosLosClientes = clienteServicio.obtenerTodosLosClientes();
                                if (!todosLosClientes.isEmpty()) {
                                    System.out.println("Lista de clientes:");
                                    for (Cliente cliente : todosLosClientes) {
                                        System.out.println(cliente);
                                    }
                                } else {
                                    System.out.println("No hay clientes registrados.");
                                }
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                        break;
                case 2:
                    
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Agregar vehículo");
                        System.out.println("2. Buscar vehículo por chasis");
                        System.out.println("3. Actualizar vehículo");
                        System.out.println("4. Eliminar vehículo");
                        System.out.println("5. Mostrar todos los vehículos");
                        int opcionVehiculos = scanner.nextInt();
                        scanner.nextLine(); // Consume la nueva línea después del número

                        switch (opcionVehiculos) {
                            case 1:
                                System.out.println("Ingrese la marca del vehículo:");
                                String marca = scanner.nextLine();
                                System.out.println("Ingrese el modelo del vehículo:");
                                String modelo = scanner.nextLine();
                                System.out.println("Ingrese el año del vehículo:");
                                int ano = scanner.nextInt();
                                System.out.println("Ingrese el numero de motor del vehículo:");
                                String numeroMotor = scanner.nextLine();
                                
                                System.out.println("Ingrese el número de chasis del vehículo:");
                                String chasis = scanner.nextLine();
                                System.out.println("Ingrese el color del vehículo:");
                                String color = scanner.nextLine();
                                System.out.println("Ingrese el tipo del vehículo:");
                                String tipo = scanner.nextLine();

                                Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, ano, numeroMotor, chasis, color, tipo);
                                vehiculoServicio.agregarVehiculo(nuevoVehiculo);
                                System.out.println("Vehículo agregado correctamente.");
                            case 2:
                                System.out.println("Ingrese el número de chasis del vehículo a buscar:");
                                String chasisBusqueda = scanner.nextLine();
                                Vehiculo vehiculoEncontrado = vehiculoServicio.buscarVehiculoPorChasis(chasisBusqueda);
                                if (vehiculoEncontrado != null) {
                                    System.out.println("Vehículo encontrado:");
                                    System.out.println(vehiculoEncontrado);
                                } else {
                                    System.out.println("Vehículo no encontrado.");
                                }
                                break;
                            case 3:
                                // Similar a la opción 1, pero aquí se busca y actualiza el vehículo existente
                                break;
                            case 4:
                                System.out.println("Ingrese el número de chasis del vehículo a eliminar:");
                                String chasisEliminar = scanner.nextLine();
                                vehiculoServicio.eliminarVehiculo(chasisEliminar);
                                System.out.println("Vehículo eliminado correctamente.");
                                break;
                            case 5:
                                List<Vehiculo> todosLosVehiculos = vehiculoServicio.obtenerTodosLosVehiculos();
                                if (!todosLosVehiculos.isEmpty()) {
                                    System.out.println("Lista de vehículos:");
                                    for (Vehiculo vehiculo : todosLosVehiculos) {
                                        System.out.println(vehiculo);
                                    }
                                } else {
                                    System.out.println("No hay vehículos registrados.");
                                }
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                        break;
                    
                case 3:
                        System.out.println("Seleccione una opción:");
                            System.out.println("1. Agregar póliza");
                            System.out.println("2. Buscar póliza por número");
                            System.out.println("3. Actualizar póliza");
                            System.out.println("4. Eliminar póliza");
                            System.out.println("5. Mostrar todas las pólizas");
                            int opcionPolizas = scanner.nextInt();
                            scanner.nextLine(); // Consume la nueva línea después del número

                            switch (opcionPolizas) {
                                case 1:
                                    System.out.println("Ingrese el número de póliza:");
                                    String numeroPoliza = scanner.nextLine();
                                    System.out.println("Ingrese la fecha de inicio de la póliza:");
                                    String fechaInicio = scanner.nextLine();
                                    System.out.println("Ingrese la fecha de fin de la póliza:");
                                    String fechaFin = scanner.nextLine();
                                    System.out.println("Ingrese la cantidad de cuotas:");
                                    int cantidadCuotas = scanner.nextInt();
                                    scanner.nextLine(); // Consume la nueva línea después del número
                                    System.out.println("Ingrese la forma de pago:");
                                    String formaPago = scanner.nextLine();
                                    System.out.println("Ingrese el monto total asegurado:");
                                    double montoTotalAsegurado = scanner.nextDouble();
                                    scanner.nextLine(); // Consume la nueva línea después del número
                                    System.out.println("¿Incluye granizo? (true/false):");
                                    boolean incluyeGranizo = scanner.nextBoolean();
                                    scanner.nextLine(); // Consume la nueva línea después del booleano
                                    double montoMaximoGranizo = 0.0;
                                    if (incluyeGranizo) {
                                        System.out.println("Ingrese el monto máximo por granizo:");
                                        montoMaximoGranizo = scanner.nextDouble();
                                        scanner.nextLine(); // Consume la nueva línea después del número
                                    }
                                    System.out.println("Ingrese el tipo de cobertura:");
                                    String tipoCobertura = scanner.nextLine();
                                    System.out.println("Ingrese el número de documento del cliente:");
                                    String numeroDocumentoCliente = scanner.nextLine();
                                    Cliente cliente = clienteServicio.buscarClientePorDocumento(numeroDocumentoCliente);
                                    if (cliente == null) {
                                        System.out.println("Cliente no encontrado. No se puede crear la póliza.");
                                        break;
                                    }

                                    System.out.println("Ingrese el número de chasis del vehículo:");
                                    String numeroChasisVehiculo = scanner.nextLine();
                                    Vehiculo vehiculo = vehiculoServicio.buscarVehiculoPorChasis(numeroChasisVehiculo);
                                    if (vehiculo == null) {
                                        System.out.println("Vehículo no encontrado. No se puede crear la póliza.");
                                        break;
                                    }
                                    
                                    Poliza nuevaPoliza = new Poliza(numeroPoliza, fechaInicio, fechaFin, cantidadCuotas, formaPago, montoTotalAsegurado, incluyeGranizo, montoMaximoGranizo, tipoCobertura, cliente, vehiculo);
                                    
                                    
                                    polizaServicio.agregarPoliza(nuevaPoliza);
                                    System.out.println("Póliza agregada correctamente.");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el número de póliza a buscar:");
                                    String numeroPolizaBusqueda = scanner.nextLine();
                                    Poliza polizaEncontrada = polizaServicio.buscarPolizaPorNumero(numeroPolizaBusqueda);
                                    if (polizaEncontrada != null) {
                                        System.out.println("Póliza encontrada:");
                                        System.out.println(polizaEncontrada);
                                    } else {
                                        System.out.println("Póliza no encontrada.");
                                    }
                                    break;
                                case 3:
                                        System.out.println("Ingrese el número de póliza a actualizar:");
                                        String numeroPolizaActualizar = scanner.nextLine();
                                        Poliza polizaExistente = polizaServicio.buscarPolizaPorNumero(numeroPolizaActualizar);

                                        if (polizaExistente != null) {
                                            System.out.println("Ingrese la nueva fecha de inicio de la póliza:");
                                            String nuevaFechaInicio = scanner.nextLine();
                                            System.out.println("Ingrese la nueva fecha de fin de la póliza:");
                                            String nuevaFechaFin = scanner.nextLine();
                                            // ... captura otros nuevos valores para los atributos de la póliza
                                             System.out.println("Ingrese la nueva cantidad de cuotas:");
                                            int nuevaCantidadCuotas = scanner.nextInt();
                                            scanner.nextLine(); // Consume la nueva línea después del número

                                            System.out.println("Ingrese la nueva forma de pago:");
                                            String nuevaFormaPago = scanner.nextLine();

                                            System.out.println("Ingrese el nuevo monto total asegurado:");
                                            double nuevoMontoTotalAsegurado = scanner.nextDouble();
                                            scanner.nextLine(); // Consume la nueva línea después del número

                                            System.out.println("¿Incluye granizo? (true/false):");
                                            boolean nuevoIncluyeGranizo = scanner.nextBoolean();
                                            scanner.nextLine(); // Consume la nueva línea después del booleano

                                            double nuevoMontoMaximoGranizo = 0.0;
                                            if (nuevoIncluyeGranizo) {
                                                System.out.println("Ingrese el nuevo monto máximo por granizo:");
                                                nuevoMontoMaximoGranizo = scanner.nextDouble();
                                                scanner.nextLine(); // Consume la nueva línea después del número
                                            }

                                            System.out.println("Ingrese el nuevo tipo de cobertura:");
                                            String nuevoTipoCobertura = scanner.nextLine();  
                                            
                                            polizaExistente.setFechaInicio(nuevaFechaInicio);
                                            polizaExistente.setFechaFin(nuevaFechaFin);
                                            polizaExistente.setCantidadCuotas(nuevaCantidadCuotas);
                                            polizaExistente.setFormaPago(nuevaFormaPago);
                                            polizaExistente.setMontoTotalAsegurado(nuevoMontoTotalAsegurado);
                                            polizaExistente.setIncluyeGranizo(nuevoIncluyeGranizo);
                                            polizaExistente.setMontoMaximoGranizo(nuevoMontoMaximoGranizo);
                                            polizaExistente.setTipoCobertura(nuevoTipoCobertura);
                                            

                                            // Actualizar la póliza en el servicio
                                            polizaServicio.actualizarPoliza(numeroPolizaActualizar, polizaExistente);
                                            System.out.println("Póliza actualizada correctamente.");
                                        } else {
                                            System.out.println("Póliza no encontrada.");
                                        }
                                        break;
                                case 4:
                                    System.out.println("Ingrese el número de póliza a eliminar:");
                                    String numeroPolizaEliminar = scanner.nextLine();
                                    polizaServicio.eliminarPoliza(numeroPolizaEliminar);
                                    System.out.println("Póliza eliminada correctamente.");
                                    break;
                                case 5:
                                    List<Poliza> todasLasPolizas = polizaServicio.obtenerTodasLasPolizas();
                                    if (!todasLasPolizas.isEmpty()) {
                                        System.out.println("Lista de pólizas:");
                                        for (Poliza poliza : todasLasPolizas) {
                                            System.out.println(poliza);
                                        }
                                    } else {
                                        System.out.println("No hay pólizas registradas.");
                                    }
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente de nuevo.");
                            }
                            break;
                case 4:
                            System.out.println("Seleccione una opción:");
                            System.out.println("1. Agregar cuota a póliza");
                            System.out.println("2. Consultar cuotas de póliza");
                            int opcionCuotas = scanner.nextInt();
                            scanner.nextLine(); // Consume la nueva línea después del número

                            switch (opcionCuotas) {
                                case 1:
                                    System.out.println("Ingrese el número de póliza:");
                                    String numeroPolizaCuota = scanner.nextLine();
                                    Poliza polizaParaCuota = polizaServicio.buscarPolizaPorNumero(numeroPolizaCuota);

                                    if (polizaParaCuota != null) {
                                        
                                        System.out.println("Ingrese el número de cuota:");
                                        int numeroCuota = scanner.nextInt();
                                        
                                        System.out.println("Ingrese el monto total de la cuota:");
                                        double montoTotalCuota = scanner.nextDouble();
                                        scanner.nextLine(); // Consume la nueva línea después del número
                                        
                                        System.out.println("¿La cuota está pagada? (true/false):");
                                        boolean cuotaPagada = scanner.nextBoolean();
                                        scanner.nextLine(); // Consume la nueva línea después del booleano

                                        System.out.println("Ingrese la fecha de vencimiento de la cuota:");
                                        String fechaVencimientoCuota = scanner.nextLine();

                                        System.out.println("Ingrese la forma de pago de la cuota:");
                                        String formaPagoCuota = scanner.nextLine();

                                        Cuota nuevaCuota = new Cuota(numeroCuota, montoTotalCuota, cuotaPagada, fechaVencimientoCuota, formaPagoCuota, polizaParaCuota);
                                        cuotaServicio.agregarCuotaAPoliza(polizaParaCuota, nuevaCuota);
                                        
                                        System.out.println("Cuota agregada correctamente.");
                                    } else {
                                        System.out.println("Póliza no encontrada.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Ingrese el número de póliza:");
                                    String numeroPolizaConsultarCuotas = scanner.nextLine();
                                    List<Cuota> cuotasDePoliza = cuotaServicio.obtenerCuotasDePoliza(numeroPolizaConsultarCuotas);

                                    if (cuotasDePoliza != null && !cuotasDePoliza.isEmpty()) {
                                        System.out.println("Cuotas de la póliza:");
                                        for (Cuota cuota : cuotasDePoliza) {
                                            // ... mostrar detalles de la cuota
                                        }
                                    } else {
                                        System.out.println("No se encontraron cuotas para la póliza.");
                                    }
                                    break;

                                // ... otras opciones para gestionar cuotas
                            }
                            break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
    }   
