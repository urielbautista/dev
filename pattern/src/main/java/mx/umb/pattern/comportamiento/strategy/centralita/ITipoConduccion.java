package mx.umb.pattern.comportamiento.strategy.centralita;

public interface ITipoConduccion {
	String obtenerDescripcion();
    int obtenerPotencia(float decilitrosCombustible);
    int obtenerIncrementoVelocidad(float decilitrosCombustible);
}
