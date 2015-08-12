package mx.umb.pattern.estructural.decorator.centralita;

public class Turbo extends Decorator {

	private Vehiculo vehiculo;
	   
	public Turbo(Vehiculo vehiculo){
		this.vehiculo = vehiculo;
	}
	 
	@Override
	public String descripcion() {
		return vehiculo.descripcion() + " Turbo";
	}

	@Override
	public int velocidadMaxima() {
		return vehiculo.velocidadMaxima() + 30;
	}

	@Override
	public double consumo() {
		 return vehiculo.consumo() + 0.4;
	}
	
}