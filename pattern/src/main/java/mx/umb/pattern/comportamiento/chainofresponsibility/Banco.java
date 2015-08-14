package mx.umb.pattern.comportamiento.chainofresponsibility;

public class Banco implements IAprobador {
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
		EjecutivoDeCuenta ejecutivo= new EjecutivoDeCuenta();
		this.setnext(ejecutivo);
		
		LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
		ejecutivo.setnext(lider);
		
		Gerente gerente= new Gerente();
		lider.setnext(gerente);
		
		Director director= new Director();
		gerente.setnext(director);
		
		aprobador.solicitarPrestamo(monto);

	}

}
