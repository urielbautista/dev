package mx.umb.pattern.creacional.factory.method.centralita;

public class MotorDieselFactory implements IMotorFactory {

	@Override
	public IMotor createInstance() {
		IMotor motorDiesel = new MotorDiesel();
		motorDiesel.setEstabilidad(60);
		motorDiesel.setParMotor(90);
		motorDiesel.setPotencia(700);
		motorDiesel.setRendimiento(220);
		motorDiesel.setVelocidadNominal(80); 
        return motorDiesel;

	}

}
