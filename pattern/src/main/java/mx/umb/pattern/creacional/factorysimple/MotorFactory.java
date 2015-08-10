package mx.umb.pattern.creacional.factorysimple;

import mx.umb.pattern.creacional.simplefactory.centralita.IMotor;

public class MotorFactory {
	
	public IMotor CreateInstance(String tipoMotor) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
		Class myClass = Class.forName(XMLConfig.getInstance().obtenerTipo(tipoMotor));
		IMotor resultado = (IMotor) myClass.newInstance();
		return resultado;
	}
}
