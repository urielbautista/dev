package mx.umb.pattern.comportamiento.chainofresponsibility;

public interface IAprobador {
	void setnext(IAprobador aprobador);
	IAprobador getNext();
	void solicitarPrestamo (int monto);
}
