package mx.umb.pattern.gof.estructural.decorator.centralita;

public class Diesel extends Decorator {
    // Instancia de la clase vehiculo
    private Vehiculo vehiculo;
 
    // Constructor que recibe el vehículo que encapsulará el decorator
    public Diesel(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    // Los métodos utilizan la información del objeto encapsulado y le
    // incorporan su propia funcionalidad.
	@Override
	public String descripcion() {
		 return vehiculo.descripcion() + " Diesel";
	}

	@Override
	public int velocidadMaxima() {
		 return vehiculo.velocidadMaxima() + 20;
	}

	@Override
	public double consumo() {
		return vehiculo.consumo() - 0.8;
	}

}
