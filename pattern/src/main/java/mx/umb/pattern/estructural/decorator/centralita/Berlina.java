package mx.umb.pattern.estructural.decorator.centralita;

public class Berlina extends Vehiculo {
	
	public Berlina() {
		 descripcion = "Berlina";
	}
	
	@Override
	public int velocidadMaxima() {
		return 180;
	}

	@Override
	public double consumo() {
		return 6.2;
	}

}
