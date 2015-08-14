package mx.umb.pattern.comportamiento.visitor;

public class Iva implements Visitor {
	private final double IMPUESTO_NORMAL=1.21;
	private final double IMPUESTO_REDUCIDO=1.105;
	
	@Override
	public double visit(Book book) {
		return book.getPrecio()*IMPUESTO_NORMAL;
	}

	@Override
	public double visit(Fruit fruit) {
		return fruit.getPrecio()*IMPUESTO_REDUCIDO;
	}

}
