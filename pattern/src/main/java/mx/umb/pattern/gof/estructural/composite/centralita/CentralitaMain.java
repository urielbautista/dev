package mx.umb.pattern.gof.estructural.composite.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		// Declaramos los tornillos incluidos en la llanta, que serán nodos hoja
		ComponenteRecambio tornillo1 = new ElementoRecambio("Tornillo llanta", "Tornillo llanta marca ACME", 0.21);
		ComponenteRecambio tornillo2 = new ElementoRecambio("Tornillo llanta", "Tornillo llanta marca ACME", 0.21);
		ComponenteRecambio tornillo3 = new ElementoRecambio("Tornillo llanta", "Tornillo llanta marca ACME", 0.21);
		ComponenteRecambio tornillo4 = new ElementoRecambio("Tornillo llanta", "Tornillo llanta marca ACME", 0.21);
		 
		// Declaramos la llanta, que poseerá cuatro tornillos. Por tanto, se tratará de un elemento Composite (compuesto
		// por otros elementos, que pueden ser compuestos u hojas)
		ComponenteRecambio llanta = new Recambio("Llanta ACME 15'", "Llanta ACME de 15'", 42.22);
		 
		// Añadimos los tornillos a la llanta
		llanta.add(tornillo1);
		llanta.add(tornillo2);
		llanta.add(tornillo3);
		llanta.add(tornillo4);
		 
		// Declaramos ahora otro elemento: la válvula de la rueda
		ComponenteRecambio valvula = new ElementoRecambio("Válvula", "Válvula de neumático genérica", 0.49);
		 
		// Realizamos lo mismo con el neumático
		ComponenteRecambio neumatico = new ElementoRecambio("Neumático 15'", "Neumático Michelin de 15'", 13.42);
		 
		// Declaramos un nuevo objeto compuesto: la rueda.
		// Este objeto estará compuesto por la llanta, la válvula y el neumático.
		// A su vez, la llanta incluirá los tornillos.
		// Establecemos el precio de la rueda a '0', ya que dependerá en exclusiva del contenido de sus elementos.
		ComponenteRecambio rueda = new Recambio("Rueda 15'", "Rueda de 15' con llanta ACME y neumático Michelin", 0);
		 
		// Añadimos a la rueda los elementos hoja que instanciamos previamente
		rueda.add(llanta);
		rueda.add(neumatico);
		rueda.add(valvula);
		
		System.out.println(rueda.getNombre());
		
		System.out.println("*******************************************************");
		
		double precioTotal = rueda.getPrecio();
		System.out.println("El precio total de la rueda es " + precioTotal);
		 
		// Modificamos el precio de los tornillos para ver cómo afecta al precio total
		tornillo1.setPrecio(0.34);
		tornillo2.setPrecio(0.34);
		tornillo3.setPrecio(0.34);
		tornillo4.setPrecio(0.34);
		precioTotal = rueda.getPrecio();
		System.out.println("El precio total de la rueda tras la subida de precio es " + precioTotal);
	}

}