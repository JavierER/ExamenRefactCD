/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10ej2;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author joterodelrio
 */
public class Partida {
    private int nAdivinar;
    private int nIntentos;

    public void setNAdivinar() {
        nAdivinar = (int)(Math.random()*50+1);
    }

    public void setNIntentos() {
        nIntentos = (int)(Math.random()*10+1);
    }

    public void EjecutarPartida() {
        boolean gameover = true;
        boolean nNotValid = false;
        for (int i = 0; i < nIntentos; i++) {
            do {
                int resposta = Integer.parseInt(JOptionPane.showInputDialog("Intento  " + (i + 1)));
                if (resposta >= 1 && resposta <= 50) {
                    if () {
                        JOptionPane.showMessageDialog(null, "Pista " + (i + 1) + ": número moi lonxe.");
                    } else if () {
                        JOptionPane.showMessageDialog(null, "Pista " + (i + 1) + ": número lonxe.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Felicidades, ha acertado.");
                        gameover = false;
                        break;
                    }
                    nNotValid = false;
                } else {
                    nNotValid = true;
                }
            } while (nNotValid);
        }

        if (gameover) {
            JOptionPane.showMessageDialog(null, "Ha perdido. Lo siento :(");
        }

    }
}
