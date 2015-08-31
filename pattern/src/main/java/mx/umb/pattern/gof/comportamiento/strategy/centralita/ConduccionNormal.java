package mx.umb.pattern.gof.comportamiento.strategy.centralita;

public class ConduccionNormal implements ITipoConduccion {

	@Override
	public String obtenerDescripcion() {
		return "Conduccion Normal";
	}

	@Override
	public int obtenerPotencia(float decilitrosCombustible) {
		return (int)(decilitrosCombustible * 0.842) + 3;
	}

	@Override
	public int obtenerIncrementoVelocidad(float decilitrosCombustible) {
		return (int)(decilitrosCombustible * 0.422) + 2;
	}

}