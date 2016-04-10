/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor.Singleton;

/**
 *
 * @author emarin
 */
public class TestComercial {
    public static void main(String[] args) {
        //inicializacion de comercial en el sistema
        Comercial elComercial = Comercial.instance();
        elComercial.setNombre("Comercial auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com");
        // muestra el comercial del sistema
        visualizar();
    }
    public static void visualizar(){
        Comercial elComercial = Comercial.instance();
        elComercial.visualizar();
    }
}
