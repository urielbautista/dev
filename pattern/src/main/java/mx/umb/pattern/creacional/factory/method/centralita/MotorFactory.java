package mx.umb.pattern.creacional.factory.method.centralita;


public class MotorFactory {
	
	public static IMotorFactory obtenerFactoria() {
		IMotorFactory resultado = null;
		try {
			Class myClass = Class.forName("mx.umb.pattern.creacional.factory.method.centralita.MotorGasolinaFactory");
			resultado = (IMotorFactory) myClass.newInstance();
		} catch (Exception e) {
			System.out.println("ERROR: Reflexion");
		}
		return resultado;
	}
}
