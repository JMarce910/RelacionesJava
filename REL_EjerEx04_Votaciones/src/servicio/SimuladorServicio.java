/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Pc
 */
public class SimuladorServicio {
    
    Random random = new Random();

    List<String> generarNombresAleatorios(int cantidad) {
        List<String> nombres = Arrays.asList(
            "Juan", "María", "Luis", "Ana", "Carlos", "Sofía", "Pedro", "Laura", "Javier", "Isabel", "Andrea", "Francisco", "Diego"
            // Agrega más nombres a la lista...
        );

        List<String> nombresAleatorios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = random.nextInt(nombres.size());
            nombresAleatorios.add(nombres.get(indiceAleatorio));
        }

        return nombresAleatorios;
    }

    List<String> generarApellidosAleatorios(int cantidad) {
        List<String> apellidos = Arrays.asList(
            "García", "Rodríguez", "Martínez", "Fernández", "López", "Pérez", "González", "Hernández", "Díaz", "Torres"
            // Agrega más apellidos a la lista...
        );

        List<String> apellidosAleatorios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = random.nextInt(apellidos.size());
            apellidosAleatorios.add(apellidos.get(indiceAleatorio));
        }

        return apellidosAleatorios;
    }

     List<String> generarDNIs(int cantidad) {
        List<String> dnisAleatorios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int dniNumero = 10000000 + random.nextInt(90000000); // Genera números entre 10000000 y 99999999
            String dni = String.valueOf(dniNumero);
            dnisAleatorios.add(dni);
        }

        return dnisAleatorios;
    }

 public List<Alumno> crearAlumnos(int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        List<String> nombresAleatorios = generarNombresAleatorios(cantidad);
        List<String> apellidosAleatorios = generarApellidosAleatorios(cantidad);
        List<String> dnisAleatorios = generarDNIs(cantidad);

        for (int i = 0; i < cantidad; i++) {
            String nombreCompleto = nombresAleatorios.get(i) + " " + apellidosAleatorios.get(i);
            String dni = dnisAleatorios.get(i);
            Alumno alumno = new Alumno(nombreCompleto, dni, 0); // Inicialmente, cantidad de votos es 0
            alumnos.add(alumno);
        }

        return alumnos;
    }

     void imprimirListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("DNI: " + alumno.getDNI());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("--------");
        }
    }

    public void votacion(List<Alumno> alumnos) {
        Random random = new Random();
        Set<Alumno> alumnosSet = new HashSet<>(alumnos); // Para evitar duplicados al elegir el alumno que vota
        
        for (Alumno alumno : alumnos) {
            Set<Alumno> votosRealizados = new HashSet<>();
            while (votosRealizados.size() < 3) {
                int indiceAleatorio = generarIndiceAleatorio(alumnos.size(), alumnos.indexOf(alumno));
                Alumno votado = alumnos.get(indiceAleatorio);
                if (!votado.equals(alumno) && !votosRealizados.contains(votado)) {
                    votosRealizados.add(votado);
                    alumno.incrementarVotos();
                    alumno.agregarVotoRealizado(votado);
                }
            }
        }
    }

    int generarIndiceAleatorio(int max, int exclude) {
        Random random = new Random();
        int indice = random.nextInt(max);
        while (indice == exclude) {
            indice = random.nextInt(max);
        }
        return indice;
    }

    public void mostrarResultadosVotacion(List<Alumno> alumnos) {
        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getCantidadVotos).reversed());

        System.out.println("Facilitadores:");
        for (int i = 0; i < 5; i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println((i + 1) + ". " + alumno.getNombreCompleto() + " - Votos: " + alumno.getCantidadVotos());
        }

        System.out.println("Suplentes:");
        for (int i = 5; i < 10; i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println((i - 4) + ". " + alumno.getNombreCompleto() + " - Votos: " + alumno.getCantidadVotos());
        }
    }
    public void mostrarDetallesVotos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos realizados:");
            for (Alumno votado : alumno.getVotosRealizados()) {
                System.out.println("- " + votado.getNombreCompleto());
            }
            System.out.println("--------");
        }
    }
   public void mostrarListaAlumnos(List<Alumno> alumnos) {
    System.out.println("=== Lista de Alumnos ===");
    for (Alumno alumno : alumnos) {
        System.out.println("Nombre: " + alumno.getNombreCompleto());
        System.out.println("DNI: " + alumno.getDNI());
        System.out.println("Cantidad de votos recibidos: " + alumno.getCantidadVotos());
        System.out.println("--------");
    }
}
}
