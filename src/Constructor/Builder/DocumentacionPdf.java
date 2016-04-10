/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Builder;

/**
 *
 * @author emarin
 */
public class DocumentacionPdf extends Documentacion{

    @Override
    public void agregaDocumento(String documento) {
        if(documento.startsWith("<PDF>"))
            this.contenido.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion PDF");
        for(String s :this.contenido)
            System.out.println(s);
    }
    
}
