package mx.umb.pattern.gof.comportamiento.state;

import java.nio.channels.SocketChannel;

public interface State {
	SocketChannel procesar();
}
