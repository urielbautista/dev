package mx.umb.pattern.gof.estructural.decorator.centralita;

public class CommonRail extends Decorator {
    private Vehiculo vehiculo;
    
    public CommonRail(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
	@Override
	public String descripcion() {
		return vehiculo.descripcion() + " Common Rail";
	}

	@Override
	public int velocidadMaxima() {
		return vehiculo.velocidadMaxima() - 15;
	}

	@Override
	public double consumo() {
		return vehiculo.consumo() - 0.4;
	}

}
