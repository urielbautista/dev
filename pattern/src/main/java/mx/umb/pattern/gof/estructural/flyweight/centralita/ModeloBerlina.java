package mx.umb.pattern.gof.estructural.flyweight.centralita;

public class ModeloBerlina extends ModeloVehiculo {

	ModeloBerlina(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	
	@Override
	public void mostrarCaracteristicas(String datosExtra){
		super.mostrarCaracteristicas(datosExtra);
	}
}
