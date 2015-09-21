package mx.umb.pattern.concurrency.proactor;

import java.io.IOException;

public class Server {

	public static void main(String[] args) throws IOException {
        Proactor proactor = new Proactor();
        Acceptor acceptor = new Acceptor(proactor, "localhost", 7070);
        acceptor.accept();
        proactor.handleEvent();
	}

}
