package mx.umb.pattern.comportamiento.state.centralita;

public class VehiculoContext {
	private State estado;                 // Estado actual del vehiculo (apagado, parado, en marcha, sin combustible)
    private int velocidadActual = 0;      // Velocidad actual del vehiculo
    private int combustibleActual = 0;    // Cantidad de combustible restante
    
 // El constructor inserta el combustible del que dispondra el vehiculo
    public VehiculoContext(int combustible){
        this.combustibleActual = combustible;
        //Indicar un estado inicial (Apagado)
        estado = new ApagadoState(this);
    }
 
    // Los metodos del contexto invocaran el metodo de la interfaz State, delegando las operaciones
    // dependientes del estado en las clases que los implementen.
    public void acelerar() {
        estado.acelerar();
        System.out.println("Velocidad actual: " + velocidadActual + ". Combustible restante: " + combustibleActual);
    }
 
    public void frenar(){
        estado.frenar();
    }
 
    public void contactar(){
        estado.contactar();
    }
 
    public void modificarVelocidad(int kmh){
        velocidadActual += kmh;
    }
 
    public void modificarCombustible(int decilitros) {
        combustibleActual += decilitros;
    }
    
	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getCombustibleActual() {
		return combustibleActual;
	}

	public void setCombustibleActual(int combustibleActual) {
		this.combustibleActual = combustibleActual;
	}
  
}
