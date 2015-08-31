package mx.umb.pattern.gof.estructural.flyweight.centralita;

public class ModeloDeportivo extends ModeloVehiculo {

	ModeloDeportivo(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	
	@Override
    public void mostrarCaracteristicas(String datosExtra){
    	 super.mostrarCaracteristicas(datosExtra + " edicion Sport");
    }
       

}
