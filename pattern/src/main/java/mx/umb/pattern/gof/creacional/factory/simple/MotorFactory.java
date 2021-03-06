package mx.umb.pattern.gof.creacional.factory.simple;

import mx.umb.pattern.gof.creacional.factory.simple.centralita.IMotor;

public class MotorFactory {
	
	public IMotor createInstance(String tipoMotor) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
		Class myClass = Class.forName(XMLConfig.getInstance().obtenerTipo(tipoMotor));
		IMotor resultado = (IMotor) myClass.newInstance();
		return resultado;
	}
}
