package mx.umb.pattern.gof.comportamiento.strategy.centralita;

public interface ITipoConduccion {
	String obtenerDescripcion();
    int obtenerPotencia(float decilitrosCombustible);
    int obtenerIncrementoVelocidad(float decilitrosCombustible);
}
