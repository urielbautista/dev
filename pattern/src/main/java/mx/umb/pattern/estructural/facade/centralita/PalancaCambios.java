package mx.umb.pattern.estructural.facade.centralita;

public class PalancaCambios implements IPalancaCambios {
	private int velocidadActual;

	@Override
	public void insertarVelocidad(int velocidad) {
		System.out.println("Introduciendo marcha " + velocidad);
		this.velocidadActual = velocidad;
	}

	@Override
	public void puntoMuerto() {
		System.out.println("Sacando velocidad " + this.velocidadActual);
		this.velocidadActual = 0;
	}

	@Override
	public int getVelocidadActual() {
		return velocidadActual;
	}

}