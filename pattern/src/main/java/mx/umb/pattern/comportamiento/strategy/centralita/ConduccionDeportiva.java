package mx.umb.pattern.comportamiento.strategy.centralita;

public class ConduccionDeportiva implements ITipoConduccion {

	@Override
	public String obtenerDescripcion() {
		return "Conduccion Deportiva";
	}

	@Override
	public int obtenerPotencia(float decilitrosCombustible) {
		return (int)(decilitrosCombustible * 0.987) + 5;
	}

	@Override
	public int obtenerIncrementoVelocidad(float decilitrosCombustible) {
		return (int)(decilitrosCombustible * 0.618) + 3;
	}

}