package mx.umb.pattern.gof.comportamiento.command.centralita;

public class LucesLargas extends LucesReceiver {
	private final int DISTANCIA = 200;
	
	@Override
	public int encender() {
		this.encendidas = true;
        return DISTANCIA;
	}

}
