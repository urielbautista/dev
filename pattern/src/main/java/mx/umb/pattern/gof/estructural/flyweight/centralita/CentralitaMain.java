package mx.umb.pattern.gof.estructural.flyweight.centralita;

import java.util.Date;

public class CentralitaMain {

	public static void main(String[] args) {
		VehiculoFW v1 = new VehiculoFW("Seat", "Ibiza sport", "Amarillo", "1234-CCA", new Date(), "71000011A");
		VehiculoFW v2 = new VehiculoFW("Seat", "Ibiza sport", "Rojo", "1235-CCA", new Date(), "71000012A");
		VehiculoFW v3 = new VehiculoFW("Peugeot", "406", "Verde", "1236-CCA", new Date(), "71000013A");
		VehiculoFW v4 = new VehiculoFW("Renault", "Clio sport", "Amarillo", "1237-CCA", new Date(), "71000014A");
		VehiculoFW v5 = new VehiculoFW("Seat", "Ibiza sport", "Amarillo", "1238-CCA", new Date(), "71000015A");
		 
		v1.mostrarInformacionVehiculo();
		v2.mostrarInformacionVehiculo();
		v3.mostrarInformacionVehiculo();
		v4.mostrarInformacionVehiculo();
		v5.mostrarInformacionVehiculo();
		 
		System.out.println();
	}

}
