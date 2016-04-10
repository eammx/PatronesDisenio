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
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }
    
    public Documentacion construye(String nombreCliente){
       this.constructor.construyeSolicitudPedido(nombreCliente);
       this.constructor.construyeSolicitudMatriculacion(nombreCliente);
       Documentacion documentacion = this.constructor.resultado();
       return documentacion;
    }
}
