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
public class DocumentoPDF implements Documento{
    
    protected ComponentePDF herramientaPDF = new ComponentePDF();

    @Override
    public void setContenido(String contenido) {
        this.herramientaPDF.pdfFijaContenido(contenido);
    }

    @Override
    public void dibujar() {
        this.herramientaPDF.pdfPreparaVisualizacion();
        this.herramientaPDF.pdfRefresca();
        this.herramientaPDF.pdfFinalizaVisualizacion();
    }

    @Override
    public void imprimir() {
        this.herramientaPDF.pdfEnviaImpresora();
    }
    
}
