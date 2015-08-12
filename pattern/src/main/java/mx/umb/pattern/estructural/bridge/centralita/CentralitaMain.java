package mx.umb.pattern.estructural.bridge.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
//		Como vemos, cada refinamiento se desarrollará en una dirección, pero ambos elementos podrán
//		seguir haciendo uso del motor por medio de los métodos codificados en la clase abstracta
//		Vehiculo. La implementación del método abstracto MostrarCaracteristicas también será diferente.
//		Por lo tanto, si invocamos este método, toda la funcionalidad contenida en él será parte
//		dependiente de la propia abstracción (Vehiculo).
		IMotor motorDiesel = new Diesel();
		Vehiculo berlina = new Berlina(motorDiesel, 4); 
		berlina.mostrarCaracteristicas();
		
//		Si, por el contrario, necesitáramos hacer uso de funcionalidad no dependiente del chasis del
//		vehículo, deberíamos “cruzar el puente” y solicitarle la información (o la funcionalidad, en este 
//		caso) al motor. O más concretamente, a la implementación del motor, que será independiente 
//		del vehículo.
		
		IMotor motorDieselBridge = new Diesel();
		Vehiculo berlinaBridge = new Berlina(motorDieselBridge, 4);
		 
		berlinaBridge.mostrarCaracteristicas();
		berlinaBridge.acelerar(2.4d);
	}

}
