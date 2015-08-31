package mx.umb.pattern.gof.comportamiento.strategy.centralita;

public class VehiculoCliente {
	 private Contexto contexto;
	 
	 public VehiculoCliente(){
		 contexto = new Contexto();
	 }
	 
	 public void conduccionDeportiva(){
	 	ITipoConduccion conduccionDeportiva = new ConduccionDeportiva();
	 	contexto.setTipoConduccion (conduccionDeportiva);
	}

	 public void ConduccionNormal() {
		 ITipoConduccion conduccionNormal = new ConduccionNormal();
		 contexto.setTipoConduccion(conduccionNormal);
	 }

	 // Métodos que invocan la funcionalidad implementada por la interfaz
	 public void Acelerar(float combustible){
		 String descripcion = contexto.obtenerDescripcion();
		 int incrementoVelocidad = contexto.incrementarVelocidad(combustible);
		 int potencia = contexto.incrementarPotencia(combustible);
		 System.out.println("Tipo de conducción " + descripcion);
		 System.out.println("Combustible inyectado: " + combustible);
		 System.out.println("Potencia proporcionada: " + potencia);
		 System.out.println("Incremento de velocidad: " + incrementoVelocidad);
	 }
}