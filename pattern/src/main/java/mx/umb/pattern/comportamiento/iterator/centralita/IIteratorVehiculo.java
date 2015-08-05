package mx.umb.pattern.comportamiento.iterator.centralita;

public interface IIteratorVehiculo {
	void primero();
    Vehiculo actual();
    Vehiculo siguiente();
    boolean quedanElementos();
}
