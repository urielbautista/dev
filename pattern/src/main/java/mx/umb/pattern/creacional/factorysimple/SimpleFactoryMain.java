package mx.umb.pattern.creacional.factorysimple;

import mx.umb.pattern.creacional.simplefactory.centralita.IMotor;

public class SimpleFactoryMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		MotorFactory factory = new MotorFactory();
	    IMotor motorDiesel = factory.CreateInstance(EnumMotor.GASOLINA.getMotor());
	 
	    if (motorDiesel == null)
	        return;
	 
	    System.out.println(motorDiesel.inyectarCombustible(20));
	    System.out.println(motorDiesel.consumirCombustible());
	    System.out.println(motorDiesel.realizarExpansion());
	    System.out.println(motorDiesel.realizarEscape());
	    System.out.println();
	}

}
