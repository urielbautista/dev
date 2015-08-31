package mx.umb.pattern.gof.comportamiento.chainofresponsibility;

public class LiderTeamEjecutivo implements IAprobador {
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
		if (monto >10000 && monto <= 50000){
			System.out.println("Lo manejo yo, El Lider");
		}else{
			aprobador.solicitarPrestamo(monto);
		}
	}

}
