/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10ej2;

/**
 *
 * @author joterodelrio
 */
public class Boletin10Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partida partidilla = new Partida();
        partidilla.setNAdivinar();
        partidilla.setNIntentos();
        partidilla.EjecutarPartida();
    }
    
}
