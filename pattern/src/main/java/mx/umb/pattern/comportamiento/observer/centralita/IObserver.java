package mx.umb.pattern.comportamiento.observer.centralita;

public interface IObserver {
	// Metodo que sera invocado por el Subject
    // El objeto "o" seran los valores que el Subject le pasara al Observer
    void update(Object o);
}
