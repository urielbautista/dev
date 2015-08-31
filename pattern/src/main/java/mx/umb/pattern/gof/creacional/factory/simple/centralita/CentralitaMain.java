package mx.umb.pattern.gof.creacional.factory.simple.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		
		MotorFactory factory = new MotorFactory();
	    IMotor motorDiesel = factory.CreateInstance("MotorDiesel");
	 
	    if (motorDiesel == null)
	        return;
	 
	    System.out.println(motorDiesel.inyectarCombustible(20));
	    System.out.println(motorDiesel.consumirCombustible());
	    System.out.println(motorDiesel.realizarExpansion());
	    System.out.println(motorDiesel.realizarEscape());
	    System.out.println();
	}
	
}