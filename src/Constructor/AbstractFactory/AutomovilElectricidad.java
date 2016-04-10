package Constructor.AbstractFactory;

/**
 *
 * @author emarin
 */
public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Automovil electrico de modelo: " + this.modelo + " color: " + this.color + " potencia: " + this.potencia + " espacio: "+ this.espacio);
    }

}
