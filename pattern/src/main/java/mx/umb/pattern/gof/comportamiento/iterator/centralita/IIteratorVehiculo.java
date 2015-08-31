package mx.umb.pattern.gof.comportamiento.iterator.centralita;

public interface IIteratorVehiculo {
	void primero();
    Vehiculo actual();
    Vehiculo siguiente();
    boolean quedanElementos();
}
