package mx.umb.pattern.comportamiento.iterator.centralita;

public interface IRegistroVehiculos {
	 void insertarVehiculo(String marca, String modelo, double precio);
	 Vehiculo mostrarInformacionVehiculo(int indice);
	 IIteratorVehiculo obtenerIterator();
}
