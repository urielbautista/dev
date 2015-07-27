package mx.umb.pattern.comportamiento.observer;

import java.util.Observable;

//clase que sera monitoreada
public class ObservableWeather extends Observable {
	private String weather;
	
	public ObservableWeather (String weather){
		this.weather=weather;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
		//Marcamos el objeto observable como objeto que ha cambiado
		setChanged();
		//Notificamos a los observadores y le enviamos el nuevo valor
		//notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
		notifyObservers();
	}
}