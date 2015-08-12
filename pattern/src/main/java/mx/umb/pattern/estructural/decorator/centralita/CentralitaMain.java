package mx.umb.pattern.estructural.decorator.centralita;

public class CentralitaMain {
	
	public static void main(String[] args) {
		System.out.println("********** Version basica **********");
		Vehiculo monovolumen = new Monovolumen();
		Vehiculo berlina = new Berlina();
		mostrarCaracteristicas(monovolumen);
		mostrarCaracteristicas(berlina);
		
		System.out.println(" ********** Version decorador1 **********");
		Vehiculo monovolumenv1 = new Monovolumen();
		 
		// Decoramos el monovolumen añadiéndole un motor gasolina a través
		// del decorador "Gasolina"
		monovolumenv1 = new Gasolina(monovolumenv1);
		Vehiculo berlinav1 = new Berlina();
		mostrarCaracteristicas(monovolumenv1);
		mostrarCaracteristicas(berlinav1);
		
		System.out.println(" ********** Version decorador2 **********");
		Vehiculo berlinav2 = new Berlina();
		 
		berlinav2 = new Diesel(berlinav2);
		mostrarCaracteristicas(berlinav2);
		 
		berlinav2 = new Turbo(berlinav2);
		mostrarCaracteristicas(berlinav2);
		 
		berlinav2 = new Inyeccion(berlinav2);
		mostrarCaracteristicas(berlinav2);
		 
		berlinav2 = new CommonRail(berlinav2);
		mostrarCaracteristicas(berlinav2);
	}

	private static void mostrarCaracteristicas(Vehiculo v) {
		System.out.println("Caracteristicas: \n"+ v.descripcion()+v.velocidadMaxima()+v.consumo());
	}
	
}
