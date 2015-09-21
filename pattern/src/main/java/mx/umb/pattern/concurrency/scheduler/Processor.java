package mx.umb.pattern.concurrency.scheduler;

public class Processor implements Runnable {

	public static void main(String[] args) {

		new Processor().run();;
	}

	@Override
	public void run() {
		JournalEntry sc= new JournalEntry();
		 Printer printer = new Printer();
		 printer.doIt(sc);
	}

}
