package mx.umb.pattern.comportamiento.state;

import java.nio.channels.SocketChannel;

public interface State {
	SocketChannel procesar();
}
