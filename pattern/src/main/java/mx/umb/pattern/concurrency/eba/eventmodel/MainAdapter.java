package mx.umb.pattern.concurrency.eba.eventmodel;

public class MainAdapter {

	public static void main(String[] args) {
        NumberReader reader = new NumberReader();
        NumberReadListener listener = new NumberReadListenerImpl();
        NumberReaderLoggingAdaptor adaptor = new NumberReaderLoggingAdaptor();
        adaptor.addNumberReadListener(listener);
        reader.addNumberReadListener(adaptor);
        reader.start();
	}

}
