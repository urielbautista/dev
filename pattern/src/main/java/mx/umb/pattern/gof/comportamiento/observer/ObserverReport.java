package mx.umb.pattern.gof.comportamiento.observer;

import java.util.Observable;
import java.util.Observer;

//clase que monitorizara la clase observada.
public class ObserverReport implements Observer {
	private ObservableWeather weatherUpdate ;
	
	@Override
	public void update(Observable observable, Object arg) {
		weatherUpdate = (ObservableWeather) observable;
		System.out.println("Weather Report Live. Its "+ weatherUpdate.getWeather());
	}
}