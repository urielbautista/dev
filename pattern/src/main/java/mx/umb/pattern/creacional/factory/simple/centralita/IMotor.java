package mx.umb.pattern.creacional.factory.simple.centralita;

public interface IMotor {
	String consumirCombustible();
	String inyectarCombustible(int cantidad);
	String realizarEscape();
	String realizarExpansion();  
}
