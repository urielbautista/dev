package mx.umb.pattern.concurrency.proactor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

public class Worker {
	private Proactor proactor;
	private SocketChannel socket;
	private ByteBuffer b_read;
	private ByteBuffer b_write;

	public Worker(Proactor p, SocketChannel s) {
		proactor = p;
		socket = s;
		b_read = ByteBuffer.allocateDirect(1024);
	}

	public void work() throws IOException {
		System.out.println("WORKS");
		socket.read(b_read);
		proactor.register(socket, SelectionKey.OP_READ, this);
	}

	public void handleEvent(SelectionKey sk) {
		System.out.println(new String(b_read.array()));
	}
}
