package mx.umb.pattern.gof.comportamiento.iterator.centralita;

import java.util.ArrayList;
import java.util.Date;

public class RegistroVehiculos implements IRegistroVehiculos {
	private ArrayList listaVehiculos;
	
	public RegistroVehiculos() {
		this.listaVehiculos = new ArrayList();
	}
	
	@Override
	public void insertarVehiculo(String marca, String modelo, double precio) {
		Vehiculo v = new Vehiculo(marca, modelo, new Date() , precio);
        listaVehiculos.add(v);
	}

	@Override
	public Vehiculo mostrarInformacionVehiculo(int indice) {
		return (Vehiculo) listaVehiculos.get(indice);
	}

	@Override
	public IIteratorVehiculo obtenerIterator() {
		return new IteratorVehiculo(listaVehiculos);
	}

}
