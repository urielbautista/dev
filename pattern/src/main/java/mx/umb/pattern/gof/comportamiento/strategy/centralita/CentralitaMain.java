package mx.umb.pattern.gof.comportamiento.strategy.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
	    VehiculoCliente cliente = new VehiculoCliente();
	    cliente.conduccionDeportiva();
	    cliente.Acelerar(2.4f);
	    System.out.println("");
	    cliente.ConduccionNormal();
	    cliente.Acelerar(2.4f);	
	    System.out.println();
	}

}