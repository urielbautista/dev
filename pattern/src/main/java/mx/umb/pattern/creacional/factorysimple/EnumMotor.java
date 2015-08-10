package mx.umb.pattern.creacional.factorysimple;

public enum EnumMotor {
	MOTOR_TYPES("allowedMotorTypes"),
	DIESEL("motorDiesel"),
	GASOLINA("motorGasolina");

	private String motor;

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	EnumMotor(String motor){
		this.setMotor(motor);
	}
}
