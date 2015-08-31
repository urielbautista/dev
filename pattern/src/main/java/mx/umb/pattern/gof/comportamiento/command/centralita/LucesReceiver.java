package mx.umb.pattern.gof.comportamiento.command.centralita;

//Clase abstracta de la que heredarán las clases que serán encapsuladas por los
//objectos Command. Por lo tanto, sus métodos serán aquellos que encapsulará el
//método Execute().unque en realidad esto no es estrictamente necesario (un objeto
//Command podría albergar diversos objetos no necesariamente relacionados entre sí).
public abstract class LucesReceiver {
	 protected boolean encendidas;
	 protected int distanciaAlumbrado;
	 
	 // Método encargado de apagar las luces. Establece el estado del atributo 'encendidas'
	 // a 'false'. Será común a todas las clases que hereden de ella.
	 public void apagar(){
	        this.encendidas = false;
	 }
	 
	 // El método Encender será distinto en cada una de las clases que hereden de esta clase.
	 public abstract int encender();
	    
}
