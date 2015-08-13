package mx.umb.pattern.creacional.builder.centralita;

public class VehiculoDirector {
	private VehiculoBuilder builder;
	   
	// Constructor que recibirá un Builder concreto y lo asociará al director
	public VehiculoDirector(VehiculoBuilder builder){
		this.builder = builder;
	}
	 
	public void construirVehiculo() throws Exception{
		// Construimos el vehiculo definiendo el orden del proceso
		builder.definirVehiculo();
		builder.construirHabitaculo();
		builder.construirMotor();
		builder.construirRuedas();
		builder.definirExtras();
	 
		// Se realizan comprobaciones y validaciones
		if ((builder.getVehiculo().getTipoCarroceria().getTipoCarroceria() == "deportivo") &&
				(builder.getVehiculo().isDireccionAsistida() == false))
	            throw new Exception("Error en el ensamblado: Un deportivo no puede carecer de direccion asistida");
	    }
	 
	public Vehiculo getVehiculo(){
		return builder.getVehiculo();
	}
}
