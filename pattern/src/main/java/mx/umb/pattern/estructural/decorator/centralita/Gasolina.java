package mx.umb.pattern.estructural.decorator.centralita;

public class Gasolina extends Decorator {
	// Instancia de la clase vehiculo
    private Vehiculo vehiculo;
 
    // Constructor que recibe el vehículo que encapsulará el decorator
    public Gasolina(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
 
    // Los métodos utilizan la información del objeto encapsulado y le
    // incorporan su propia funcionalidad.
	@Override
	public String descripcion() {
		return vehiculo.descripcion() + " Gasolina";
	}

	// Un vehículo gasolina proporciona más potencia, por lo que "decora" el
    // vehiculo añadiendo mayor velocidad máxima
	@Override
	public int velocidadMaxima() {
		return vehiculo.velocidadMaxima() + 60;
	}

    // La gasolina es menos energética que el diesel, por lo que el consumo
    // de combustible es mayor. Decoraremos el vehículo añadiéndole un consumo
    // de 1.2 litros adicionales a los 100 km.
	@Override
	public double consumo() {
		 return vehiculo.consumo() + 1.2;
	}

}
