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
public class ClienteContado extends Cliente{

    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
    
}
