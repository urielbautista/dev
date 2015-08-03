package mx.umb.pattern.comportamiento.state.centralita;

public class EnMarchaState implements State {
	// Referencia a la clase de contexto
    private VehiculoContext vehiculoContext;
    private final int VELOCIDAD_MAXIMA = 200;
    // Constructor que inyecta la dependencia en la clase actual
    public EnMarchaState(VehiculoContext vehiculoContext){
        this.vehiculoContext = vehiculoContext;
    }
    
	@Override
	public void acelerar() {
		if (vehiculoContext.getCombustibleActual() > 0) {
            // Aumentamos la velocidad, permaneciendo en el mismo estado
            if (vehiculoContext.getVelocidadActual() >= VELOCIDAD_MAXIMA) {
            	System.out.println("ERROR: El coche ha alcanzado su velocidad maxima");
            	vehiculoContext.modificarCombustible(-10);
            }else {
            	vehiculoContext.modificarVelocidad(10);
            	vehiculoContext.modificarCombustible(-10);
            }
        }else {
            //estado = SIN COMBUSTIBLE
        	vehiculoContext.setEstado( new SinCombustibleState(vehiculoContext));
            System.out.println("El vehiculo se ha quedado sin combustible");
        }
	}

	@Override
	public void frenar() {
        // Reducimos la velocidad. Si esta llega a 0, cambiaremos a estado "PARADO"
		vehiculoContext.modificarVelocidad(-10);
        if (vehiculoContext.getVelocidadActual() <= 0){
            //estado = PARADO;
        	vehiculoContext.setEstado(new ParadoState(vehiculoContext));
            System.out.println("El vehiculo se encuentra ahora PARADO");
        }
	}

	@Override
	public void contactar() {
		// No se puede detener el vehiculo en marcha!
		System.out.println("ERROR: No se puede cortar el contacto en marcha!");
	}

}