package mx.umb.pattern.gof.estructural.bridge.centralita;

public class Gasolina implements IMotor {

	@Override
	public void inyectarCombustible(double cantidad) {
		System.out.println("Inyectando " + cantidad + " ml. de Gasolina");
	}

	@Override
	public void consumirCombustible() {
		 realizarCombustion();
	}

	private void realizarCombustion() {
		System.out.println("Realizada la combustión de la Gasolina");
	}

}