package mx.umb.pattern.comportamiento.observer.centralita;

public interface ISubject {
	// Interfaz que expone los metodos de registro y eliminacion de observers, asi como para
	// la notificacion de los cambios de estado.
	void registrarObserver(IObserver o);
    void eliminarObserver(IObserver o);
    void notificarObservers();
}
