package mx.umb.pattern.comportamiento.observer.centralita;

import java.util.ArrayList;
import java.util.List;

public class MedidorSensores implements ISubject {
	// Atributos que modelan el estado
    private int nivelAceite;
	private int nivelAgua;
    private int nivelPresionNeumaticos;
    // Listado de observers
    List  <IObserver> suscriptores;

    
	// Constructor que creara un medidor con los valores iniciales de las presiones
    public MedidorSensores(int nivelAceite, int nivelAgua, int nivelPresionNeumaticos){
        this.suscriptores = new ArrayList <IObserver>();
        this.nivelAceite = nivelAceite;
        this.nivelAgua = nivelAgua;
        this.nivelPresionNeumaticos = nivelPresionNeumaticos;
    }
 
    // Comprobamos si el observer se encuentra en la lista. En caso contrario,
    // lo incluye en la lista
	@Override
	public void registrarObserver(IObserver o) {
		 if (!suscriptores.contains(o)){
			 suscriptores.add(o);
		 }       
	}

    // Comprobamos si el observer se encuentra en la lista. En caso afirmativo,
    // lo elimina de la lista
	@Override
	public void eliminarObserver(IObserver o) {
        if (suscriptores.contains(o)){
        	 suscriptores.remove(o);
        }
           
	}
	
	// Recorre la lista de observers e invoca su metodo Update()
	@Override
	public void notificarObservers() {
        // Creamos un array con el estado del Subject
        int[] valores = { this.nivelAceite, this.nivelAgua, this.nivelPresionNeumaticos };
 
        // Recorremos todos los objetos suscritos (observers)
        IObserver observer;
        for(Object o : suscriptores){
            // Invocamos el metodo Update de cada observer, pasandole el array con el estado
            // del subject como parametro.
            // Cada observer ya hara lo que estime necesario con esa informacion.
            observer = (IObserver)o;
            observer.update(valores);
        }
	}
	
	public int getNivelAceite() {
		return nivelAceite;
	}

	public void setNivelAceite(int nivelAceite) {
		if (this.nivelAceite != nivelAceite){
            this.nivelAceite = nivelAceite;
            notificarObservers();
        }
	}

	public int getNivelAgua() {
		return nivelAgua;
	}

	public void setNivelAgua(int nivelAgua) {
		if (this.nivelAgua != nivelAgua){
			this.nivelAgua = nivelAgua;
            notificarObservers();
        }
	}

	public int getNivelPresionNeumaticos() {
		return nivelPresionNeumaticos;
	}

	public void setNivelPresionNeumaticos(int nivelPresionNeumaticos) {
		if (this.nivelPresionNeumaticos != nivelPresionNeumaticos){
            this.nivelPresionNeumaticos = nivelPresionNeumaticos;
            notificarObservers();
        }
	}

}