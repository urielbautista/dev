package mx.umb.pattern.estructural.decorator.centralita;

public class Inyeccion extends Decorator {
	 private Vehiculo vehiculo;
	 
	 public Inyeccion(Vehiculo vehiculo) {
		 this.vehiculo = vehiculo;
	 }
	 
	@Override
	public String descripcion() {
		return vehiculo.descripcion() + " Inyección";
	}

	@Override
	public int velocidadMaxima() {
		return vehiculo.velocidadMaxima();
	}

	@Override
	public double consumo() {
		return vehiculo.consumo() - 1.2;
	}

}
