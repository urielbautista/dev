package mx.umb.pattern.estructural.bridge.centralita;

public class Diesel implements IMotor {

	@Override
	public void inyectarCombustible(double cantidad) {
		System.out.println("Inyectando " + cantidad + " ml. de Gasoil");
	}

	@Override
	public void consumirCombustible() {
		realizarExplosion();
	}

	private void realizarExplosion() {
		 System.out.println("Realizada la explosión del Gasoil");
	}

}
