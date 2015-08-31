package mx.umb.pattern.gof.creacional.factory.simple.centralita;

public class MotorDiesel implements IMotor {

	@Override
	public String consumirCombustible() {
		return realizarCombustion();
	}

	private String realizarCombustion() {
		 return "MotorDiesel: Realizada combustion del Gasoil";
	}

	@Override
	public String inyectarCombustible(int cantidad) {
		return "MotorDiesel: Inyectados {0} ml. de Gasoil."+ cantidad;
	}

	@Override
	public String realizarEscape() {
		return "MotorDiesel: Realizado escape de gases";
	}

	@Override
	public String realizarExpansion() {
		 return "MotorDiesel: Realizada expansion";
	}

}
