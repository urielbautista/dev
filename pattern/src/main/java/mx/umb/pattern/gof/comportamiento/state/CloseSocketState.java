package mx.umb.pattern.gof.comportamiento.state;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class CloseSocketState implements State {
	private SocketChannel socketChannel;
	
	public CloseSocketState (SocketChannel socketChannel){
		this.socketChannel=socketChannel;
	}

	@Override
	public SocketChannel procesar() {
		try {
			if (socketChannel!=null && socketChannel.isConnected()){
		 		socketChannel.close();
			}else{
				System.out.println("Al parecer no esta conectado");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}	
		return socketChannel;
	}

}