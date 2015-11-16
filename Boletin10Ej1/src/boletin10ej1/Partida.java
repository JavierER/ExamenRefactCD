/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author joterodelrio
 */
public class Partida {

    private int nAdivinar;
    private int nIntentos;

    public void setNAdivinar() {
        do {
            nAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Introduce número para adivinar (1-50)"));
        } while (nAdivinar < 1 || nAdivinar > 50);
    }

    public void setNIntentos() {
        nIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de intentos para adivinar"));
    }

    public void EjecutarPartida() {
        boolean gameover = true;
        boolean nNotValid = false;
        for (int i = 0; i < nIntentos; i++) {
            do {
                int resposta = Integer.parseInt(JOptionPane.showInputDialog("Intento  " + (i + 1)));
                if (resposta >= 1 && resposta <= 50) {
                    if (resposta < nAdivinar) {
                        JOptionPane.showMessageDialog(null, "Pista " + (i + 1) + ": número inferior al número que hay que adivinar.");
                    } else if (resposta > nAdivinar) {
                        JOptionPane.showMessageDialog(null, "Pista " + (i + 1) + ": número mayor al número que hay que adivinar.");
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
            JOptionPane.showMessageDialog(null, "Lo siento, el número a adivinar era " + nAdivinar + " :(");
        }

    }
}
