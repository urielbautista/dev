package mx.umb.pattern.gof.comportamiento.chainofresponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.solicitarPrestamo(100000);
	}

}
