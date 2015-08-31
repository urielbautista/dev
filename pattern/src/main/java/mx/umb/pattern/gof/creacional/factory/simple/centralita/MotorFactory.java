package mx.umb.pattern.gof.creacional.factory.simple.centralita;

public class MotorFactory {
	
	public IMotor CreateInstance(String tipoMotor){
		IMotor resultado;
		switch (tipoMotor){
			case "MotorDiesel":
				resultado = new MotorDiesel();
				break;
		     case "MotorGasolina":
	                resultado = new MotorGasolina();
	                break;
			default:
				resultado = null;
				break;
		}
	 
		return resultado;
	}
}
