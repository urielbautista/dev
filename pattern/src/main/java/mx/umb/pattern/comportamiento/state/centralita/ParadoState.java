package mx.umb.pattern.comportamiento.state.centralita;

public class ParadoState implements State {
    // Referencia a la clase de contexto
    private VehiculoContext vehiculoContext;
 
    // Constructor que inyecta la dependencia en la clase actual
    public ParadoState(VehiculoContext vehiculoContext){
        this.vehiculoContext = vehiculoContext;
    }
 
	@Override
	public void acelerar() {
        // Comprobamos que el vehiculo disponga de combustible
        if (vehiculoContext.getCombustibleActual() > 0){
            // El vehiculo se pone en marcha. Aumenta la velocidad y cambiamos de estado
            //estado = EN_MARCHA;
        	vehiculoContext.setEstado(new EnMarchaState(vehiculoContext));
        	System.out.println("El vehiculo se encuentra ahora EN MARCHA");
        	vehiculoContext.modificarVelocidad(10);
        	vehiculoContext.modificarCombustible(-10);
        }else {
            //estado = SIN COMBUSTIBLE
        	vehiculoContext.setEstado(new SinCombustibleState(vehiculoContext));
            System.out.println("El vehiculo se encuentra ahora SIN COMBUSTIBLE");
        }
	}

	@Override
	public void frenar() {
		// No ocurre nada. Si el vehiculo ya se encuentra detenido, no habra efecto alguno
		System.out.println("ERROR: El vehiculo ya se encuentra detenido");
	}

	@Override
	public void contactar() {
        // El vehiculo se apaga
        // estado = APAGADO;
		vehiculoContext.setEstado(new ApagadoState(vehiculoContext));
        System.out.println("El vehiculo se encuentra ahora APAGADO");
	}
}