package mx.umb.pattern.estructural.bridge.centralita;

public abstract class Vehiculo {
	private IMotor motor;
	 
    public Vehiculo(IMotor motor){
        this.motor = motor;
    }
 
    // Encapsulamos la funcionalidad de la interfaz IMotor
    public void acelerar(double combustible){
        motor.inyectarCombustible(combustible);
        motor.consumirCombustible();
    }
 
    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }
 
    // Método abstracto
    public abstract void mostrarCaracteristicas();
}