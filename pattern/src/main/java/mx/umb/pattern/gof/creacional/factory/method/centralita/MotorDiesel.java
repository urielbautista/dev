package mx.umb.pattern.gof.creacional.factory.method.centralita;

public class MotorDiesel implements IMotor {
	private int estabilidad;
    private float parMotor;
    private int potencia;
    private float rendimiento;
    private int velocidadNominal;
    
	@Override
	public String consumirCombustible() {
		return realizarCombustion();
	}

	private String realizarCombustion() {
		 return "MotorDiesel: Realizada combustion del Gasoil";
	}

	@Override
	public String inyectarCombustible(int cantidad) {
		return "MotorDiesel: Inyectados {0} ml. de Gasoil."+ cantidad;
	}

	@Override
	public String realizarEscape() {
		return "MotorDiesel: Realizado escape de gases";
	}

	@Override
	public String realizarExpansion() {
		 return "MotorDiesel: Realizada expansion";
	}
	public int getEstabilidad() {
		return estabilidad;
	}

	public void setEstabilidad(int estabilidad) {
		this.estabilidad = estabilidad;
	}

	public float getParMotor() {
		return parMotor;
	}

	public void setParMotor(float parMotor) {
		this.parMotor = parMotor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public int getVelocidadNominal() {
		return velocidadNominal;
	}

	public void setVelocidadNominal(int velocidadNominal) {
		this.velocidadNominal = velocidadNominal;
	}

}
