package mx.umb.pattern.estructural.facade.centralita;

public class Acelerador implements IAcelerador {

	@Override
	public void presionarAcelerador() {
		System.out.println("Acelerador presionado");

	}

	@Override
	public void soltarAcelerador() {
		 System.out.println("Acelerador levantado");
	}

}