package mx.umb.pattern.comportamiento.templatemethod.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		Motor motorGasolina = new MotorGasolina();
		//el motor diesel hace uso del gancho para añadir su propia funcionalidad, 
		//mientras que el motor gasolina ha delegado en la clase base el funcionamiento por defecto.
		Motor motorDiesel = new MotorDiesel(true);
		 
		motorGasolina.realizarFaseMotor();
		System.out.println("----------------------------------------------------");
		motorDiesel.realizarFaseMotor();
	}

}
