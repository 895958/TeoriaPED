/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import eus.euskadi.opendata.Meteo;

/**
 *
 * @author gorka
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //eus.euskadi.opendata.Meteo meteo = new eus.euskadi.opendata.Meteo();
        Meteo meteo = new Meteo();
        System.out.println("La calidad del aire es: " + meteo.getCalidadAire());
        
        //java.util.Scanner sc = new java.util.Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
    }
    
}
