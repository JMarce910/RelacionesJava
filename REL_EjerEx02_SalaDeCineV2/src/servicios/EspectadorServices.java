/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Espectador;
import entidades.Peliculas;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class EspectadorServices {
    
    Peliculas peliculas = new Peliculas();
    PeliculaServices ps = new PeliculaServices();

    public void mostarInfoPersona(ArrayList<Espectador> espectadores) {

        for (Espectador i : espectadores) {
            System.out.println(i);

        }
    }

}
