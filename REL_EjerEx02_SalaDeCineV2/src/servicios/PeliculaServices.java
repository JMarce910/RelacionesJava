/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Peliculas;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PeliculaServices {
    
    private int conteo;
    ArrayList<Peliculas> peliculasData = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    LocalTime time = LocalTime.now();
    Cine cine;
    
    public void llenarDataPeliculas(ArrayList<Cine> dataInfoAllCine){
        Peliculas peliculas = new Peliculas();
        CineServices cineServices = new CineServices();
        System.out.println("Digita el titulo de la pelicula");
       String titulo = scanner.nextLine();
        peliculas.setTitulo(titulo);
        System.out.println("Digita la duracion");
        System.out.println("Hora: ");
        int hora = scanner.nextInt();
        System.out.println("Minutos");
        int minutos = scanner.nextInt();
        System.out.println("Segundos");
        int segundos = scanner.nextInt();
         time = time.withHour(hora).withMinute(minutos).withSecond(segundos);
         peliculas.setTime(time);
        System.out.println("Digita el precio");
        double precio = scanner.nextDouble();
        peliculas.setPrecio(precio);
        System.out.println("Digita la edad minima");
        int edadMinima = scanner.nextInt();
        peliculas.setEdadMinima(edadMinima);
        System.out.println("Director");
        scanner.nextLine();
        peliculas.setDirector(scanner.nextLine());
        peliculasData.add(peliculas);
        String[][] salaActual=cineServices.configurarSalas();
        cine = new Cine(salaActual,precio,peliculas);
        dataInfoAllCine.add(cine);
    }

    public void llenarEspectador(ArrayList<Cine> dataInfoAllCine){
        do {
            Peliculas peliculas = new Peliculas();
            if(peliculasData.isEmpty()){
                System.out.println("No hay peliculas");
                break;
            }
            System.out.println("Digita el id");
            int id = scanner.nextInt();
            boolean noRepetidoDesicion = noRepetido(id);
            if(noRepetidoDesicion){

                break;
            }
            System.out.println("Digita el nombre");
            String name = scanner.next();

            System.out.println("Digita la edad");
            int edad = scanner.nextInt();

            System.out.println("Digita el dinero que tienes");
            double dinero = scanner.nextDouble();
            Espectador espectador = new Espectador(name, edad, dinero, id);
            boolean condiciones = addMovie(espectador,dataInfoAllCine);
            if (!condiciones){
                break;
            }
            peliculas.setEspectador(espectador);
            peliculas.getEspectador().getEspectadores().add(espectador);
            break;
        }while (true);
    }
    
    public boolean noRepetido(int id){
        boolean falseOrTrueRepetido = false;
        for (Espectador i : Espectador.espectadores
             ) {
            if (i.getId() == id){
                falseOrTrueRepetido = true;
                System.out.println("Repetido");
                break;
            }
        }
        return falseOrTrueRepetido;
    }
    
    public boolean addMovie(Espectador espectador,ArrayList<Cine> dataInfoAllCine){
        CineServices cineServices = new CineServices();
        System.out.println("Que peliculas quieres ver?");
        System.out.println("Aqui esta el catalago");
        mostrarInfo();
        scanner.nextLine();
        String nameMovie = scanner.nextLine();
        boolean condicionesTrueOrFalse = false;
        for (Cine i : dataInfoAllCine
             ) {
            if(i.getPeliculas().getTitulo().equals(nameMovie)){
                String[][] salaActual = i.getSala();
                  if (espectador.getDinero() >= i.getPrecio()){
                       i.getPeliculas().setEspectador(espectador);
                     if (espectador.getEdad() >= i.getPeliculas().getEdadMinima()) {
                         condicionesTrueOrFalse = true;
                         System.out.println("Sala: ");
                         for (int m = 0; m < dataInfoAllCine.size(); m++) {
                             System.out.println(Arrays.deepToString(dataInfoAllCine.get(m).getSala()));
                         }
                         espectador.setPeliculas(i.getPeliculas());
                         System.out.println("Digita el asiento que quieres(Numero)");
                         int numero = scanner.nextInt();
                         System.out.println("Digita la Letra");
                         scanner.nextLine();
                         String letra = scanner.nextLine();
                         boolean salirDelBucle = false;
                             for (int k = 5; k >= 0; k--) {
                                 for (int l = 7; l >= 0; l--) {
                                     switch (letra.toUpperCase()){
                                         
                                         case "A" : {
                                             if (numero == 8){
                                                 numero = 0;
                                             } else if (numero == 7) {
                                                 numero = 1;
                                             } else if (numero == 6) {
                                                 numero = 2;
                                             } else if (numero == 5) {
                                                 numero = 3;
                                             } else if (numero == 4) {
                                             } else if (numero == 3) {
                                                 numero = 5;
                                             } else if (numero == 2) {
                                                 numero = 6;
                                             } else if (numero == 1) {
                                                 numero = 7;
                                             }
                                             if (salaActual[numero][0].length() == 3){
                                                 System.out.println("Asiento no disponible");
                                                 salirDelBucle = true;
                                                 break;
                                             }
                                             salaActual[numero][0] = salaActual[numero][0] + "X";
                                             i.setSala(salaActual);
                                             salirDelBucle = true;
                                         }
                                         case "B" : {
                                             if (numero == 8){
                                                 numero = 0;
                                             } else if (numero == 7) {
                                                 numero = 1;
                                             } else if (numero == 6) {
                                                 numero = 2;
                                             } else if (numero == 5) {
                                                 numero = 3;
                                             } else if (numero == 4) {
                                             } else if (numero == 3) {
                                                 numero = 5;
                                             } else if (numero == 2) {
                                                 numero = 6;
                                             } else if (numero == 1) {
                                                 numero = 7;
                                             }
                                             if (salaActual[numero][1].length() == 3){
                                                 System.out.println("Asiento no disponible");
                                                 salirDelBucle = true;
                                                 break;
                                             }
                                             salaActual[numero][1] = salaActual[numero][1] + "X";
                                             i.setSala(salaActual);
                                             salirDelBucle = true;
                                         }
                                         case "C" : {
                                             if (numero == 8){
                                                 numero = 0;
                                             } else if (numero == 7) {
                                                 numero = 1;
                                             } else if (numero == 6) {
                                                 numero = 2;
                                             } else if (numero == 5) {
                                                 numero = 3;
                                             } else if (numero == 4) {
                                             } else if (numero == 3) {
                                                 numero = 5;
                                             } else if (numero == 2) {
                                                 numero = 6;
                                             } else if (numero == 1) {
                                                 numero = 7;
                                             }
                                             if (salaActual[numero][2].length() == 3){
                                                 System.out.println("Asiento no disponible");
                                                 salirDelBucle = true;
                                                 break;
                                             }
                                             salaActual[numero][2] = salaActual[numero][2] + "X";
                                             i.setSala(salaActual);
                                             salirDelBucle = true;
                                         }
                                         case "D" : {
                                             if (numero == 8){
                                                 numero = 0;
                                             } else if (numero == 7) {
                                                 numero = 1;
                                             } else if (numero == 6) {
                                                 numero = 2;
                                             } else if (numero == 5) {
                                                 numero = 3;
                                             } else if (numero == 4) {
                                             } else if (numero == 3) {
                                                 numero = 5;
                                             } else if (numero == 2) {
                                                 numero = 6;
                                             } else if (numero == 1) {
                                                 numero = 7;
                                             }
                                             if (salaActual[numero][3].length() == 3){
                                                 System.out.println("Asiento no disponible");
                                                 salirDelBucle = true;
                                                 break;
                                             }
                                             salaActual[numero][3] = salaActual[numero][3] + "X";
                                             i.setSala(salaActual);
                                             salirDelBucle = true;
                                         }
                                         case "E" : {
                                             if (numero == 8){
                                                 numero = 0;
                                             } else if (numero == 7) {
                                                 numero = 1;
                                             } else if (numero == 6) {
                                                 numero = 2;
                                             } else if (numero == 5) {
                                                 numero = 3;
                                             } else if (numero == 4) {
                                             } else if (numero == 3) {
                                                 numero = 5;
                                             } else if (numero == 2) {
                                                 numero = 6;
                                             } else if (numero == 1) {
                                                 numero = 7;
                                             }
                                             if (salaActual[numero][4].length() == 3){
                                                 System.out.println("Asiento no disponible");
                                                 salirDelBucle = true;
                                                 break;
                                             }
                                             salaActual[numero][4] = salaActual[numero][4] + "X";
                                             i.setSala(salaActual);
                                             salirDelBucle = true;
                                         }
                                         case "F" : {
                                             if (numero == 8){
                                                 numero = 0;
                                             } else if (numero == 7) {
                                                 numero = 1;
                                             } else if (numero == 6) {
                                                 numero = 2;
                                             } else if (numero == 5) {
                                                 numero = 3;
                                             } else if (numero == 4) {
                                             } else if (numero == 3) {
                                                 numero = 5;
                                             } else if (numero == 2) {
                                                 numero = 6;
                                             } else if (numero == 1) {
                                                 numero = 7;
                                             }
                                             if (salaActual[numero][5].length() == 3){
                                                 System.out.println("Asiento no disponible");
                                                 salirDelBucle = true;
                                                 break;
                                             }
                                             salaActual[numero][5] = salaActual[numero][5] + "X";
                                             i.setSala(salaActual);
                                             salirDelBucle = true;
                                         }
                                     }
                                     if(salirDelBucle){
                                         break;
                                     }
                                     }
                                 if(salirDelBucle){
                                     break;
                                 }

                         }
                         System.out.println();
                         System.out.println("Toma el tiquete");
                         break;
                     }else {
                         System.out.println("Edad minima no insuficiente");
                     }
                  }else {
                      System.out.println("No tienes suficiente dinero");
                  }
            }
        }
        return condicionesTrueOrFalse;
    }
    public void mostrarInfo(){
        for (Peliculas i : peliculasData
             ) {
            System.out.println(i);
        }
    }

    public ArrayList<Peliculas > getPeliculasData() {
        return peliculasData;
    }

    public void setPeliculasData(ArrayList<Peliculas > peliculasData) {
        this.peliculasData = peliculasData;
    }
    
}
