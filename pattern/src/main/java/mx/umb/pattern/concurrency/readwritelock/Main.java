package mx.umb.pattern.concurrency.readwritelock;

public class Main {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.set("java", "object oriented");
		dictionary.set("linux", "rulez");
		
		Writer writer = new Writer(dictionary, "Mr. Writer");
		Reader reader1 = new Reader(dictionary, "Mrs Reader 1");
		Reader reader2 = new Reader(dictionary, "Mrs Reader 2");
		Reader reader3 = new Reader(dictionary, "Mrs Reader 3");
		Reader reader4 = new Reader(dictionary, "Mrs Reader 4");
		Reader reader5 = new Reader(dictionary, "Mrs Reader 5");
		writer.start();
		reader1.start();
		reader2.start();
		reader3.start();
		reader4.start();
		reader5.start();
	}
}
