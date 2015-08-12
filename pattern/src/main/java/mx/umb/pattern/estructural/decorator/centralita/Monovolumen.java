package mx.umb.pattern.estructural.decorator.centralita;

public class Monovolumen extends Vehiculo {
	
	public Monovolumen() {
		descripcion = "Monovolumen";
	}

	@Override
	public int velocidadMaxima() {
		return 160;
	}

	@Override
	public double consumo() {
		return 7.5;
	}

}
