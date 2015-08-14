package mx.umb.pattern.comportamiento.chainofresponsibility;

public class EjecutivoDeCuenta implements IAprobador {
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
		if (monto <=10000){
			System.out.println("Lo manejo yo, El Ejcutivo de Cuenta");
		}else{
			aprobador.solicitarPrestamo(monto);
		}
	}

}
