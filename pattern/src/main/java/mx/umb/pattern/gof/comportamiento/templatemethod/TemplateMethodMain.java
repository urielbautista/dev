package mx.umb.pattern.gof.comportamiento.templatemethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		CSVDataParser csvDataParser=new CSVDataParser();
		csvDataParser.parseDataAndGenerateOutput();
		System.out.println("**********************");
		DatabaseDataParser databaseDataParser=new DatabaseDataParser();
		databaseDataParser.parseDataAndGenerateOutput();
	}

}