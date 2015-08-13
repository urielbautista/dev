package mx.umb.pattern.estructural.facade.centralita;

public class Embrague implements IEmbrague {

	@Override
	public void presionarEmbrague() {
		System.out.println("Embrague presionado");
	}

	@Override
	public void soltarEmbrague() {
		System.out.println("Embrague suelto");
	}

}