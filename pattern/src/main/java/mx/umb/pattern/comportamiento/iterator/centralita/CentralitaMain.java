package mx.umb.pattern.comportamiento.iterator.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		// Declaramos el registro
		IRegistroVehiculos registro = new RegistroVehiculos();
		 
		// Insertamos unos cuantos elementos
		registro.insertarVehiculo("Volkswagen", "Polo", 12300);
		registro.insertarVehiculo("Volkswagen", "Golf GTI", 18900);
		registro.insertarVehiculo("Volkswagen", "Passat", 27000);
		registro.insertarVehiculo("Volkswagen", "Scirocco", 32100);
		registro.insertarVehiculo("Volkswagen", "Touareg", 21800);
		 
		// Obtenemos el iterator
		IIteratorVehiculo iterador = registro.obtenerIterator();
		 
		// Mientras queden elementos
		while (iterador.quedanElementos()) {
		    // Obtenemos el siguiente elemento
		    Vehiculo v = iterador.siguiente();
		    // Mostramos su contenido
		    System.out.println(v.getMarca() + " " + v.getModelo() + " fabricado el " + v.getFechaFabricacion() + " (" + v.getPrecio() + " euros)");
		}

	}

}
