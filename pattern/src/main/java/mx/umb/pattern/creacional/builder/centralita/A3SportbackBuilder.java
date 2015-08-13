package mx.umb.pattern.creacional.builder.centralita;

public class A3SportbackBuilder extends VehiculoBuilder {

	@Override
	public void definirVehiculo() {
	     v = new Vehiculo();
	     v.setMarca("Audi");
	     v.setModelo("A3 Sportback");
	}

	 // Método que construirá las ruedas
	@Override
	public void construirRuedas() {
	     v.setTipoRuedas(new Rueda());
	     v.getTipoRuedas().setDiametro(17);
	     v.getTipoRuedas().setLlanta("aluminio");
	     v.getTipoRuedas().setNeumatico("Michelin");
	}

	 // Método que construirá el habitaculo
	@Override
	public void construirHabitaculo() {
        v.setTipoCarroceria( new Carroceria());
        v.getTipoCarroceria().setTipoCarroceria("deportivo");
        v.getTipoCarroceria().setHabitaculoReforzado(true);
        v.getTipoCarroceria().setMaterial("fibra de carbono");
        v.setColor("plata cromado");
	}

	 // Método que construirá el motor
	@Override
	public void construirMotor() {
		 v.setMotor(new MotorDiesel());
	}

	@Override
	public void definirExtras() {
	     v.setCierreCentralizado(true);
	     v.setDireccionAsistida(true);
	}

}