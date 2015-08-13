package mx.umb.pattern.creacional.builder.centralita;

public class CentralitaMain {

	public static void main(String[] args) throws Exception {
		// Definimos un director, pasándole un constructor de Audi como parámetro
		VehiculoDirector directorAudi = new VehiculoDirector(new A3SportbackBuilder());
		 
		// El director construye el vehiculo, delegando en el constructor la tarea de
		// creación de cada una de las piezas
		directorAudi.construirVehiculo();
		 
		// Obtenemos el vehículo directamente del director, aunque la instancia del vehículo
		// se encuentra en el constructor.
		Vehiculo audiA3 = directorAudi.getVehiculo();
		 
		// Repetimos el proceso con un constructor distinto.
		VehiculoDirector directorCitroen = new VehiculoDirector(new CitroenXsaraBuilder());
		directorCitroen.construirVehiculo();
		Vehiculo citroen = directorCitroen.getVehiculo();
		 
		// Mostramos por pantalla los dos vehiculos:
		System.out.println("PRIMER VEHICULO:" + System.getProperty("line.separator"));
		System.out.println(audiA3.getPrestaciones());
		 
		System.out.println("SEGUNDO VEHICULO:" + System.getProperty("line.separator"));
		System.out.println(citroen.getPrestaciones());
		 
		System.out.println();
	}

}
