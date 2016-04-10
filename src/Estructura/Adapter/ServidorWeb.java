/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura.Adapter;

/**
 *
 * @author emarin
 */
public class ServidorWeb {
    public static void main(String[] args) {
        Documento documento1,documento2;
        documento1 = new DocumentoHtml();
        documento2 = new DocumentoPDF();
        
        documento1.setContenido("Hola Html");
        documento1.dibujar();
        System.out.println();
        documento2.setContenido("Hola PDF");
        documento2.dibujar();
    }
}
