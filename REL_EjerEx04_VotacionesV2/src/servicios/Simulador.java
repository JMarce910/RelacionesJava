
package servicios;


import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;



/**
 *
 * @author Pc
 */
public class Simulador {
    
    ArrayList<Alumno> AlumnosData = new ArrayList<>();
    ArrayList<Alumno> bigVoto = new ArrayList<>();
    String[] dataNombres = {
            "Ana", "Juan", "Carlos", "María", "Pedro",
            "Luis", "Carmen", "Manuel", "Josefa", "Francisco",
            "Dolores", "Javier", "Antonio", "Rosario", "Jesús",
            "Margarita", "Rafael", "Josefina", "Miguel", "Patricia",
            "Roberto", "Guadalupe", "Fernando", "Teresa", "Sergio",
            "Leticia", "Ricardo", "Alejandra", "Diego", "Susana",
            "Víctor", "Soledad", "Irene", "Eduardo", "Adriana",
            "Joaquín", "Clara", "Enrique", "Cecilia", "Gabriel",
            "Sofía", "Ramón", "Silvia", "Mario", "Pilar",
            "Hugo", "Monica", "Pablo", "Lorena", "Alberto"
    };
    String[] dataApellidos = {
            "González", "Rodríguez", "Pérez", "Sánchez", "Ramírez",
            "Torres", "Díaz", "Vargas", "Castillo", "Ortega",
            "Mendoza", "Herrera", "López", "Reyes", "Cruz",
            "Morales", "Gutiérrez", "Guerrero", "Chávez", "Aguilar",
            "Barrera", "Navarro", "Franco", "Alvarez", "Romero",
            "Benítez", "Medina", "Hernández", "Campos", "Marín",
            "Valdez", "Maldonado", "Rojas", "Soto", "Contreras",
            "Zamora", "Ríos", "Solís", "Delgado", "Mercado",
            "Cordova", "Salinas", "Villanueva", "Ayala", "Peña",
            "Ochoa", "Rangel", "Cordero", "Sepúlveda", "Valencia"
    };

    public StringBuilder generateAleatorio() {
        StringBuilder newName;
        Random rand = new Random();
        int numeroAleatorio1 = rand.nextInt(50);
        int numeroAleatorio2 = rand.nextInt(50);

        newName = new StringBuilder(dataNombres[numeroAleatorio1]);
        newName.append(" ").append(dataApellidos[numeroAleatorio2]);
        return newName;
    }

    public StringBuilder generateDni() {
        StringBuilder dni = new StringBuilder("1018");
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int numeroAleatorio1 = rand.nextInt(10);
            dni.append(numeroAleatorio1);

        }
        return dni;
    }

    public void crearData(HashSet<String> alumnosVotos) {

        for (int i = 0; i < 100; i++) {
            Alumno alumno = new Alumno();
            StringBuilder nameCompleted = generateAleatorio();
            StringBuilder dni = generateDni();
            alumno.setNombreCompleto(String.valueOf(nameCompleted));
            alumno.setDNI(Integer.parseInt(String.valueOf(dni)));
            AlumnosData.add(alumno);
            votacion(alumnosVotos, alumno, i);
        }

    }

    public void votacion(HashSet<String> alumnosVotos, Alumno alumno, int j) {
        Random rand = new Random();
        Voto voto = new Voto();
        int[] conteoRandom = new int[3];
        int conteo0 = conteoRandom[0] = rand.nextInt(100);
        System.out.println("0: " + conteo0);
        int conteo1 = conteoRandom[1] = rand.nextInt(100);
        System.out.println("1: " + conteo1);
        int conteo2 = conteoRandom[2] = rand.nextInt(100);
        System.out.println("2: " + conteo2);
        for (int i = 0; i < AlumnosData.size(); i++) {
            if (i == conteoRandom[0] || i == conteoRandom[1] || i == conteoRandom[2]) {
                if (j != conteoRandom[0] && j != conteoRandom[1] && j != conteoRandom[2]) {
                    AlumnosData.get(i).setCantidadVotos(AlumnosData.get(i).getCantidadVotos() + 1);
                    alumnosVotos.add(alumno + "voto Por: " + AlumnosData.get(i));
                }
            }
        }
    }

    public int recuentoVotos(int salirDelBucle) {
        int conteo1 = 0;


        if (salirDelBucle == 0) {
            return conteo1;
        }
        for (int i = 0; i < AlumnosData.size(); i++) {
            if (conteo1 < AlumnosData.get(i).getCantidadVotos()) {
                conteo1 = AlumnosData.get(i).getCantidadVotos();
                    bigVoto.add(AlumnosData.get(i));
                AlumnosData.remove(AlumnosData.get(i));
                conteo1 = 0;
            }
        }

       return  recuentoVotos(salirDelBucle-1);
    }
    public void mostrarData(){
        for (Alumno i: AlumnosData
             ) {
            System.out.println(i);
        }
    }
    public void mostrarDataVotosBig(){
         bigVoto.sort((p1, p2) ->  Integer.compare(p2.getCantidadVotos(),p1.getCantidadVotos()));
         for (int i = 0; i < 10; i++) {

            if(i < 5){
                System.out.println("Facilitadores");
                System.out.println(bigVoto.get(i));
            }else {
                System.out.println("Facilitadores auxiliares");
                System.out.println(bigVoto.get(i));
            }
        }
    }
 
}
