package mx.umb.pattern.comportamiento.observer.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		// Creamos un medidor de sensores
		ISubject sensores = new MedidorSensores(20, 380, 200);
		 
		// Creamos dos observers: un display y un emisor de alertas.
		// Se realiza la suscripcion a traves del constructor
		IObserver display = new ObserverDisplay(sensores);
		IObserver alerta = new ObserverAlerta(sensores);
		 
		// Modificamos valores del subject. Los observers son automaticamente informados
		// y actuaran automaticamente
		
		((MedidorSensores)sensores).setNivelAceite(((MedidorSensores)sensores).getNivelAceite() +10 );
		((MedidorSensores)sensores).setNivelAceite(((MedidorSensores)sensores).getNivelAceite() + 10);
		((MedidorSensores)sensores).setNivelAgua(((MedidorSensores)sensores).getNivelAgua() + 100);
		((MedidorSensores)sensores).setNivelPresionNeumaticos(((MedidorSensores)sensores).getNivelPresionNeumaticos() - 50);
		((MedidorSensores)sensores).setNivelAceite(((MedidorSensores)sensores).getNivelAceite() + 10);
		((MedidorSensores)sensores).setNivelAgua(((MedidorSensores)sensores).getNivelAgua() +100);
		((MedidorSensores)sensores).setNivelAgua(((MedidorSensores)sensores).getNivelAgua()+ 100);
	}

}
