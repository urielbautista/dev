package mx.umb.pattern.comportamiento.state;

import java.nio.channels.SocketChannel;

public class SocketContext {
	private State state;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public SocketChannel request(){
		return state.procesar();
	}

}
