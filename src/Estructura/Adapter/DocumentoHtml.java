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
public class DocumentoHtml implements Documento{
    protected String contenido;

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuja el documento HTML: " + this.contenido);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprime el documento HTML: " + this.contenido);
    }
    
}
