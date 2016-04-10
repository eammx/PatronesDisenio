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
public class ComponentePDF {

    protected String contenido;

    public void pdfFijaContenido(String contenido) {
        this.contenido = contenido;
    }

    public void pdfPreparaVisualizacion() {
        System.out.println("Visualiza PDF: comienzo");
    }

    public void pdfRefresca() {
        System.out.println("Visualiza contenido PDF: " + this.contenido);
    }
    public void pdfFinalizaVisualizacion(){
       System.out.println("Visualiza PDF: Fin"); 
    }
    
    public void pdfEnviaImpresora(){
        System.out.println("Impresion PDF: " + this.contenido);
    }
}
