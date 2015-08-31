package mx.umb.pattern.gof.comportamiento.state;

import java.nio.channels.SocketChannel;

public class StateMain {

	public static void main(String[] args) {
		State state;
		SocketContext socketContext= new SocketContext();
		SocketChannel socketChannel = null;
		state = new ConnectSocketState(socketChannel);
		socketContext.setState( state ); 
 		socketChannel = socketContext.request();
 		//-----------------------------\\
 		//		 CLOSE SOCKET 	 \\
 		//-----------------------------\\
 		//Second State:
 		state = new CloseSocketState(socketChannel);
 		socketContext.setState( state ); 
 		socketChannel = socketContext.request();
	}
}
