package mx.umb.pattern.gof.creacional.factory.method.centralita;

public class MotorGasolinaFactory implements IMotorFactory {

	@Override
	public IMotor createInstance() {
        IMotor motorGasolina = new MotorGasolina();
        motorGasolina.setEstabilidad(100);
        motorGasolina.setParMotor(40);
        motorGasolina.setPotencia(1200);
        motorGasolina.setRendimiento(420);
        motorGasolina.setVelocidadNominal(47);
		return motorGasolina;
	}

}
