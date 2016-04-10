/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura.Bridge;

import java.util.Scanner;

/**
 *
 * @author emarin
 */
public class FormAppletImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    @Override
    public void dibujarTexto(String texto) {
        System.out.println("Applet: " + texto);
    }

    @Override
    public String administrarZonaIndicada() {
        return reader.next();
    }

}
