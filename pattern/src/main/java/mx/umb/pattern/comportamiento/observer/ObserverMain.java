package mx.umb.pattern.comportamiento.observer;

public class ObserverMain {

	public static void main(String[] args) {	
		ObservableWeather observable = new ObservableWeather(null);
		ObserverReport observer = new ObserverReport();
		observable.addObserver(observer);
		observable.setWeather("Bright and sunny...Let's play cricket!! ");
		observable.setWeather("Raining Heavily!..Let's have hot Pakodas!!");
	}

}
