/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cine;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pc
 */
public class CineServices {
    
    ArrayList<Cine> dataInfoAllCine = new ArrayList<>();

        Cine cine = new Cine();
        PeliculaServices ps = new PeliculaServices();
        public void showAllData(ArrayList<Cine> dataInfoAllCine){

                for (Cine i : dataInfoAllCine
                     ) {
                        System.out.println(i.getPeliculas().getTitulo()+" "+Arrays.deepToString(i.getSala())+" " + i.getPeliculas());
                }
        }
        public String[][] configurarSalas(){
                String[][] salaActual= cine.getSala();
                for (int i = 0; i < 6; i++) {
                        int conteo = 9;
                        int conteo2 = 0;
                        for (int j = 0; j < 8; j++) {
                                conteo--;
                                conteo2++;
                                   String numero = String.valueOf(conteo);

                                   salaActual[j][i] = numero;

                                if(i == 0){
                                        salaActual[j][i] = salaActual[j][i] + "A";

                                } else if (i == 1) {
                                        salaActual[j][i] = salaActual[j][i] + "B";

                                } else if (i == 2) {
                                        salaActual[j][i] = salaActual[j][i] + "C";

                                } else if (i == 3) {
                                        salaActual[j][i] = salaActual[j][i] + "D";

                                } else if (i == 4) {
                                        salaActual[j][i] = salaActual[j][i] + "E";

                                }else {
                                        salaActual[j][i] = salaActual[j][i] + "F";

                                }
                                cine.setSala(salaActual);
                        }

                }

                return salaActual;

        }
        public void mostrarSalas(){

                for (int i = 0; i < dataInfoAllCine.size(); i++) {
                        System.out.println(Arrays.deepToString(dataInfoAllCine.get(i).getSala()));
                }
        }

        public ArrayList<Cine> getDataInfoAllCine() {
                return dataInfoAllCine;
        }

        public void setDataInfoAllCine(ArrayList<Cine> dataInfoAllCine) {
                this.dataInfoAllCine = dataInfoAllCine;
        }
    
}
