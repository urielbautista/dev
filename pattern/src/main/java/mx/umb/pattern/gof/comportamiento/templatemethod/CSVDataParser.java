package mx.umb.pattern.gof.comportamiento.templatemethod;

public class CSVDataParser extends DataParser {

	@Override
	void readData() {
		 System.out.println("Reading data from csv file");
	}

	@Override
	void processData() {
		System.out.println("Looping through loaded csv file");
	}

}
