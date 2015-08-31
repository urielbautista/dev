package mx.umb.pattern.gof.comportamiento.chainofresponsibility;

public interface IAprobador {
	void setnext(IAprobador aprobador);
	IAprobador getNext();
	void solicitarPrestamo (int monto);
}
