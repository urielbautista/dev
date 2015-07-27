package mx.umb.pattern.creacional.singleton;

public class SingletonMain {

	public static void main(String[] args) throws InterruptedException {
		// Instanciamos el Singleton
	     Singleton s = Singleton.getInstance();
	 
	     // Hacemos una pausa de tres segundos
	     Thread.sleep(3000);
	 
	     // Intentamos instanciar un segundo Singleton
	     Singleton s2 = Singleton.getInstance();
	 
	     // Comprobamos que ambos objetos son referencias a la misma
	     // instancia, que es única
	     System.out.println("Instancia {0} creada a las {1} : " + s.getCreacion());
	     System.out.println("Instancia {0} creada a las {1} : " + s2.getCreacion());
	}

}