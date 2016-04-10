package Constructor.AbstractFactory;

/**
 *
 * @author emarin
 */
public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Scooter electrico de modelo: " + this.modelo + " color: " + this.color + " potencia: " + this.potencia);
    }

}
