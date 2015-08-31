package mx.umb.pattern.gof.comportamiento.iterator.centralita;

import java.util.ArrayList;

public class IteratorVehiculo implements IIteratorVehiculo {

	// Referencia al listado completo
    private ArrayList vehiculos;
 
    // Almacenaremos el índice en el que se encuentra el iterador
    private int posicionActual = -1;
 
    // El constructor inyectará el ArrayList en el objeto
    public IteratorVehiculo(ArrayList listado){
        this.vehiculos = listado;
    }
    
    // Operación 1: Reinicio del índice, colocándolo en el elemento anterior al primero
	@Override
	public void primero() {
		this.posicionActual = -1;
	}

	// Operación 2: Acceso al elemento actual
	@Override
	public Vehiculo actual() {
		// Si no existen elementos, devolveremos null.
	    // Si el indice actual es mayor que el mayor indice aceptable, devolveremos null.
	    // Si el indice actual es -1, devolveremos null.
	    if ((this.vehiculos == null) || 
	        (this.vehiculos.size() == 0) || 
	        (posicionActual > this.vehiculos.size() - 1) ||
	        (this.posicionActual < 0))
	        return null;
	 
	    // Devolvemos el elemento correspondiente al elemento actual
	    else
	        return (Vehiculo)this.vehiculos.get(posicionActual);

	}

	@Override
	public Vehiculo siguiente() {
	    // Si no existen elementos, devolveremos null.
	    // Si el indice siguiente es mayor que el mayor indice aceptable, devolveremos null.
	    if ((this.vehiculos == null) || 
	        (this.vehiculos.size() == 0) || 
	        (posicionActual + 1 > this.vehiculos.size() - 1))
	        return null;
	 
	    // Aumentamos el índice en una unidad y devolvemos ese elemento
	    else
	        return (Vehiculo)this.vehiculos.get(++posicionActual);
	}

	@Override
	public boolean quedanElementos() {
		 // Devolvemos un booleano que será true si la posición siguiente es menor o igual que el
	    // máximo índice aceptable (número de elementos del array - 1).
	    return (posicionActual + 1 <= this.vehiculos.size() - 1);
	}

}
