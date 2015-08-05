package mx.umb.pattern.comportamiento.command.centralita;

public class LucesCortas extends LucesReceiver {
	 private final int DISTANCIA = 40;
	 
	@Override
	public int encender() {
		this.encendidas = true;
        return DISTANCIA;
	}

}
