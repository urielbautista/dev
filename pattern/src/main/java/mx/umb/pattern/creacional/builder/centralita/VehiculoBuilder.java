package mx.umb.pattern.creacional.builder.centralita;

public abstract class VehiculoBuilder {
	// Declaramos la referencia del producto a construir
    protected Vehiculo v;
 
    // Declaramos el método que recuperará el objeto
    public Vehiculo getVehiculo(){
        return v;
    }

    public abstract void definirVehiculo();
    public abstract void construirRuedas();
    public abstract void construirHabitaculo();
    public abstract void construirMotor();
    public abstract void definirExtras();
}
