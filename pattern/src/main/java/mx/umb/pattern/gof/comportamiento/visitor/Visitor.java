package mx.umb.pattern.gof.comportamiento.visitor;

public interface Visitor {
	double visit(Book book);
	double visit(Fruit fruit);
}
