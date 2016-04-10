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
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        this.documentacion = new DocumentacionPdf();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento = "<PDF> Solicitud de pedido de cliente:"
                + nombreCliente + "</PDF>";
        this.documentacion.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento = "<PDF> Solicitud de matriculacion solicitante:"
                + nombreSolicitante + "</PDF>";
        this.documentacion.agregaDocumento(documento);
    }

}
