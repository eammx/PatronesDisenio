package Constructor.AbstractFactory;

/**
 *
 * @author emarin
 */
public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Scooter gasolina de modelo: " + this.modelo + " color: " + this.color + " potencia: " + this.potencia);
    }

}
