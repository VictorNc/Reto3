/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumnoUTM
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        Constructor personaje1 = new Constructor(); 
        Mago personaje2 = new Mago();
        Guerrero personaje3 = new Guerrero();
        System.out.println("Indique puntaje para Constructor ");
        int puntaje = Integer.parseInt(entrada.readLine());
        personaje1.setPuntaje(puntaje);
    }
    
}
