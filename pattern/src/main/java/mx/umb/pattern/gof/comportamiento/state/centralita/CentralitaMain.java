package mx.umb.pattern.gof.comportamiento.state.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		VehiculoContext vehiculoContext = new VehiculoContext(20);
		vehiculoContext.acelerar();
		vehiculoContext.contactar();
		vehiculoContext.acelerar();
		vehiculoContext.acelerar();
		vehiculoContext.acelerar();
		vehiculoContext.frenar();
		vehiculoContext.frenar();
		vehiculoContext.frenar();
		vehiculoContext.frenar();
	}
}
