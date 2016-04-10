/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Prototype;

/**
 *
 * @author emarin
 */
public class Usuario {
    public static void main(String[] args){
        //Inicializacion de la documentacion en blanco
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        
        //creacion de documentacion nueva para dos clientes
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}
