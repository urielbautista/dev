package mx.umb.pattern.creacional.factory.method.centralita;

public class CentralitaMain {

	// TODO Pendiente agregar un archivo de propiedades.
	
	public static void main(String[] args) {
	    // Usamos un método genérico para instanciar la factoría por defecto.
	    // La factoría estará definida en la configuración
	    IMotorFactory factoria = MotorFactory.obtenerFactoria();
	 
	    // Instanciamos un motor a través de la factoría.
	    // Fijémonos que únicamente tratamos con interfaces. En ningún momento
	    // concretamos la clase con la que estamos trabajando
	    IMotor motor = factoria.createInstance();
	 
	    // Finalmente, hacemos uso del motor a través de los métodos de la
	    // interfaz IMotor.
	    System.out.println(motor.inyectarCombustible(20));
	    System.out.println(motor.consumirCombustible());
	    System.out.println(motor.realizarExpansion());
	    System.out.println(motor.realizarEscape());
	    System.out.println();
	}
}
