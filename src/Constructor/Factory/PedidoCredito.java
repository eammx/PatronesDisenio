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
public class PedidoCredito extends Pedido{

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (this.importe >= 1000.00) && (this.importe <= 5000.00);
    }

    @Override
    public void paga() {
        System.out.println("El pago de pedido a credito de " + this.importe + " se ha realizado.");
    }
}
