package mx.umb.pattern.comportamiento.state.centralita;

public class ApagadoState implements State {
	// Referencia a la clase de contexto
    private VehiculoContext vehiculoContext;
    
    // Constructor que inyecta la dependencia en la clase actual
    public ApagadoState(VehiculoContext vehiculoContext){
        this.vehiculoContext = vehiculoContext;
    }
    
	@Override
	public void acelerar() {
		// Acelerar con el vehiculo apagado no sirve de mucho 
		System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
	}

	@Override
	public void frenar() {
		// Frenar con el vehiculo parado tampoco sirve de mucho...
		System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
	}

	@Override
	public void contactar() {
        // Comprobamos que el vehiculo disponga de combustible
        if (vehiculoContext.getCombustibleActual() > 0) {
            // El vehiculo arranca -> Cambio de estado
            //estado = PARADO;
        	vehiculoContext.setEstado(new ParadoState(vehiculoContext));
            System.out.println("El vehiculo se encuentra ahora PARADO");
        	vehiculoContext.setVelocidadActual(0);
        }else{
            // El vehiculo no arranca -> Sin combustible
            //estado = SIN COMBUSTIBLE
        	vehiculoContext.setEstado( new SinCombustibleState(vehiculoContext));
            System.out.println("El vehiculo se encuentra sin combustible");
        }
	}
}