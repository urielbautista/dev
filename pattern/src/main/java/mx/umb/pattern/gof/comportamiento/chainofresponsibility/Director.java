package mx.umb.pattern.gof.comportamiento.chainofresponsibility;

public class Director implements IAprobador {
	private IAprobador aprobador;
	
	@Override
	public void setnext(IAprobador aprobador) {
		this.aprobador=aprobador;
	}

	@Override
	public IAprobador getNext() {
		return aprobador;
	}

	@Override
	public void solicitarPrestamo(int monto) {
		if (monto > 100000){
			System.out.println("Lo manejo yo, El Director");
		}
	}

}
