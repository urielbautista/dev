package mx.umb.pattern.gof.comportamiento.templatemethod;

public class DatabaseDataParser extends DataParser {

	@Override
	void readData() {
		 System.out.println("Reading data from database");
	}

	@Override
	void processData() {
		System.out.println("Looping through datasets");  
	}

}