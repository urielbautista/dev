package mx.umb.pattern.comportamiento.visitor;

public interface Visitor {
	double visit(Book book);
	double visit(Fruit fruit);
}
