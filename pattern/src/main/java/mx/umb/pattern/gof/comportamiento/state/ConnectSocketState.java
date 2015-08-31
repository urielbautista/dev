package mx.umb.pattern.gof.comportamiento.state;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class ConnectSocketState implements State {

	private SocketChannel socketChannel;
	
	public ConnectSocketState (SocketChannel socketChannel){
		this.socketChannel=socketChannel;
	}
	
	@Override
	public SocketChannel procesar() {
 		try {
 			int port = 21;
 			InetAddress host = InetAddress.getByName("10.133.33.49");
 			SocketAddress adress = new InetSocketAddress(host, 10007);
 			socketChannel = SocketChannel.open(adress);
 			socketChannel.configureBlocking(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return socketChannel;

	}

}
