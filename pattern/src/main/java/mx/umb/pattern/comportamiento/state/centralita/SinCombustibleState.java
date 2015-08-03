package mx.umb.pattern.comportamiento.state.centralita;

public class SinCombustibleState implements State {
	 // Referencia a la clase de contexto
    private VehiculoContext vehiculoContext;
 
    // Constructor que inyecta la dependencia en la clase actual
    public SinCombustibleState(VehiculoContext vehiculoContext){
        this.vehiculoContext = vehiculoContext;
    }
    
	@Override
	public void acelerar() {
		System.out.println("ERROR: El vehiculo se encuentra sin combustible");
	}

	@Override
	public void frenar() {
		System.out.println("ERROR: El vehiculo se encuentra sin combustible");
	}

	@Override
	public void contactar() {
		System.out.println("ERROR: El vehiculo se encuentra sin combustible");
	}
}