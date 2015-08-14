package mx.umb.pattern.comportamiento.chainofresponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.solicitarPrestamo(100000);
	}

}
