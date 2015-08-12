package mx.umb.pattern.estructural.bridge.centralita;

public class Monovolumen extends Vehiculo {
    // Atributo propio
    private boolean puertaCorrediza;
 
    // La implementacion de los vehículos se desarrolla de forma independiente
    public Monovolumen(IMotor motor, boolean puertaCorrediza){
    	super(motor);
        this.puertaCorrediza = puertaCorrediza;
    }
 
    // Implementación del método abstracto
	@Override
	public void mostrarCaracteristicas() {
       System.out.println("Vehiculo de tipo Berlina " + (puertaCorrediza ? "con" : "sin") + 
                " puerta corrediza.");
	}

}