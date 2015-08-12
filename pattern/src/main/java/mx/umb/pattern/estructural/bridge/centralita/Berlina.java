package mx.umb.pattern.estructural.bridge.centralita;

public class Berlina extends Vehiculo {
	// Atributo propio
    private int capacidadMaletero;
 
    // La implementacion de los vehículos se desarrolla de forma independiente
    public Berlina(IMotor motor, int capacidadMaletero){
    	super(motor);
        this.capacidadMaletero = capacidadMaletero;
    }
   
    // Implementación del método abstracto
	@Override
	public void mostrarCaracteristicas() {
        System.out.println("Vehiculo de tipo Berlina con un maletero con una capacidad de " + 
                capacidadMaletero + " litros.");
	}

}