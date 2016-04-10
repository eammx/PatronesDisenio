/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Factory;

/**
 *
 * @author emarin
 */
public class PedidoContado extends Pedido{

    public PedidoContado(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.println("El pago de pedido por importe de " + this.importe + " se ha realizado.");
    }
}
