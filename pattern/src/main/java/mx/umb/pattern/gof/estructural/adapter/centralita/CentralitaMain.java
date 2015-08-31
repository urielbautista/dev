package mx.umb.pattern.gof.estructural.adapter.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		//Lo ideal sería utilizar la clase EnchufeBritanico, que es lo que nuestro taladro espera.
		// Instanciamos enchufe y taladro
		System.out.println("********** Version basica **********");
		IEnchufeIngles enchufe = new EnchufeBritanico();
		Taladro taladro = new Taladro(enchufe);
		 
		// Encendemos el taladro
		taladro.encender();
		 
		System.out.println();
		
		//Sin embargo, recordemos que el patrón Adapter no tiene sentido en este escenario, 
		//sino cuando el objeto del que disponemos no cumple con la interfaz esperada, es decir: 
		//en nuestro sistema, la clase EnchufeBritanico no existe. La clase del subsistema al que 
		//necesitamos conectarnos no implementa la interfaz IEnchufeBritanico,
		//sino que se trata de un objeto de la clase EnchufeEspanol. 
		//La situación, por lo tanto, es esta:
		/**
		IEnchufeEuropeo enchufeEuropeo = new EnchufeEspanol();
		Taladro taladro = new Taladro(enchufeEuropeo);
		taladro.encender();
		**/
		//Lo cual nos daría un clarísimo error de compilación, ya que nuestro taladro espera un enchufe inglés.

		
		//Instanciamos un enchufe español y usamos el adaptador para hacer que le sirva a nuestro taladro:
		// Instanciamos el enchufe español, que es el que existe en nuestro país
		System.out.println("********** Version adapter **********");
		IEnchufeEuropeo enchufeEuropeo = new EnchufeEspanol();
		 
		// Instanciamos el adaptador pasándole el enchufe español como parámetro
		IEnchufeIngles adaptador = new AdapterInglesEuropeo(enchufeEuropeo);
		 
		// Creamos el taladro pasándole nuestro adaptador
		Taladro taladroAdaptado = new Taladro(adaptador);
		 
		// Encendemos el taladro
		taladroAdaptado.encender(); 
		
	}

}
