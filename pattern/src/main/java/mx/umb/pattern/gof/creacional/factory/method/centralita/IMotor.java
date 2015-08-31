package mx.umb.pattern.gof.creacional.factory.method.centralita;

public interface IMotor {
	void setEstabilidad(int estabilidad);
	void setParMotor(float parMotor);
	void setPotencia(int potencia);
	void setRendimiento(float rendimiento);
	void setVelocidadNominal(int velocidadNominal);
	
	String consumirCombustible();
	String inyectarCombustible(int cantidad);
	String realizarEscape();
	String realizarExpansion();  
}
