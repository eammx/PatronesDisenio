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
public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHtml() {
        this.documentacion = new DocumentacionHtml();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento = "<HTML> Solicitud de pedido de cliente:"
                + nombreCliente + "</HTML>";
        this.documentacion.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento = "<HTML> Solicitud de matriculacion solicitante:"
                + nombreSolicitante + "</HTML>";
        this.documentacion.agregaDocumento(documento);
    }

}
