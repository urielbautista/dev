package mx.umb.pattern.gof.creacional.builder.centralita;

public class CitroenXsaraBuilder extends VehiculoBuilder {

	@Override
	public void definirVehiculo() {
	    v = new Vehiculo();
        v.setMarca("Citroen");
        v.setModelo("Xsara Picasso");
	}
	
    // Método que construirá las ruedas
	@Override
	public void construirRuedas() {
		v.setTipoRuedas(new Rueda());
		v.getTipoRuedas().setDiametro(15);
		v.getTipoRuedas().setLlanta("hierro");
		v.getTipoRuedas().setNeumatico("Firestone");
	}

	// Método que construirá el habitaculo
	
	@Override
	public void construirHabitaculo() {
	     v.setTipoCarroceria(new Carroceria());
	     v.getTipoCarroceria().setTipoCarroceria("monovolumen");
	     v.getTipoCarroceria().setHabitaculoReforzado(false);
	     v.getTipoCarroceria().setMaterial("acero");
	     v.setColor("negro");
	}

	@Override
	public void construirMotor() {
		v.setMotor(new MotorDiesel());
	}

	@Override
	public void definirExtras() {
		v.setCierreCentralizado(false);
        v.setDireccionAsistida(false);
	}

}
