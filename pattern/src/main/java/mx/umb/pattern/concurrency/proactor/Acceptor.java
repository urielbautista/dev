package mx.umb.pattern.concurrency.proactor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Acceptor implements CompletionHandler {
	private SocketAddress address;
	private ServerSocketChannel ssc;
	private Proactor proactor;

	public Acceptor(Proactor p, String host, int port) {
		address = new InetSocketAddress(host, port);
		proactor = p;
	}

	public void accept() throws IOException {
		ssc = ServerSocketChannel.open();
		ssc.configureBlocking(false);
		ssc.socket().bind(this.address);
		proactor.register(ssc, SelectionKey.OP_ACCEPT, this);

	}

	@Override
	public void handleEvent(SelectionKey sk) {
		System.out.println("SAMPLE");
        ServerSocketChannel handle= (ServerSocketChannel) sk.channel();
        SocketChannel s=null;
        try {
                s= handle.accept();
                s.configureBlocking(false);
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        
        Worker w = new Worker(proactor, s);
        try {
                w.work();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
	}

}
