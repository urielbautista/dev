package mx.umb.pattern.creacional.factory.simple.centralita;

public class MotorGasolina implements IMotor {

	@Override
	public String consumirCombustible() {
		return realizarExplosion();
	}

	private String realizarExplosion() {
		return "MotorGasolina: Realizada explosion de la Gasolina";
	}

	@Override
	public String inyectarCombustible(int cantidad) {
		return "MotorGasolina: Inyectados {0} ml. de Gasolina."+ cantidad;
	}

	@Override
	public String realizarEscape() {
		 return "MotorGasolina: Realizado escape de gases";
	}

	@Override
	public String realizarExpansion() {
		return "MotorGasolina: Realizada expansion";
	}

}