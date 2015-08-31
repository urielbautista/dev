package mx.umb.pattern.gof.comportamiento.command.centralita;

public class LucesPosicion extends LucesReceiver {
	private final int DISTANCIA = 1;
	
	@Override
	public int encender() {
		this.encendidas = true;
        return DISTANCIA;
	}

}
