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
public class Usuario {
    public static void main(String[] args){
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.00);
        cliente.nuevoPedido(10000.00);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.00);
        cliente.nuevoPedido(10000.00);
    }
}
